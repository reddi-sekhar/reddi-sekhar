package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationDetailsTypeU127523C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationDetailsTypeU127523C   {
  @JsonProperty("priceAmount")
  private BigDecimal priceAmount;

  @JsonProperty("priceQualifier")
  private String priceQualifier;

  public TariffInformationDetailsTypeU127523C priceAmount(BigDecimal priceAmount) {
    this.priceAmount = priceAmount;
    return this;
  }

  /**
   * Get priceAmount
   * @return priceAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPriceAmount() {
    return priceAmount;
  }

  public void setPriceAmount(BigDecimal priceAmount) {
    this.priceAmount = priceAmount;
  }

  public TariffInformationDetailsTypeU127523C priceQualifier(String priceQualifier) {
    this.priceQualifier = priceQualifier;
    return this;
  }

  /**
   * Get priceQualifier
   * @return priceQualifier
  */
  @ApiModelProperty(value = "")


  public String getPriceQualifier() {
    return priceQualifier;
  }

  public void setPriceQualifier(String priceQualifier) {
    this.priceQualifier = priceQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationDetailsTypeU127523C tariffInformationDetailsTypeU127523C = (TariffInformationDetailsTypeU127523C) o;
    return Objects.equals(this.priceAmount, tariffInformationDetailsTypeU127523C.priceAmount) &&
        Objects.equals(this.priceQualifier, tariffInformationDetailsTypeU127523C.priceQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceAmount, priceQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationDetailsTypeU127523C {\n");
    
    sb.append("    priceAmount: ").append(toIndentedString(priceAmount)).append("\n");
    sb.append("    priceQualifier: ").append(toIndentedString(priceQualifier)).append("\n");
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

