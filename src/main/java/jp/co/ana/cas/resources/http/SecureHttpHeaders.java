//
// COPYRIGHT (C) NEC CORPORATION
//
// ALL RIGHTS RESERVED BY NEC NEC CORPORATION, THIS PROGRAM
// MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
// FURNISHED BY NEC NEC CORPORATION, NO PART OF THIS PROGRAM
// MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
// WITHOUT THE PRIOR WRITTEN PERMISSION OF NEC NEC CORPORATION.
//
// NEC CORPORATION CONFIDENTIAL AND PROPRIETARY
package jp.co.ana.cas.resources.http;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;

/**
 * セキュリティ対策用の機能を追加実装した {@link HttpHeaders} のラッパークラス。
 *
 */
public class SecureHttpHeaders extends HttpHeaders {

    private static final long serialVersionUID = 1L;

    private static final int DEFAULT_HEADER_LENGTH = 21;

    public SecureHttpHeaders() {
        super();

        super.add("X-Content-Type-Options", "nosniff");
        super.add("X-XSS-Protection", "1; mode=block");
        super.add("X-Frame-Options", "deny");
        super.add("Cache-Control", "no-store");
    }

    /**
     * セキュリティ対策の属性が付与された <code>Set-Cookie</code> ヘッダを追加します。<br />
     * <code>secure;</code> は必ず設定されます。
     * 
     * @param name  Cookie の名前。
     * @param value Cookie の値。 null を指定した場合は空の文字列が設定されます。
     * @throws IllegalArgumentException name が null か 空の文字列の場合。
     */
    public void addCookie(String name, String value) throws IllegalArgumentException {
        this.addCookie(name, value, null, null, null, true);
    }

    /**
     * セキュリティ対策の属性が付与された <code>Set-Cookie</code> ヘッダを追加します。
     * 
     * @param name   Cookie の名前。
     * @param value  Cookie の値。 null を指定した場合は空の文字列が設定されます。
     * @param useSSL secure パラメータを利用するかのフラグ。 true の場合 <code>secure;</code> が設定されます。
     * @throws IllegalArgumentException name が null か 空の文字列の場合。
     */
    public void addCookie(String name, String value, boolean useSSL) throws IllegalArgumentException {
        this.addCookie(name, value, null, null, null, useSSL);
    }

    /**
     * セキュリティ対策の属性が付与された <code>Set-Cookie</code> ヘッダを追加します。
     * 
     * @param name    Cookie の名前。
     * @param value   Cookie の値。 null を指定した場合は空の文字列が設定されます。
     * @param expires Cookie の有効期限（ GMT ）。 null を指定した場合は設定されません。
     * @param domain  Cookie の発行ドメイン。 null を指定した場合は設定されません。
     * @param path    Cookie を利用するパス。 null を指定した場合は設定されません。
     * @param useSSL  secure パラメータを利用するかのフラグ。 true の場合 <code>secure;</code> が設定されます。
     * @throws IllegalArgumentException name が null か 空の文字列の場合。
     */
    public void addCookie(String name, String value, LocalDateTime expires, String domain, String path, boolean useSSL)
            throws IllegalArgumentException {
        if ((name == null) || name.isEmpty()) {
            throw new IllegalArgumentException("name is required.");
        }
        String valueLocal = value;
        if (valueLocal == null) {
            valueLocal = "";
        }

        StringBuilder headerValue = new StringBuilder(DEFAULT_HEADER_LENGTH);
        headerValue.append(name).append("=").append(valueLocal).append(";");

        if (expires != null) {
            headerValue.append("expires=");
            headerValue
                    .append(expires.format(DateTimeFormatter.ofPattern("EEE, dd-MMM-yyyy HH:mm:ss 'GMT'", Locale.US)))
                    .append(";");
        }

        if (!StringUtils.isEmpty(domain)) {
            headerValue.append("domain=").append(domain).append(";");
        }

        if (!StringUtils.isEmpty(path)) {
            headerValue.append("path=").append(path).append(";");
        }

        if (useSSL) {
            headerValue.append("secure;");
        }

        headerValue.append("httponly;");

        super.add("Set-Cookie", headerValue.toString());
    }

}
