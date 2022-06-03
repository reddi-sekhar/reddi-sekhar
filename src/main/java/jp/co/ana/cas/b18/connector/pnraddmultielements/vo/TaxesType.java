package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxesType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TaxesType   {
  @JsonProperty("additionnalCharge")
  private TaxDetailsTypeU additionnalCharge;

  public TaxesType additionnalCharge(TaxDetailsTypeU additionnalCharge) {
    this.additionnalCharge = additionnalCharge;
    return this;
  }

  /**
   * Get additionnalCharge
   * @return additionnalCharge
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaxDetailsTypeU getAdditionnalCharge() {
    return additionnalCharge;
  }

  public void setAdditionnalCharge(TaxDetailsTypeU additionnalCharge) {
    this.additionnalCharge = additionnalCharge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxesType taxesType = (TaxesType) o;
    return Objects.equals(this.additionnalCharge, taxesType.additionnalCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionnalCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxesType {\n");
    
    sb.append("    additionnalCharge: ").append(toIndentedString(additionnalCharge)).append("\n");
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

