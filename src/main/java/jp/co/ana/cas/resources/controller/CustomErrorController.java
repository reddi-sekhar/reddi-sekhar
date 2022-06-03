//
// COPYRIGHT (C) 2020 NEC CORPORATION
//
// ALL RIGHTS RESERVED BY NEC NEC CORPORATION, THIS PROGRAM
// MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
// FURNISHED BY NEC NEC CORPORATION, NO PART OF THIS PROGRAM
// MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
// WITHOUT THE PRIOR WRITTEN PERMISSION OF NEC NEC CORPORATION.
//
// NEC CORPORATION CONFIDENTIAL AND PROPRIETARY
package jp.co.ana.cas.resources.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import jp.co.ana.cas.resources.handler.ErrorDto;

/**
 * JSON形式のエラーを返すカスタムエラーコントローラ.
 * 
 * @see org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController
 */
@RestController
@RequestMapping(
    "${server.error.path:/error}"
)
@ApiIgnore
@CrossOrigin
public class CustomErrorController extends AbstractErrorController {

    @Autowired
    private ServerProperties serverProperties;

    public CustomErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @Override
    public String getErrorPath() {
        return this.serverProperties.getError().getPath();
    }

    @SuppressWarnings(
        "findsecbugs:SPRING_CSRF_UNRESTRICTED_REQUEST_MAPPING"
    )
    @RequestMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ErrorDto> error(HttpServletRequest req, HttpServletResponse res) {
        ErrorAttributeOptions options = ErrorAttributeOptions.of(ErrorAttributeOptions.Include.BINDING_ERRORS,
                ErrorAttributeOptions.Include.EXCEPTION, ErrorAttributeOptions.Include.MESSAGE,
                ErrorAttributeOptions.Include.STACK_TRACE);
        Map<String, Object> attrs = super.getErrorAttributes(req, options);
        String message = (String) attrs.get("message");
        int status = (int) attrs.get("status");

        ErrorDto body = new ErrorDto();
        body.addMessage(message);

        return ResponseEntity.status(status).body(body);
    }
}
