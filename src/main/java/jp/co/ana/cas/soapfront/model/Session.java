package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Session.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class Session   {
  
  /** The security token. */
  @JsonProperty("securityToken")
  private String securityToken;

  /** The sequence number. */
  @JsonProperty("sequenceNumber")
  private String sequenceNumber;

  /** The session id. */
  @JsonProperty("sessionId")
  private String sessionId;

  /** The transaction status code. */
  @JsonProperty("transactionStatusCode")
  private String transactionStatusCode;

  /**
   * Security token.
   *
   * @param securityToken the security token
   * @return the session
   */
  public Session securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

  /**
   * Get securityToken.
   *
   * @return securityToken
   */
  @ApiModelProperty(value = "")


  public String getSecurityToken() {
    return securityToken;
  }

  /**
   * Sets the security token.
   *
   * @param securityToken the new security token
   */
  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }

  /**
   * Sequence number.
   *
   * @param sequenceNumber the sequence number
   * @return the session
   */
  public Session sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber.
   *
   * @return sequenceNumber
   */
  @ApiModelProperty(value = "")


  public String getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * Sets the sequence number.
   *
   * @param sequenceNumber the new sequence number
   */
  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  /**
   * Session id.
   *
   * @param sessionId the session id
   * @return the session
   */
  public Session sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId.
   *
   * @return sessionId
   */
  @ApiModelProperty(value = "")


  public String getSessionId() {
    return sessionId;
  }

  /**
   * Sets the session id.
   *
   * @param sessionId the new session id
   */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  /**
   * Transaction status code.
   *
   * @param transactionStatusCode the transaction status code
   * @return the session
   */
  public Session transactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
    return this;
  }

  /**
   * Get transactionStatusCode.
   *
   * @return transactionStatusCode
   */
  @ApiModelProperty(value = "")


  public String getTransactionStatusCode() {
    return transactionStatusCode;
  }

  /**
   * Sets the transaction status code.
   *
   * @param transactionStatusCode the new transaction status code
   */
  public void setTransactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.securityToken, session.securityToken)
        && Objects.equals(this.sequenceNumber, session.sequenceNumber)
        &&  Objects.equals(this.sessionId, session.sessionId)
        && Objects.equals(this.transactionStatusCode, session.transactionStatusCode);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(securityToken, sequenceNumber, sessionId, transactionStatusCode);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    transactionStatusCode: ")
      .append(toIndentedString(transactionStatusCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

