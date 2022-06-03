package jp.co.ana.cas.soapfront.utils;

import java.util.Map;

/**
 * The Class SoapfrontHeaderContext.
 */
public class SoapfrontHeaderContext {

  /** The Constant CONTEXT. */
  private static final ThreadLocal<Map<String, String>> CONTEXT = new ThreadLocal<>();
  
  /** The Constant SESSION_ID. */
  public static final String SESSION_ID = "apass-session-id";
  
  /** The Constant SEQUENCE_NUM. */
  public static final String SEQUENCE_NUM = "apass-sequence-number";
  
  /** The Constant SECURITY_TOKEN. */
  public static final String SECURITY_TOKEN = "apass-security-token";
  
  /** The Constant TRANACTION_STATUS. */
  public static final String TRANACTION_STATUS = "apass-transaction-status-code";
  
  /** The Constant USER_NAME. */
  public static final String USER_NAME = "apass-username";
  
  /** The Constant PASSWORD. */
  public static final String PASSWORD = "apass-password";
  
  /** The Constant PSUDO_CITY_CODE. */
  public static final String PSUDO_CITY_CODE = "apass-pseudo-city-code";
  
  /** The Constant AGENT_DUTY_CODE. */
  public static final String AGENT_DUTY_CODE = "apass-agent-duty-code";

  /**
   * Instantiates a new soapfront header context.
   */
  private SoapfrontHeaderContext() {
    
  }
  
  /**
   * Sets the soapfront header.
   *
   * @param soapfrontHeader the soapfront header
   */
  public static void setSoapfrontHeader(Map<String, String> soapfrontHeader) {
    CONTEXT.set(soapfrontHeader);
  }

  /**
   * Gets the soapfront header.
   *
   * @return the soapfront header
   */
  public static Map<String, String> getSoapfrontHeader() {
    return CONTEXT.get();
  }

  /**
   * Clear.
   */
  public static void clear() {
    CONTEXT.remove();
  }
}
