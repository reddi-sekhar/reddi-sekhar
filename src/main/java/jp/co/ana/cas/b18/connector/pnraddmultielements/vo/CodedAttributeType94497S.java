package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CodedAttributeType94497S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CodedAttributeType94497S   {
  @JsonProperty("attributeDetails")
  @Valid
  private List<CodedAttributeInformationType> attributeDetails = null;

  @JsonProperty("attributeFunction")
  private String attributeFunction;

  public CodedAttributeType94497S attributeDetails(List<CodedAttributeInformationType> attributeDetails) {
    this.attributeDetails = attributeDetails;
    return this;
  }

  public CodedAttributeType94497S addAttributeDetailsItem(CodedAttributeInformationType attributeDetailsItem) {
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

  public List<CodedAttributeInformationType> getAttributeDetails() {
    return attributeDetails;
  }

  public void setAttributeDetails(List<CodedAttributeInformationType> attributeDetails) {
    this.attributeDetails = attributeDetails;
  }

  public CodedAttributeType94497S attributeFunction(String attributeFunction) {
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
    CodedAttributeType94497S codedAttributeType94497S = (CodedAttributeType94497S) o;
    return Objects.equals(this.attributeDetails, codedAttributeType94497S.attributeDetails) &&
        Objects.equals(this.attributeFunction, codedAttributeType94497S.attributeFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDetails, attributeFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedAttributeType94497S {\n");
    
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

