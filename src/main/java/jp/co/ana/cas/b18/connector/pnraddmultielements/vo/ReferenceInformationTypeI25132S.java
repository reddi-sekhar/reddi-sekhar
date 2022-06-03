package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencingDetailsTypeI45901C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferenceInformationTypeI25132S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferenceInformationTypeI25132S   {
  @JsonProperty("referenceDetails")
  @Valid
  private List<ReferencingDetailsTypeI45901C> referenceDetails = null;

  public ReferenceInformationTypeI25132S referenceDetails(List<ReferencingDetailsTypeI45901C> referenceDetails) {
    this.referenceDetails = referenceDetails;
    return this;
  }

  public ReferenceInformationTypeI25132S addReferenceDetailsItem(ReferencingDetailsTypeI45901C referenceDetailsItem) {
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

  public List<ReferencingDetailsTypeI45901C> getReferenceDetails() {
    return referenceDetails;
  }

  public void setReferenceDetails(List<ReferencingDetailsTypeI45901C> referenceDetails) {
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
    ReferenceInformationTypeI25132S referenceInformationTypeI25132S = (ReferenceInformationTypeI25132S) o;
    return Objects.equals(this.referenceDetails, referenceInformationTypeI25132S.referenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceInformationTypeI25132S {\n");
    
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

