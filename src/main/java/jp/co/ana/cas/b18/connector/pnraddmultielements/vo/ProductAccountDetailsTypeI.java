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
 * ProductAccountDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductAccountDetailsTypeI   {
  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("category")
  private String category;

  @JsonProperty("rateClass")
  private String rateClass;

  @JsonProperty("sequenceNumber")
  private String sequenceNumber;

  @JsonProperty("versionNumber")
  private String versionNumber;

  public ProductAccountDetailsTypeI approvalCode(String approvalCode) {
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

  public ProductAccountDetailsTypeI category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ProductAccountDetailsTypeI rateClass(String rateClass) {
    this.rateClass = rateClass;
    return this;
  }

  /**
   * Get rateClass
   * @return rateClass
  */
  @ApiModelProperty(value = "")


  public String getRateClass() {
    return rateClass;
  }

  public void setRateClass(String rateClass) {
    this.rateClass = rateClass;
  }

  public ProductAccountDetailsTypeI sequenceNumber(String sequenceNumber) {
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

  public ProductAccountDetailsTypeI versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
  */
  @ApiModelProperty(value = "")


  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAccountDetailsTypeI productAccountDetailsTypeI = (ProductAccountDetailsTypeI) o;
    return Objects.equals(this.approvalCode, productAccountDetailsTypeI.approvalCode) &&
        Objects.equals(this.category, productAccountDetailsTypeI.category) &&
        Objects.equals(this.rateClass, productAccountDetailsTypeI.rateClass) &&
        Objects.equals(this.sequenceNumber, productAccountDetailsTypeI.sequenceNumber) &&
        Objects.equals(this.versionNumber, productAccountDetailsTypeI.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, category, rateClass, sequenceNumber, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAccountDetailsTypeI {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    rateClass: ").append(toIndentedString(rateClass)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

