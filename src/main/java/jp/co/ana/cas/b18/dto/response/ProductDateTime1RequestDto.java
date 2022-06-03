package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDateTime1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ProductDateTime1RequestDto   {
  @JsonProperty("arrivalDate")
  private String arrivalDate;

  @JsonProperty("arrivalTime")
  private String arrivalTime;

  @JsonProperty("departureDate")
  private String departureDate;

  @JsonProperty("departureTime")
  private String departureTime;

  public ProductDateTime1RequestDto arrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * Arrival Date
   * @return arrivalDate
  */
  @ApiModelProperty(example = "240322", value = "Arrival Date")


  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public ProductDateTime1RequestDto arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Arrival Time
   * @return arrivalTime
  */
  @ApiModelProperty(example = "1550", value = "Arrival Time")


  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public ProductDateTime1RequestDto departureDate(String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  /**
   * Departure Date
   * @return departureDate
  */
  @ApiModelProperty(example = "230322", required = true, value = "Departure Date")
  @NotNull


  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public ProductDateTime1RequestDto departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Departure Time
   * @return departureTime
  */
  @ApiModelProperty(example = "230322", value = "Departure Time")


  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDateTime1RequestDto productDateTime1RequestDto = (ProductDateTime1RequestDto) o;
    return Objects.equals(this.arrivalDate, productDateTime1RequestDto.arrivalDate) &&
        Objects.equals(this.arrivalTime, productDateTime1RequestDto.arrivalTime) &&
        Objects.equals(this.departureDate, productDateTime1RequestDto.departureDate) &&
        Objects.equals(this.departureTime, productDateTime1RequestDto.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalDate, arrivalTime, departureDate, departureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDateTime1RequestDto {\n");
    
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
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

