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
 * CouponInformationDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CouponInformationDetailsTypeI   {
  @JsonProperty("cpnNumber")
  private String cpnNumber;

  public CouponInformationDetailsTypeI cpnNumber(String cpnNumber) {
    this.cpnNumber = cpnNumber;
    return this;
  }

  /**
   * Get cpnNumber
   * @return cpnNumber
  */
  @ApiModelProperty(value = "")


  public String getCpnNumber() {
    return cpnNumber;
  }

  public void setCpnNumber(String cpnNumber) {
    this.cpnNumber = cpnNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponInformationDetailsTypeI couponInformationDetailsTypeI = (CouponInformationDetailsTypeI) o;
    return Objects.equals(this.cpnNumber, couponInformationDetailsTypeI.cpnNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpnNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponInformationDetailsTypeI {\n");
    
    sb.append("    cpnNumber: ").append(toIndentedString(cpnNumber)).append("\n");
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
