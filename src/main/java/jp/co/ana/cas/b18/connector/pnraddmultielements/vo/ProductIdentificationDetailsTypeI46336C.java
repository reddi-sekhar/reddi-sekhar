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
 * ProductIdentificationDetailsTypeI46336C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductIdentificationDetailsTypeI46336C   {
  @JsonProperty("bookingClass")
  private String bookingClass;

  @JsonProperty("flightNumber")
  private String flightNumber;

  public ProductIdentificationDetailsTypeI46336C bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

  /**
   * Get bookingClass
   * @return bookingClass
  */
  @ApiModelProperty(value = "")


  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public ProductIdentificationDetailsTypeI46336C flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

  /**
   * Get flightNumber
   * @return flightNumber
  */
  @ApiModelProperty(value = "")


  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductIdentificationDetailsTypeI46336C productIdentificationDetailsTypeI46336C = (ProductIdentificationDetailsTypeI46336C) o;
    return Objects.equals(this.bookingClass, productIdentificationDetailsTypeI46336C.bookingClass) &&
        Objects.equals(this.flightNumber, productIdentificationDetailsTypeI46336C.flightNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClass, flightNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIdentificationDetailsTypeI46336C {\n");
    
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
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

