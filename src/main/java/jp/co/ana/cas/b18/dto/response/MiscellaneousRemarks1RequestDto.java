package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.MiscellaneousRemarkType1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MiscellaneousRemarks1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class MiscellaneousRemarks1RequestDto   {
  @JsonProperty("remarks")
  private MiscellaneousRemarkType1RequestDto remarks;

  public MiscellaneousRemarks1RequestDto remarks(MiscellaneousRemarkType1RequestDto remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarkType1RequestDto getRemarks() {
    return remarks;
  }

  public void setRemarks(MiscellaneousRemarkType1RequestDto remarks) {
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
    MiscellaneousRemarks1RequestDto miscellaneousRemarks1RequestDto = (MiscellaneousRemarks1RequestDto) o;
    return Objects.equals(this.remarks, miscellaneousRemarks1RequestDto.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarks1RequestDto {\n");
    
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

