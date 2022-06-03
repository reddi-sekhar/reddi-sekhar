package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationIdentificationBatchTypeU60738C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedLocationOneIdentificationTypeU56455C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlaceLocationIdentificationTypeU35293S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PlaceLocationIdentificationTypeU35293S   {
  @JsonProperty("firstLocationDetails")
  private RelatedLocationOneIdentificationTypeU56455C firstLocationDetails;

  @JsonProperty("locationDescription")
  private LocationIdentificationBatchTypeU60738C locationDescription;

  @JsonProperty("locationType")
  private String locationType;

  public PlaceLocationIdentificationTypeU35293S firstLocationDetails(RelatedLocationOneIdentificationTypeU56455C firstLocationDetails) {
    this.firstLocationDetails = firstLocationDetails;
    return this;
  }

  /**
   * Get firstLocationDetails
   * @return firstLocationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedLocationOneIdentificationTypeU56455C getFirstLocationDetails() {
    return firstLocationDetails;
  }

  public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU56455C firstLocationDetails) {
    this.firstLocationDetails = firstLocationDetails;
  }

  public PlaceLocationIdentificationTypeU35293S locationDescription(LocationIdentificationBatchTypeU60738C locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationIdentificationBatchTypeU60738C getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(LocationIdentificationBatchTypeU60738C locationDescription) {
    this.locationDescription = locationDescription;
  }

  public PlaceLocationIdentificationTypeU35293S locationType(String locationType) {
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
    PlaceLocationIdentificationTypeU35293S placeLocationIdentificationTypeU35293S = (PlaceLocationIdentificationTypeU35293S) o;
    return Objects.equals(this.firstLocationDetails, placeLocationIdentificationTypeU35293S.firstLocationDetails) &&
        Objects.equals(this.locationDescription, placeLocationIdentificationTypeU35293S.locationDescription) &&
        Objects.equals(this.locationType, placeLocationIdentificationTypeU35293S.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLocationDetails, locationDescription, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceLocationIdentificationTypeU35293S {\n");
    
    sb.append("    firstLocationDetails: ").append(toIndentedString(firstLocationDetails)).append("\n");
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

