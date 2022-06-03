package jp.co.ana.cas.soapfront.service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import jp.co.ana.cas.soapfront.utils.SoapfrontHeaderContext;


/**
 * The Class ControllerRequestAdvice.
 */
@ControllerAdvice
public class ControllerRequestAdvice implements RequestBodyAdvice {

  /**
   * Supports.
   *
   * @param methodParameter the method parameter
   * @param targetType the target type
   * @param converterType the converter type
   * @return true, if successful
   */
  @Override
  public boolean supports(MethodParameter methodParameter, Type targetType,
      Class<? extends HttpMessageConverter<?>> converterType) {
    return true;
  }

  /**
   * Before body read.
   *
   * @param inputMessage the input message
   * @param parameter the parameter
   * @param targetType the target type
   * @param converterType the converter type
   * @return the http input message
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Override
  public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter,
      Type targetType, Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
    return inputMessage;
  }

  /**
   * After body read.
   *
   * @param body the body
   * @param inputMessage the input message
   * @param parameter the parameter
   * @param targetType the target type
   * @param converterType the converter type
   * @return the object
   */
  @Override
  public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
      Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {

    Map<String, List<String>> httpHeaders = inputMessage.getHeaders();

    Map<String, String> soapfrontHeaders = httpHeaders.entrySet().stream()
        .filter(header -> header.getKey().startsWith("apass-"))
        .collect(Collectors.toMap(Map.Entry::getKey, header -> header.getValue().get(0)));

    SoapfrontHeaderContext.setSoapfrontHeader(soapfrontHeaders);

    return body;
  }

  /**
   * Handle empty body.
   *
   * @param body the body
   * @param inputMessage the input message
   * @param parameter the parameter
   * @param targetType the target type
   * @param converterType the converter type
   * @return the object
   */
  @Override
  public Object handleEmptyBody(Object body, HttpInputMessage inputMessage,
      MethodParameter parameter, Type targetType,
      Class<? extends HttpMessageConverter<?>> converterType) {

    return body;
  }

}
