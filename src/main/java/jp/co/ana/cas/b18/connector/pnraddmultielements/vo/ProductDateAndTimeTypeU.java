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
 * ProductDateAndTimeTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDateAndTimeTypeU   {
  @JsonProperty("arrivalDate")
  private String arrivalDate;

  @JsonProperty("arrivalTime")
  private String arrivalTime;

  @JsonProperty("departureDate")
  private String departureDate;

  @JsonProperty("departureTime")
  private String departureTime;

  public ProductDateAndTimeTypeU arrivalDate(String arrivalDate) {
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

  public ProductDateAndTimeTypeU arrivalTime(String arrivalTime) {
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

  public ProductDateAndTimeTypeU departureDate(String departureDate) {
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

  public ProductDateAndTimeTypeU departureTime(String departureTime) {
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
    ProductDateAndTimeTypeU productDateAndTimeTypeU = (ProductDateAndTimeTypeU) o;
    return Objects.equals(this.arrivalDate, productDateAndTimeTypeU.arrivalDate) &&
        Objects.equals(this.arrivalTime, productDateAndTimeTypeU.arrivalTime) &&
        Objects.equals(this.departureDate, productDateAndTimeTypeU.departureDate) &&
        Objects.equals(this.departureTime, productDateAndTimeTypeU.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalDate, arrivalTime, departureDate, departureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDateAndTimeTypeU {\n");
    
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

