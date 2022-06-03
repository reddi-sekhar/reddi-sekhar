package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsType127526C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElementManagementSegmentType127983S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ElementManagementSegmentType127983S   {
  @JsonProperty("elementReference")
  private ReferencingDetailsType127526C elementReference;

  @JsonProperty("lineNumber")
  private Long lineNumber;

  @JsonProperty("segmentName")
  private String segmentName;

  public ElementManagementSegmentType127983S elementReference(ReferencingDetailsType127526C elementReference) {
    this.elementReference = elementReference;
    return this;
  }

  /**
   * Get elementReference
   * @return elementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencingDetailsType127526C getElementReference() {
    return elementReference;
  }

  public void setElementReference(ReferencingDetailsType127526C elementReference) {
    this.elementReference = elementReference;
  }

  public ElementManagementSegmentType127983S lineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Get lineNumber
   * @return lineNumber
  */
  @ApiModelProperty(value = "")


  public Long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
  }

  public ElementManagementSegmentType127983S segmentName(String segmentName) {
    this.segmentName = segmentName;
    return this;
  }

  /**
   * Get segmentName
   * @return segmentName
  */
  @ApiModelProperty(value = "")


  public String getSegmentName() {
    return segmentName;
  }

  public void setSegmentName(String segmentName) {
    this.segmentName = segmentName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementManagementSegmentType127983S elementManagementSegmentType127983S = (ElementManagementSegmentType127983S) o;
    return Objects.equals(this.elementReference, elementManagementSegmentType127983S.elementReference) &&
        Objects.equals(this.lineNumber, elementManagementSegmentType127983S.lineNumber) &&
        Objects.equals(this.segmentName, elementManagementSegmentType127983S.segmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementReference, lineNumber, segmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementSegmentType127983S {\n");
    
    sb.append("    elementReference: ").append(toIndentedString(elementReference)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    segmentName: ").append(toIndentedString(segmentName)).append("\n");
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

