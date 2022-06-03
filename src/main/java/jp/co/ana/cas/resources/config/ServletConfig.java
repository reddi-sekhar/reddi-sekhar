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
package jp.co.ana.cas.resources.config;

import java.util.Collections;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletContextInitializer servletContextInitializer(@Value("${secure.cookie:true}") boolean secure) {
        ServletContextInitializer servletContextInitializer = new ServletContextInitializer() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                servletContext.getSessionCookieConfig().setHttpOnly(true);
                servletContext.getSessionCookieConfig().setSecure(secure);
                servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
            }
        };
        return servletContextInitializer;
    }

}
