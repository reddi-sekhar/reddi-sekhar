package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CreditCardType   {
  @JsonProperty("creditCardCompany")
  private String creditCardCompany;

  @JsonProperty("creditCardNumber")
  private String creditCardNumber;

  @JsonProperty("expirationDate")
  private String expirationDate;

  public CreditCardType creditCardCompany(String creditCardCompany) {
    this.creditCardCompany = creditCardCompany;
    return this;
  }

  /**
   * Get creditCardCompany
   * @return creditCardCompany
  */
  @ApiModelProperty(value = "")


  public String getCreditCardCompany() {
    return creditCardCompany;
  }

  public void setCreditCardCompany(String creditCardCompany) {
    this.creditCardCompany = creditCardCompany;
  }

  public CreditCardType creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

  /**
   * Get creditCardNumber
   * @return creditCardNumber
  */
  @ApiModelProperty(value = "")


  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public CreditCardType expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  */
  @ApiModelProperty(value = "")


  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardType creditCardType = (CreditCardType) o;
    return Objects.equals(this.creditCardCompany, creditCardType.creditCardCompany) &&
        Objects.equals(this.creditCardNumber, creditCardType.creditCardNumber) &&
        Objects.equals(this.expirationDate, creditCardType.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardCompany, creditCardNumber, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardType {\n");
    
    sb.append("    creditCardCompany: ").append(toIndentedString(creditCardCompany)).append("\n");
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

