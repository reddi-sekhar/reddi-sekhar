package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ArrivalStationInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.DepartureInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.ProductDetailsFlightResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightDetailResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FlightDetailResponseDto   {
  @JsonProperty("productDetails")
  private ProductDetailsFlightResponseDto productDetails;

  @JsonProperty("departureInformation")
  private DepartureInformationResponseDto departureInformation;

  @JsonProperty("arrivalStationInfo")
  private ArrivalStationInfoResponseDto arrivalStationInfo;

  public FlightDetailResponseDto productDetails(ProductDetailsFlightResponseDto productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetailsFlightResponseDto getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetailsFlightResponseDto productDetails) {
    this.productDetails = productDetails;
  }

  public FlightDetailResponseDto departureInformation(DepartureInformationResponseDto departureInformation) {
    this.departureInformation = departureInformation;
    return this;
  }

  /**
   * Get departureInformation
   * @return departureInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DepartureInformationResponseDto getDepartureInformation() {
    return departureInformation;
  }

  public void setDepartureInformation(DepartureInformationResponseDto departureInformation) {
    this.departureInformation = departureInformation;
  }

  public FlightDetailResponseDto arrivalStationInfo(ArrivalStationInfoResponseDto arrivalStationInfo) {
    this.arrivalStationInfo = arrivalStationInfo;
    return this;
  }

  /**
   * Get arrivalStationInfo
   * @return arrivalStationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ArrivalStationInfoResponseDto getArrivalStationInfo() {
    return arrivalStationInfo;
  }

  public void setArrivalStationInfo(ArrivalStationInfoResponseDto arrivalStationInfo) {
    this.arrivalStationInfo = arrivalStationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightDetailResponseDto flightDetailResponseDto = (FlightDetailResponseDto) o;
    return Objects.equals(this.productDetails, flightDetailResponseDto.productDetails) &&
        Objects.equals(this.departureInformation, flightDetailResponseDto.departureInformation) &&
        Objects.equals(this.arrivalStationInfo, flightDetailResponseDto.arrivalStationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, departureInformation, arrivalStationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightDetailResponseDto {\n");
    
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    departureInformation: ").append(toIndentedString(departureInformation)).append("\n");
    sb.append("    arrivalStationInfo: ").append(toIndentedString(arrivalStationInfo)).append("\n");
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

