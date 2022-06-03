package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.PaymentModuleResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredFopResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class StructuredFopResponseDto   {
  @JsonProperty("paymentModule")
  private PaymentModuleResponseDto paymentModule;

  public StructuredFopResponseDto paymentModule(PaymentModuleResponseDto paymentModule) {
    this.paymentModule = paymentModule;
    return this;
  }

  /**
   * Get paymentModule
   * @return paymentModule
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentModuleResponseDto getPaymentModule() {
    return paymentModule;
  }

  public void setPaymentModule(PaymentModuleResponseDto paymentModule) {
    this.paymentModule = paymentModule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredFopResponseDto structuredFopResponseDto = (StructuredFopResponseDto) o;
    return Objects.equals(this.paymentModule, structuredFopResponseDto.paymentModule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentModule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredFopResponseDto {\n");
    
    sb.append("    paymentModule: ").append(toIndentedString(paymentModule)).append("\n");
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

