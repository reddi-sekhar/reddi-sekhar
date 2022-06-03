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
 * FareElementsRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FareElementsRequestDto   {
  @JsonProperty("freetextLong")
  private String freetextLong;

  @JsonProperty("generalIndicator")
  private String generalIndicator;

  @JsonProperty("passengerType")
  private String passengerType;

  public FareElementsRequestDto freetextLong(String freetextLong) {
    this.freetextLong = freetextLong;
    return this;
  }

  /**
   * Free text long
   * @return freetextLong
  */
  @ApiModelProperty(value = "Free text long")

@Size(min=1,max=150) 
  public String getFreetextLong() {
    return freetextLong;
  }

  public void setFreetextLong(String freetextLong) {
    this.freetextLong = freetextLong;
  }

  public FareElementsRequestDto generalIndicator(String generalIndicator) {
    this.generalIndicator = generalIndicator;
    return this;
  }

  /**
   * General Indicator
   * @return generalIndicator
  */
  @ApiModelProperty(value = "General Indicator")

@Size(min=1,max=1) 
  public String getGeneralIndicator() {
    return generalIndicator;
  }

  public void setGeneralIndicator(String generalIndicator) {
    this.generalIndicator = generalIndicator;
  }

  public FareElementsRequestDto passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Passenger type  PAX for Passenger  INF for Infant not occupying a seat
   * @return passengerType
  */
  @ApiModelProperty(value = "Passenger type  PAX for Passenger  INF for Infant not occupying a seat")

@Size(min=1,max=3) 
  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareElementsRequestDto fareElementsRequestDto = (FareElementsRequestDto) o;
    return Objects.equals(this.freetextLong, fareElementsRequestDto.freetextLong) &&
        Objects.equals(this.generalIndicator, fareElementsRequestDto.generalIndicator) &&
        Objects.equals(this.passengerType, fareElementsRequestDto.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextLong, generalIndicator, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareElementsRequestDto {\n");
    
    sb.append("    freetextLong: ").append(toIndentedString(freetextLong)).append("\n");
    sb.append("    generalIndicator: ").append(toIndentedString(generalIndicator)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

