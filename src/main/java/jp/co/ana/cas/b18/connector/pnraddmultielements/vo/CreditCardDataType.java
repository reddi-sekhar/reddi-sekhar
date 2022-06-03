package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CreditCardInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CreditCardDataType   {
  @JsonProperty("ccInfo")
  private CreditCardInformationType ccInfo;

  public CreditCardDataType ccInfo(CreditCardInformationType ccInfo) {
    this.ccInfo = ccInfo;
    return this;
  }

  /**
   * Get ccInfo
   * @return ccInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardInformationType getCcInfo() {
    return ccInfo;
  }

  public void setCcInfo(CreditCardInformationType ccInfo) {
    this.ccInfo = ccInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardDataType creditCardDataType = (CreditCardDataType) o;
    return Objects.equals(this.ccInfo, creditCardDataType.ccInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardDataType {\n");
    
    sb.append("    ccInfo: ").append(toIndentedString(ccInfo)).append("\n");
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

