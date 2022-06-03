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

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ForwardedHeaderFilter;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * フィルタの設定を追加するコンフィグレーション。
 *
 */
@Configuration
public class FilterConfig {

    @Value("${api.base-path}")
    private String basePath;

    /**
     * ForwardedHeaderFilter を追加するための {@link FilterRegistrationBean} を返却します。
     * 
     * @return フィルタの設定が格納された {@link FilterRegistrationBean} 。
     */
    @Bean
    public FilterRegistrationBean<Filter> forwardedHeaderFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(forwardedHeaderFilter());
        registration.addUrlPatterns(UriComponentsBuilder.fromPath(basePath + "/*").toUriString());
        registration.setName("forwardedHeaderFilter");
        registration.setOrder(1);
        return registration;
    }

    /**
     * AccessLogFilter を追加するための {@link FilterRegistrationBean} を返却します。
     * 
     * @return フィルタの設定が格納された {@link FilterRegistrationBean} 。
     */
    @Bean
    public FilterRegistrationBean<Filter> accessLogFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
        registration.setFilter(accessLogFilter());
        registration.addUrlPatterns(UriComponentsBuilder.fromPath(basePath + "/*").toUriString());
        registration.setName("accessLogFilter");
        registration.setOrder(2);
        return registration;
    }

    /**
     * X-Forwarded ヘッダを処理するためのフィルタを定義します。
     * 
     * @return {@link ForwardedHeaderFilter} のインスタンス。
     */
    @Bean(name = "forwardedHeaderFilter")
    public ForwardedHeaderFilter forwardedHeaderFilter() {
        return new ForwardedHeaderFilter();
    }

    /**
     * アクセスログフィルタを返却します。
     * 
     * @return アクセスログ処理を実装した {@link AccessLogFilter} のインスタンス。
     */
    @Bean(name = "accessLogFilter")
    public Filter accessLogFilter() {
        return new AccessLogFilter();
    }

}
