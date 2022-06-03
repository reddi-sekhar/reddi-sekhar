package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedLocationOneIdentificationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedLocationTwoIdentificationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlaceLocationIdentificationTypeU8954S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PlaceLocationIdentificationTypeU8954S   {
  @JsonProperty("firstLocationDetails")
  private RelatedLocationOneIdentificationTypeU firstLocationDetails;

  @JsonProperty("secondLocationDetails")
  private RelatedLocationTwoIdentificationTypeU secondLocationDetails;

  public PlaceLocationIdentificationTypeU8954S firstLocationDetails(RelatedLocationOneIdentificationTypeU firstLocationDetails) {
    this.firstLocationDetails = firstLocationDetails;
    return this;
  }

  /**
   * Get firstLocationDetails
   * @return firstLocationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedLocationOneIdentificationTypeU getFirstLocationDetails() {
    return firstLocationDetails;
  }

  public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU firstLocationDetails) {
    this.firstLocationDetails = firstLocationDetails;
  }

  public PlaceLocationIdentificationTypeU8954S secondLocationDetails(RelatedLocationTwoIdentificationTypeU secondLocationDetails) {
    this.secondLocationDetails = secondLocationDetails;
    return this;
  }

  /**
   * Get secondLocationDetails
   * @return secondLocationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedLocationTwoIdentificationTypeU getSecondLocationDetails() {
    return secondLocationDetails;
  }

  public void setSecondLocationDetails(RelatedLocationTwoIdentificationTypeU secondLocationDetails) {
    this.secondLocationDetails = secondLocationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceLocationIdentificationTypeU8954S placeLocationIdentificationTypeU8954S = (PlaceLocationIdentificationTypeU8954S) o;
    return Objects.equals(this.firstLocationDetails, placeLocationIdentificationTypeU8954S.firstLocationDetails) &&
        Objects.equals(this.secondLocationDetails, placeLocationIdentificationTypeU8954S.secondLocationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLocationDetails, secondLocationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceLocationIdentificationTypeU8954S {\n");
    
    sb.append("    firstLocationDetails: ").append(toIndentedString(firstLocationDetails)).append("\n");
    sb.append("    secondLocationDetails: ").append(toIndentedString(secondLocationDetails)).append("\n");
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

