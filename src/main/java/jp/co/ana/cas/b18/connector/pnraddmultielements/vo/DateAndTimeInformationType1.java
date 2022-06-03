package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeDetailsTypeI56946C1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DateAndTimeInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DateAndTimeInformationType1   {
  @JsonProperty("dateAndTimeDetails")
  private DateAndTimeDetailsTypeI56946C1 dateAndTimeDetails;

  public DateAndTimeInformationType1 dateAndTimeDetails(DateAndTimeDetailsTypeI56946C1 dateAndTimeDetails) {
    this.dateAndTimeDetails = dateAndTimeDetails;
    return this;
  }

  /**
   * Get dateAndTimeDetails
   * @return dateAndTimeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeDetailsTypeI56946C1 getDateAndTimeDetails() {
    return dateAndTimeDetails;
  }

  public void setDateAndTimeDetails(DateAndTimeDetailsTypeI56946C1 dateAndTimeDetails) {
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
    DateAndTimeInformationType1 dateAndTimeInformationType1 = (DateAndTimeInformationType1) o;
    return Objects.equals(this.dateAndTimeDetails, dateAndTimeInformationType1.dateAndTimeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAndTimeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateAndTimeInformationType1 {\n");
    
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

