package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedLocationOneIdentificationTypeU45087C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlaceLocationIdentificationTypeU24573S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PlaceLocationIdentificationTypeU24573S   {
  @JsonProperty("firstLocationDetails")
  private RelatedLocationOneIdentificationTypeU45087C firstLocationDetails;

  @JsonProperty("locationType")
  private String locationType;

  public PlaceLocationIdentificationTypeU24573S firstLocationDetails(RelatedLocationOneIdentificationTypeU45087C firstLocationDetails) {
    this.firstLocationDetails = firstLocationDetails;
    return this;
  }

  /**
   * Get firstLocationDetails
   * @return firstLocationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedLocationOneIdentificationTypeU45087C getFirstLocationDetails() {
    return firstLocationDetails;
  }

  public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU45087C firstLocationDetails) {
    this.firstLocationDetails = firstLocationDetails;
  }

  public PlaceLocationIdentificationTypeU24573S locationType(String locationType) {
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
    PlaceLocationIdentificationTypeU24573S placeLocationIdentificationTypeU24573S = (PlaceLocationIdentificationTypeU24573S) o;
    return Objects.equals(this.firstLocationDetails, placeLocationIdentificationTypeU24573S.firstLocationDetails) &&
        Objects.equals(this.locationType, placeLocationIdentificationTypeU24573S.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLocationDetails, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceLocationIdentificationTypeU24573S {\n");
    
    sb.append("    firstLocationDetails: ").append(toIndentedString(firstLocationDetails)).append("\n");
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

