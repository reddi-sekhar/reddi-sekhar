package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeInformationTypeU36633C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttributeTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AttributeTypeU   {
  @JsonProperty("attributeDetails")
  private AttributeInformationTypeU36633C attributeDetails;

  @JsonProperty("attributeFunction")
  private String attributeFunction;

  public AttributeTypeU attributeDetails(AttributeInformationTypeU36633C attributeDetails) {
    this.attributeDetails = attributeDetails;
    return this;
  }

  /**
   * Get attributeDetails
   * @return attributeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AttributeInformationTypeU36633C getAttributeDetails() {
    return attributeDetails;
  }

  public void setAttributeDetails(AttributeInformationTypeU36633C attributeDetails) {
    this.attributeDetails = attributeDetails;
  }

  public AttributeTypeU attributeFunction(String attributeFunction) {
    this.attributeFunction = attributeFunction;
    return this;
  }

  /**
   * Get attributeFunction
   * @return attributeFunction
  */
  @ApiModelProperty(value = "")


  public String getAttributeFunction() {
    return attributeFunction;
  }

  public void setAttributeFunction(String attributeFunction) {
    this.attributeFunction = attributeFunction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeTypeU attributeTypeU = (AttributeTypeU) o;
    return Objects.equals(this.attributeDetails, attributeTypeU.attributeDetails) &&
        Objects.equals(this.attributeFunction, attributeTypeU.attributeFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDetails, attributeFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeTypeU {\n");
    
    sb.append("    attributeDetails: ").append(toIndentedString(attributeDetails)).append("\n");
    sb.append("    attributeFunction: ").append(toIndentedString(attributeFunction)).append("\n");
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

