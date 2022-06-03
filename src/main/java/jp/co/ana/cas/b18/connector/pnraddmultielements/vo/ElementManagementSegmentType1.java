package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElementManagementSegmentType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ElementManagementSegmentType1   {
  @JsonProperty("reference")
  private ReferencingDetailsType1 reference;

  @JsonProperty("segmentName")
  private String segmentName;

  public ElementManagementSegmentType1 reference(ReferencingDetailsType1 reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencingDetailsType1 getReference() {
    return reference;
  }

  public void setReference(ReferencingDetailsType1 reference) {
    this.reference = reference;
  }

  public ElementManagementSegmentType1 segmentName(String segmentName) {
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
    ElementManagementSegmentType1 elementManagementSegmentType1 = (ElementManagementSegmentType1) o;
    return Objects.equals(this.reference, elementManagementSegmentType1.reference) &&
        Objects.equals(this.segmentName, elementManagementSegmentType1.segmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, segmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementManagementSegmentType1 {\n");
    
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

