package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationType64816C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentTravellerIdentificationCodeType38226S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationCodeType38226S   {
  @JsonProperty("airlineFrequentTraveler")
  private FrequentTravellerIdentificationType airlineFrequentTraveler;

  @JsonProperty("allianceFrequentTraveler")
  private FrequentTravellerIdentificationType64816C allianceFrequentTraveler;

  public FrequentTravellerIdentificationCodeType38226S airlineFrequentTraveler(FrequentTravellerIdentificationType airlineFrequentTraveler) {
    this.airlineFrequentTraveler = airlineFrequentTraveler;
    return this;
  }

  /**
   * Get airlineFrequentTraveler
   * @return airlineFrequentTraveler
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationType getAirlineFrequentTraveler() {
    return airlineFrequentTraveler;
  }

  public void setAirlineFrequentTraveler(FrequentTravellerIdentificationType airlineFrequentTraveler) {
    this.airlineFrequentTraveler = airlineFrequentTraveler;
  }

  public FrequentTravellerIdentificationCodeType38226S allianceFrequentTraveler(FrequentTravellerIdentificationType64816C allianceFrequentTraveler) {
    this.allianceFrequentTraveler = allianceFrequentTraveler;
    return this;
  }

  /**
   * Get allianceFrequentTraveler
   * @return allianceFrequentTraveler
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationType64816C getAllianceFrequentTraveler() {
    return allianceFrequentTraveler;
  }

  public void setAllianceFrequentTraveler(FrequentTravellerIdentificationType64816C allianceFrequentTraveler) {
    this.allianceFrequentTraveler = allianceFrequentTraveler;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerIdentificationCodeType38226S frequentTravellerIdentificationCodeType38226S = (FrequentTravellerIdentificationCodeType38226S) o;
    return Objects.equals(this.airlineFrequentTraveler, frequentTravellerIdentificationCodeType38226S.airlineFrequentTraveler) &&
        Objects.equals(this.allianceFrequentTraveler, frequentTravellerIdentificationCodeType38226S.allianceFrequentTraveler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineFrequentTraveler, allianceFrequentTraveler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationCodeType38226S {\n");
    
    sb.append("    airlineFrequentTraveler: ").append(toIndentedString(airlineFrequentTraveler)).append("\n");
    sb.append("    allianceFrequentTraveler: ").append(toIndentedString(allianceFrequentTraveler)).append("\n");
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

