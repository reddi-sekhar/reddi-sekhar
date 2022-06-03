package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AssociatedChargesInformationTypeI198205C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateInformationTypeI198204C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationTypeI136706S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationTypeI136706S   {
  @JsonProperty("chargeDetails")
  @Valid
  private List<AssociatedChargesInformationTypeI198205C> chargeDetails = null;

  @JsonProperty("rateInformation")
  private RateInformationTypeI198204C rateInformation;

  @JsonProperty("tariffInfo")
  private TariffInformationDetailsTypeI tariffInfo;

  public TariffInformationTypeI136706S chargeDetails(List<AssociatedChargesInformationTypeI198205C> chargeDetails) {
    this.chargeDetails = chargeDetails;
    return this;
  }

  public TariffInformationTypeI136706S addChargeDetailsItem(AssociatedChargesInformationTypeI198205C chargeDetailsItem) {
    if (this.chargeDetails == null) {
      this.chargeDetails = new ArrayList<>();
    }
    this.chargeDetails.add(chargeDetailsItem);
    return this;
  }

  /**
   * Get chargeDetails
   * @return chargeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AssociatedChargesInformationTypeI198205C> getChargeDetails() {
    return chargeDetails;
  }

  public void setChargeDetails(List<AssociatedChargesInformationTypeI198205C> chargeDetails) {
    this.chargeDetails = chargeDetails;
  }

  public TariffInformationTypeI136706S rateInformation(RateInformationTypeI198204C rateInformation) {
    this.rateInformation = rateInformation;
    return this;
  }

  /**
   * Get rateInformation
   * @return rateInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateInformationTypeI198204C getRateInformation() {
    return rateInformation;
  }

  public void setRateInformation(RateInformationTypeI198204C rateInformation) {
    this.rateInformation = rateInformation;
  }

  public TariffInformationTypeI136706S tariffInfo(TariffInformationDetailsTypeI tariffInfo) {
    this.tariffInfo = tariffInfo;
    return this;
  }

  /**
   * Get tariffInfo
   * @return tariffInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationDetailsTypeI getTariffInfo() {
    return tariffInfo;
  }

  public void setTariffInfo(TariffInformationDetailsTypeI tariffInfo) {
    this.tariffInfo = tariffInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationTypeI136706S tariffInformationTypeI136706S = (TariffInformationTypeI136706S) o;
    return Objects.equals(this.chargeDetails, tariffInformationTypeI136706S.chargeDetails) &&
        Objects.equals(this.rateInformation, tariffInformationTypeI136706S.rateInformation) &&
        Objects.equals(this.tariffInfo, tariffInformationTypeI136706S.tariffInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeDetails, rateInformation, tariffInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationTypeI136706S {\n");
    
    sb.append("    chargeDetails: ").append(toIndentedString(chargeDetails)).append("\n");
    sb.append("    rateInformation: ").append(toIndentedString(rateInformation)).append("\n");
    sb.append("    tariffInfo: ").append(toIndentedString(tariffInfo)).append("\n");
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

