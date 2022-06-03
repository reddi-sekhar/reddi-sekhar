package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerDetailsTypeI1   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("identificationCode")
  private String identificationCode;

  @JsonProperty("infantIndicator")
  private String infantIndicator;

  @JsonProperty("type")
  private String type;

  public TravellerDetailsTypeI1 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public TravellerDetailsTypeI1 identificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
    return this;
  }

  /**
   * Get identificationCode
   * @return identificationCode
  */
  @ApiModelProperty(value = "")


  public String getIdentificationCode() {
    return identificationCode;
  }

  public void setIdentificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
  }

  public TravellerDetailsTypeI1 infantIndicator(String infantIndicator) {
    this.infantIndicator = infantIndicator;
    return this;
  }

  /**
   * Get infantIndicator
   * @return infantIndicator
  */
  @ApiModelProperty(value = "")


  public String getInfantIndicator() {
    return infantIndicator;
  }

  public void setInfantIndicator(String infantIndicator) {
    this.infantIndicator = infantIndicator;
  }

  public TravellerDetailsTypeI1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


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
    TravellerDetailsTypeI1 travellerDetailsTypeI1 = (TravellerDetailsTypeI1) o;
    return Objects.equals(this.firstName, travellerDetailsTypeI1.firstName) &&
        Objects.equals(this.identificationCode, travellerDetailsTypeI1.identificationCode) &&
        Objects.equals(this.infantIndicator, travellerDetailsTypeI1.infantIndicator) &&
        Objects.equals(this.type, travellerDetailsTypeI1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, identificationCode, infantIndicator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerDetailsTypeI1 {\n");
    
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

