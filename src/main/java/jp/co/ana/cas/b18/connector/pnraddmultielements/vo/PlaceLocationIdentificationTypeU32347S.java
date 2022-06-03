package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationIdentificationBatchTypeU56454C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedLocationOneIdentificationTypeU56455C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlaceLocationIdentificationTypeU32347S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PlaceLocationIdentificationTypeU32347S   {
  @JsonProperty("firstLocationDetails")
  private RelatedLocationOneIdentificationTypeU56455C firstLocationDetails;

  @JsonProperty("locationDescription")
  private LocationIdentificationBatchTypeU56454C locationDescription;

  @JsonProperty("locationType")
  private String locationType;

  public PlaceLocationIdentificationTypeU32347S firstLocationDetails(RelatedLocationOneIdentificationTypeU56455C firstLocationDetails) {
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

  public PlaceLocationIdentificationTypeU32347S locationDescription(LocationIdentificationBatchTypeU56454C locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationIdentificationBatchTypeU56454C getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(LocationIdentificationBatchTypeU56454C locationDescription) {
    this.locationDescription = locationDescription;
  }

  public PlaceLocationIdentificationTypeU32347S locationType(String locationType) {
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
    PlaceLocationIdentificationTypeU32347S placeLocationIdentificationTypeU32347S = (PlaceLocationIdentificationTypeU32347S) o;
    return Objects.equals(this.firstLocationDetails, placeLocationIdentificationTypeU32347S.firstLocationDetails) &&
        Objects.equals(this.locationDescription, placeLocationIdentificationTypeU32347S.locationDescription) &&
        Objects.equals(this.locationType, placeLocationIdentificationTypeU32347S.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLocationDetails, locationDescription, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceLocationIdentificationTypeU32347S {\n");
    
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

