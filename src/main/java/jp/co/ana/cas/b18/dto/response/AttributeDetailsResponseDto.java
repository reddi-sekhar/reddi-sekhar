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
 * AttributeDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AttributeDetailsResponseDto   {
  @JsonProperty("attributeType")
  private String attributeType;

  @JsonProperty("attributeDescription")
  private String attributeDescription;

  public AttributeDetailsResponseDto attributeType(String attributeType) {
    this.attributeType = attributeType;
    return this;
  }

  /**
   * provides the attribute Type
   * @return attributeType
  */
  @ApiModelProperty(example = "ARC", value = "provides the attribute Type")

@Size(min=1,max=3) 
  public String getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(String attributeType) {
    this.attributeType = attributeType;
  }

  public AttributeDetailsResponseDto attributeDescription(String attributeDescription) {
    this.attributeDescription = attributeDescription;
    return this;
  }

  /**
   * provides a description for the attribute
   * @return attributeDescription
  */
  @ApiModelProperty(example = "false", value = "provides a description for the attribute")

@Size(min=1,max=256) 
  public String getAttributeDescription() {
    return attributeDescription;
  }

  public void setAttributeDescription(String attributeDescription) {
    this.attributeDescription = attributeDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeDetailsResponseDto attributeDetailsResponseDto = (AttributeDetailsResponseDto) o;
    return Objects.equals(this.attributeType, attributeDetailsResponseDto.attributeType) &&
        Objects.equals(this.attributeDescription, attributeDetailsResponseDto.attributeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeType, attributeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeDetailsResponseDto {\n");
    
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    attributeDescription: ").append(toIndentedString(attributeDescription)).append("\n");
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

