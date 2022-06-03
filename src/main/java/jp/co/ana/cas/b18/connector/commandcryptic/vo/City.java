package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * City
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class City   {
  @JsonProperty("buildingCode")
  private String buildingCode;

  @JsonProperty("codeContext")
  private String codeContext;

  @JsonProperty("locationCode")
  private String locationCode;

  public City buildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
    return this;
  }

  /**
   * Get buildingCode
   * @return buildingCode
  */
  @ApiModelProperty(value = "")


  public String getBuildingCode() {
    return buildingCode;
  }

  public void setBuildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
  }

  public City codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Get codeContext
   * @return codeContext
  */
  @ApiModelProperty(value = "")


  public String getCodeContext() {
    return codeContext;
  }

  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  public City locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * Get locationCode
   * @return locationCode
  */
  @ApiModelProperty(value = "")


  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.buildingCode, city.buildingCode) &&
        Objects.equals(this.codeContext, city.codeContext) &&
        Objects.equals(this.locationCode, city.locationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingCode, codeContext, locationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    buildingCode: ").append(toIndentedString(buildingCode)).append("\n");
    sb.append("    codeContext: ").append(toIndentedString(codeContext)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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

