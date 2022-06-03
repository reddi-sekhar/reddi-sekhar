package jp.co.ana.cas.soapfront.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;
import jp.co.ana.cas.soapfront.model.AMASecurityHostedUser;
import jp.co.ana.cas.soapfront.model.Session;
import jp.co.ana.cas.soapfront.model.TransactionFlowLinkType;
import jp.co.ana.cas.soapfront.model.UsernameToken;

/**
 * HeaderDto.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-05-09T17:16:25.118849100+09:00[Asia/Tokyo]")
public class RequestSoapHeader   {
  
  /** The amasecurity hosted user. */
  @JsonProperty("amasecurityHostedUser")
  private AMASecurityHostedUser amasecurityHostedUser;

  /** The session. */
  @JsonProperty("session")
  private Session session;

  /** The transaction flow link type. */
  @JsonProperty("transactionFlowLinkType")
  private TransactionFlowLinkType transactionFlowLinkType;

  /** The username token. */
  @JsonProperty("usernameToken")
  private UsernameToken usernameToken;

  /**
   * Amasecurity hosted user.
   *
   * @param amasecurityHostedUser the amasecurity hosted user
   * @return the request soap header
   */
  public RequestSoapHeader amasecurityHostedUser(AMASecurityHostedUser amasecurityHostedUser) {
    this.amasecurityHostedUser = amasecurityHostedUser;
    return this;
  }

  /**
   * Get amasecurityHostedUser.
   *
   * @return amasecurityHostedUser
   */
  @ApiModelProperty(value = "")

  @Valid

  public AMASecurityHostedUser getAmasecurityHostedUser() {
    return amasecurityHostedUser;
  }

  /**
   * Sets the amasecurity hosted user.
   *
   * @param amasecurityHostedUser the new amasecurity hosted user
   */
  public void setAmasecurityHostedUser(AMASecurityHostedUser amasecurityHostedUser) {
    this.amasecurityHostedUser = amasecurityHostedUser;
  }

  /**
   * Session.
   *
   * @param session the session
   * @return the request soap header
   */
  public RequestSoapHeader session(Session session) {
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
   * @return the request soap header
   */
  public RequestSoapHeader transactionFlowLinkType(
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
   * Username token.
   *
   * @param usernameToken the username token
   * @return the request soap header
   */
  public RequestSoapHeader usernameToken(UsernameToken usernameToken) {
    this.usernameToken = usernameToken;
    return this;
  }

  /**
   * Get usernameToken.
   *
   * @return usernameToken
   */
  @ApiModelProperty(value = "")

  @Valid

  public UsernameToken getUsernameToken() {
    return usernameToken;
  }

  /**
   * Sets the username token.
   *
   * @param usernameToken the new username token
   */
  public void setUsernameToken(UsernameToken usernameToken) {
    this.usernameToken = usernameToken;
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
    RequestSoapHeader headerDto = (RequestSoapHeader) o;
    return Objects.equals(this.amasecurityHostedUser, headerDto.amasecurityHostedUser)
        && Objects.equals(this.session, headerDto.session)
        && Objects.equals(this.transactionFlowLinkType, headerDto.transactionFlowLinkType)
        && Objects.equals(this.usernameToken, headerDto.usernameToken);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(amasecurityHostedUser, session, transactionFlowLinkType, usernameToken);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderDto {\n");
    
    sb.append("    amasecurityHostedUser: ")
    .append(toIndentedString(amasecurityHostedUser)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    transactionFlowLinkType: ")
    .append(toIndentedString(transactionFlowLinkType)).append("\n");
    sb.append("    usernameToken: ").append(toIndentedString(usernameToken)).append("\n");
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

