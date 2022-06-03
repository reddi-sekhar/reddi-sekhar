package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType25420S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU25419S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RemainingAmountsDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RemainingAmountsDetails   {
  @JsonProperty("providerCode")
  private CompanyInformationType25420S providerCode;

  @JsonProperty("remainingAmount")
  private TariffInformationTypeU25419S remainingAmount;

  public RemainingAmountsDetails providerCode(CompanyInformationType25420S providerCode) {
    this.providerCode = providerCode;
    return this;
  }

  /**
   * Get providerCode
   * @return providerCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType25420S getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(CompanyInformationType25420S providerCode) {
    this.providerCode = providerCode;
  }

  public RemainingAmountsDetails remainingAmount(TariffInformationTypeU25419S remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

  /**
   * Get remainingAmount
   * @return remainingAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU25419S getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(TariffInformationTypeU25419S remainingAmount) {
    this.remainingAmount = remainingAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemainingAmountsDetails remainingAmountsDetails = (RemainingAmountsDetails) o;
    return Objects.equals(this.providerCode, remainingAmountsDetails.providerCode) &&
        Objects.equals(this.remainingAmount, remainingAmountsDetails.remainingAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerCode, remainingAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemainingAmountsDetails {\n");
    
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
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

