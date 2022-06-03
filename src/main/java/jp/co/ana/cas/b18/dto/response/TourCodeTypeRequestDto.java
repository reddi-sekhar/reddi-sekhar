package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FormatedTourCodeTypeRequestDto;
import jp.co.ana.cas.b18.dto.response.FreeFormatTourCodeTypeRequestDto;
import jp.co.ana.cas.b18.dto.response.NetRemitTourCodeTypeRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourCodeTypeRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TourCodeTypeRequestDto   {
  @JsonProperty("passengerType")
  private String passengerType;

  @JsonProperty("formatedTour")
  private FormatedTourCodeTypeRequestDto formatedTour;

  @JsonProperty("freeFormatTour")
  private FreeFormatTourCodeTypeRequestDto freeFormatTour;

  @JsonProperty("netRemit")
  private NetRemitTourCodeTypeRequestDto netRemit;

  public TourCodeTypeRequestDto passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Passenger type  PAX for Passenger  INF for Infant not occupying a seat
   * @return passengerType
  */
  @ApiModelProperty(value = "Passenger type  PAX for Passenger  INF for Infant not occupying a seat")

@Size(min=1,max=3) 
  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public TourCodeTypeRequestDto formatedTour(FormatedTourCodeTypeRequestDto formatedTour) {
    this.formatedTour = formatedTour;
    return this;
  }

  /**
   * Get formatedTour
   * @return formatedTour
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormatedTourCodeTypeRequestDto getFormatedTour() {
    return formatedTour;
  }

  public void setFormatedTour(FormatedTourCodeTypeRequestDto formatedTour) {
    this.formatedTour = formatedTour;
  }

  public TourCodeTypeRequestDto freeFormatTour(FreeFormatTourCodeTypeRequestDto freeFormatTour) {
    this.freeFormatTour = freeFormatTour;
    return this;
  }

  /**
   * Get freeFormatTour
   * @return freeFormatTour
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeFormatTourCodeTypeRequestDto getFreeFormatTour() {
    return freeFormatTour;
  }

  public void setFreeFormatTour(FreeFormatTourCodeTypeRequestDto freeFormatTour) {
    this.freeFormatTour = freeFormatTour;
  }

  public TourCodeTypeRequestDto netRemit(NetRemitTourCodeTypeRequestDto netRemit) {
    this.netRemit = netRemit;
    return this;
  }

  /**
   * Get netRemit
   * @return netRemit
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetRemitTourCodeTypeRequestDto getNetRemit() {
    return netRemit;
  }

  public void setNetRemit(NetRemitTourCodeTypeRequestDto netRemit) {
    this.netRemit = netRemit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourCodeTypeRequestDto tourCodeTypeRequestDto = (TourCodeTypeRequestDto) o;
    return Objects.equals(this.passengerType, tourCodeTypeRequestDto.passengerType) &&
        Objects.equals(this.formatedTour, tourCodeTypeRequestDto.formatedTour) &&
        Objects.equals(this.freeFormatTour, tourCodeTypeRequestDto.freeFormatTour) &&
        Objects.equals(this.netRemit, tourCodeTypeRequestDto.netRemit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerType, formatedTour, freeFormatTour, netRemit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourCodeTypeRequestDto {\n");
    
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
    sb.append("    formatedTour: ").append(toIndentedString(formatedTour)).append("\n");
    sb.append("    freeFormatTour: ").append(toIndentedString(freeFormatTour)).append("\n");
    sb.append("    netRemit: ").append(toIndentedString(netRemit)).append("\n");
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

