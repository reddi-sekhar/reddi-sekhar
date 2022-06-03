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
 * ClassDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ClassDetailsType   {
  @JsonProperty("bookingClass")
  private String bookingClass;

  @JsonProperty("code")
  private String code;

  @JsonProperty("numberOfSeats")
  private Long numberOfSeats;

  public ClassDetailsType bookingClass(String bookingClass) {
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

  public ClassDetailsType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ClassDetailsType numberOfSeats(Long numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
    return this;
  }

  /**
   * Get numberOfSeats
   * @return numberOfSeats
  */
  @ApiModelProperty(value = "")


  public Long getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(Long numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassDetailsType classDetailsType = (ClassDetailsType) o;
    return Objects.equals(this.bookingClass, classDetailsType.bookingClass) &&
        Objects.equals(this.code, classDetailsType.code) &&
        Objects.equals(this.numberOfSeats, classDetailsType.numberOfSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClass, code, numberOfSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassDetailsType {\n");
    
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    numberOfSeats: ").append(toIndentedString(numberOfSeats)).append("\n");
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

