package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AssociatedChargesInformationTypeI39535C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeI39533C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationTypeI22057S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationTypeI22057S   {
  @JsonProperty("chargeDetails")
  @Valid
  private List<AssociatedChargesInformationTypeI39535C> chargeDetails = null;

  @JsonProperty("tariffInfo")
  private TariffInformationDetailsTypeI39533C tariffInfo;

  public TariffInformationTypeI22057S chargeDetails(List<AssociatedChargesInformationTypeI39535C> chargeDetails) {
    this.chargeDetails = chargeDetails;
    return this;
  }

  public TariffInformationTypeI22057S addChargeDetailsItem(AssociatedChargesInformationTypeI39535C chargeDetailsItem) {
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

  public List<AssociatedChargesInformationTypeI39535C> getChargeDetails() {
    return chargeDetails;
  }

  public void setChargeDetails(List<AssociatedChargesInformationTypeI39535C> chargeDetails) {
    this.chargeDetails = chargeDetails;
  }

  public TariffInformationTypeI22057S tariffInfo(TariffInformationDetailsTypeI39533C tariffInfo) {
    this.tariffInfo = tariffInfo;
    return this;
  }

  /**
   * Get tariffInfo
   * @return tariffInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationDetailsTypeI39533C getTariffInfo() {
    return tariffInfo;
  }

  public void setTariffInfo(TariffInformationDetailsTypeI39533C tariffInfo) {
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
    TariffInformationTypeI22057S tariffInformationTypeI22057S = (TariffInformationTypeI22057S) o;
    return Objects.equals(this.chargeDetails, tariffInformationTypeI22057S.chargeDetails) &&
        Objects.equals(this.tariffInfo, tariffInformationTypeI22057S.tariffInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeDetails, tariffInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationTypeI22057S {\n");
    
    sb.append("    chargeDetails: ").append(toIndentedString(chargeDetails)).append("\n");
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

