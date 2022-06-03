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
 * DiscountInformationDetailsType141679C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiscountInformationDetailsType141679C   {
  @JsonProperty("beneficiary")
  private String beneficiary;

  @JsonProperty("discountCode")
  private String discountCode;

  @JsonProperty("percentage")
  private Long percentage;

  @JsonProperty("unitQuantity")
  private Long unitQuantity;

  public DiscountInformationDetailsType141679C beneficiary(String beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
  */
  @ApiModelProperty(value = "")


  public String getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(String beneficiary) {
    this.beneficiary = beneficiary;
  }

  public DiscountInformationDetailsType141679C discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

  /**
   * Get discountCode
   * @return discountCode
  */
  @ApiModelProperty(value = "")


  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  public DiscountInformationDetailsType141679C percentage(Long percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  */
  @ApiModelProperty(value = "")


  public Long getPercentage() {
    return percentage;
  }

  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }

  public DiscountInformationDetailsType141679C unitQuantity(Long unitQuantity) {
    this.unitQuantity = unitQuantity;
    return this;
  }

  /**
   * Get unitQuantity
   * @return unitQuantity
  */
  @ApiModelProperty(value = "")


  public Long getUnitQuantity() {
    return unitQuantity;
  }

  public void setUnitQuantity(Long unitQuantity) {
    this.unitQuantity = unitQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInformationDetailsType141679C discountInformationDetailsType141679C = (DiscountInformationDetailsType141679C) o;
    return Objects.equals(this.beneficiary, discountInformationDetailsType141679C.beneficiary) &&
        Objects.equals(this.discountCode, discountInformationDetailsType141679C.discountCode) &&
        Objects.equals(this.percentage, discountInformationDetailsType141679C.percentage) &&
        Objects.equals(this.unitQuantity, discountInformationDetailsType141679C.unitQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary, discountCode, percentage, unitQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInformationDetailsType141679C {\n");
    
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    unitQuantity: ").append(toIndentedString(unitQuantity)).append("\n");
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

