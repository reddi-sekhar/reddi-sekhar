package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeInformationType142108C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CodedAttributeType127282S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CodedAttributeType127282S   {
  @JsonProperty("attributeDetails")
  private CodedAttributeInformationType142108C attributeDetails;

  public CodedAttributeType127282S attributeDetails(CodedAttributeInformationType142108C attributeDetails) {
    this.attributeDetails = attributeDetails;
    return this;
  }

  /**
   * Get attributeDetails
   * @return attributeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeInformationType142108C getAttributeDetails() {
    return attributeDetails;
  }

  public void setAttributeDetails(CodedAttributeInformationType142108C attributeDetails) {
    this.attributeDetails = attributeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodedAttributeType127282S codedAttributeType127282S = (CodedAttributeType127282S) o;
    return Objects.equals(this.attributeDetails, codedAttributeType127282S.attributeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedAttributeType127282S {\n");
    
    sb.append("    attributeDetails: ").append(toIndentedString(attributeDetails)).append("\n");
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

