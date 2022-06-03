package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ReferenceResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElementManagementStructDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ElementManagementStructDataResponseDto   {
  @JsonProperty("elementReference")
  private ReferenceResponseDto elementReference;

  @JsonProperty("segmentName")
  private String segmentName;

  @JsonProperty("lineNumber")
  private Long lineNumber;

  public ElementManagementStructDataResponseDto elementReference(ReferenceResponseDto elementReference) {
    this.elementReference = elementReference;
    return this;
  }

  /**
   * Get elementReference
   * @return elementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceResponseDto getElementReference() {
    return elementReference;
  }

  public void setElementReference(ReferenceResponseDto elementReference) {
    this.elementReference = elementReference;
  }

  public ElementManagementStructDataResponseDto segmentName(String segmentName) {
    this.segmentName = segmentName;
    return this;
  }

  /**
   * PNR segment or element name
   * @return segmentName
  */
  @ApiModelProperty(value = "PNR segment or element name")

@Size(min=1,max=3) 
  public String getSegmentName() {
    return segmentName;
  }

  public void setSegmentName(String segmentName) {
    this.segmentName = segmentName;
  }

  public ElementManagementStructDataResponseDto lineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * PNR segment/element 'line' number attributed by the Server
   * @return lineNumber
  */
  @ApiModelProperty(example = "1", value = "PNR segment/element 'line' number attributed by the Server")


  public Long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementManagementStructDataResponseDto elementManagementStructDataResponseDto = (ElementManagementStructDataResponseDto) o;
    return Objects.equals(this.elementReference, elementManagementStructDataResponseDto.elementReference) &&
        Objects.equals(this.segmentName, elementManagementStructDataResponseDto.segmentName) &&
        Objects.equals(this.lineNumber, elementManagementStructDataResponseDto.lineNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementReference, segmentName, lineNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementStructDataResponseDto {\n");
    
    sb.append("    elementReference: ").append(toIndentedString(elementReference)).append("\n");
    sb.append("    segmentName: ").append(toIndentedString(segmentName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
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

