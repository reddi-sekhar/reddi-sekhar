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
 * RateIndicatorsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateIndicatorsType   {
  @JsonProperty("rateChangeIndicator")
  private String rateChangeIndicator;

  public RateIndicatorsType rateChangeIndicator(String rateChangeIndicator) {
    this.rateChangeIndicator = rateChangeIndicator;
    return this;
  }

  /**
   * Get rateChangeIndicator
   * @return rateChangeIndicator
  */
  @ApiModelProperty(value = "")


  public String getRateChangeIndicator() {
    return rateChangeIndicator;
  }

  public void setRateChangeIndicator(String rateChangeIndicator) {
    this.rateChangeIndicator = rateChangeIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateIndicatorsType rateIndicatorsType = (RateIndicatorsType) o;
    return Objects.equals(this.rateChangeIndicator, rateIndicatorsType.rateChangeIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateChangeIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateIndicatorsType {\n");
    
    sb.append("    rateChangeIndicator: ").append(toIndentedString(rateChangeIndicator)).append("\n");
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

