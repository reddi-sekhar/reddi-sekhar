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
 * PassengerResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PassengerResponseDto   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("type")
  private String type;

  @JsonProperty("infantIndicator")
  private String infantIndicator;

  @JsonProperty("identificationCode")
  private String identificationCode;

  public PassengerResponseDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Traveler First Name
   * @return firstName
  */
  @ApiModelProperty(example = "TARO", value = "Traveler First Name")

@Size(min=1,max=56) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PassengerResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Traveler Type using  Amadeus codification.
   * @return type
  */
  @ApiModelProperty(example = "ADT", value = "Traveler Type using  Amadeus codification.")

@Size(min=1,max=3) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PassengerResponseDto infantIndicator(String infantIndicator) {
    this.infantIndicator = infantIndicator;
    return this;
  }

  /**
   * code is used to mention that the traveler is accompanied by an infant with no seat
   * @return infantIndicator
  */
  @ApiModelProperty(value = "code is used to mention that the traveler is accompanied by an infant with no seat")

@Size(min=1,max=1) 
  public String getInfantIndicator() {
    return infantIndicator;
  }

  public void setInfantIndicator(String infantIndicator) {
    this.infantIndicator = infantIndicator;
  }

  public PassengerResponseDto identificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
    return this;
  }

  /**
   * Identification code
   * @return identificationCode
  */
  @ApiModelProperty(value = "Identification code")

@Size(min=1,max=70) 
  public String getIdentificationCode() {
    return identificationCode;
  }

  public void setIdentificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerResponseDto passengerResponseDto = (PassengerResponseDto) o;
    return Objects.equals(this.firstName, passengerResponseDto.firstName) &&
        Objects.equals(this.type, passengerResponseDto.type) &&
        Objects.equals(this.infantIndicator, passengerResponseDto.infantIndicator) &&
        Objects.equals(this.identificationCode, passengerResponseDto.identificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, type, infantIndicator, identificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerResponseDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    infantIndicator: ").append(toIndentedString(infantIndicator)).append("\n");
    sb.append("    identificationCode: ").append(toIndentedString(identificationCode)).append("\n");
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

