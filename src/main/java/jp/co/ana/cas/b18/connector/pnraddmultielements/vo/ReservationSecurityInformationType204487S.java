package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ResponsibilityInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SecondRpLineInformationType283891C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketInformationType5120C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationSecurityInformationType204487S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationSecurityInformationType204487S   {
  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("queueingInformation")
  private TicketInformationType5120C queueingInformation;

  @JsonProperty("responsibilityInformation")
  private ResponsibilityInformationType responsibilityInformation;

  @JsonProperty("secondRpInformation")
  private SecondRpLineInformationType283891C secondRpInformation;

  public ReservationSecurityInformationType204487S cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Get cityCode
   * @return cityCode
  */
  @ApiModelProperty(value = "")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public ReservationSecurityInformationType204487S queueingInformation(TicketInformationType5120C queueingInformation) {
    this.queueingInformation = queueingInformation;
    return this;
  }

  /**
   * Get queueingInformation
   * @return queueingInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketInformationType5120C getQueueingInformation() {
    return queueingInformation;
  }

  public void setQueueingInformation(TicketInformationType5120C queueingInformation) {
    this.queueingInformation = queueingInformation;
  }

  public ReservationSecurityInformationType204487S responsibilityInformation(ResponsibilityInformationType responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
    return this;
  }

  /**
   * Get responsibilityInformation
   * @return responsibilityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponsibilityInformationType getResponsibilityInformation() {
    return responsibilityInformation;
  }

  public void setResponsibilityInformation(ResponsibilityInformationType responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
  }

  public ReservationSecurityInformationType204487S secondRpInformation(SecondRpLineInformationType283891C secondRpInformation) {
    this.secondRpInformation = secondRpInformation;
    return this;
  }

  /**
   * Get secondRpInformation
   * @return secondRpInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecondRpLineInformationType283891C getSecondRpInformation() {
    return secondRpInformation;
  }

  public void setSecondRpInformation(SecondRpLineInformationType283891C secondRpInformation) {
    this.secondRpInformation = secondRpInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationSecurityInformationType204487S reservationSecurityInformationType204487S = (ReservationSecurityInformationType204487S) o;
    return Objects.equals(this.cityCode, reservationSecurityInformationType204487S.cityCode) &&
        Objects.equals(this.queueingInformation, reservationSecurityInformationType204487S.queueingInformation) &&
        Objects.equals(this.responsibilityInformation, reservationSecurityInformationType204487S.responsibilityInformation) &&
        Objects.equals(this.secondRpInformation, reservationSecurityInformationType204487S.secondRpInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, queueingInformation, responsibilityInformation, secondRpInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationSecurityInformationType204487S {\n");
    
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    queueingInformation: ").append(toIndentedString(queueingInformation)).append("\n");
    sb.append("    responsibilityInformation: ").append(toIndentedString(responsibilityInformation)).append("\n");
    sb.append("    secondRpInformation: ").append(toIndentedString(secondRpInformation)).append("\n");
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

