package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AcceptanceChannel;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccregReason;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompensationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginAndDestinationDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SegmentCabinIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI127261S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelItineraryInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DcsLegInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DcsLegInfo   {
  @JsonProperty("acceptanceChannel")
  private AcceptanceChannel acceptanceChannel;

  @JsonProperty("accregReason")
  @Valid
  private List<AccregReason> accregReason = null;

  @JsonProperty("compensationData")
  private CompensationType compensationData;

  @JsonProperty("leg")
  private OriginAndDestinationDetailsTypeI leg;

  @JsonProperty("legPosition")
  private TravelItineraryInformationTypeI legPosition;

  @JsonProperty("paxStatus")
  private StatusTypeI127261S paxStatus;

  @JsonProperty("paxType")
  private ReferenceInformationTypeI paxType;

  @JsonProperty("regradeCabin")
  private SegmentCabinIdentificationType regradeCabin;

  @JsonProperty("seatDelivery")
  private SpecialRequirementsDetailsType seatDelivery;

  public DcsLegInfo acceptanceChannel(AcceptanceChannel acceptanceChannel) {
    this.acceptanceChannel = acceptanceChannel;
    return this;
  }

  /**
   * Get acceptanceChannel
   * @return acceptanceChannel
  */
  @ApiModelProperty(value = "")

  @Valid

  public AcceptanceChannel getAcceptanceChannel() {
    return acceptanceChannel;
  }

  public void setAcceptanceChannel(AcceptanceChannel acceptanceChannel) {
    this.acceptanceChannel = acceptanceChannel;
  }

  public DcsLegInfo accregReason(List<AccregReason> accregReason) {
    this.accregReason = accregReason;
    return this;
  }

  public DcsLegInfo addAccregReasonItem(AccregReason accregReasonItem) {
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

  public List<AccregReason> getAccregReason() {
    return accregReason;
  }

  public void setAccregReason(List<AccregReason> accregReason) {
    this.accregReason = accregReason;
  }

  public DcsLegInfo compensationData(CompensationType compensationData) {
    this.compensationData = compensationData;
    return this;
  }

  /**
   * Get compensationData
   * @return compensationData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompensationType getCompensationData() {
    return compensationData;
  }

  public void setCompensationData(CompensationType compensationData) {
    this.compensationData = compensationData;
  }

  public DcsLegInfo leg(OriginAndDestinationDetailsTypeI leg) {
    this.leg = leg;
    return this;
  }

  /**
   * Get leg
   * @return leg
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestinationDetailsTypeI getLeg() {
    return leg;
  }

  public void setLeg(OriginAndDestinationDetailsTypeI leg) {
    this.leg = leg;
  }

  public DcsLegInfo legPosition(TravelItineraryInformationTypeI legPosition) {
    this.legPosition = legPosition;
    return this;
  }

  /**
   * Get legPosition
   * @return legPosition
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelItineraryInformationTypeI getLegPosition() {
    return legPosition;
  }

  public void setLegPosition(TravelItineraryInformationTypeI legPosition) {
    this.legPosition = legPosition;
  }

  public DcsLegInfo paxStatus(StatusTypeI127261S paxStatus) {
    this.paxStatus = paxStatus;
    return this;
  }

  /**
   * Get paxStatus
   * @return paxStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusTypeI127261S getPaxStatus() {
    return paxStatus;
  }

  public void setPaxStatus(StatusTypeI127261S paxStatus) {
    this.paxStatus = paxStatus;
  }

  public DcsLegInfo paxType(ReferenceInformationTypeI paxType) {
    this.paxType = paxType;
    return this;
  }

  /**
   * Get paxType
   * @return paxType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationTypeI getPaxType() {
    return paxType;
  }

  public void setPaxType(ReferenceInformationTypeI paxType) {
    this.paxType = paxType;
  }

  public DcsLegInfo regradeCabin(SegmentCabinIdentificationType regradeCabin) {
    this.regradeCabin = regradeCabin;
    return this;
  }

  /**
   * Get regradeCabin
   * @return regradeCabin
  */
  @ApiModelProperty(value = "")

  @Valid

  public SegmentCabinIdentificationType getRegradeCabin() {
    return regradeCabin;
  }

  public void setRegradeCabin(SegmentCabinIdentificationType regradeCabin) {
    this.regradeCabin = regradeCabin;
  }

  public DcsLegInfo seatDelivery(SpecialRequirementsDetailsType seatDelivery) {
    this.seatDelivery = seatDelivery;
    return this;
  }

  /**
   * Get seatDelivery
   * @return seatDelivery
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsDetailsType getSeatDelivery() {
    return seatDelivery;
  }

  public void setSeatDelivery(SpecialRequirementsDetailsType seatDelivery) {
    this.seatDelivery = seatDelivery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcsLegInfo dcsLegInfo = (DcsLegInfo) o;
    return Objects.equals(this.acceptanceChannel, dcsLegInfo.acceptanceChannel) &&
        Objects.equals(this.accregReason, dcsLegInfo.accregReason) &&
        Objects.equals(this.compensationData, dcsLegInfo.compensationData) &&
        Objects.equals(this.leg, dcsLegInfo.leg) &&
        Objects.equals(this.legPosition, dcsLegInfo.legPosition) &&
        Objects.equals(this.paxStatus, dcsLegInfo.paxStatus) &&
        Objects.equals(this.paxType, dcsLegInfo.paxType) &&
        Objects.equals(this.regradeCabin, dcsLegInfo.regradeCabin) &&
        Objects.equals(this.seatDelivery, dcsLegInfo.seatDelivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceChannel, accregReason, compensationData, leg, legPosition, paxStatus, paxType, regradeCabin, seatDelivery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcsLegInfo {\n");
    
    sb.append("    acceptanceChannel: ").append(toIndentedString(acceptanceChannel)).append("\n");
    sb.append("    accregReason: ").append(toIndentedString(accregReason)).append("\n");
    sb.append("    compensationData: ").append(toIndentedString(compensationData)).append("\n");
    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
    sb.append("    legPosition: ").append(toIndentedString(legPosition)).append("\n");
    sb.append("    paxStatus: ").append(toIndentedString(paxStatus)).append("\n");
    sb.append("    paxType: ").append(toIndentedString(paxType)).append("\n");
    sb.append("    regradeCabin: ").append(toIndentedString(regradeCabin)).append("\n");
    sb.append("    seatDelivery: ").append(toIndentedString(seatDelivery)).append("\n");
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

