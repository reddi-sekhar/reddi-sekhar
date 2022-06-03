package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccountingElementType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountingInformationElementType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccountingInformationElementType1   {
  @JsonProperty("account")
  private AccountingElementType1 account;

  @JsonProperty("accountNumberOfUnits")
  private String accountNumberOfUnits;

  public AccountingInformationElementType1 account(AccountingElementType1 account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountingElementType1 getAccount() {
    return account;
  }

  public void setAccount(AccountingElementType1 account) {
    this.account = account;
  }

  public AccountingInformationElementType1 accountNumberOfUnits(String accountNumberOfUnits) {
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
    AccountingInformationElementType1 accountingInformationElementType1 = (AccountingInformationElementType1) o;
    return Objects.equals(this.account, accountingInformationElementType1.account) &&
        Objects.equals(this.accountNumberOfUnits, accountingInformationElementType1.accountNumberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountNumberOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountingInformationElementType1 {\n");
    
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

