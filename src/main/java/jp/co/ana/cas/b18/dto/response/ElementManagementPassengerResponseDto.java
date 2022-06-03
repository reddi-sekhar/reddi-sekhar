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
 * ElementManagementPassengerResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ElementManagementPassengerResponseDto   {
  @JsonProperty("status")
  private String status;

  @JsonProperty("reference")
  private ReferenceResponseDto reference;

  @JsonProperty("segmentName")
  private String segmentName;

  @JsonProperty("lineNumber")
  private Long lineNumber;

  public ElementManagementPassengerResponseDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Action to perform (When a PNR segment/element is transmitted)
   * @return status
  */
  @ApiModelProperty(value = "Action to perform (When a PNR segment/element is transmitted)")

@Size(min=1,max=3) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ElementManagementPassengerResponseDto reference(ReferenceResponseDto reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceResponseDto getReference() {
    return reference;
  }

  public void setReference(ReferenceResponseDto reference) {
    this.reference = reference;
  }

  public ElementManagementPassengerResponseDto segmentName(String segmentName) {
    this.segmentName = segmentName;
    return this;
  }

  /**
   * PNR segment or element name
   * @return segmentName
  */
  @ApiModelProperty(example = "NM", value = "PNR segment or element name")

@Size(min=1,max=3) 
  public String getSegmentName() {
    return segmentName;
  }

  public void setSegmentName(String segmentName) {
    this.segmentName = segmentName;
  }

  public ElementManagementPassengerResponseDto lineNumber(Long lineNumber) {
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
    ElementManagementPassengerResponseDto elementManagementPassengerResponseDto = (ElementManagementPassengerResponseDto) o;
    return Objects.equals(this.status, elementManagementPassengerResponseDto.status) &&
        Objects.equals(this.reference, elementManagementPassengerResponseDto.reference) &&
        Objects.equals(this.segmentName, elementManagementPassengerResponseDto.segmentName) &&
        Objects.equals(this.lineNumber, elementManagementPassengerResponseDto.lineNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reference, segmentName, lineNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementPassengerResponseDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

