package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.TransactionStatusResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardDetailedDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CreditCardDetailedDataResponseDto   {
  @JsonProperty("transactionStatus")
  @Valid
  private List<TransactionStatusResponseDto> transactionStatus = null;

  public CreditCardDetailedDataResponseDto transactionStatus(List<TransactionStatusResponseDto> transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  public CreditCardDetailedDataResponseDto addTransactionStatusItem(TransactionStatusResponseDto transactionStatusItem) {
    if (this.transactionStatus == null) {
      this.transactionStatus = new ArrayList<>();
    }
    this.transactionStatus.add(transactionStatusItem);
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TransactionStatusResponseDto> getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(List<TransactionStatusResponseDto> transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardDetailedDataResponseDto creditCardDetailedDataResponseDto = (CreditCardDetailedDataResponseDto) o;
    return Objects.equals(this.transactionStatus, creditCardDetailedDataResponseDto.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardDetailedDataResponseDto {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

