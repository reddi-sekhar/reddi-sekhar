package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Session
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class Session   {
  @JsonProperty("securityToken")
  private String securityToken;

  @JsonProperty("sequenceNumber")
  private String sequenceNumber;

  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("transactionStatusCode")
  private String transactionStatusCode;

  public Session securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

  /**
   * Get securityToken
   * @return securityToken
  */
  @ApiModelProperty(value = "")


  public String getSecurityToken() {
    return securityToken;
  }

  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }

  public Session sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
  */
  @ApiModelProperty(value = "")


  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public Session sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  @ApiModelProperty(value = "")


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Session transactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
    return this;
  }

  /**
   * Get transactionStatusCode
   * @return transactionStatusCode
  */
  @ApiModelProperty(value = "")


  public String getTransactionStatusCode() {
    return transactionStatusCode;
  }

  public void setTransactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.securityToken, session.securityToken) &&
        Objects.equals(this.sequenceNumber, session.sequenceNumber) &&
        Objects.equals(this.sessionId, session.sessionId) &&
        Objects.equals(this.transactionStatusCode, session.transactionStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityToken, sequenceNumber, sessionId, transactionStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    transactionStatusCode: ").append(toIndentedString(transactionStatusCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

