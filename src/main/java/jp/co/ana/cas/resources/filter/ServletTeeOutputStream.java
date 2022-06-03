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

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

public class ServletTeeOutputStream extends ServletOutputStream {

    /** OutputStream */
    private OutputStream stream;

    /**
     * コンストラクタ
     *
     * @param output outputStream
     */
    public ServletTeeOutputStream(OutputStream output) {
        stream = output;
    }

    @Override
    public void write(int b) throws IOException {
        stream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }

    @Override
    public boolean isReady() {
        return false;
    }

    @Override
    public void setWriteListener(WriteListener arg0) {
        // NOP
    }

}