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
 * AttributeInformationTypeU45068C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AttributeInformationTypeU45068C   {
  @JsonProperty("attributeType")
  private String attributeType;

  public AttributeInformationTypeU45068C attributeType(String attributeType) {
    this.attributeType = attributeType;
    return this;
  }

  /**
   * Get attributeType
   * @return attributeType
  */
  @ApiModelProperty(value = "")


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
    AttributeInformationTypeU45068C attributeInformationTypeU45068C = (AttributeInformationTypeU45068C) o;
    return Objects.equals(this.attributeType, attributeInformationTypeU45068C.attributeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeInformationTypeU45068C {\n");
    
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

