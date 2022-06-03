package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarkType210666C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExtendedRemarkType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ExtendedRemarkType   {
  @JsonProperty("structuredRemark")
  private MiscellaneousRemarkType210666C structuredRemark;

  public ExtendedRemarkType structuredRemark(MiscellaneousRemarkType210666C structuredRemark) {
    this.structuredRemark = structuredRemark;
    return this;
  }

  /**
   * Get structuredRemark
   * @return structuredRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarkType210666C getStructuredRemark() {
    return structuredRemark;
  }

  public void setStructuredRemark(MiscellaneousRemarkType210666C structuredRemark) {
    this.structuredRemark = structuredRemark;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedRemarkType extendedRemarkType = (ExtendedRemarkType) o;
    return Objects.equals(this.structuredRemark, extendedRemarkType.structuredRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structuredRemark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedRemarkType {\n");
    
    sb.append("    structuredRemark: ").append(toIndentedString(structuredRemark)).append("\n");
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

