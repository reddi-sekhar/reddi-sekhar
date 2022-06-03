package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.AirAuxItineraryRequestDto;
import jp.co.ana.cas.b18.dto.response.ElementManagementPassenger1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItineraryInfo1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ItineraryInfo1RequestDto   {
  @JsonProperty("airAuxItinerary")
  private AirAuxItineraryRequestDto airAuxItinerary;

  @JsonProperty("elementManagementItinerary")
  private ElementManagementPassenger1RequestDto elementManagementItinerary;

  public ItineraryInfo1RequestDto airAuxItinerary(AirAuxItineraryRequestDto airAuxItinerary) {
    this.airAuxItinerary = airAuxItinerary;
    return this;
  }

  /**
   * Get airAuxItinerary
   * @return airAuxItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public AirAuxItineraryRequestDto getAirAuxItinerary() {
    return airAuxItinerary;
  }

  public void setAirAuxItinerary(AirAuxItineraryRequestDto airAuxItinerary) {
    this.airAuxItinerary = airAuxItinerary;
  }

  public ItineraryInfo1RequestDto elementManagementItinerary(ElementManagementPassenger1RequestDto elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
    return this;
  }

  /**
   * Get elementManagementItinerary
   * @return elementManagementItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementPassenger1RequestDto getElementManagementItinerary() {
    return elementManagementItinerary;
  }

  public void setElementManagementItinerary(ElementManagementPassenger1RequestDto elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryInfo1RequestDto itineraryInfo1RequestDto = (ItineraryInfo1RequestDto) o;
    return Objects.equals(this.airAuxItinerary, itineraryInfo1RequestDto.airAuxItinerary) &&
        Objects.equals(this.elementManagementItinerary, itineraryInfo1RequestDto.elementManagementItinerary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airAuxItinerary, elementManagementItinerary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryInfo1RequestDto {\n");
    
    sb.append("    airAuxItinerary: ").append(toIndentedString(airAuxItinerary)).append("\n");
    sb.append("    elementManagementItinerary: ").append(toIndentedString(elementManagementItinerary)).append("\n");
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

