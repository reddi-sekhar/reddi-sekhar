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
 * ElementManagementSegmentType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ElementManagementSegmentType   {
  @JsonProperty("lineNumber")
  private Long lineNumber;

  @JsonProperty("reference")
  private ReferencingDetailsType127526C reference;

  @JsonProperty("segmentName")
  private String segmentName;

  @JsonProperty("status")
  private String status;

  public ElementManagementSegmentType lineNumber(Long lineNumber) {
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

  public ElementManagementSegmentType reference(ReferencingDetailsType127526C reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencingDetailsType127526C getReference() {
    return reference;
  }

  public void setReference(ReferencingDetailsType127526C reference) {
    this.reference = reference;
  }

  public ElementManagementSegmentType segmentName(String segmentName) {
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

  public ElementManagementSegmentType status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementManagementSegmentType elementManagementSegmentType = (ElementManagementSegmentType) o;
    return Objects.equals(this.lineNumber, elementManagementSegmentType.lineNumber) &&
        Objects.equals(this.reference, elementManagementSegmentType.reference) &&
        Objects.equals(this.segmentName, elementManagementSegmentType.segmentName) &&
        Objects.equals(this.status, elementManagementSegmentType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, reference, segmentName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementSegmentType {\n");
    
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    segmentName: ").append(toIndentedString(segmentName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

