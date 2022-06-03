package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitDetailsTypeI2755C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NumberOfUnitsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NumberOfUnitsTypeI   {
  @JsonProperty("numberDetail")
  private NumberOfUnitDetailsTypeI2755C numberDetail;

  public NumberOfUnitsTypeI numberDetail(NumberOfUnitDetailsTypeI2755C numberDetail) {
    this.numberDetail = numberDetail;
    return this;
  }

  /**
   * Get numberDetail
   * @return numberDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitDetailsTypeI2755C getNumberDetail() {
    return numberDetail;
  }

  public void setNumberDetail(NumberOfUnitDetailsTypeI2755C numberDetail) {
    this.numberDetail = numberDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfUnitsTypeI numberOfUnitsTypeI = (NumberOfUnitsTypeI) o;
    return Objects.equals(this.numberDetail, numberOfUnitsTypeI.numberDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnitsTypeI {\n");
    
    sb.append("    numberDetail: ").append(toIndentedString(numberDetail)).append("\n");
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

