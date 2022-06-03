package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusDetailsType300442C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StatusType   {
  @JsonProperty("statusInformation")
  private StatusDetailsType300442C statusInformation;

  public StatusType statusInformation(StatusDetailsType300442C statusInformation) {
    this.statusInformation = statusInformation;
    return this;
  }

  /**
   * Get statusInformation
   * @return statusInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusDetailsType300442C getStatusInformation() {
    return statusInformation;
  }

  public void setStatusInformation(StatusDetailsType300442C statusInformation) {
    this.statusInformation = statusInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusType statusType = (StatusType) o;
    return Objects.equals(this.statusInformation, statusType.statusInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusType {\n");
    
    sb.append("    statusInformation: ").append(toIndentedString(statusInformation)).append("\n");
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

