package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationDetailsTypeU45479C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationTypeU   {
  @JsonProperty("priceDetails")
  private TariffInformationDetailsTypeU45479C priceDetails;

  public TariffInformationTypeU priceDetails(TariffInformationDetailsTypeU45479C priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationDetailsTypeU45479C getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(TariffInformationDetailsTypeU45479C priceDetails) {
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
    TariffInformationTypeU tariffInformationTypeU = (TariffInformationTypeU) o;
    return Objects.equals(this.priceDetails, tariffInformationTypeU.priceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationTypeU {\n");
    
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

