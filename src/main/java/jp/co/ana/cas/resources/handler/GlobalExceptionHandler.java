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
package jp.co.ana.cas.resources.handler;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import jp.co.ana.cas.resources.http.SecureHttpHeaders;
import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Component
@Log4j2
public class GlobalExceptionHandler {

    /**
     * API のパラメータ検証エラーが発生した場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 400(Bad Request) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <b>レスポンスボディの例</b>
     * 
     * <pre>
     * {
     *   "messages": [ "must match UUID" ]
     * }
     * </pre>
     * 
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler
    public ResponseEntity<ErrorDto> handleValidationError(MethodArgumentNotValidException e) {

        // エラーログを出力
        log.error(e.getMessage(), e);

        List<FieldError> errors = e.getBindingResult().getFieldErrors();

        ErrorDto errorDto = new ErrorDto();
        for (FieldError error : errors) {
            errorDto.addMessage(error.getField() + " " + error.getDefaultMessage());
        }

        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * API のパラメータ検証エラーが発生した場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 400(Bad Request) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <b>レスポンスボディの例</b>
     * 
     * <pre>
     * {
     *   "messages": [ "must match UUID" ]
     * }
     * </pre>
     * 
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler
    public ResponseEntity<ErrorDto> handleValidationError(ConstraintViolationException e) {
        // エラーログを出力
        log.error(e.getMessage(), e);

        List<ConstraintViolation<?>> errors = new ArrayList<ConstraintViolation<?>>(e.getConstraintViolations());

        ErrorDto errorDto = new ErrorDto();
        for (ConstraintViolation<?> error : errors) {
            errorDto.addMessage(error.getMessage());
        }

        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * API のパラメータ検証エラーが発生した場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 400(Bad Request) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <b>レスポンスボディの例</b>
     * 
     * <pre>
     * {
     *   "messages": [ "Invalid value: numeric_data" ]
     * }
     * </pre>
     * 
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler
    public ResponseEntity<ErrorDto> handleFormatError(HttpMessageNotReadableException e) {

        // エラーログを出力
        log.error(e.getMessage(), e);

        ErrorDto errorDto = new ErrorDto();
        if (e.getCause() instanceof UnrecognizedPropertyException) {
            String pName = ((UnrecognizedPropertyException) e.getCause()).getPropertyName();
            errorDto.addMessage("Invalid property: " + pName);
        } else if (e.getCause() instanceof JsonMappingException) {
            for (Reference ref : ((JsonMappingException) e.getCause()).getPath()) {
                errorDto.addMessage("Invalid value: " + ref.getFieldName());
            }
        } else {
            errorDto.addMessage("Invalid input value(s).");
        }

        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * メディアタイプがapplication/json以外の場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 415(Unsupported Media Type) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <b>レスポンスボディの例</b>
     *
     * <pre>
     * {
     *   "messages": [ "Not supported media types." ]
     * }
     * </pre>
     * 
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<ErrorDto> handleMediaTypeNotSupportedError(Exception e) {
        // エラーログを出力
        log.error(e.getMessage(), e);

        // 返却するオブジェクトを生成し、メッセージを設定
        ErrorDto errorDto = new ErrorDto();
        errorDto.addMessage("Not supported media types.");

        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    /**
     * API のパラメータ検証エラーが発生した場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 400(Bad Request) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <b>レスポンスボディの例</b>
     * 
     * <pre>
     * {
     *   "messages": [ "Missing URI template variable 'name' for method parameter of type String" ]
     * }
     * </pre>
     * 
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler
    public ResponseEntity<ErrorDto> handleValidationError(MissingPathVariableException e) {
        // エラーログを出力
        log.error(e.getMessage(), e);

        ErrorDto errorDto = new ErrorDto();
        errorDto.addMessage(e.getMessage());
        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * Acceptヘッダーがapplication/jsonではない場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 406(Not Acceptable) を返却し、レスポンスボディとしては何も返却しない。<br />
     * <br />
     *
     * @param e 発生したエラーの例外オブジェクト。
     */
    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResponseEntity<ErrorDto> handleMediaTypeNotAcceptableError(Exception e) {
        // Acceptヘッダーがapplication/jsonではないため、レスポンスボディは設定しない
        // エラーログを出力
        log.error(e.getMessage(), e);

        return new ResponseEntity<>(null, new SecureHttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
    }

    /**
     * HTTPメソッドとURIの組み合わせが正しくない場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 405(Method Not Allowed) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <br />
     * <b>レスポンスボディの例</b>
     * 
     * <pre>
     * {
     *   "messages": [ "Not supported http method." ]
     * }
     * </pre>
     *
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ErrorDto> handleHttpMethodNotSupportedError(Exception e) {
        // エラーログを出力
        log.error(e.getMessage(), e);

        // 返却するオブジェクトを生成し、メッセージを設定
        ErrorDto errorDto = new ErrorDto();
        errorDto.addMessage("Not supported http method.");

        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.METHOD_NOT_ALLOWED);
    }

    /**
     * 内部システムエラーが発生した場合のエラー処理を行います。<br />
     * HTTP ステータスコードは 500(Internal Server Error) を返却し、レスポンスボディとしてエラーメッセージを含んだ JSON
     * を返却します。<br />
     * <br />
     * <b>レスポンスボディの例</b>
     * 
     * <pre>
     * {
     *   "messages": [ "Internal Server Error." ]
     * }
     * </pre>
     *
     * @param e 発生したエラーの例外オブジェクト。
     * @return エラー情報を格納した {@link ErrorDto} オブジェクト。
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleInternalServerError(Exception e) {
        // エラーログを出力
        log.error(e.getMessage(), e);

        // 返却するオブジェクトを生成し、メッセージを設定
        ErrorDto errorDto = new ErrorDto();
        errorDto.addMessage("Internal Server Error.");

        return new ResponseEntity<>(errorDto, new SecureHttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
