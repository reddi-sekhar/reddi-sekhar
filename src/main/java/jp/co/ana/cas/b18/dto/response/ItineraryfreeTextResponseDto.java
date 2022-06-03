package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FreeTextDetailItineraryResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItineraryfreeTextResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ItineraryfreeTextResponseDto   {
  @JsonProperty("freetextDetail")
  private FreeTextDetailItineraryResponseDto freetextDetail;

  @JsonProperty("longFreetext")
  private String longFreetext;

  public ItineraryfreeTextResponseDto freetextDetail(FreeTextDetailItineraryResponseDto freetextDetail) {
    this.freetextDetail = freetextDetail;
    return this;
  }

  /**
   * Get freetextDetail
   * @return freetextDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextDetailItineraryResponseDto getFreetextDetail() {
    return freetextDetail;
  }

  public void setFreetextDetail(FreeTextDetailItineraryResponseDto freetextDetail) {
    this.freetextDetail = freetextDetail;
  }

  public ItineraryfreeTextResponseDto longFreetext(String longFreetext) {
    this.longFreetext = longFreetext;
    return this;
  }

  /**
   * Long free text information.
   * @return longFreetext
  */
  @ApiModelProperty(value = "Long free text information.")

@Size(min=1,max=999) 
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
    ItineraryfreeTextResponseDto itineraryfreeTextResponseDto = (ItineraryfreeTextResponseDto) o;
    return Objects.equals(this.freetextDetail, itineraryfreeTextResponseDto.freetextDetail) &&
        Objects.equals(this.longFreetext, itineraryfreeTextResponseDto.longFreetext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextDetail, longFreetext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryfreeTextResponseDto {\n");
    
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

