package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.AMASecurityHostedUser;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.Session;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.TransactionFlowLinkType;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.UsernameToken;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandCrypticHeaderDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCrypticHeaderDto   {
  @JsonProperty("amasecurityHostedUser")
  private AMASecurityHostedUser amasecurityHostedUser;

  @JsonProperty("session")
  private Session session;

  @JsonProperty("transactionFlowLinkType")
  private TransactionFlowLinkType transactionFlowLinkType;

  @JsonProperty("usernameToken")
  private UsernameToken usernameToken;

  public CommandCrypticHeaderDto amasecurityHostedUser(AMASecurityHostedUser amasecurityHostedUser) {
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

  public CommandCrypticHeaderDto session(Session session) {
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

  public CommandCrypticHeaderDto transactionFlowLinkType(TransactionFlowLinkType transactionFlowLinkType) {
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

  public CommandCrypticHeaderDto usernameToken(UsernameToken usernameToken) {
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
    CommandCrypticHeaderDto commandCrypticHeaderDto = (CommandCrypticHeaderDto) o;
    return Objects.equals(this.amasecurityHostedUser, commandCrypticHeaderDto.amasecurityHostedUser) &&
        Objects.equals(this.session, commandCrypticHeaderDto.session) &&
        Objects.equals(this.transactionFlowLinkType, commandCrypticHeaderDto.transactionFlowLinkType) &&
        Objects.equals(this.usernameToken, commandCrypticHeaderDto.usernameToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amasecurityHostedUser, session, transactionFlowLinkType, usernameToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticHeaderDto {\n");
    
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

