package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffcodeType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceProductDetailsType20775S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceProductDetailsType20775S   {
  @JsonProperty("tariffCodeDetails")
  @Valid
  private List<TariffcodeType> tariffCodeDetails = null;

  public InsuranceProductDetailsType20775S tariffCodeDetails(List<TariffcodeType> tariffCodeDetails) {
    this.tariffCodeDetails = tariffCodeDetails;
    return this;
  }

  public InsuranceProductDetailsType20775S addTariffCodeDetailsItem(TariffcodeType tariffCodeDetailsItem) {
    if (this.tariffCodeDetails == null) {
      this.tariffCodeDetails = new ArrayList<>();
    }
    this.tariffCodeDetails.add(tariffCodeDetailsItem);
    return this;
  }

  /**
   * Get tariffCodeDetails
   * @return tariffCodeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffcodeType> getTariffCodeDetails() {
    return tariffCodeDetails;
  }

  public void setTariffCodeDetails(List<TariffcodeType> tariffCodeDetails) {
    this.tariffCodeDetails = tariffCodeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceProductDetailsType20775S insuranceProductDetailsType20775S = (InsuranceProductDetailsType20775S) o;
    return Objects.equals(this.tariffCodeDetails, insuranceProductDetailsType20775S.tariffCodeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffCodeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceProductDetailsType20775S {\n");
    
    sb.append("    tariffCodeDetails: ").append(toIndentedString(tariffCodeDetails)).append("\n");
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

