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
 * Passenger1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class Passenger1RequestDto   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("identificationCode")
  private String identificationCode;

  @JsonProperty("infantIndicator")
  private String infantIndicator;

  @JsonProperty("type")
  private String type;

  public Passenger1RequestDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Traveler First Name
   * @return firstName
  */
  @ApiModelProperty(value = "Traveler First Name")

@Size(min=1,max=56) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Passenger1RequestDto identificationCode(String identificationCode) {
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

  public Passenger1RequestDto infantIndicator(String infantIndicator) {
    this.infantIndicator = infantIndicator;
    return this;
  }

  /**
   * Infant Indicator
   * @return infantIndicator
  */
  @ApiModelProperty(value = "Infant Indicator")

@Size(min=1,max=1) 
  public String getInfantIndicator() {
    return infantIndicator;
  }

  public void setInfantIndicator(String infantIndicator) {
    this.infantIndicator = infantIndicator;
  }

  public Passenger1RequestDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Traveler Type
   * @return type
  */
  @ApiModelProperty(value = "Traveler Type")

@Size(min=1,max=3) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passenger1RequestDto passenger1RequestDto = (Passenger1RequestDto) o;
    return Objects.equals(this.firstName, passenger1RequestDto.firstName) &&
        Objects.equals(this.identificationCode, passenger1RequestDto.identificationCode) &&
        Objects.equals(this.infantIndicator, passenger1RequestDto.infantIndicator) &&
        Objects.equals(this.type, passenger1RequestDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, identificationCode, infantIndicator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passenger1RequestDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    identificationCode: ").append(toIndentedString(identificationCode)).append("\n");
    sb.append("    infantIndicator: ").append(toIndentedString(infantIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

