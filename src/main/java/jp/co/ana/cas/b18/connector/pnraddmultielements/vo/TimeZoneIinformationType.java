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
 * TimeZoneIinformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TimeZoneIinformationType   {
  @JsonProperty("code")
  private Long code;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("suffix")
  private String suffix;

  public TimeZoneIinformationType code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public TimeZoneIinformationType countryCode(String countryCode) {
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

  public TimeZoneIinformationType suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
  */
  @ApiModelProperty(value = "")


  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZoneIinformationType timeZoneIinformationType = (TimeZoneIinformationType) o;
    return Objects.equals(this.code, timeZoneIinformationType.code) &&
        Objects.equals(this.countryCode, timeZoneIinformationType.countryCode) &&
        Objects.equals(this.suffix, timeZoneIinformationType.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, countryCode, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneIinformationType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

