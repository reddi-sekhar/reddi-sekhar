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
 * ResponseIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ResponseIdentificationType   {
  @JsonProperty("banknetDate")
  private String banknetDate;

  @JsonProperty("banknetRefNumber")
  private String banknetRefNumber;

  @JsonProperty("transacIdentifier")
  private String transacIdentifier;

  @JsonProperty("validationCode")
  private String validationCode;

  public ResponseIdentificationType banknetDate(String banknetDate) {
    this.banknetDate = banknetDate;
    return this;
  }

  /**
   * Get banknetDate
   * @return banknetDate
  */
  @ApiModelProperty(value = "")


  public String getBanknetDate() {
    return banknetDate;
  }

  public void setBanknetDate(String banknetDate) {
    this.banknetDate = banknetDate;
  }

  public ResponseIdentificationType banknetRefNumber(String banknetRefNumber) {
    this.banknetRefNumber = banknetRefNumber;
    return this;
  }

  /**
   * Get banknetRefNumber
   * @return banknetRefNumber
  */
  @ApiModelProperty(value = "")


  public String getBanknetRefNumber() {
    return banknetRefNumber;
  }

  public void setBanknetRefNumber(String banknetRefNumber) {
    this.banknetRefNumber = banknetRefNumber;
  }

  public ResponseIdentificationType transacIdentifier(String transacIdentifier) {
    this.transacIdentifier = transacIdentifier;
    return this;
  }

  /**
   * Get transacIdentifier
   * @return transacIdentifier
  */
  @ApiModelProperty(value = "")


  public String getTransacIdentifier() {
    return transacIdentifier;
  }

  public void setTransacIdentifier(String transacIdentifier) {
    this.transacIdentifier = transacIdentifier;
  }

  public ResponseIdentificationType validationCode(String validationCode) {
    this.validationCode = validationCode;
    return this;
  }

  /**
   * Get validationCode
   * @return validationCode
  */
  @ApiModelProperty(value = "")


  public String getValidationCode() {
    return validationCode;
  }

  public void setValidationCode(String validationCode) {
    this.validationCode = validationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseIdentificationType responseIdentificationType = (ResponseIdentificationType) o;
    return Objects.equals(this.banknetDate, responseIdentificationType.banknetDate) &&
        Objects.equals(this.banknetRefNumber, responseIdentificationType.banknetRefNumber) &&
        Objects.equals(this.transacIdentifier, responseIdentificationType.transacIdentifier) &&
        Objects.equals(this.validationCode, responseIdentificationType.validationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banknetDate, banknetRefNumber, transacIdentifier, validationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseIdentificationType {\n");
    
    sb.append("    banknetDate: ").append(toIndentedString(banknetDate)).append("\n");
    sb.append("    banknetRefNumber: ").append(toIndentedString(banknetRefNumber)).append("\n");
    sb.append("    transacIdentifier: ").append(toIndentedString(transacIdentifier)).append("\n");
    sb.append("    validationCode: ").append(toIndentedString(validationCode)).append("\n");
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

