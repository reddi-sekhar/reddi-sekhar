package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductAccountDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentTravellerVerificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerVerificationType   {
  @JsonProperty("account")
  private ProductAccountDetailsType account;

  @JsonProperty("actionRequest")
  private String actionRequest;

  @JsonProperty("company")
  private CompanyIdentificationType company;

  public FrequentTravellerVerificationType account(ProductAccountDetailsType account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductAccountDetailsType getAccount() {
    return account;
  }

  public void setAccount(ProductAccountDetailsType account) {
    this.account = account;
  }

  public FrequentTravellerVerificationType actionRequest(String actionRequest) {
    this.actionRequest = actionRequest;
    return this;
  }

  /**
   * Get actionRequest
   * @return actionRequest
  */
  @ApiModelProperty(value = "")


  public String getActionRequest() {
    return actionRequest;
  }

  public void setActionRequest(String actionRequest) {
    this.actionRequest = actionRequest;
  }

  public FrequentTravellerVerificationType company(CompanyIdentificationType company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyIdentificationType getCompany() {
    return company;
  }

  public void setCompany(CompanyIdentificationType company) {
    this.company = company;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerVerificationType frequentTravellerVerificationType = (FrequentTravellerVerificationType) o;
    return Objects.equals(this.account, frequentTravellerVerificationType.account) &&
        Objects.equals(this.actionRequest, frequentTravellerVerificationType.actionRequest) &&
        Objects.equals(this.company, frequentTravellerVerificationType.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, actionRequest, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerVerificationType {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    actionRequest: ").append(toIndentedString(actionRequest)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

