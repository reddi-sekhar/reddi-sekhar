package jp.co.ana.cas.soapfront.service;

import java.util.Map;
import java.util.Objects;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import jp.co.ana.cas.soapfront.utils.SoapfrontHeaderContext;

/**
 * The Class ControllerResponseAdvise.
 */
@ControllerAdvice
public class ControllerResponseAdvise implements ResponseBodyAdvice<Object> {

  /**
   * Supports.
   *
   * @param returnType the return type
   * @param converterType the converter type
   * @return true, if successful
   */
  @Override
  public boolean supports(MethodParameter returnType,
      Class<? extends HttpMessageConverter<?>> converterType) {
    return true;
  }

  /**
   * Before body write.
   *
   * @param body the body
   * @param returnType the return type
   * @param selectedContentType the selected content type
   * @param selectedConverterType the selected converter type
   * @param request the request
   * @param response the response
   * @return the object
   */
  @Override
  public Object beforeBodyWrite(Object body, MethodParameter returnType,
      MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType,
      ServerHttpRequest request, ServerHttpResponse response) {

    try {
      Map<String, String> responseHeaders = SoapfrontHeaderContext.getSoapfrontHeader();
      if (Objects.nonNull(responseHeaders)) {
        for (Map.Entry<String, String> entry : responseHeaders.entrySet()) {
          response.getHeaders().add(entry.getKey(), entry.getValue());
        }
      }
    } finally {

      SoapfrontHeaderContext.clear();
    }

    return body;
  }
}
