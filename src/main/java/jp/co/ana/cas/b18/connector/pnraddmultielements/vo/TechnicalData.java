package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PnrHistoryDataType27157S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SequenceDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI32775S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType27086S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TechnicalData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TechnicalData   {
  @JsonProperty("enveloppeNumberData")
  private SequenceDetailsTypeU enveloppeNumberData;

  @JsonProperty("generalPNRInformation")
  private StatusTypeI32775S generalPNRInformation;

  @JsonProperty("lastTransmittedEnvelopeNumber")
  private PnrHistoryDataType27157S lastTransmittedEnvelopeNumber;

  @JsonProperty("purgeDateData")
  private StructuredDateTimeInformationType27086S purgeDateData;

  public TechnicalData enveloppeNumberData(SequenceDetailsTypeU enveloppeNumberData) {
    this.enveloppeNumberData = enveloppeNumberData;
    return this;
  }

  /**
   * Get enveloppeNumberData
   * @return enveloppeNumberData
  */
  @ApiModelProperty(value = "")

  @Valid

  public SequenceDetailsTypeU getEnveloppeNumberData() {
    return enveloppeNumberData;
  }

  public void setEnveloppeNumberData(SequenceDetailsTypeU enveloppeNumberData) {
    this.enveloppeNumberData = enveloppeNumberData;
  }

  public TechnicalData generalPNRInformation(StatusTypeI32775S generalPNRInformation) {
    this.generalPNRInformation = generalPNRInformation;
    return this;
  }

  /**
   * Get generalPNRInformation
   * @return generalPNRInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusTypeI32775S getGeneralPNRInformation() {
    return generalPNRInformation;
  }

  public void setGeneralPNRInformation(StatusTypeI32775S generalPNRInformation) {
    this.generalPNRInformation = generalPNRInformation;
  }

  public TechnicalData lastTransmittedEnvelopeNumber(PnrHistoryDataType27157S lastTransmittedEnvelopeNumber) {
    this.lastTransmittedEnvelopeNumber = lastTransmittedEnvelopeNumber;
    return this;
  }

  /**
   * Get lastTransmittedEnvelopeNumber
   * @return lastTransmittedEnvelopeNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrHistoryDataType27157S getLastTransmittedEnvelopeNumber() {
    return lastTransmittedEnvelopeNumber;
  }

  public void setLastTransmittedEnvelopeNumber(PnrHistoryDataType27157S lastTransmittedEnvelopeNumber) {
    this.lastTransmittedEnvelopeNumber = lastTransmittedEnvelopeNumber;
  }

  public TechnicalData purgeDateData(StructuredDateTimeInformationType27086S purgeDateData) {
    this.purgeDateData = purgeDateData;
    return this;
  }

  /**
   * Get purgeDateData
   * @return purgeDateData
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType27086S getPurgeDateData() {
    return purgeDateData;
  }

  public void setPurgeDateData(StructuredDateTimeInformationType27086S purgeDateData) {
    this.purgeDateData = purgeDateData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalData technicalData = (TechnicalData) o;
    return Objects.equals(this.enveloppeNumberData, technicalData.enveloppeNumberData) &&
        Objects.equals(this.generalPNRInformation, technicalData.generalPNRInformation) &&
        Objects.equals(this.lastTransmittedEnvelopeNumber, technicalData.lastTransmittedEnvelopeNumber) &&
        Objects.equals(this.purgeDateData, technicalData.purgeDateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enveloppeNumberData, generalPNRInformation, lastTransmittedEnvelopeNumber, purgeDateData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalData {\n");
    
    sb.append("    enveloppeNumberData: ").append(toIndentedString(enveloppeNumberData)).append("\n");
    sb.append("    generalPNRInformation: ").append(toIndentedString(generalPNRInformation)).append("\n");
    sb.append("    lastTransmittedEnvelopeNumber: ").append(toIndentedString(lastTransmittedEnvelopeNumber)).append("\n");
    sb.append("    purgeDateData: ").append(toIndentedString(purgeDateData)).append("\n");
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

