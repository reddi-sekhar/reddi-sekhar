package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceProductDetailsType20775S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PremiumPerTariffPerPax
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PremiumPerTariffPerPax   {
  @JsonProperty("tariffCodeInfo")
  private InsuranceProductDetailsType20775S tariffCodeInfo;

  @JsonProperty("tariffCodePerPaxAmount")
  private MonetaryInformationTypeI tariffCodePerPaxAmount;

  public PremiumPerTariffPerPax tariffCodeInfo(InsuranceProductDetailsType20775S tariffCodeInfo) {
    this.tariffCodeInfo = tariffCodeInfo;
    return this;
  }

  /**
   * Get tariffCodeInfo
   * @return tariffCodeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceProductDetailsType20775S getTariffCodeInfo() {
    return tariffCodeInfo;
  }

  public void setTariffCodeInfo(InsuranceProductDetailsType20775S tariffCodeInfo) {
    this.tariffCodeInfo = tariffCodeInfo;
  }

  public PremiumPerTariffPerPax tariffCodePerPaxAmount(MonetaryInformationTypeI tariffCodePerPaxAmount) {
    this.tariffCodePerPaxAmount = tariffCodePerPaxAmount;
    return this;
  }

  /**
   * Get tariffCodePerPaxAmount
   * @return tariffCodePerPaxAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI getTariffCodePerPaxAmount() {
    return tariffCodePerPaxAmount;
  }

  public void setTariffCodePerPaxAmount(MonetaryInformationTypeI tariffCodePerPaxAmount) {
    this.tariffCodePerPaxAmount = tariffCodePerPaxAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumPerTariffPerPax premiumPerTariffPerPax = (PremiumPerTariffPerPax) o;
    return Objects.equals(this.tariffCodeInfo, premiumPerTariffPerPax.tariffCodeInfo) &&
        Objects.equals(this.tariffCodePerPaxAmount, premiumPerTariffPerPax.tariffCodePerPaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffCodeInfo, tariffCodePerPaxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumPerTariffPerPax {\n");
    
    sb.append("    tariffCodeInfo: ").append(toIndentedString(tariffCodeInfo)).append("\n");
    sb.append("    tariffCodePerPaxAmount: ").append(toIndentedString(tariffCodePerPaxAmount)).append("\n");
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

