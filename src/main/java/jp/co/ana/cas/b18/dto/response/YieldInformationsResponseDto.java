package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.MonetaryDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * YieldInformationsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class YieldInformationsResponseDto   {
  @JsonProperty("monetaryDetails")
  private MonetaryDetailsResponseDto monetaryDetails;

  @JsonProperty("otherMonetaryDetails")
  @Valid
  private List<MonetaryDetailsResponseDto> otherMonetaryDetails = null;

  public YieldInformationsResponseDto monetaryDetails(MonetaryDetailsResponseDto monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
    return this;
  }

  /**
   * Get monetaryDetails
   * @return monetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryDetailsResponseDto getMonetaryDetails() {
    return monetaryDetails;
  }

  public void setMonetaryDetails(MonetaryDetailsResponseDto monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
  }

  public YieldInformationsResponseDto otherMonetaryDetails(List<MonetaryDetailsResponseDto> otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
    return this;
  }

  public YieldInformationsResponseDto addOtherMonetaryDetailsItem(MonetaryDetailsResponseDto otherMonetaryDetailsItem) {
    if (this.otherMonetaryDetails == null) {
      this.otherMonetaryDetails = new ArrayList<>();
    }
    this.otherMonetaryDetails.add(otherMonetaryDetailsItem);
    return this;
  }

  /**
   * Get otherMonetaryDetails
   * @return otherMonetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryDetailsResponseDto> getOtherMonetaryDetails() {
    return otherMonetaryDetails;
  }

  public void setOtherMonetaryDetails(List<MonetaryDetailsResponseDto> otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YieldInformationsResponseDto yieldInformationsResponseDto = (YieldInformationsResponseDto) o;
    return Objects.equals(this.monetaryDetails, yieldInformationsResponseDto.monetaryDetails) &&
        Objects.equals(this.otherMonetaryDetails, yieldInformationsResponseDto.otherMonetaryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monetaryDetails, otherMonetaryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YieldInformationsResponseDto {\n");
    
    sb.append("    monetaryDetails: ").append(toIndentedString(monetaryDetails)).append("\n");
    sb.append("    otherMonetaryDetails: ").append(toIndentedString(otherMonetaryDetails)).append("\n");
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

