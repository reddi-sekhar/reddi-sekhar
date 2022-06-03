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
 * TravellerNameInfoType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerNameInfoType   {
  @JsonProperty("age")
  private Long age;

  @JsonProperty("infantIndicator")
  private String infantIndicator;

  @JsonProperty("otherType")
  private String otherType;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("travellerIdentificationCode")
  private String travellerIdentificationCode;

  @JsonProperty("type")
  private String type;

  public TravellerNameInfoType age(Long age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public TravellerNameInfoType infantIndicator(String infantIndicator) {
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

  public TravellerNameInfoType otherType(String otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  */
  @ApiModelProperty(value = "")


  public String getOtherType() {
    return otherType;
  }

  public void setOtherType(String otherType) {
    this.otherType = otherType;
  }

  public TravellerNameInfoType qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public TravellerNameInfoType quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public TravellerNameInfoType travellerIdentificationCode(String travellerIdentificationCode) {
    this.travellerIdentificationCode = travellerIdentificationCode;
    return this;
  }

  /**
   * Get travellerIdentificationCode
   * @return travellerIdentificationCode
  */
  @ApiModelProperty(value = "")


  public String getTravellerIdentificationCode() {
    return travellerIdentificationCode;
  }

  public void setTravellerIdentificationCode(String travellerIdentificationCode) {
    this.travellerIdentificationCode = travellerIdentificationCode;
  }

  public TravellerNameInfoType type(String type) {
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
    TravellerNameInfoType travellerNameInfoType = (TravellerNameInfoType) o;
    return Objects.equals(this.age, travellerNameInfoType.age) &&
        Objects.equals(this.infantIndicator, travellerNameInfoType.infantIndicator) &&
        Objects.equals(this.otherType, travellerNameInfoType.otherType) &&
        Objects.equals(this.qualifier, travellerNameInfoType.qualifier) &&
        Objects.equals(this.quantity, travellerNameInfoType.quantity) &&
        Objects.equals(this.travellerIdentificationCode, travellerNameInfoType.travellerIdentificationCode) &&
        Objects.equals(this.type, travellerNameInfoType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, infantIndicator, otherType, qualifier, quantity, travellerIdentificationCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerNameInfoType {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    infantIndicator: ").append(toIndentedString(infantIndicator)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    travellerIdentificationCode: ").append(toIndentedString(travellerIdentificationCode)).append("\n");
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

