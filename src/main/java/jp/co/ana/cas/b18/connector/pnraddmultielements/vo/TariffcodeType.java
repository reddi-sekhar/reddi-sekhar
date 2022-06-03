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
 * TariffcodeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffcodeType   {
  @JsonProperty("tariffCode")
  private String tariffCode;

  @JsonProperty("tariffCodeType")
  private String tariffCodeType;

  public TariffcodeType tariffCode(String tariffCode) {
    this.tariffCode = tariffCode;
    return this;
  }

  /**
   * Get tariffCode
   * @return tariffCode
  */
  @ApiModelProperty(value = "")


  public String getTariffCode() {
    return tariffCode;
  }

  public void setTariffCode(String tariffCode) {
    this.tariffCode = tariffCode;
  }

  public TariffcodeType tariffCodeType(String tariffCodeType) {
    this.tariffCodeType = tariffCodeType;
    return this;
  }

  /**
   * Get tariffCodeType
   * @return tariffCodeType
  */
  @ApiModelProperty(value = "")


  public String getTariffCodeType() {
    return tariffCodeType;
  }

  public void setTariffCodeType(String tariffCodeType) {
    this.tariffCodeType = tariffCodeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffcodeType tariffcodeType = (TariffcodeType) o;
    return Objects.equals(this.tariffCode, tariffcodeType.tariffCode) &&
        Objects.equals(this.tariffCodeType, tariffcodeType.tariffCodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffCode, tariffCodeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffcodeType {\n");
    
    sb.append("    tariffCode: ").append(toIndentedString(tariffCode)).append("\n");
    sb.append("    tariffCodeType: ").append(toIndentedString(tariffCodeType)).append("\n");
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

