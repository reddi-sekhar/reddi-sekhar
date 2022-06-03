package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.AcceptanceChannelResponseDto;
import jp.co.ana.cas.b18.dto.response.AccregReasonResponseDto;
import jp.co.ana.cas.b18.dto.response.LegPositionResponseDto;
import jp.co.ana.cas.b18.dto.response.LegResponseDto;
import jp.co.ana.cas.b18.dto.response.PaxStatusResponseDto;
import jp.co.ana.cas.b18.dto.response.PaxTypeResponseDto;
import jp.co.ana.cas.b18.dto.response.RegradeCabinResponseDto;
import jp.co.ana.cas.b18.dto.response.SeatDeliveryResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DcsLegInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DcsLegInfoResponseDto   {
  @JsonProperty("legPosition")
  private LegPositionResponseDto legPosition;

  @JsonProperty("leg")
  private LegResponseDto leg;

  @JsonProperty("paxType")
  private PaxTypeResponseDto paxType;

  @JsonProperty("seatDelivery")
  private SeatDeliveryResponseDto seatDelivery;

  @JsonProperty("paxStatus")
  private PaxStatusResponseDto paxStatus;

  @JsonProperty("accregReason")
  @Valid
  private List<AccregReasonResponseDto> accregReason = null;

  @JsonProperty("regradeCabin")
  private RegradeCabinResponseDto regradeCabin;

  @JsonProperty("acceptanceChannel")
  private AcceptanceChannelResponseDto acceptanceChannel;

  public DcsLegInfoResponseDto legPosition(LegPositionResponseDto legPosition) {
    this.legPosition = legPosition;
    return this;
  }

  /**
   * Get legPosition
   * @return legPosition
  */
  @ApiModelProperty(value = "")

  @Valid

  public LegPositionResponseDto getLegPosition() {
    return legPosition;
  }

  public void setLegPosition(LegPositionResponseDto legPosition) {
    this.legPosition = legPosition;
  }

  public DcsLegInfoResponseDto leg(LegResponseDto leg) {
    this.leg = leg;
    return this;
  }

  /**
   * Get leg
   * @return leg
  */
  @ApiModelProperty(value = "")

  @Valid

  public LegResponseDto getLeg() {
    return leg;
  }

  public void setLeg(LegResponseDto leg) {
    this.leg = leg;
  }

  public DcsLegInfoResponseDto paxType(PaxTypeResponseDto paxType) {
    this.paxType = paxType;
    return this;
  }

  /**
   * Get paxType
   * @return paxType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaxTypeResponseDto getPaxType() {
    return paxType;
  }

  public void setPaxType(PaxTypeResponseDto paxType) {
    this.paxType = paxType;
  }

  public DcsLegInfoResponseDto seatDelivery(SeatDeliveryResponseDto seatDelivery) {
    this.seatDelivery = seatDelivery;
    return this;
  }

  /**
   * Get seatDelivery
   * @return seatDelivery
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatDeliveryResponseDto getSeatDelivery() {
    return seatDelivery;
  }

  public void setSeatDelivery(SeatDeliveryResponseDto seatDelivery) {
    this.seatDelivery = seatDelivery;
  }

  public DcsLegInfoResponseDto paxStatus(PaxStatusResponseDto paxStatus) {
    this.paxStatus = paxStatus;
    return this;
  }

  /**
   * Get paxStatus
   * @return paxStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaxStatusResponseDto getPaxStatus() {
    return paxStatus;
  }

  public void setPaxStatus(PaxStatusResponseDto paxStatus) {
    this.paxStatus = paxStatus;
  }

  public DcsLegInfoResponseDto accregReason(List<AccregReasonResponseDto> accregReason) {
    this.accregReason = accregReason;
    return this;
  }

  public DcsLegInfoResponseDto addAccregReasonItem(AccregReasonResponseDto accregReasonItem) {
    if (this.accregReason == null) {
      this.accregReason = new ArrayList<>();
    }
    this.accregReason.add(accregReasonItem);
    return this;
  }

  /**
   * Get accregReason
   * @return accregReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccregReasonResponseDto> getAccregReason() {
    return accregReason;
  }

  public void setAccregReason(List<AccregReasonResponseDto> accregReason) {
    this.accregReason = accregReason;
  }

  public DcsLegInfoResponseDto regradeCabin(RegradeCabinResponseDto regradeCabin) {
    this.regradeCabin = regradeCabin;
    return this;
  }

  /**
   * Get regradeCabin
   * @return regradeCabin
  */
  @ApiModelProperty(value = "")

  @Valid

  public RegradeCabinResponseDto getRegradeCabin() {
    return regradeCabin;
  }

  public void setRegradeCabin(RegradeCabinResponseDto regradeCabin) {
    this.regradeCabin = regradeCabin;
  }

  public DcsLegInfoResponseDto acceptanceChannel(AcceptanceChannelResponseDto acceptanceChannel) {
    this.acceptanceChannel = acceptanceChannel;
    return this;
  }

  /**
   * Get acceptanceChannel
   * @return acceptanceChannel
  */
  @ApiModelProperty(value = "")

  @Valid

  public AcceptanceChannelResponseDto getAcceptanceChannel() {
    return acceptanceChannel;
  }

  public void setAcceptanceChannel(AcceptanceChannelResponseDto acceptanceChannel) {
    this.acceptanceChannel = acceptanceChannel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcsLegInfoResponseDto dcsLegInfoResponseDto = (DcsLegInfoResponseDto) o;
    return Objects.equals(this.legPosition, dcsLegInfoResponseDto.legPosition) &&
        Objects.equals(this.leg, dcsLegInfoResponseDto.leg) &&
        Objects.equals(this.paxType, dcsLegInfoResponseDto.paxType) &&
        Objects.equals(this.seatDelivery, dcsLegInfoResponseDto.seatDelivery) &&
        Objects.equals(this.paxStatus, dcsLegInfoResponseDto.paxStatus) &&
        Objects.equals(this.accregReason, dcsLegInfoResponseDto.accregReason) &&
        Objects.equals(this.regradeCabin, dcsLegInfoResponseDto.regradeCabin) &&
        Objects.equals(this.acceptanceChannel, dcsLegInfoResponseDto.acceptanceChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legPosition, leg, paxType, seatDelivery, paxStatus, accregReason, regradeCabin, acceptanceChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcsLegInfoResponseDto {\n");
    
    sb.append("    legPosition: ").append(toIndentedString(legPosition)).append("\n");
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
    sb.append("    paxType: ").append(toIndentedString(paxType)).append("\n");
    sb.append("    seatDelivery: ").append(toIndentedString(seatDelivery)).append("\n");
    sb.append("    paxStatus: ").append(toIndentedString(paxStatus)).append("\n");
    sb.append("    accregReason: ").append(toIndentedString(accregReason)).append("\n");
    sb.append("    regradeCabin: ").append(toIndentedString(regradeCabin)).append("\n");
    sb.append("    acceptanceChannel: ").append(toIndentedString(acceptanceChannel)).append("\n");
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

