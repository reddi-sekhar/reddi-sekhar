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
 * LocationTypeI2784C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class LocationTypeI2784C   {
  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("cityName")
  private String cityName;

  public LocationTypeI2784C cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Get cityCode
   * @return cityCode
  */
  @ApiModelProperty(value = "")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public LocationTypeI2784C cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * Get cityName
   * @return cityName
  */
  @ApiModelProperty(value = "")


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationTypeI2784C locationTypeI2784C = (LocationTypeI2784C) o;
    return Objects.equals(this.cityCode, locationTypeI2784C.cityCode) &&
        Objects.equals(this.cityName, locationTypeI2784C.cityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, cityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationTypeI2784C {\n");
    
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
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

