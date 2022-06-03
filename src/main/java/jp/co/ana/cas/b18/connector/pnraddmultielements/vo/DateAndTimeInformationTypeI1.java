package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeDetailsTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DateAndTimeInformationTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DateAndTimeInformationTypeI1   {
  @JsonProperty("dateAndTime")
  private DateAndTimeDetailsTypeI1 dateAndTime;

  public DateAndTimeInformationTypeI1 dateAndTime(DateAndTimeDetailsTypeI1 dateAndTime) {
    this.dateAndTime = dateAndTime;
    return this;
  }

  /**
   * Get dateAndTime
   * @return dateAndTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeDetailsTypeI1 getDateAndTime() {
    return dateAndTime;
  }

  public void setDateAndTime(DateAndTimeDetailsTypeI1 dateAndTime) {
    this.dateAndTime = dateAndTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateAndTimeInformationTypeI1 dateAndTimeInformationTypeI1 = (DateAndTimeInformationTypeI1) o;
    return Objects.equals(this.dateAndTime, dateAndTimeInformationTypeI1.dateAndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateAndTimeInformationTypeI1 {\n");
    
    sb.append("    dateAndTime: ").append(toIndentedString(dateAndTime)).append("\n");
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

