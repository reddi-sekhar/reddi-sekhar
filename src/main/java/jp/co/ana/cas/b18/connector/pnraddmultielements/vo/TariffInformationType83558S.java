package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeU127523C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationType83558S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationType83558S   {
  @JsonProperty("priceDetails")
  private TariffInformationDetailsTypeU127523C priceDetails;

  public TariffInformationType83558S priceDetails(TariffInformationDetailsTypeU127523C priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationDetailsTypeU127523C getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(TariffInformationDetailsTypeU127523C priceDetails) {
    this.priceDetails = priceDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationType83558S tariffInformationType83558S = (TariffInformationType83558S) o;
    return Objects.equals(this.priceDetails, tariffInformationType83558S.priceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationType83558S {\n");
    
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
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

