package jp.co.ana.cas.b18.dto.response;

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
 * CommissionInformation1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CommissionInformation1RequestDto   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("percentage")
  private BigDecimal percentage;

  public CommissionInformation1RequestDto amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount (before tag A)
   * @return amount
  */
  @ApiModelProperty(value = "Amount (before tag A)")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CommissionInformation1RequestDto percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage (max 2 decimals)
   * @return percentage
  */
  @ApiModelProperty(value = "Percentage (max 2 decimals)")

  @Valid

  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionInformation1RequestDto commissionInformation1RequestDto = (CommissionInformation1RequestDto) o;
    return Objects.equals(this.amount, commissionInformation1RequestDto.amount) &&
        Objects.equals(this.percentage, commissionInformation1RequestDto.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionInformation1RequestDto {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

