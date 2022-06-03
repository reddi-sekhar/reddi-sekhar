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
 * ElementManagementItineraryResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ElementManagementItineraryResponseDto   {
  @JsonProperty("segmentName")
  private String segmentName;

  @JsonProperty("lineNumber")
  private Long lineNumber;

  @JsonProperty("status")
  private String status;

  @JsonProperty("reference")
  private ReferenceResponseDto reference;

  public ElementManagementItineraryResponseDto segmentName(String segmentName) {
    this.segmentName = segmentName;
    return this;
  }

  /**
   * PNR segment or element name
   * @return segmentName
  */
  @ApiModelProperty(example = "AIR", value = "PNR segment or element name")

@Size(min=1,max=3) 
  public String getSegmentName() {
    return segmentName;
  }

  public void setSegmentName(String segmentName) {
    this.segmentName = segmentName;
  }

  public ElementManagementItineraryResponseDto lineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * PNR segment/element 'line' number attributed by the Server
   * @return lineNumber
  */
  @ApiModelProperty(example = "2", value = "PNR segment/element 'line' number attributed by the Server")


  public Long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
  }

  public ElementManagementItineraryResponseDto status(String status) {
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

  public ElementManagementItineraryResponseDto reference(ReferenceResponseDto reference) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementManagementItineraryResponseDto elementManagementItineraryResponseDto = (ElementManagementItineraryResponseDto) o;
    return Objects.equals(this.segmentName, elementManagementItineraryResponseDto.segmentName) &&
        Objects.equals(this.lineNumber, elementManagementItineraryResponseDto.lineNumber) &&
        Objects.equals(this.status, elementManagementItineraryResponseDto.status) &&
        Objects.equals(this.reference, elementManagementItineraryResponseDto.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentName, lineNumber, status, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementItineraryResponseDto {\n");
    
    sb.append("    segmentName: ").append(toIndentedString(segmentName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

