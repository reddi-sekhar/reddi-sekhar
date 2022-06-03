package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.Reference1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferenceForSegment1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReferenceForSegment1RequestDto   {
  @JsonProperty("reference")
  @Valid
  private List<Reference1RequestDto> reference = null;

  public ReferenceForSegment1RequestDto reference(List<Reference1RequestDto> reference) {
    this.reference = reference;
    return this;
  }

  public ReferenceForSegment1RequestDto addReferenceItem(Reference1RequestDto referenceItem) {
    if (this.reference == null) {
      this.reference = new ArrayList<>();
    }
    this.reference.add(referenceItem);
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Reference1RequestDto> getReference() {
    return reference;
  }

  public void setReference(List<Reference1RequestDto> reference) {
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
    ReferenceForSegment1RequestDto referenceForSegment1RequestDto = (ReferenceForSegment1RequestDto) o;
    return Objects.equals(this.reference, referenceForSegment1RequestDto.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceForSegment1RequestDto {\n");
    
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

