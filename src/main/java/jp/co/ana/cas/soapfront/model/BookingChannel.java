package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * BookingChannel.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class BookingChannel   {
  
  /** The company name. */
  @JsonProperty("companyName")
  private CompanyNameType companyName;

  /** The type. */
  @JsonProperty("type")
  private String type;

  /**
   * Company name.
   *
   * @param companyName the company name
   * @return the booking channel
   */
  public BookingChannel companyName(CompanyNameType companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName.
   *
   * @return companyName
   */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyNameType getCompanyName() {
    return companyName;
  }

  /**
   * Sets the company name.
   *
   * @param companyName the new company name
   */
  public void setCompanyName(CompanyNameType companyName) {
    this.companyName = companyName;
  }

  /**
   * Type.
   *
   * @param type the type
   * @return the booking channel
   */
  public BookingChannel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingChannel bookingChannel = (BookingChannel) o;
    return Objects.equals(this.companyName, bookingChannel.companyName)
        && Objects.equals(this.type, bookingChannel.type);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(companyName, type);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingChannel {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

