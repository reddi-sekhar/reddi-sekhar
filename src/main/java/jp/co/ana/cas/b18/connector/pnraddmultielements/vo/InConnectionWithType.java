package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CouponInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketNumberTypeI79026S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransportIdentifierType79027S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InConnectionWithType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InConnectionWithType   {
  @JsonProperty("carrier")
  private TransportIdentifierType79027S carrier;

  @JsonProperty("couponList")
  @Valid
  private List<CouponInformationTypeI> couponList = null;

  @JsonProperty("identification")
  private TicketNumberTypeI79026S identification;

  public InConnectionWithType carrier(TransportIdentifierType79027S carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Get carrier
   * @return carrier
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransportIdentifierType79027S getCarrier() {
    return carrier;
  }

  public void setCarrier(TransportIdentifierType79027S carrier) {
    this.carrier = carrier;
  }

  public InConnectionWithType couponList(List<CouponInformationTypeI> couponList) {
    this.couponList = couponList;
    return this;
  }

  public InConnectionWithType addCouponListItem(CouponInformationTypeI couponListItem) {
    if (this.couponList == null) {
      this.couponList = new ArrayList<>();
    }
    this.couponList.add(couponListItem);
    return this;
  }

  /**
   * Get couponList
   * @return couponList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CouponInformationTypeI> getCouponList() {
    return couponList;
  }

  public void setCouponList(List<CouponInformationTypeI> couponList) {
    this.couponList = couponList;
  }

  public InConnectionWithType identification(TicketNumberTypeI79026S identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketNumberTypeI79026S getIdentification() {
    return identification;
  }

  public void setIdentification(TicketNumberTypeI79026S identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InConnectionWithType inConnectionWithType = (InConnectionWithType) o;
    return Objects.equals(this.carrier, inConnectionWithType.carrier) &&
        Objects.equals(this.couponList, inConnectionWithType.couponList) &&
        Objects.equals(this.identification, inConnectionWithType.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, couponList, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InConnectionWithType {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    couponList: ").append(toIndentedString(couponList)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

