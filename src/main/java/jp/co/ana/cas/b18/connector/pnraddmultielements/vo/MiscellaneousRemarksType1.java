package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarkType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MiscellaneousRemarksType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarksType1   {
  @JsonProperty("remarks")
  private MiscellaneousRemarkType1 remarks;

  public MiscellaneousRemarksType1 remarks(MiscellaneousRemarkType1 remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarkType1 getRemarks() {
    return remarks;
  }

  public void setRemarks(MiscellaneousRemarkType1 remarks) {
    this.remarks = remarks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiscellaneousRemarksType1 miscellaneousRemarksType1 = (MiscellaneousRemarksType1) o;
    return Objects.equals(this.remarks, miscellaneousRemarksType1.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarksType1 {\n");
    
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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

