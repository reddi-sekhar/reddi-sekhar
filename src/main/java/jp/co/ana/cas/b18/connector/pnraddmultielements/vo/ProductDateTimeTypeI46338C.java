package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDateTimeTypeI46338C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDateTimeTypeI46338C   {
  @JsonProperty("arrivalDate")
  private String arrivalDate;

  @JsonProperty("arrivalTime")
  private String arrivalTime;

  @JsonProperty("departureDate")
  private String departureDate;

  @JsonProperty("departureTime")
  private String departureTime;

  public ProductDateTimeTypeI46338C arrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * Get arrivalDate
   * @return arrivalDate
  */
  @ApiModelProperty(value = "")


  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public ProductDateTimeTypeI46338C arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Get arrivalTime
   * @return arrivalTime
  */
  @ApiModelProperty(value = "")


  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public ProductDateTimeTypeI46338C departureDate(String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  /**
   * Get departureDate
   * @return departureDate
  */
  @ApiModelProperty(value = "")


  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public ProductDateTimeTypeI46338C departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Get departureTime
   * @return departureTime
  */
  @ApiModelProperty(value = "")


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
    ProductDateTimeTypeI46338C productDateTimeTypeI46338C = (ProductDateTimeTypeI46338C) o;
    return Objects.equals(this.arrivalDate, productDateTimeTypeI46338C.arrivalDate) &&
        Objects.equals(this.arrivalTime, productDateTimeTypeI46338C.arrivalTime) &&
        Objects.equals(this.departureDate, productDateTimeTypeI46338C.departureDate) &&
        Objects.equals(this.departureTime, productDateTimeTypeI46338C.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalDate, arrivalTime, departureDate, departureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDateTimeTypeI46338C {\n");
    
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

