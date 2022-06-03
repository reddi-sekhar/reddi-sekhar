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
 * StatusDetailsTypeI57035C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StatusDetailsTypeI57035C   {
  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("isPNRModifDuringTrans")
  private String isPNRModifDuringTrans;

  public StatusDetailsTypeI57035C indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
  */
  @ApiModelProperty(value = "")


  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public StatusDetailsTypeI57035C isPNRModifDuringTrans(String isPNRModifDuringTrans) {
    this.isPNRModifDuringTrans = isPNRModifDuringTrans;
    return this;
  }

  /**
   * Get isPNRModifDuringTrans
   * @return isPNRModifDuringTrans
  */
  @ApiModelProperty(value = "")


  public String getIsPNRModifDuringTrans() {
    return isPNRModifDuringTrans;
  }

  public void setIsPNRModifDuringTrans(String isPNRModifDuringTrans) {
    this.isPNRModifDuringTrans = isPNRModifDuringTrans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetailsTypeI57035C statusDetailsTypeI57035C = (StatusDetailsTypeI57035C) o;
    return Objects.equals(this.indicator, statusDetailsTypeI57035C.indicator) &&
        Objects.equals(this.isPNRModifDuringTrans, statusDetailsTypeI57035C.isPNRModifDuringTrans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, isPNRModifDuringTrans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetailsTypeI57035C {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    isPNRModifDuringTrans: ").append(toIndentedString(isPNRModifDuringTrans)).append("\n");
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

