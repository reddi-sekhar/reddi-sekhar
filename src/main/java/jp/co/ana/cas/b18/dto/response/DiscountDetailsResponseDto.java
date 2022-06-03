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
 * DiscountDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DiscountDetailsResponseDto   {
  @JsonProperty("discountCode")
  private String discountCode;

  public DiscountDetailsResponseDto discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

  /**
   * Promotion code used to define redemption/upgrade price in miles
   * @return discountCode
  */
  @ApiModelProperty(value = "Promotion code used to define redemption/upgrade price in miles")

@Size(min=1,max=6) 
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountDetailsResponseDto discountDetailsResponseDto = (DiscountDetailsResponseDto) o;
    return Objects.equals(this.discountCode, discountDetailsResponseDto.discountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountDetailsResponseDto {\n");
    
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
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

