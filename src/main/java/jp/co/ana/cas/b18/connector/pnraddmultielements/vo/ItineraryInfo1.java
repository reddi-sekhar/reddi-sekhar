package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AirAuxItinerary;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItineraryInfo1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItineraryInfo1   {
  @JsonProperty("airAuxItinerary")
  private AirAuxItinerary airAuxItinerary;

  @JsonProperty("elementManagementItinerary")
  private ElementManagementSegmentType1 elementManagementItinerary;

  @JsonProperty("referenceForSegment")
  private ReferenceInfoType1 referenceForSegment;

  public ItineraryInfo1 airAuxItinerary(AirAuxItinerary airAuxItinerary) {
    this.airAuxItinerary = airAuxItinerary;
    return this;
  }

  /**
   * Get airAuxItinerary
   * @return airAuxItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public AirAuxItinerary getAirAuxItinerary() {
    return airAuxItinerary;
  }

  public void setAirAuxItinerary(AirAuxItinerary airAuxItinerary) {
    this.airAuxItinerary = airAuxItinerary;
  }

  public ItineraryInfo1 elementManagementItinerary(ElementManagementSegmentType1 elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
    return this;
  }

  /**
   * Get elementManagementItinerary
   * @return elementManagementItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType1 getElementManagementItinerary() {
    return elementManagementItinerary;
  }

  public void setElementManagementItinerary(ElementManagementSegmentType1 elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
  }

  public ItineraryInfo1 referenceForSegment(ReferenceInfoType1 referenceForSegment) {
    this.referenceForSegment = referenceForSegment;
    return this;
  }

  /**
   * Get referenceForSegment
   * @return referenceForSegment
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType1 getReferenceForSegment() {
    return referenceForSegment;
  }

  public void setReferenceForSegment(ReferenceInfoType1 referenceForSegment) {
    this.referenceForSegment = referenceForSegment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryInfo1 itineraryInfo1 = (ItineraryInfo1) o;
    return Objects.equals(this.airAuxItinerary, itineraryInfo1.airAuxItinerary) &&
        Objects.equals(this.elementManagementItinerary, itineraryInfo1.elementManagementItinerary) &&
        Objects.equals(this.referenceForSegment, itineraryInfo1.referenceForSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airAuxItinerary, elementManagementItinerary, referenceForSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryInfo1 {\n");
    
    sb.append("    airAuxItinerary: ").append(toIndentedString(airAuxItinerary)).append("\n");
    sb.append("    elementManagementItinerary: ").append(toIndentedString(elementManagementItinerary)).append("\n");
    sb.append("    referenceForSegment: ").append(toIndentedString(referenceForSegment)).append("\n");
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

