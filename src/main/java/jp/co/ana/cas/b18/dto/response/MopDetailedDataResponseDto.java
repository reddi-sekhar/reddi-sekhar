package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CreditCardDetailedDataResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MopDetailedDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class MopDetailedDataResponseDto   {
  @JsonProperty("creditCardDetailedData")
  private CreditCardDetailedDataResponseDto creditCardDetailedData;

  public MopDetailedDataResponseDto creditCardDetailedData(CreditCardDetailedDataResponseDto creditCardDetailedData) {
    this.creditCardDetailedData = creditCardDetailedData;
    return this;
  }

  /**
   * Get creditCardDetailedData
   * @return creditCardDetailedData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardDetailedDataResponseDto getCreditCardDetailedData() {
    return creditCardDetailedData;
  }

  public void setCreditCardDetailedData(CreditCardDetailedDataResponseDto creditCardDetailedData) {
    this.creditCardDetailedData = creditCardDetailedData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MopDetailedDataResponseDto mopDetailedDataResponseDto = (MopDetailedDataResponseDto) o;
    return Objects.equals(this.creditCardDetailedData, mopDetailedDataResponseDto.creditCardDetailedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardDetailedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MopDetailedDataResponseDto {\n");
    
    sb.append("    creditCardDetailedData: ").append(toIndentedString(creditCardDetailedData)).append("\n");
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

