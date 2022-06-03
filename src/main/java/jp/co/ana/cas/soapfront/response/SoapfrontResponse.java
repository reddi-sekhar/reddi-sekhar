package jp.co.ana.cas.soapfront.response;


/**
 * The Interface SoapfrontResponse.
 */
public interface SoapfrontResponse {

  /**
   * Gets the soap header.
   *
   * @return the soap header
   */
  public ResponseSoapHeader getSoapHeader();
  
  /**
   * Sets the soap header.
   *
   * @param soapHeader the new soap header
   */
  public void setSoapHeader(ResponseSoapHeader soapHeader);
}
