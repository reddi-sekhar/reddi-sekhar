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
package jp.co.ana.cas.resources.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import lombok.extern.log4j.Log4j2;

/**
 * アクセスログを出力するためのフィルタ。
 *
 */
@Log4j2
public class AccessLogFilter implements Filter {

    @Override
    public void destroy() {
        // NOP
    }

    @Value("${MSTMP_REQHEADER_THRESHOLD:8192}")
    protected Integer requestHeaderThreshold;

    @Value("${MSTMP_REQBODY_THRESHOLD:2097152}")
    protected Integer requestBodyThreshold;

    @Value("${accesslog.output.content-types:}")
    protected String[] outputContentTypes;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        RequestLogWrapper requestWrapper = new RequestLogWrapper((HttpServletRequest) request);
        ResponseLogWrapper responseWrapper = new ResponseLogWrapper((HttpServletResponse) response);
        chain.doFilter(requestWrapper, responseWrapper);
        outputLog(requestWrapper, responseWrapper);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // NOP
    }

    /**
     * ログのメッセージを生成して、ログ出力を行います。
     *
     * @param request  リクエスト
     * @param response レスポンス
     */
    private void outputLog(HttpServletRequest request, HttpServletResponse response) {
        // 共通部分の作成
        String uri = request.getRequestURI();
        String query = request.getQueryString();
        if (StringUtils.isEmpty(query)) {
            query = "";
        }

        String source = request.getRemoteHost();
        if (StringUtils.isNotEmpty(request.getHeader("X-Forwarded-For"))) {
            source = request.getHeader("X-Forwarded-For");
        }
        if (StringUtils.isEmpty(source)) {
            source = "-";
        }
        String locale = "-";
        if (StringUtils.isNotEmpty(request.getHeader("locale"))) {
            locale = request.getHeader("locale");
        }
        String userId = "-";
        if (StringUtils.isNotEmpty(request.getRemoteUser())) {
            userId = request.getRemoteUser();
        }

        // リクエストヘッダ
        StringBuilder reqHeader = new StringBuilder();
        Enumeration<String> reqHeaderNames = request.getHeaderNames();
        while (reqHeaderNames.hasMoreElements()) {
            String name = reqHeaderNames.nextElement();
            String value = request.getHeader(name);
            // リクエストヘッダのサイズチェック
            if ((reqHeader.length() + name.length() + value.length()) > requestHeaderThreshold) {
                log.warn(
                        "request header size exceeds threshold, so trim request header log. current request header size : {}",
                        reqHeader.length());
                break;
            }
            reqHeader.append(name).append("=").append(value).append(";");
        }

        // レスポンスヘッダ
        StringBuilder resHeader = new StringBuilder();
        for (String name : response.getHeaderNames()) {
            String value = response.getHeader(name);
            // レスポンスヘッダのサイズチェック
            if ((resHeader.length() + name.length() + value.length()) > requestHeaderThreshold) {
                log.warn(
                        "response header size exceeds threshold, so trim response header log. current response header size : {}",
                        resHeader.length());
                break;
            }
            resHeader.append(name).append("=").append(value).append(";");
        }

        // リクエストボディ
        String reqBody = "";
        if (allowOutput(request.getContentType())) {
            reqBody = ((RequestLogWrapper) request).getStringRequestBody();
            if (StringUtils.isEmpty(reqBody)) {
                reqBody = "";
            }
            if (reqBody.length() > requestBodyThreshold) {
                log.warn("request body size exceeds threshold, so trim request body log. request body size : {}",
                        reqBody.length());
                reqBody = StringUtils.truncate(reqBody, requestBodyThreshold);
            }
        }

        // レスポンスボディ
        String resBody = "";
        if (allowOutput(response.getContentType())) {
            resBody = ((ResponseLogWrapper) response).getStringResponseBody();
            if (StringUtils.isEmpty(resBody)) {
                resBody = "";
            }
            if (resBody.length() > requestBodyThreshold) {
                log.warn("response body size exceeds threshold, so trim response body log. response body size : {}",
                        resBody.length());
                resBody = StringUtils.truncate(resBody, requestBodyThreshold);
            }
        }

        // ログ出力
        if (log.isInfoEnabled()) {
            log.info(
                    "\tsource:{}\tmethod:{}\tpath:{}\tquery:{}\tstatus:{}\tlocale:{}\tremote_user:{}\t"
                            + "request_header:{}\trequest_body:{}\tresponse_header:{}\tresponse_body:{}",
                    source, request.getMethod(), uri, query, response.getStatus(), locale, userId, reqHeader.toString(),
                    reqBody, resHeader.toString(), resBody);
        }
    }

    private boolean allowOutput(String contentType) {
        if (StringUtils.isEmpty(contentType)) {
            return false;
        }

        for (String outputContentType : outputContentTypes) {
            if (StringUtils.isEmpty(outputContentType)) {
                break;
            }
            if (contentType.contains(outputContentType)) {
                return true;
            }
        }

        return false;
    }

}
