package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AMASecurityHostedUser;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.Session;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransactionFlowLinkType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UsernameToken;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRAddMultiElementsHeaderDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRAddMultiElementsHeaderDto   {
  @JsonProperty("amasecurityHostedUser")
  private AMASecurityHostedUser amasecurityHostedUser;

  @JsonProperty("session")
  private Session session;

  @JsonProperty("transactionFlowLinkType")
  private TransactionFlowLinkType transactionFlowLinkType;

  @JsonProperty("usernameToken")
  private UsernameToken usernameToken;

  public PNRAddMultiElementsHeaderDto amasecurityHostedUser(AMASecurityHostedUser amasecurityHostedUser) {
    this.amasecurityHostedUser = amasecurityHostedUser;
    return this;
  }

  /**
   * Get amasecurityHostedUser
   * @return amasecurityHostedUser
  */
  @ApiModelProperty(value = "")

  @Valid

  public AMASecurityHostedUser getAmasecurityHostedUser() {
    return amasecurityHostedUser;
  }

  public void setAmasecurityHostedUser(AMASecurityHostedUser amasecurityHostedUser) {
    this.amasecurityHostedUser = amasecurityHostedUser;
  }

  public PNRAddMultiElementsHeaderDto session(Session session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
  */
  @ApiModelProperty(value = "")

  @Valid

  public Session getSession() {
    return session;
  }

  public void setSession(Session session) {
    this.session = session;
  }

  public PNRAddMultiElementsHeaderDto transactionFlowLinkType(TransactionFlowLinkType transactionFlowLinkType) {
    this.transactionFlowLinkType = transactionFlowLinkType;
    return this;
  }

  /**
   * Get transactionFlowLinkType
   * @return transactionFlowLinkType
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFlowLinkType getTransactionFlowLinkType() {
    return transactionFlowLinkType;
  }

  public void setTransactionFlowLinkType(TransactionFlowLinkType transactionFlowLinkType) {
    this.transactionFlowLinkType = transactionFlowLinkType;
  }

  public PNRAddMultiElementsHeaderDto usernameToken(UsernameToken usernameToken) {
    this.usernameToken = usernameToken;
    return this;
  }

  /**
   * Get usernameToken
   * @return usernameToken
  */
  @ApiModelProperty(value = "")

  @Valid

  public UsernameToken getUsernameToken() {
    return usernameToken;
  }

  public void setUsernameToken(UsernameToken usernameToken) {
    this.usernameToken = usernameToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRAddMultiElementsHeaderDto pnRAddMultiElementsHeaderDto = (PNRAddMultiElementsHeaderDto) o;
    return Objects.equals(this.amasecurityHostedUser, pnRAddMultiElementsHeaderDto.amasecurityHostedUser) &&
        Objects.equals(this.session, pnRAddMultiElementsHeaderDto.session) &&
        Objects.equals(this.transactionFlowLinkType, pnRAddMultiElementsHeaderDto.transactionFlowLinkType) &&
        Objects.equals(this.usernameToken, pnRAddMultiElementsHeaderDto.usernameToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amasecurityHostedUser, session, transactionFlowLinkType, usernameToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRAddMultiElementsHeaderDto {\n");
    
    sb.append("    amasecurityHostedUser: ").append(toIndentedString(amasecurityHostedUser)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    transactionFlowLinkType: ").append(toIndentedString(transactionFlowLinkType)).append("\n");
    sb.append("    usernameToken: ").append(toIndentedString(usernameToken)).append("\n");
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

