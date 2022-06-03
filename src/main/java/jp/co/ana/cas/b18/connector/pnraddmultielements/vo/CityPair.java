package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU35293S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CityPair
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CityPair   {
  @JsonProperty("arrLocation")
  private PlaceLocationIdentificationTypeU35293S arrLocation;

  @JsonProperty("depLocation")
  private PlaceLocationIdentificationTypeU35293S depLocation;

  public CityPair arrLocation(PlaceLocationIdentificationTypeU35293S arrLocation) {
    this.arrLocation = arrLocation;
    return this;
  }

  /**
   * Get arrLocation
   * @return arrLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU35293S getArrLocation() {
    return arrLocation;
  }

  public void setArrLocation(PlaceLocationIdentificationTypeU35293S arrLocation) {
    this.arrLocation = arrLocation;
  }

  public CityPair depLocation(PlaceLocationIdentificationTypeU35293S depLocation) {
    this.depLocation = depLocation;
    return this;
  }

  /**
   * Get depLocation
   * @return depLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU35293S getDepLocation() {
    return depLocation;
  }

  public void setDepLocation(PlaceLocationIdentificationTypeU35293S depLocation) {
    this.depLocation = depLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityPair cityPair = (CityPair) o;
    return Objects.equals(this.arrLocation, cityPair.arrLocation) &&
        Objects.equals(this.depLocation, cityPair.depLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrLocation, depLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityPair {\n");
    
    sb.append("    arrLocation: ").append(toIndentedString(arrLocation)).append("\n");
    sb.append("    depLocation: ").append(toIndentedString(depLocation)).append("\n");
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

