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
 * Traveller1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class Traveller1RequestDto   {
  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("surname")
  private String surname;

  public Traveller1RequestDto qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Traveller Qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "Traveller Qualifier")

@Size(min=1,max=3) 
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public Traveller1RequestDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity
   * @return quantity
  */
  @ApiModelProperty(value = "Quantity")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Traveller1RequestDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Traveler Last Name or Group name
   * @return surname
  */
  @ApiModelProperty(required = true, value = "Traveler Last Name or Group name")
  @NotNull

@Size(min=1,max=57) 
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
    Traveller1RequestDto traveller1RequestDto = (Traveller1RequestDto) o;
    return Objects.equals(this.qualifier, traveller1RequestDto.qualifier) &&
        Objects.equals(this.quantity, traveller1RequestDto.quantity) &&
        Objects.equals(this.surname, traveller1RequestDto.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifier, quantity, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Traveller1RequestDto {\n");
    
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

