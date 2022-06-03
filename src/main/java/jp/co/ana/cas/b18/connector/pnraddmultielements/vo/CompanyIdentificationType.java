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
 * CompanyIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyIdentificationType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("otherPartnerCode")
  private String otherPartnerCode;

  @JsonProperty("partnerCode")
  private String partnerCode;

  public CompanyIdentificationType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CompanyIdentificationType otherPartnerCode(String otherPartnerCode) {
    this.otherPartnerCode = otherPartnerCode;
    return this;
  }

  /**
   * Get otherPartnerCode
   * @return otherPartnerCode
  */
  @ApiModelProperty(value = "")


  public String getOtherPartnerCode() {
    return otherPartnerCode;
  }

  public void setOtherPartnerCode(String otherPartnerCode) {
    this.otherPartnerCode = otherPartnerCode;
  }

  public CompanyIdentificationType partnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
    return this;
  }

  /**
   * Get partnerCode
   * @return partnerCode
  */
  @ApiModelProperty(value = "")


  public String getPartnerCode() {
    return partnerCode;
  }

  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIdentificationType companyIdentificationType = (CompanyIdentificationType) o;
    return Objects.equals(this.code, companyIdentificationType.code) &&
        Objects.equals(this.otherPartnerCode, companyIdentificationType.otherPartnerCode) &&
        Objects.equals(this.partnerCode, companyIdentificationType.partnerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, otherPartnerCode, partnerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIdentificationType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    otherPartnerCode: ").append(toIndentedString(otherPartnerCode)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
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

