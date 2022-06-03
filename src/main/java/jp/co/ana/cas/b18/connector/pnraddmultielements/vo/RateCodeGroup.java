package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareQualifierDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType136708S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RateCodeGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateCodeGroup   {
  @JsonProperty("additionalInfo")
  private FreeTextInformationType136708S additionalInfo;

  @JsonProperty("rateCodeInfo")
  private FareQualifierDetailsTypeI rateCodeInfo;

  public RateCodeGroup additionalInfo(FreeTextInformationType136708S additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType136708S getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(FreeTextInformationType136708S additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public RateCodeGroup rateCodeInfo(FareQualifierDetailsTypeI rateCodeInfo) {
    this.rateCodeInfo = rateCodeInfo;
    return this;
  }

  /**
   * Get rateCodeInfo
   * @return rateCodeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareQualifierDetailsTypeI getRateCodeInfo() {
    return rateCodeInfo;
  }

  public void setRateCodeInfo(FareQualifierDetailsTypeI rateCodeInfo) {
    this.rateCodeInfo = rateCodeInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCodeGroup rateCodeGroup = (RateCodeGroup) o;
    return Objects.equals(this.additionalInfo, rateCodeGroup.additionalInfo) &&
        Objects.equals(this.rateCodeInfo, rateCodeGroup.rateCodeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, rateCodeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCodeGroup {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    rateCodeInfo: ").append(toIndentedString(rateCodeInfo)).append("\n");
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

