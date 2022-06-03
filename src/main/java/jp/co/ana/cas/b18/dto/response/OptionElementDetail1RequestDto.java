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
 * OptionElementDetail1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OptionElementDetail1RequestDto   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("freetext")
  private String freetext;

  public OptionElementDetail1RequestDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Dater
   * @return date
  */
  @ApiModelProperty(value = "Dater")

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OptionElementDetail1RequestDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Free flow text
   * @return freetext
  */
  @ApiModelProperty(value = "Free flow text")

@Size(min=1,max=200) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionElementDetail1RequestDto optionElementDetail1RequestDto = (OptionElementDetail1RequestDto) o;
    return Objects.equals(this.date, optionElementDetail1RequestDto.date) &&
        Objects.equals(this.freetext, optionElementDetail1RequestDto.freetext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, freetext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElementDetail1RequestDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
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

