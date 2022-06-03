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
 * TravellerResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravellerResponseDto   {
  @JsonProperty("surname")
  private String surname;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("staffType")
  private String staffType;

  public TravellerResponseDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Traveler Last Name  Group name
   * @return surname
  */
  @ApiModelProperty(example = "SORANO", value = "Traveler Last Name  Group name")

@Size(min=1,max=57) 
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public TravellerResponseDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Traveller quantity
   * @return quantity
  */
  @ApiModelProperty(example = "1", value = "Traveller quantity")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public TravellerResponseDto staffType(String staffType) {
    this.staffType = staffType;
    return this;
  }

  /**
   * Staff Type
   * @return staffType
  */
  @ApiModelProperty(value = "Staff Type")

@Size(min=1,max=3) 
  public String getStaffType() {
    return staffType;
  }

  public void setStaffType(String staffType) {
    this.staffType = staffType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerResponseDto travellerResponseDto = (TravellerResponseDto) o;
    return Objects.equals(this.surname, travellerResponseDto.surname) &&
        Objects.equals(this.quantity, travellerResponseDto.quantity) &&
        Objects.equals(this.staffType, travellerResponseDto.staffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, quantity, staffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerResponseDto {\n");
    
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    staffType: ").append(toIndentedString(staffType)).append("\n");
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

