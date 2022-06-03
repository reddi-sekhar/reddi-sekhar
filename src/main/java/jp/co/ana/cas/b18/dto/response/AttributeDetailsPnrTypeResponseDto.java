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
 * AttributeDetailsPnrTypeResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AttributeDetailsPnrTypeResponseDto   {
  @JsonProperty("attributeType")
  private String attributeType;

  public AttributeDetailsPnrTypeResponseDto attributeType(String attributeType) {
    this.attributeType = attributeType;
    return this;
  }

  /**
   * provides the attribute Type
   * @return attributeType
  */
  @ApiModelProperty(value = "provides the attribute Type")

@Size(min=1,max=5) 
  public String getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(String attributeType) {
    this.attributeType = attributeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeDetailsPnrTypeResponseDto attributeDetailsPnrTypeResponseDto = (AttributeDetailsPnrTypeResponseDto) o;
    return Objects.equals(this.attributeType, attributeDetailsPnrTypeResponseDto.attributeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeDetailsPnrTypeResponseDto {\n");
    
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
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

