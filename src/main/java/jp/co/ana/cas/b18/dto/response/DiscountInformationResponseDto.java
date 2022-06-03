package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DiscountDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiscountInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DiscountInformationResponseDto   {
  @JsonProperty("discountDetails")
  private DiscountDetailsResponseDto discountDetails;

  public DiscountInformationResponseDto discountDetails(DiscountDetailsResponseDto discountDetails) {
    this.discountDetails = discountDetails;
    return this;
  }

  /**
   * Get discountDetails
   * @return discountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiscountDetailsResponseDto getDiscountDetails() {
    return discountDetails;
  }

  public void setDiscountDetails(DiscountDetailsResponseDto discountDetails) {
    this.discountDetails = discountDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInformationResponseDto discountInformationResponseDto = (DiscountInformationResponseDto) o;
    return Objects.equals(this.discountDetails, discountInformationResponseDto.discountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInformationResponseDto {\n");
    
    sb.append("    discountDetails: ").append(toIndentedString(discountDetails)).append("\n");
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

