package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.MopDetailedDataResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentModuleResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PaymentModuleResponseDto   {
  @JsonProperty("mopDetailedData")
  private MopDetailedDataResponseDto mopDetailedData;

  public PaymentModuleResponseDto mopDetailedData(MopDetailedDataResponseDto mopDetailedData) {
    this.mopDetailedData = mopDetailedData;
    return this;
  }

  /**
   * Get mopDetailedData
   * @return mopDetailedData
  */
  @ApiModelProperty(value = "")

  @Valid

  public MopDetailedDataResponseDto getMopDetailedData() {
    return mopDetailedData;
  }

  public void setMopDetailedData(MopDetailedDataResponseDto mopDetailedData) {
    this.mopDetailedData = mopDetailedData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentModuleResponseDto paymentModuleResponseDto = (PaymentModuleResponseDto) o;
    return Objects.equals(this.mopDetailedData, paymentModuleResponseDto.mopDetailedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mopDetailedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentModuleResponseDto {\n");
    
    sb.append("    mopDetailedData: ").append(toIndentedString(mopDetailedData)).append("\n");
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

