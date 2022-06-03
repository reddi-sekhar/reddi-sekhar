package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ItineraryInfoResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OriginDestinationDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OriginDestinationDetailsResponseDto   {
  @JsonProperty("itineraryInfo")
  @Valid
  private List<ItineraryInfoResponseDto> itineraryInfo = null;

  public OriginDestinationDetailsResponseDto itineraryInfo(List<ItineraryInfoResponseDto> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
    return this;
  }

  public OriginDestinationDetailsResponseDto addItineraryInfoItem(ItineraryInfoResponseDto itineraryInfoItem) {
    if (this.itineraryInfo == null) {
      this.itineraryInfo = new ArrayList<>();
    }
    this.itineraryInfo.add(itineraryInfoItem);
    return this;
  }

  /**
   * Get itineraryInfo
   * @return itineraryInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ItineraryInfoResponseDto> getItineraryInfo() {
    return itineraryInfo;
  }

  public void setItineraryInfo(List<ItineraryInfoResponseDto> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginDestinationDetailsResponseDto originDestinationDetailsResponseDto = (OriginDestinationDetailsResponseDto) o;
    return Objects.equals(this.itineraryInfo, originDestinationDetailsResponseDto.itineraryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginDestinationDetailsResponseDto {\n");
    
    sb.append("    itineraryInfo: ").append(toIndentedString(itineraryInfo)).append("\n");
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

