package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.Reference1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElementManagementPassenger1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ElementManagementPassenger1RequestDto   {
  @JsonProperty("reference")
  private Reference1RequestDto reference;

  @JsonProperty("segmentName")
  private String segmentName;

  public ElementManagementPassenger1RequestDto reference(Reference1RequestDto reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Reference1RequestDto getReference() {
    return reference;
  }

  public void setReference(Reference1RequestDto reference) {
    this.reference = reference;
  }

  public ElementManagementPassenger1RequestDto segmentName(String segmentName) {
    this.segmentName = segmentName;
    return this;
  }

  /**
   * PNR segment or element name
   * @return segmentName
  */
  @ApiModelProperty(required = true, value = "PNR segment or element name")
  @NotNull

@Size(min=1,max=3) 
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
    ElementManagementPassenger1RequestDto elementManagementPassenger1RequestDto = (ElementManagementPassenger1RequestDto) o;
    return Objects.equals(this.reference, elementManagementPassenger1RequestDto.reference) &&
        Objects.equals(this.segmentName, elementManagementPassenger1RequestDto.segmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, segmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementPassenger1RequestDto {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

