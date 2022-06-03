package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsType272902C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferenceInfoType195220S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferenceInfoType195220S   {
  @JsonProperty("referenceDetails")
  @Valid
  private List<ReferencingDetailsType272902C> referenceDetails = null;

  public ReferenceInfoType195220S referenceDetails(List<ReferencingDetailsType272902C> referenceDetails) {
    this.referenceDetails = referenceDetails;
    return this;
  }

  public ReferenceInfoType195220S addReferenceDetailsItem(ReferencingDetailsType272902C referenceDetailsItem) {
    if (this.referenceDetails == null) {
      this.referenceDetails = new ArrayList<>();
    }
    this.referenceDetails.add(referenceDetailsItem);
    return this;
  }

  /**
   * Get referenceDetails
   * @return referenceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferencingDetailsType272902C> getReferenceDetails() {
    return referenceDetails;
  }

  public void setReferenceDetails(List<ReferencingDetailsType272902C> referenceDetails) {
    this.referenceDetails = referenceDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceInfoType195220S referenceInfoType195220S = (ReferenceInfoType195220S) o;
    return Objects.equals(this.referenceDetails, referenceInfoType195220S.referenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceInfoType195220S {\n");
    
    sb.append("    referenceDetails: ").append(toIndentedString(referenceDetails)).append("\n");
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

