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
 * FormatedTourCodeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormatedTourCodeType   {
  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("partyId")
  private String partyId;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("year")
  private Long year;

  public FormatedTourCodeType approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  /**
   * Get approvalCode
   * @return approvalCode
  */
  @ApiModelProperty(value = "")


  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public FormatedTourCodeType companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FormatedTourCodeType partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * Get partyId
   * @return partyId
  */
  @ApiModelProperty(value = "")


  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public FormatedTourCodeType productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public FormatedTourCodeType year(Long year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @ApiModelProperty(value = "")


  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatedTourCodeType formatedTourCodeType = (FormatedTourCodeType) o;
    return Objects.equals(this.approvalCode, formatedTourCodeType.approvalCode) &&
        Objects.equals(this.companyId, formatedTourCodeType.companyId) &&
        Objects.equals(this.partyId, formatedTourCodeType.partyId) &&
        Objects.equals(this.productId, formatedTourCodeType.productId) &&
        Objects.equals(this.year, formatedTourCodeType.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, companyId, partyId, productId, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatedTourCodeType {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

