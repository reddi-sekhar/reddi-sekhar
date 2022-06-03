package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationType198190C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentTravellerIdentificationCodeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationCodeType   {
  @JsonProperty("airlineFrequentTraveler")
  private FrequentTravellerIdentificationType198190C airlineFrequentTraveler;

  public FrequentTravellerIdentificationCodeType airlineFrequentTraveler(FrequentTravellerIdentificationType198190C airlineFrequentTraveler) {
    this.airlineFrequentTraveler = airlineFrequentTraveler;
    return this;
  }

  /**
   * Get airlineFrequentTraveler
   * @return airlineFrequentTraveler
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationType198190C getAirlineFrequentTraveler() {
    return airlineFrequentTraveler;
  }

  public void setAirlineFrequentTraveler(FrequentTravellerIdentificationType198190C airlineFrequentTraveler) {
    this.airlineFrequentTraveler = airlineFrequentTraveler;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerIdentificationCodeType frequentTravellerIdentificationCodeType = (FrequentTravellerIdentificationCodeType) o;
    return Objects.equals(this.airlineFrequentTraveler, frequentTravellerIdentificationCodeType.airlineFrequentTraveler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineFrequentTraveler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationCodeType {\n");
    
    sb.append("    airlineFrequentTraveler: ").append(toIndentedString(airlineFrequentTraveler)).append("\n");
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

