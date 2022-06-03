package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CreditCardStatusGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedPaymentDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DetailedPaymentDataType   {
  @JsonProperty("creditCardDetailedData")
  private CreditCardStatusGroupType creditCardDetailedData;

  @JsonProperty("dummy")
  private Object dummy;

  @JsonProperty("fopInformation")
  private FormOfPaymentType fopInformation;

  public DetailedPaymentDataType creditCardDetailedData(CreditCardStatusGroupType creditCardDetailedData) {
    this.creditCardDetailedData = creditCardDetailedData;
    return this;
  }

  /**
   * Get creditCardDetailedData
   * @return creditCardDetailedData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardStatusGroupType getCreditCardDetailedData() {
    return creditCardDetailedData;
  }

  public void setCreditCardDetailedData(CreditCardStatusGroupType creditCardDetailedData) {
    this.creditCardDetailedData = creditCardDetailedData;
  }

  public DetailedPaymentDataType dummy(Object dummy) {
    this.dummy = dummy;
    return this;
  }

  /**
   * Get dummy
   * @return dummy
  */
  @ApiModelProperty(value = "")


  public Object getDummy() {
    return dummy;
  }

  public void setDummy(Object dummy) {
    this.dummy = dummy;
  }

  public DetailedPaymentDataType fopInformation(FormOfPaymentType fopInformation) {
    this.fopInformation = fopInformation;
    return this;
  }

  /**
   * Get fopInformation
   * @return fopInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormOfPaymentType getFopInformation() {
    return fopInformation;
  }

  public void setFopInformation(FormOfPaymentType fopInformation) {
    this.fopInformation = fopInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedPaymentDataType detailedPaymentDataType = (DetailedPaymentDataType) o;
    return Objects.equals(this.creditCardDetailedData, detailedPaymentDataType.creditCardDetailedData) &&
        Objects.equals(this.dummy, detailedPaymentDataType.dummy) &&
        Objects.equals(this.fopInformation, detailedPaymentDataType.fopInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardDetailedData, dummy, fopInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedPaymentDataType {\n");
    
    sb.append("    creditCardDetailedData: ").append(toIndentedString(creditCardDetailedData)).append("\n");
    sb.append("    dummy: ").append(toIndentedString(dummy)).append("\n");
    sb.append("    fopInformation: ").append(toIndentedString(fopInformation)).append("\n");
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

