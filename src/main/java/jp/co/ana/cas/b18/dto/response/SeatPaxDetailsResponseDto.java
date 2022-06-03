package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.GenericDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatPaxDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SeatPaxDetailsResponseDto   {
  @JsonProperty("genericDetails")
  private GenericDetailsResponseDto genericDetails;

  public SeatPaxDetailsResponseDto genericDetails(GenericDetailsResponseDto genericDetails) {
    this.genericDetails = genericDetails;
    return this;
  }

  /**
   * Get genericDetails
   * @return genericDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public GenericDetailsResponseDto getGenericDetails() {
    return genericDetails;
  }

  public void setGenericDetails(GenericDetailsResponseDto genericDetails) {
    this.genericDetails = genericDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatPaxDetailsResponseDto seatPaxDetailsResponseDto = (SeatPaxDetailsResponseDto) o;
    return Objects.equals(this.genericDetails, seatPaxDetailsResponseDto.genericDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genericDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatPaxDetailsResponseDto {\n");
    
    sb.append("    genericDetails: ").append(toIndentedString(genericDetails)).append("\n");
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

