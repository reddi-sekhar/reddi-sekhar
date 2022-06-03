package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SegmentCabinIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SegmentCabinIdentificationType   {
  @JsonProperty("cabinCode")
  private String cabinCode;

  public SegmentCabinIdentificationType cabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
    return this;
  }

  /**
   * Get cabinCode
   * @return cabinCode
  */
  @ApiModelProperty(value = "")


  public String getCabinCode() {
    return cabinCode;
  }

  public void setCabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentCabinIdentificationType segmentCabinIdentificationType = (SegmentCabinIdentificationType) o;
    return Objects.equals(this.cabinCode, segmentCabinIdentificationType.cabinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabinCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentCabinIdentificationType {\n");
    
    sb.append("    cabinCode: ").append(toIndentedString(cabinCode)).append("\n");
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

