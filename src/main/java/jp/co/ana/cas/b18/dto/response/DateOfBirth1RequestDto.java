package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DateAndTimeDetails1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DateOfBirth1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DateOfBirth1RequestDto   {
  @JsonProperty("dateAndTimeDetails")
  private DateAndTimeDetails1RequestDto dateAndTimeDetails;

  public DateOfBirth1RequestDto dateAndTimeDetails(DateAndTimeDetails1RequestDto dateAndTimeDetails) {
    this.dateAndTimeDetails = dateAndTimeDetails;
    return this;
  }

  /**
   * Get dateAndTimeDetails
   * @return dateAndTimeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeDetails1RequestDto getDateAndTimeDetails() {
    return dateAndTimeDetails;
  }

  public void setDateAndTimeDetails(DateAndTimeDetails1RequestDto dateAndTimeDetails) {
    this.dateAndTimeDetails = dateAndTimeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateOfBirth1RequestDto dateOfBirth1RequestDto = (DateOfBirth1RequestDto) o;
    return Objects.equals(this.dateAndTimeDetails, dateOfBirth1RequestDto.dateAndTimeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAndTimeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateOfBirth1RequestDto {\n");
    
    sb.append("    dateAndTimeDetails: ").append(toIndentedString(dateAndTimeDetails)).append("\n");
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

