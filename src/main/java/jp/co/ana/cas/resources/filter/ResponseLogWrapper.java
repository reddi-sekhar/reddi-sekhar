//
// COPYRIGHT (C) 2017 NEC CORPORATION
//
// ALL RIGHTS RESERVED BY NEC NEC CORPORATION, THIS PROGRAM
// MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
// FURNISHED BY NEC NEC CORPORATION, NO PART OF THIS PROGRAM
// MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
// WITHOUT THE PRIOR WRITTEN PERMISSION OF NEC NEC CORPORATION.
//
// NEC CORPORATION CONFIDENTIAL AND PROPRIETARY
package jp.co.ana.cas.resources.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.bouncycastle.util.io.TeeOutputStream;

public class ResponseLogWrapper extends HttpServletResponseWrapper {

    /** apache commons のTeeOutputStream */
    private TeeOutputStream teeStream = null;

    /** ResponseBodyのコピー先 */
    private ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

    /** Streamのラッパー */
    private ServletTeeOutputStream servletStream = null;

    /** writer */
    private PrintWriter printWriter = null;

    /**
     * コンストラクタ
     *
     * @param response レスポンスオブジェクト
     */
    public ResponseLogWrapper(HttpServletResponse response) {
        super(response);
    }

    /**
     * OutputStreamをTeeStreamでオーバーラップします。
     *
     * {@inheritDoc}
     */
    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if (servletStream == null) {
            teeStream = new TeeOutputStream(super.getOutputStream(), byteStream);
            servletStream = new ServletTeeOutputStream(teeStream);
        }
        return servletStream;
    }

    /**
     * TeeStreamからwriterを作り出します。
     *
     * {@inheritDoc}
     */
    @Override
    public PrintWriter getWriter() throws IOException {
        if (printWriter == null) {
            printWriter = new PrintWriter(new OutputStreamWriter(teeStream, StandardCharsets.UTF_8));
        }
        return printWriter;
    }

    /**
     * コピーしたレスポンスボディの文字列を取得します。
     *
     * @return レスポンスボディ
     */
    public String getStringResponseBody() {
        return byteStream.toString(StandardCharsets.UTF_8);
    }

}