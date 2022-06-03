package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateInformationTypeI50732C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeI50731C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationTypeI28460S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationTypeI28460S   {
  @JsonProperty("rateInformation")
  private RateInformationTypeI50732C rateInformation;

  @JsonProperty("tariffInfo")
  private TariffInformationDetailsTypeI50731C tariffInfo;

  public TariffInformationTypeI28460S rateInformation(RateInformationTypeI50732C rateInformation) {
    this.rateInformation = rateInformation;
    return this;
  }

  /**
   * Get rateInformation
   * @return rateInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateInformationTypeI50732C getRateInformation() {
    return rateInformation;
  }

  public void setRateInformation(RateInformationTypeI50732C rateInformation) {
    this.rateInformation = rateInformation;
  }

  public TariffInformationTypeI28460S tariffInfo(TariffInformationDetailsTypeI50731C tariffInfo) {
    this.tariffInfo = tariffInfo;
    return this;
  }

  /**
   * Get tariffInfo
   * @return tariffInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationDetailsTypeI50731C getTariffInfo() {
    return tariffInfo;
  }

  public void setTariffInfo(TariffInformationDetailsTypeI50731C tariffInfo) {
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
    TariffInformationTypeI28460S tariffInformationTypeI28460S = (TariffInformationTypeI28460S) o;
    return Objects.equals(this.rateInformation, tariffInformationTypeI28460S.rateInformation) &&
        Objects.equals(this.tariffInfo, tariffInformationTypeI28460S.tariffInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateInformation, tariffInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationTypeI28460S {\n");
    
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

