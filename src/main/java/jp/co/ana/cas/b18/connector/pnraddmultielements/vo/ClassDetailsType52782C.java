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
 * ClassDetailsType52782C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ClassDetailsType52782C   {
  @JsonProperty("bookingClass")
  private String bookingClass;

  @JsonProperty("code")
  private String code;

  public ClassDetailsType52782C bookingClass(String bookingClass) {
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

  public ClassDetailsType52782C code(String code) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassDetailsType52782C classDetailsType52782C = (ClassDetailsType52782C) o;
    return Objects.equals(this.bookingClass, classDetailsType52782C.bookingClass) &&
        Objects.equals(this.code, classDetailsType52782C.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClass, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassDetailsType52782C {\n");
    
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

