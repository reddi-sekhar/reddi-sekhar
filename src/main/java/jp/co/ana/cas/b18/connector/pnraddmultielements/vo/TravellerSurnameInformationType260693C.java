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
 * TravellerSurnameInformationType260693C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerSurnameInformationType260693C   {
  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("staffType")
  private String staffType;

  @JsonProperty("surname")
  private String surname;

  public TravellerSurnameInformationType260693C qualifier(String qualifier) {
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

  public TravellerSurnameInformationType260693C quantity(Long quantity) {
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

  public TravellerSurnameInformationType260693C staffType(String staffType) {
    this.staffType = staffType;
    return this;
  }

  /**
   * Get staffType
   * @return staffType
  */
  @ApiModelProperty(value = "")


  public String getStaffType() {
    return staffType;
  }

  public void setStaffType(String staffType) {
    this.staffType = staffType;
  }

  public TravellerSurnameInformationType260693C surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerSurnameInformationType260693C travellerSurnameInformationType260693C = (TravellerSurnameInformationType260693C) o;
    return Objects.equals(this.qualifier, travellerSurnameInformationType260693C.qualifier) &&
        Objects.equals(this.quantity, travellerSurnameInformationType260693C.quantity) &&
        Objects.equals(this.staffType, travellerSurnameInformationType260693C.staffType) &&
        Objects.equals(this.surname, travellerSurnameInformationType260693C.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifier, quantity, staffType, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerSurnameInformationType260693C {\n");
    
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    staffType: ").append(toIndentedString(staffType)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

