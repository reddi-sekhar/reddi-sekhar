package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ReferenceItineraryResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferenceForSegmentResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReferenceForSegmentResponseDto   {
  @JsonProperty("reference")
  @Valid
  private List<ReferenceItineraryResponseDto> reference = null;

  public ReferenceForSegmentResponseDto reference(List<ReferenceItineraryResponseDto> reference) {
    this.reference = reference;
    return this;
  }

  public ReferenceForSegmentResponseDto addReferenceItem(ReferenceItineraryResponseDto referenceItem) {
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

  public List<ReferenceItineraryResponseDto> getReference() {
    return reference;
  }

  public void setReference(List<ReferenceItineraryResponseDto> reference) {
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
    ReferenceForSegmentResponseDto referenceForSegmentResponseDto = (ReferenceForSegmentResponseDto) o;
    return Objects.equals(this.reference, referenceForSegmentResponseDto.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceForSegmentResponseDto {\n");
    
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

