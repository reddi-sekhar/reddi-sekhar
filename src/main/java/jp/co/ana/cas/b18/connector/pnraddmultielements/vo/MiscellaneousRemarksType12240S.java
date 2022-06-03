package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarkType18076C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MiscellaneousRemarksType12240S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarksType12240S   {
  @JsonProperty("remarkDetails")
  private MiscellaneousRemarkType18076C remarkDetails;

  public MiscellaneousRemarksType12240S remarkDetails(MiscellaneousRemarkType18076C remarkDetails) {
    this.remarkDetails = remarkDetails;
    return this;
  }

  /**
   * Get remarkDetails
   * @return remarkDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarkType18076C getRemarkDetails() {
    return remarkDetails;
  }

  public void setRemarkDetails(MiscellaneousRemarkType18076C remarkDetails) {
    this.remarkDetails = remarkDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiscellaneousRemarksType12240S miscellaneousRemarksType12240S = (MiscellaneousRemarksType12240S) o;
    return Objects.equals(this.remarkDetails, miscellaneousRemarksType12240S.remarkDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remarkDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarksType12240S {\n");
    
    sb.append("    remarkDetails: ").append(toIndentedString(remarkDetails)).append("\n");
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

