package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CabinDetailsCabinResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CabinDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CabinDetailsResponseDto   {
  @JsonProperty("cabinDetails")
  private CabinDetailsCabinResponseDto cabinDetails;

  public CabinDetailsResponseDto cabinDetails(CabinDetailsCabinResponseDto cabinDetails) {
    this.cabinDetails = cabinDetails;
    return this;
  }

  /**
   * Get cabinDetails
   * @return cabinDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CabinDetailsCabinResponseDto getCabinDetails() {
    return cabinDetails;
  }

  public void setCabinDetails(CabinDetailsCabinResponseDto cabinDetails) {
    this.cabinDetails = cabinDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CabinDetailsResponseDto cabinDetailsResponseDto = (CabinDetailsResponseDto) o;
    return Objects.equals(this.cabinDetails, cabinDetailsResponseDto.cabinDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabinDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinDetailsResponseDto {\n");
    
    sb.append("    cabinDetails: ").append(toIndentedString(cabinDetails)).append("\n");
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

