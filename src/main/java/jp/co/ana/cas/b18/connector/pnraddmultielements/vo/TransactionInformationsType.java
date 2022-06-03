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
 * TransactionInformationsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TransactionInformationsType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("issueIndicator")
  private String issueIndicator;

  @JsonProperty("transmissionControlNumber")
  private String transmissionControlNumber;

  @JsonProperty("type")
  private String type;

  public TransactionInformationsType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TransactionInformationsType issueIndicator(String issueIndicator) {
    this.issueIndicator = issueIndicator;
    return this;
  }

  /**
   * Get issueIndicator
   * @return issueIndicator
  */
  @ApiModelProperty(value = "")


  public String getIssueIndicator() {
    return issueIndicator;
  }

  public void setIssueIndicator(String issueIndicator) {
    this.issueIndicator = issueIndicator;
  }

  public TransactionInformationsType transmissionControlNumber(String transmissionControlNumber) {
    this.transmissionControlNumber = transmissionControlNumber;
    return this;
  }

  /**
   * Get transmissionControlNumber
   * @return transmissionControlNumber
  */
  @ApiModelProperty(value = "")


  public String getTransmissionControlNumber() {
    return transmissionControlNumber;
  }

  public void setTransmissionControlNumber(String transmissionControlNumber) {
    this.transmissionControlNumber = transmissionControlNumber;
  }

  public TransactionInformationsType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInformationsType transactionInformationsType = (TransactionInformationsType) o;
    return Objects.equals(this.code, transactionInformationsType.code) &&
        Objects.equals(this.issueIndicator, transactionInformationsType.issueIndicator) &&
        Objects.equals(this.transmissionControlNumber, transactionInformationsType.transmissionControlNumber) &&
        Objects.equals(this.type, transactionInformationsType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issueIndicator, transmissionControlNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInformationsType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issueIndicator: ").append(toIndentedString(issueIndicator)).append("\n");
    sb.append("    transmissionControlNumber: ").append(toIndentedString(transmissionControlNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

