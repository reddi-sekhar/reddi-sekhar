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
 * AccountingElementType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccountingElementType1   {
  @JsonProperty("clientReference")
  private String clientReference;

  @JsonProperty("companyNumber")
  private String companyNumber;

  @JsonProperty("costNumber")
  private String costNumber;

  @JsonProperty("gsttaxDetails")
  private String gsttaxDetails;

  @JsonProperty("number")
  private String number;

  public AccountingElementType1 clientReference(String clientReference) {
    this.clientReference = clientReference;
    return this;
  }

  /**
   * Get clientReference
   * @return clientReference
  */
  @ApiModelProperty(value = "")


  public String getClientReference() {
    return clientReference;
  }

  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }

  public AccountingElementType1 companyNumber(String companyNumber) {
    this.companyNumber = companyNumber;
    return this;
  }

  /**
   * Get companyNumber
   * @return companyNumber
  */
  @ApiModelProperty(value = "")


  public String getCompanyNumber() {
    return companyNumber;
  }

  public void setCompanyNumber(String companyNumber) {
    this.companyNumber = companyNumber;
  }

  public AccountingElementType1 costNumber(String costNumber) {
    this.costNumber = costNumber;
    return this;
  }

  /**
   * Get costNumber
   * @return costNumber
  */
  @ApiModelProperty(value = "")


  public String getCostNumber() {
    return costNumber;
  }

  public void setCostNumber(String costNumber) {
    this.costNumber = costNumber;
  }

  public AccountingElementType1 gsttaxDetails(String gsttaxDetails) {
    this.gsttaxDetails = gsttaxDetails;
    return this;
  }

  /**
   * Get gsttaxDetails
   * @return gsttaxDetails
  */
  @ApiModelProperty(value = "")


  public String getGsttaxDetails() {
    return gsttaxDetails;
  }

  public void setGsttaxDetails(String gsttaxDetails) {
    this.gsttaxDetails = gsttaxDetails;
  }

  public AccountingElementType1 number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountingElementType1 accountingElementType1 = (AccountingElementType1) o;
    return Objects.equals(this.clientReference, accountingElementType1.clientReference) &&
        Objects.equals(this.companyNumber, accountingElementType1.companyNumber) &&
        Objects.equals(this.costNumber, accountingElementType1.costNumber) &&
        Objects.equals(this.gsttaxDetails, accountingElementType1.gsttaxDetails) &&
        Objects.equals(this.number, accountingElementType1.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReference, companyNumber, costNumber, gsttaxDetails, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountingElementType1 {\n");
    
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    companyNumber: ").append(toIndentedString(companyNumber)).append("\n");
    sb.append("    costNumber: ").append(toIndentedString(costNumber)).append("\n");
    sb.append("    gsttaxDetails: ").append(toIndentedString(gsttaxDetails)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

