package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PnrHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PnrHeader   {
  @JsonProperty("referenceForRecordLocator")
  private ReferenceInfoType referenceForRecordLocator;

  @JsonProperty("reservationInfo")
  private ReservationControlInformationType reservationInfo;

  public PnrHeader referenceForRecordLocator(ReferenceInfoType referenceForRecordLocator) {
    this.referenceForRecordLocator = referenceForRecordLocator;
    return this;
  }

  /**
   * Get referenceForRecordLocator
   * @return referenceForRecordLocator
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType getReferenceForRecordLocator() {
    return referenceForRecordLocator;
  }

  public void setReferenceForRecordLocator(ReferenceInfoType referenceForRecordLocator) {
    this.referenceForRecordLocator = referenceForRecordLocator;
  }

  public PnrHeader reservationInfo(ReservationControlInformationType reservationInfo) {
    this.reservationInfo = reservationInfo;
    return this;
  }

  /**
   * Get reservationInfo
   * @return reservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationType getReservationInfo() {
    return reservationInfo;
  }

  public void setReservationInfo(ReservationControlInformationType reservationInfo) {
    this.reservationInfo = reservationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrHeader pnrHeader = (PnrHeader) o;
    return Objects.equals(this.referenceForRecordLocator, pnrHeader.referenceForRecordLocator) &&
        Objects.equals(this.reservationInfo, pnrHeader.reservationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceForRecordLocator, reservationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrHeader {\n");
    
    sb.append("    referenceForRecordLocator: ").append(toIndentedString(referenceForRecordLocator)).append("\n");
    sb.append("    reservationInfo: ").append(toIndentedString(reservationInfo)).append("\n");
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

