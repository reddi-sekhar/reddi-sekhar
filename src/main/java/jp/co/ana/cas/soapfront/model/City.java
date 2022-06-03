package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * City.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class City   {
  
  /** The building code. */
  @JsonProperty("buildingCode")
  private String buildingCode;

  /** The code context. */
  @JsonProperty("codeContext")
  private String codeContext;

  /** The location code. */
  @JsonProperty("locationCode")
  private String locationCode;

  /**
   * Building code.
   *
   * @param buildingCode the building code
   * @return the city
   */
  public City buildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
    return this;
  }

  /**
   * Get buildingCode.
   *
   * @return buildingCode
   */
  @ApiModelProperty(value = "")


  public String getBuildingCode() {
    return buildingCode;
  }

  /**
   * Sets the building code.
   *
   * @param buildingCode the new building code
   */
  public void setBuildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
  }

  /**
   * Code context.
   *
   * @param codeContext the code context
   * @return the city
   */
  public City codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Get codeContext.
   *
   * @return codeContext
   */
  @ApiModelProperty(value = "")


  public String getCodeContext() {
    return codeContext;
  }

  /**
   * Sets the code context.
   *
   * @param codeContext the new code context
   */
  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  /**
   * Location code.
   *
   * @param locationCode the location code
   * @return the city
   */
  public City locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * Get locationCode.
   *
   * @return locationCode
   */
  @ApiModelProperty(value = "")


  public String getLocationCode() {
    return locationCode;
  }

  /**
   * Sets the location code.
   *
   * @param locationCode the new location code
   */
  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.buildingCode, city.buildingCode)
        && Objects.equals(this.codeContext, city.codeContext)
        && Objects.equals(this.locationCode, city.locationCode);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(buildingCode, codeContext, locationCode);
  }

  /**
   * To string.
   *
   * @return the string
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

