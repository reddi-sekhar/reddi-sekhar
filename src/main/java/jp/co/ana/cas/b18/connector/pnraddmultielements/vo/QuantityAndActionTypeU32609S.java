package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityAndActionDetailsTypeU56796C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuantityAndActionTypeU32609S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QuantityAndActionTypeU32609S   {
  @JsonProperty("accoStatus")
  private QuantityAndActionDetailsTypeU56796C accoStatus;

  public QuantityAndActionTypeU32609S accoStatus(QuantityAndActionDetailsTypeU56796C accoStatus) {
    this.accoStatus = accoStatus;
    return this;
  }

  /**
   * Get accoStatus
   * @return accoStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityAndActionDetailsTypeU56796C getAccoStatus() {
    return accoStatus;
  }

  public void setAccoStatus(QuantityAndActionDetailsTypeU56796C accoStatus) {
    this.accoStatus = accoStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantityAndActionTypeU32609S quantityAndActionTypeU32609S = (QuantityAndActionTypeU32609S) o;
    return Objects.equals(this.accoStatus, quantityAndActionTypeU32609S.accoStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accoStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityAndActionTypeU32609S {\n");
    
    sb.append("    accoStatus: ").append(toIndentedString(accoStatus)).append("\n");
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

