package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FreetextDetail1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FreetextItinerary1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FreetextItinerary1RequestDto   {
  @JsonProperty("freetextDetail")
  private FreetextDetail1RequestDto freetextDetail;

  @JsonProperty("longFreetext")
  private String longFreetext;

  public FreetextItinerary1RequestDto freetextDetail(FreetextDetail1RequestDto freetextDetail) {
    this.freetextDetail = freetextDetail;
    return this;
  }

  /**
   * Get freetextDetail
   * @return freetextDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreetextDetail1RequestDto getFreetextDetail() {
    return freetextDetail;
  }

  public void setFreetextDetail(FreetextDetail1RequestDto freetextDetail) {
    this.freetextDetail = freetextDetail;
  }

  public FreetextItinerary1RequestDto longFreetext(String longFreetext) {
    this.longFreetext = longFreetext;
    return this;
  }

  /**
   * Long free text information
   * @return longFreetext
  */
  @ApiModelProperty(value = "Long free text information")

@Size(min=1,max=199) 
  public String getLongFreetext() {
    return longFreetext;
  }

  public void setLongFreetext(String longFreetext) {
    this.longFreetext = longFreetext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreetextItinerary1RequestDto freetextItinerary1RequestDto = (FreetextItinerary1RequestDto) o;
    return Objects.equals(this.freetextDetail, freetextItinerary1RequestDto.freetextDetail) &&
        Objects.equals(this.longFreetext, freetextItinerary1RequestDto.longFreetext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextDetail, longFreetext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreetextItinerary1RequestDto {\n");
    
    sb.append("    freetextDetail: ").append(toIndentedString(freetextDetail)).append("\n");
    sb.append("    longFreetext: ").append(toIndentedString(longFreetext)).append("\n");
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

