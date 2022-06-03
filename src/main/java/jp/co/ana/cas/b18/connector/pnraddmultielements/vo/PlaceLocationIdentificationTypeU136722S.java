package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationIdentificationBatchTypeU198230C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlaceLocationIdentificationTypeU136722S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PlaceLocationIdentificationTypeU136722S   {
  @JsonProperty("locationDescription")
  private LocationIdentificationBatchTypeU198230C locationDescription;

  @JsonProperty("locationType")
  private String locationType;

  public PlaceLocationIdentificationTypeU136722S locationDescription(LocationIdentificationBatchTypeU198230C locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationIdentificationBatchTypeU198230C getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(LocationIdentificationBatchTypeU198230C locationDescription) {
    this.locationDescription = locationDescription;
  }

  public PlaceLocationIdentificationTypeU136722S locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   * @return locationType
  */
  @ApiModelProperty(value = "")


  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceLocationIdentificationTypeU136722S placeLocationIdentificationTypeU136722S = (PlaceLocationIdentificationTypeU136722S) o;
    return Objects.equals(this.locationDescription, placeLocationIdentificationTypeU136722S.locationDescription) &&
        Objects.equals(this.locationType, placeLocationIdentificationTypeU136722S.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationDescription, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceLocationIdentificationTypeU136722S {\n");
    
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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

