package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeInformationType122050C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CodedAttributeType79464S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CodedAttributeType79464S   {
  @JsonProperty("attributeDetails")
  @Valid
  private List<CodedAttributeInformationType122050C> attributeDetails = null;

  public CodedAttributeType79464S attributeDetails(List<CodedAttributeInformationType122050C> attributeDetails) {
    this.attributeDetails = attributeDetails;
    return this;
  }

  public CodedAttributeType79464S addAttributeDetailsItem(CodedAttributeInformationType122050C attributeDetailsItem) {
    if (this.attributeDetails == null) {
      this.attributeDetails = new ArrayList<>();
    }
    this.attributeDetails.add(attributeDetailsItem);
    return this;
  }

  /**
   * Get attributeDetails
   * @return attributeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CodedAttributeInformationType122050C> getAttributeDetails() {
    return attributeDetails;
  }

  public void setAttributeDetails(List<CodedAttributeInformationType122050C> attributeDetails) {
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
    CodedAttributeType79464S codedAttributeType79464S = (CodedAttributeType79464S) o;
    return Objects.equals(this.attributeDetails, codedAttributeType79464S.attributeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedAttributeType79464S {\n");
    
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

