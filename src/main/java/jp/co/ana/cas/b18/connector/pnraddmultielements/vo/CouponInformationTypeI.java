package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CouponInformationDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CouponInformationTypeI   {
  @JsonProperty("couponDetails")
  private CouponInformationDetailsTypeI couponDetails;

  public CouponInformationTypeI couponDetails(CouponInformationDetailsTypeI couponDetails) {
    this.couponDetails = couponDetails;
    return this;
  }

  /**
   * Get couponDetails
   * @return couponDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CouponInformationDetailsTypeI getCouponDetails() {
    return couponDetails;
  }

  public void setCouponDetails(CouponInformationDetailsTypeI couponDetails) {
    this.couponDetails = couponDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponInformationTypeI couponInformationTypeI = (CouponInformationTypeI) o;
    return Objects.equals(this.couponDetails, couponInformationTypeI.couponDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponInformationTypeI {\n");
    
    sb.append("    couponDetails: ").append(toIndentedString(couponDetails)).append("\n");
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

