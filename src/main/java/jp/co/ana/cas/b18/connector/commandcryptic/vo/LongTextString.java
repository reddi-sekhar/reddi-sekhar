package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LongTextString
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class LongTextString   {
  @JsonProperty("textStringDetails")
  private String textStringDetails;

  public LongTextString textStringDetails(String textStringDetails) {
    this.textStringDetails = textStringDetails;
    return this;
  }

  /**
   * Get textStringDetails
   * @return textStringDetails
  */
  @ApiModelProperty(value = "")


  public String getTextStringDetails() {
    return textStringDetails;
  }

  public void setTextStringDetails(String textStringDetails) {
    this.textStringDetails = textStringDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTextString longTextString = (LongTextString) o;
    return Objects.equals(this.textStringDetails, longTextString.textStringDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textStringDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTextString {\n");
    
    sb.append("    textStringDetails: ").append(toIndentedString(textStringDetails)).append("\n");
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

