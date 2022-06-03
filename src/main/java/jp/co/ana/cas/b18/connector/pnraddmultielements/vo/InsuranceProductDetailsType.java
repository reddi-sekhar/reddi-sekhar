package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceProductDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceProductDetailsType   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("extraReference")
  @Valid
  private List<String> extraReference = null;

  public InsuranceProductDetailsType companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

  /**
   * Get companyCode
   * @return companyCode
  */
  @ApiModelProperty(value = "")


  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public InsuranceProductDetailsType countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InsuranceProductDetailsType extraReference(List<String> extraReference) {
    this.extraReference = extraReference;
    return this;
  }

  public InsuranceProductDetailsType addExtraReferenceItem(String extraReferenceItem) {
    if (this.extraReference == null) {
      this.extraReference = new ArrayList<>();
    }
    this.extraReference.add(extraReferenceItem);
    return this;
  }

  /**
   * Get extraReference
   * @return extraReference
  */
  @ApiModelProperty(value = "")


  public List<String> getExtraReference() {
    return extraReference;
  }

  public void setExtraReference(List<String> extraReference) {
    this.extraReference = extraReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceProductDetailsType insuranceProductDetailsType = (InsuranceProductDetailsType) o;
    return Objects.equals(this.companyCode, insuranceProductDetailsType.companyCode) &&
        Objects.equals(this.countryCode, insuranceProductDetailsType.countryCode) &&
        Objects.equals(this.extraReference, insuranceProductDetailsType.extraReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, countryCode, extraReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceProductDetailsType {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    extraReference: ").append(toIndentedString(extraReference)).append("\n");
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

