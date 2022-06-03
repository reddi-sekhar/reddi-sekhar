package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CarbonDioxydeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CarbonDioxydeInfo   {
  @JsonProperty("carbonDioxydeAmount")
  private QuantityType carbonDioxydeAmount;

  @JsonProperty("carbonDioxydeInfoSource")
  private FreeTextInformationType carbonDioxydeInfoSource;

  public CarbonDioxydeInfo carbonDioxydeAmount(QuantityType carbonDioxydeAmount) {
    this.carbonDioxydeAmount = carbonDioxydeAmount;
    return this;
  }

  /**
   * Get carbonDioxydeAmount
   * @return carbonDioxydeAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityType getCarbonDioxydeAmount() {
    return carbonDioxydeAmount;
  }

  public void setCarbonDioxydeAmount(QuantityType carbonDioxydeAmount) {
    this.carbonDioxydeAmount = carbonDioxydeAmount;
  }

  public CarbonDioxydeInfo carbonDioxydeInfoSource(FreeTextInformationType carbonDioxydeInfoSource) {
    this.carbonDioxydeInfoSource = carbonDioxydeInfoSource;
    return this;
  }

  /**
   * Get carbonDioxydeInfoSource
   * @return carbonDioxydeInfoSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType getCarbonDioxydeInfoSource() {
    return carbonDioxydeInfoSource;
  }

  public void setCarbonDioxydeInfoSource(FreeTextInformationType carbonDioxydeInfoSource) {
    this.carbonDioxydeInfoSource = carbonDioxydeInfoSource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarbonDioxydeInfo carbonDioxydeInfo = (CarbonDioxydeInfo) o;
    return Objects.equals(this.carbonDioxydeAmount, carbonDioxydeInfo.carbonDioxydeAmount) &&
        Objects.equals(this.carbonDioxydeInfoSource, carbonDioxydeInfo.carbonDioxydeInfoSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carbonDioxydeAmount, carbonDioxydeInfoSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarbonDioxydeInfo {\n");
    
    sb.append("    carbonDioxydeAmount: ").append(toIndentedString(carbonDioxydeAmount)).append("\n");
    sb.append("    carbonDioxydeInfoSource: ").append(toIndentedString(carbonDioxydeInfoSource)).append("\n");
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

