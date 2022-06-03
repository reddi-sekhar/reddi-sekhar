package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FrequentTravellerIdentificationRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentTravellerDataRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FrequentTravellerDataRequestDto   {
  @JsonProperty("frequentTraveller")
  private FrequentTravellerIdentificationRequestDto frequentTraveller;

  public FrequentTravellerDataRequestDto frequentTraveller(FrequentTravellerIdentificationRequestDto frequentTraveller) {
    this.frequentTraveller = frequentTraveller;
    return this;
  }

  /**
   * Get frequentTraveller
   * @return frequentTraveller
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationRequestDto getFrequentTraveller() {
    return frequentTraveller;
  }

  public void setFrequentTraveller(FrequentTravellerIdentificationRequestDto frequentTraveller) {
    this.frequentTraveller = frequentTraveller;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerDataRequestDto frequentTravellerDataRequestDto = (FrequentTravellerDataRequestDto) o;
    return Objects.equals(this.frequentTraveller, frequentTravellerDataRequestDto.frequentTraveller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequentTraveller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerDataRequestDto {\n");
    
    sb.append("    frequentTraveller: ").append(toIndentedString(frequentTraveller)).append("\n");
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

