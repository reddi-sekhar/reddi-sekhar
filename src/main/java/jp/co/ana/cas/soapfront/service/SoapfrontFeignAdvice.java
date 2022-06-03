package jp.co.ana.cas.soapfront.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import jp.co.ana.cas.soapfront.model.AMASecurityHostedUser;
import jp.co.ana.cas.soapfront.model.Session;
import jp.co.ana.cas.soapfront.model.UserID;
import jp.co.ana.cas.soapfront.model.UsernameToken;
import jp.co.ana.cas.soapfront.request.RequestSoapHeader;
import jp.co.ana.cas.soapfront.request.SoapfrontRequest;
import jp.co.ana.cas.soapfront.response.SoapfrontResponse;
import jp.co.ana.cas.soapfront.utils.SoapfrontHeaderContext;
import jp.co.ana.cas.soapfront.utils.WSSToken;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * The Class SoapfrontFeignAdvice.
 */
@Aspect
@Component
@Log4j2
public class SoapfrontFeignAdvice {

  /**
   * beforeAdvice.
   *
   * @param joinPoint the join point
   */
  @Before(value = "execution(* jp.co.ana.cas.*.connector.*.client.*Feign*.*(..))")
  public void beforeAdvice(JoinPoint joinPoint) {
    log.debug("Feign beforeAdvice" + joinPoint.getSignature());

    try {
      SoapfrontRequest soapRequest = (SoapfrontRequest) joinPoint.getArgs()[0];

      Map<String, String> soapfrontHeaders = SoapfrontHeaderContext.getSoapfrontHeader();
      RequestSoapHeader soapHeader = new RequestSoapHeader();
      if (Objects.nonNull(soapfrontHeaders) && Objects.isNull(soapRequest.getSoapHeader())) {
        if (Objects.nonNull(soapfrontHeaders.get(SoapfrontHeaderContext.SESSION_ID))) {
          Session session = new Session();

          session.setSessionId(soapfrontHeaders.get(SoapfrontHeaderContext.SESSION_ID));
          session.setSequenceNumber(soapfrontHeaders.get(SoapfrontHeaderContext.SEQUENCE_NUM));
          session.setSecurityToken(soapfrontHeaders.get(SoapfrontHeaderContext.SECURITY_TOKEN));
          session.setTransactionStatusCode(
              soapfrontHeaders.get(SoapfrontHeaderContext.TRANACTION_STATUS));

          soapHeader.setSession(session);

          soapRequest.setSoapHeader(soapHeader);
        } else if (Objects.nonNull(soapfrontHeaders.get(SoapfrontHeaderContext.USER_NAME))
            && Objects.nonNull(soapfrontHeaders.get(SoapfrontHeaderContext.PASSWORD))) {
          UsernameToken usernameToken = new UsernameToken();
          usernameToken.setUsername(soapfrontHeaders.get(SoapfrontHeaderContext.USER_NAME));

          WSSToken wssToken = WSSToken.generateToken(
              soapfrontHeaders.get(SoapfrontHeaderContext.PASSWORD));

          usernameToken.setPassword(wssToken.getPasswordDigest());
          usernameToken.setNonce(wssToken.getNonce());
          usernameToken.setCreated(wssToken.getCreated());

          soapHeader.setUsernameToken(usernameToken);

          AMASecurityHostedUser amaSecurityHostedUser = new AMASecurityHostedUser();
          UserID userId = new UserID();

          userId.setPseudoCityCode(soapfrontHeaders.get(SoapfrontHeaderContext.PSUDO_CITY_CODE));
          userId.setAgentDutyCode(soapfrontHeaders.get(SoapfrontHeaderContext.AGENT_DUTY_CODE));
          amaSecurityHostedUser.setUserID(userId);
          soapHeader.setAmasecurityHostedUser(amaSecurityHostedUser);

          Session session = new Session();
          session.setTransactionStatusCode(
              soapfrontHeaders.get(SoapfrontHeaderContext.TRANACTION_STATUS));
          soapHeader.setSession(session);

          soapRequest.setSoapHeader(soapHeader);
        }
      }
    } catch (Exception exception) {
      log.debug(exception.getStackTrace());
    } finally {
      SoapfrontHeaderContext.clear();
    }
  }

  /**
   * After advice.
   *
   * @param joinPoint   the join point
   * @param returnValue the return value
   */
  @AfterReturning(value = "execution(* jp.co.ana.cas.*.connector.*.client.*Feign*.*(..))",
      returning = "returnValue")
  public void afterAdvice(JoinPoint joinPoint, Object returnValue) {
    log.debug("Feign afterAdvice" + joinPoint.getSignature());

    @SuppressWarnings("unchecked")
    ResponseEntity<SoapfrontResponse> soapfrontResponse =
        (ResponseEntity<SoapfrontResponse>) returnValue;
    Session session = null;
    if (Objects.nonNull(soapfrontResponse)) {
      Optional<SoapfrontResponse> optional = Optional.ofNullable(soapfrontResponse.getBody());
      if (!optional.isEmpty() && optional.get().getSoapHeader() != null) {
        session = optional.get().getSoapHeader().getSession();
      }
    }
    if (Objects.nonNull(session)) {
      Map<String, String> soapfrontHeaders = new HashMap<>();
      soapfrontHeaders.put(SoapfrontHeaderContext.SESSION_ID, session.getSessionId());
      soapfrontHeaders.put(SoapfrontHeaderContext.SEQUENCE_NUM, session.getSequenceNumber());
      soapfrontHeaders.put(SoapfrontHeaderContext.SECURITY_TOKEN, session.getSecurityToken());
      soapfrontHeaders.put(SoapfrontHeaderContext.TRANACTION_STATUS,
          session.getTransactionStatusCode());

      SoapfrontHeaderContext.setSoapfrontHeader(soapfrontHeaders);

    }
  }
}
