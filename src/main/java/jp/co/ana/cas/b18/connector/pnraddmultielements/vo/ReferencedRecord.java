package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI196503S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationSecurityInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferencedRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReferencedRecord   {
  @JsonProperty("referencedReservationInfo")
  private ReservationControlInformationTypeI196503S referencedReservationInfo;

  @JsonProperty("securityInformation")
  private ReservationSecurityInformationType securityInformation;

  public ReferencedRecord referencedReservationInfo(ReservationControlInformationTypeI196503S referencedReservationInfo) {
    this.referencedReservationInfo = referencedReservationInfo;
    return this;
  }

  /**
   * Get referencedReservationInfo
   * @return referencedReservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeI196503S getReferencedReservationInfo() {
    return referencedReservationInfo;
  }

  public void setReferencedReservationInfo(ReservationControlInformationTypeI196503S referencedReservationInfo) {
    this.referencedReservationInfo = referencedReservationInfo;
  }

  public ReferencedRecord securityInformation(ReservationSecurityInformationType securityInformation) {
    this.securityInformation = securityInformation;
    return this;
  }

  /**
   * Get securityInformation
   * @return securityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationSecurityInformationType getSecurityInformation() {
    return securityInformation;
  }

  public void setSecurityInformation(ReservationSecurityInformationType securityInformation) {
    this.securityInformation = securityInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedRecord referencedRecord = (ReferencedRecord) o;
    return Objects.equals(this.referencedReservationInfo, referencedRecord.referencedReservationInfo) &&
        Objects.equals(this.securityInformation, referencedRecord.securityInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedReservationInfo, securityInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedRecord {\n");
    
    sb.append("    referencedReservationInfo: ").append(toIndentedString(referencedReservationInfo)).append("\n");
    sb.append("    securityInformation: ").append(toIndentedString(securityInformation)).append("\n");
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

