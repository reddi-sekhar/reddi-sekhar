package jp.co.ana.cas.soapfront.request;


/**
 * The Interface SoapfrontRequest.
 */
public interface SoapfrontRequest {

  /**
   * Gets the soap header.
   *
   * @return the soap header
   */
  public RequestSoapHeader getSoapHeader();
  
  /**
   * Sets the soap header.
   *
   * @param soapHeader the new soap header
   */
  public void setSoapHeader(RequestSoapHeader soapHeader);
}
