//
// COPYRIGHT (C) 2017-2019 NEC CORPORATION
//
// ALL RIGHTS RESERVED BY NEC NEC CORPORATION, THIS PROGRAM
// MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
// FURNISHED BY NEC NEC CORPORATION, NO PART OF THIS PROGRAM
// MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
// WITHOUT THE PRIOR WRITTEN PERMISSION OF NEC NEC CORPORATION.
//
// NEC CORPORATION CONFIDENTIAL AND PROPRIETARY
package jp.co.ana.cas.resources.filter;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.io.input.TeeInputStream;

public class RequestLogWrapper extends HttpServletRequestWrapper {

    /** 入力ストリーム読み込み時のバッファサイズ */
    private static final int BUFFER_SIZE = 1024;
    /** 入力ストリーム読み込み回数 */
    private static final int BUFFER_COUNT = 10;

    /** apache commons のTeeInputStream */
    private TeeInputStream teeStream = null;

    /** Streamのラッパー */
    private ServletTeeInputStream servletStream = null;

    /** RequestBodyのコピー先 */
    private ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

    /** reader */
    private BufferedReader reader = null;

    /**
     * コンストラクタ
     *
     * @param request リクエストオブジェクト
     */
    public RequestLogWrapper(HttpServletRequest request) {
        super(request);
    }

    /**
     * InputStreamをTeeStreamでオーバーラップします。
     *
     * {@inheritDoc}
     */
    @Override
    public ServletInputStream getInputStream() throws IOException {
        if (servletStream == null) {
            teeStream = new TeeInputStream(super.getInputStream(), byteStream);
            servletStream = new ServletTeeInputStream(teeStream);
        }
        return servletStream;
    }

    /**
     * TeeStreamからreaderを作り出します。
     *
     * {@inheritDoc}
     */
    @Override
    public BufferedReader getReader() throws IOException {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(this.getInputStream(), StandardCharsets.UTF_8));
        }
        return reader;
    }

    /**
     * コピーしたリクエストボディの文字列を取得します。
     *
     * @return リクエストボディ
     */
    @SuppressWarnings("squid:S1166")
    public String getStringRequestBody() {
        if (servletStream == null) {
            // 1回も読まれていない場合にBODYが取得できないので、ここで読み込む
            try {
                byte[] buffer = new byte[BUFFER_SIZE];
                InputStream input = getInputStream();
                for (int i = 0; i < BUFFER_COUNT; i++) {
                    if (input.read(buffer) == 0) {
                        break;
                    }
                    // NOP;
                }
            } catch (IOException e) {
                // ボディが存在しない場合は処理しないようにしたいため、意図的に例外を捨てている
                return "";
            }
        }
        return byteStream.toString(StandardCharsets.UTF_8);
    }
}
