package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ResponsibilityInformationType6835C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SecondRpLineInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketInformationType5120C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationSecurityInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationSecurityInformationType   {
  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("queueingInformation")
  private TicketInformationType5120C queueingInformation;

  @JsonProperty("responsibilityInformation")
  private ResponsibilityInformationType6835C responsibilityInformation;

  @JsonProperty("secondRpInformation")
  private SecondRpLineInformationType secondRpInformation;

  public ReservationSecurityInformationType cityCode(String cityCode) {
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

  public ReservationSecurityInformationType queueingInformation(TicketInformationType5120C queueingInformation) {
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

  public ReservationSecurityInformationType responsibilityInformation(ResponsibilityInformationType6835C responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
    return this;
  }

  /**
   * Get responsibilityInformation
   * @return responsibilityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponsibilityInformationType6835C getResponsibilityInformation() {
    return responsibilityInformation;
  }

  public void setResponsibilityInformation(ResponsibilityInformationType6835C responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
  }

  public ReservationSecurityInformationType secondRpInformation(SecondRpLineInformationType secondRpInformation) {
    this.secondRpInformation = secondRpInformation;
    return this;
  }

  /**
   * Get secondRpInformation
   * @return secondRpInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecondRpLineInformationType getSecondRpInformation() {
    return secondRpInformation;
  }

  public void setSecondRpInformation(SecondRpLineInformationType secondRpInformation) {
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
    ReservationSecurityInformationType reservationSecurityInformationType = (ReservationSecurityInformationType) o;
    return Objects.equals(this.cityCode, reservationSecurityInformationType.cityCode) &&
        Objects.equals(this.queueingInformation, reservationSecurityInformationType.queueingInformation) &&
        Objects.equals(this.responsibilityInformation, reservationSecurityInformationType.responsibilityInformation) &&
        Objects.equals(this.secondRpInformation, reservationSecurityInformationType.secondRpInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, queueingInformation, responsibilityInformation, secondRpInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationSecurityInformationType {\n");
    
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

