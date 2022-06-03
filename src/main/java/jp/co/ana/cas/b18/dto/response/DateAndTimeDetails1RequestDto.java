package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DateAndTimeDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DateAndTimeDetails1RequestDto   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("qualifier")
  private String qualifier;

  public DateAndTimeDetails1RequestDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Inf/Child date of birth
   * @return date
  */
  @ApiModelProperty(value = "Inf/Child date of birth")

@Size(min=1,max=8) 
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DateAndTimeDetails1RequestDto qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "Qualifier")

@Size(min=1,max=3) 
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateAndTimeDetails1RequestDto dateAndTimeDetails1RequestDto = (DateAndTimeDetails1RequestDto) o;
    return Objects.equals(this.date, dateAndTimeDetails1RequestDto.date) &&
        Objects.equals(this.qualifier, dateAndTimeDetails1RequestDto.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateAndTimeDetails1RequestDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

