package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferenceInfoType227787S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferenceInfoType227787S   {
  @JsonProperty("reference")
  @Valid
  private List<ReferencingDetailsType> reference = null;

  public ReferenceInfoType227787S reference(List<ReferencingDetailsType> reference) {
    this.reference = reference;
    return this;
  }

  public ReferenceInfoType227787S addReferenceItem(ReferencingDetailsType referenceItem) {
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

  public List<ReferencingDetailsType> getReference() {
    return reference;
  }

  public void setReference(List<ReferencingDetailsType> reference) {
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
    ReferenceInfoType227787S referenceInfoType227787S = (ReferenceInfoType227787S) o;
    return Objects.equals(this.reference, referenceInfoType227787S.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceInfoType227787S {\n");
    
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

