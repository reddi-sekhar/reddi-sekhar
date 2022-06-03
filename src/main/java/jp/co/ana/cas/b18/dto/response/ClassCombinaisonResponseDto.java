package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.BookingClassDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassCombinaisonResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ClassCombinaisonResponseDto   {
  @JsonProperty("bookingClassDetails")
  @Valid
  private List<BookingClassDetailsResponseDto> bookingClassDetails = null;

  public ClassCombinaisonResponseDto bookingClassDetails(List<BookingClassDetailsResponseDto> bookingClassDetails) {
    this.bookingClassDetails = bookingClassDetails;
    return this;
  }

  public ClassCombinaisonResponseDto addBookingClassDetailsItem(BookingClassDetailsResponseDto bookingClassDetailsItem) {
    if (this.bookingClassDetails == null) {
      this.bookingClassDetails = new ArrayList<>();
    }
    this.bookingClassDetails.add(bookingClassDetailsItem);
    return this;
  }

  /**
   * Get bookingClassDetails
   * @return bookingClassDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<BookingClassDetailsResponseDto> getBookingClassDetails() {
    return bookingClassDetails;
  }

  public void setBookingClassDetails(List<BookingClassDetailsResponseDto> bookingClassDetails) {
    this.bookingClassDetails = bookingClassDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassCombinaisonResponseDto classCombinaisonResponseDto = (ClassCombinaisonResponseDto) o;
    return Objects.equals(this.bookingClassDetails, classCombinaisonResponseDto.bookingClassDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClassDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassCombinaisonResponseDto {\n");
    
    sb.append("    bookingClassDetails: ").append(toIndentedString(bookingClassDetails)).append("\n");
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

