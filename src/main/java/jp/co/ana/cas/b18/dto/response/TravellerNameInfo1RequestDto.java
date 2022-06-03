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
 * TravellerNameInfo1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravellerNameInfo1RequestDto   {
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

  public TravellerNameInfo1RequestDto infantIndicator(String infantIndicator) {
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

  public TravellerNameInfo1RequestDto otherType(String otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Passenger type (PTC)
   * @return otherType
  */
  @ApiModelProperty(value = "Passenger type (PTC)")

@Size(min=1,max=3) 
  public String getOtherType() {
    return otherType;
  }

  public void setOtherType(String otherType) {
    this.otherType = otherType;
  }

  public TravellerNameInfo1RequestDto qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * PAX = PAX IN = Infant
   * @return qualifier
  */
  @ApiModelProperty(value = "PAX = PAX IN = Infant")

@Size(min=1,max=3) 
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public TravellerNameInfo1RequestDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Description
   * @return quantity
  */
  @ApiModelProperty(value = "Description")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public TravellerNameInfo1RequestDto travellerIdentificationCode(String travellerIdentificationCode) {
    this.travellerIdentificationCode = travellerIdentificationCode;
    return this;
  }

  /**
   * Identification code
   * @return travellerIdentificationCode
  */
  @ApiModelProperty(value = "Identification code")

@Size(min=1,max=70) 
  public String getTravellerIdentificationCode() {
    return travellerIdentificationCode;
  }

  public void setTravellerIdentificationCode(String travellerIdentificationCode) {
    this.travellerIdentificationCode = travellerIdentificationCode;
  }

  public TravellerNameInfo1RequestDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Passenger type (PTC)
   * @return type
  */
  @ApiModelProperty(value = "Passenger type (PTC)")

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
    TravellerNameInfo1RequestDto travellerNameInfo1RequestDto = (TravellerNameInfo1RequestDto) o;
    return Objects.equals(this.infantIndicator, travellerNameInfo1RequestDto.infantIndicator) &&
        Objects.equals(this.otherType, travellerNameInfo1RequestDto.otherType) &&
        Objects.equals(this.qualifier, travellerNameInfo1RequestDto.qualifier) &&
        Objects.equals(this.quantity, travellerNameInfo1RequestDto.quantity) &&
        Objects.equals(this.travellerIdentificationCode, travellerNameInfo1RequestDto.travellerIdentificationCode) &&
        Objects.equals(this.type, travellerNameInfo1RequestDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infantIndicator, otherType, qualifier, quantity, travellerIdentificationCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerNameInfo1RequestDto {\n");
    
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

