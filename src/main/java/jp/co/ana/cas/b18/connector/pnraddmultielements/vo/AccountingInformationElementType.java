package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccountingElementType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountingInformationElementType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccountingInformationElementType   {
  @JsonProperty("account")
  private AccountingElementType account;

  @JsonProperty("accountNumberOfUnits")
  private String accountNumberOfUnits;

  public AccountingInformationElementType account(AccountingElementType account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountingElementType getAccount() {
    return account;
  }

  public void setAccount(AccountingElementType account) {
    this.account = account;
  }

  public AccountingInformationElementType accountNumberOfUnits(String accountNumberOfUnits) {
    this.accountNumberOfUnits = accountNumberOfUnits;
    return this;
  }

  /**
   * Get accountNumberOfUnits
   * @return accountNumberOfUnits
  */
  @ApiModelProperty(value = "")


  public String getAccountNumberOfUnits() {
    return accountNumberOfUnits;
  }

  public void setAccountNumberOfUnits(String accountNumberOfUnits) {
    this.accountNumberOfUnits = accountNumberOfUnits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountingInformationElementType accountingInformationElementType = (AccountingInformationElementType) o;
    return Objects.equals(this.account, accountingInformationElementType.account) &&
        Objects.equals(this.accountNumberOfUnits, accountingInformationElementType.accountNumberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountNumberOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountingInformationElementType {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountNumberOfUnits: ").append(toIndentedString(accountNumberOfUnits)).append("\n");
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

