package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceNameType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI1689S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerDocumentInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInsuranceInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceInformation   {
  @JsonProperty("insuranceDocInfo")
  private TravellerDocumentInformationTypeU insuranceDocInfo;

  @JsonProperty("insuranceMonetaryInformation")
  private MonetaryInformationTypeI1689S insuranceMonetaryInformation;

  @JsonProperty("insuranceName")
  private InsuranceNameType insuranceName;

  @JsonProperty("insurancePremiumInfo")
  private TravellerInsuranceInformationType insurancePremiumInfo;

  public InsuranceInformation insuranceDocInfo(TravellerDocumentInformationTypeU insuranceDocInfo) {
    this.insuranceDocInfo = insuranceDocInfo;
    return this;
  }

  /**
   * Get insuranceDocInfo
   * @return insuranceDocInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerDocumentInformationTypeU getInsuranceDocInfo() {
    return insuranceDocInfo;
  }

  public void setInsuranceDocInfo(TravellerDocumentInformationTypeU insuranceDocInfo) {
    this.insuranceDocInfo = insuranceDocInfo;
  }

  public InsuranceInformation insuranceMonetaryInformation(MonetaryInformationTypeI1689S insuranceMonetaryInformation) {
    this.insuranceMonetaryInformation = insuranceMonetaryInformation;
    return this;
  }

  /**
   * Get insuranceMonetaryInformation
   * @return insuranceMonetaryInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI1689S getInsuranceMonetaryInformation() {
    return insuranceMonetaryInformation;
  }

  public void setInsuranceMonetaryInformation(MonetaryInformationTypeI1689S insuranceMonetaryInformation) {
    this.insuranceMonetaryInformation = insuranceMonetaryInformation;
  }

  public InsuranceInformation insuranceName(InsuranceNameType insuranceName) {
    this.insuranceName = insuranceName;
    return this;
  }

  /**
   * Get insuranceName
   * @return insuranceName
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceNameType getInsuranceName() {
    return insuranceName;
  }

  public void setInsuranceName(InsuranceNameType insuranceName) {
    this.insuranceName = insuranceName;
  }

  public InsuranceInformation insurancePremiumInfo(TravellerInsuranceInformationType insurancePremiumInfo) {
    this.insurancePremiumInfo = insurancePremiumInfo;
    return this;
  }

  /**
   * Get insurancePremiumInfo
   * @return insurancePremiumInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInsuranceInformationType getInsurancePremiumInfo() {
    return insurancePremiumInfo;
  }

  public void setInsurancePremiumInfo(TravellerInsuranceInformationType insurancePremiumInfo) {
    this.insurancePremiumInfo = insurancePremiumInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceInformation insuranceInformation = (InsuranceInformation) o;
    return Objects.equals(this.insuranceDocInfo, insuranceInformation.insuranceDocInfo) &&
        Objects.equals(this.insuranceMonetaryInformation, insuranceInformation.insuranceMonetaryInformation) &&
        Objects.equals(this.insuranceName, insuranceInformation.insuranceName) &&
        Objects.equals(this.insurancePremiumInfo, insuranceInformation.insurancePremiumInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceDocInfo, insuranceMonetaryInformation, insuranceName, insurancePremiumInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceInformation {\n");
    
    sb.append("    insuranceDocInfo: ").append(toIndentedString(insuranceDocInfo)).append("\n");
    sb.append("    insuranceMonetaryInformation: ").append(toIndentedString(insuranceMonetaryInformation)).append("\n");
    sb.append("    insuranceName: ").append(toIndentedString(insuranceName)).append("\n");
    sb.append("    insurancePremiumInfo: ").append(toIndentedString(insurancePremiumInfo)).append("\n");
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

