package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AssociatedChargesInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationTypeI   {
  @JsonProperty("chargeDetails")
  @Valid
  private List<AssociatedChargesInformationTypeI> chargeDetails = null;

  @JsonProperty("rateInformation")
  private RateInformationTypeI rateInformation;

  @JsonProperty("tariffInfo")
  private TariffInformationDetailsTypeI tariffInfo;

  public TariffInformationTypeI chargeDetails(List<AssociatedChargesInformationTypeI> chargeDetails) {
    this.chargeDetails = chargeDetails;
    return this;
  }

  public TariffInformationTypeI addChargeDetailsItem(AssociatedChargesInformationTypeI chargeDetailsItem) {
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

  public List<AssociatedChargesInformationTypeI> getChargeDetails() {
    return chargeDetails;
  }

  public void setChargeDetails(List<AssociatedChargesInformationTypeI> chargeDetails) {
    this.chargeDetails = chargeDetails;
  }

  public TariffInformationTypeI rateInformation(RateInformationTypeI rateInformation) {
    this.rateInformation = rateInformation;
    return this;
  }

  /**
   * Get rateInformation
   * @return rateInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateInformationTypeI getRateInformation() {
    return rateInformation;
  }

  public void setRateInformation(RateInformationTypeI rateInformation) {
    this.rateInformation = rateInformation;
  }

  public TariffInformationTypeI tariffInfo(TariffInformationDetailsTypeI tariffInfo) {
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
    TariffInformationTypeI tariffInformationTypeI = (TariffInformationTypeI) o;
    return Objects.equals(this.chargeDetails, tariffInformationTypeI.chargeDetails) &&
        Objects.equals(this.rateInformation, tariffInformationTypeI.rateInformation) &&
        Objects.equals(this.tariffInfo, tariffInformationTypeI.tariffInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeDetails, rateInformation, tariffInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationTypeI {\n");
    
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

