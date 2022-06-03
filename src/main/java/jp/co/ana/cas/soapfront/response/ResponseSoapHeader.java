package jp.co.ana.cas.soapfront.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;
import jp.co.ana.cas.soapfront.model.Session;
import jp.co.ana.cas.soapfront.model.TransactionFlowLinkType;

/**
 * ReplyHeaderDto.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class ResponseSoapHeader   {
  
  /** The session. */
  @JsonProperty("session")
  private Session session;

  /** The transaction flow link type. */
  @JsonProperty("transactionFlowLinkType")
  private TransactionFlowLinkType transactionFlowLinkType;

  /**
   * Session.
   *
   * @param session the session
   * @return the response soap header
   */
  public ResponseSoapHeader session(Session session) {
    this.session = session;
    return this;
  }

  /**
   * Get session.
   *
   * @return session
   */
  @ApiModelProperty(value = "")

  @Valid

  public Session getSession() {
    return session;
  }

  /**
   * Sets the session.
   *
   * @param session the new session
   */
  public void setSession(Session session) {
    this.session = session;
  }

  /**
   * Transaction flow link type.
   *
   * @param transactionFlowLinkType the transaction flow link type
   * @return the response soap header
   */
  public ResponseSoapHeader transactionFlowLinkType(
      TransactionFlowLinkType transactionFlowLinkType) {
    this.transactionFlowLinkType = transactionFlowLinkType;
    return this;
  }

  /**
   * Get transactionFlowLinkType.
   *
   * @return transactionFlowLinkType
   */
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFlowLinkType getTransactionFlowLinkType() {
    return transactionFlowLinkType;
  }

  /**
   * Sets the transaction flow link type.
   *
   * @param transactionFlowLinkType the new transaction flow link type
   */
  public void setTransactionFlowLinkType(TransactionFlowLinkType transactionFlowLinkType) {
    this.transactionFlowLinkType = transactionFlowLinkType;
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
    ResponseSoapHeader replyHeaderDto = (ResponseSoapHeader) o;
    return Objects.equals(this.session, replyHeaderDto.session)
        && Objects.equals(this.transactionFlowLinkType, replyHeaderDto.transactionFlowLinkType);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(session, transactionFlowLinkType);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyHeaderDto {\n");
    
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    transactionFlowLinkType: ")
    .append(toIndentedString(transactionFlowLinkType)).append("\n");
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

