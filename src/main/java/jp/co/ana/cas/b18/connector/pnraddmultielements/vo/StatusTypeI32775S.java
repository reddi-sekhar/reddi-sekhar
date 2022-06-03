package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusDetailsTypeI57035C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusTypeI32775S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StatusTypeI32775S   {
  @JsonProperty("statusDetails")
  private StatusDetailsTypeI57035C statusDetails;

  public StatusTypeI32775S statusDetails(StatusDetailsTypeI57035C statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Get statusDetails
   * @return statusDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusDetailsTypeI57035C getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(StatusDetailsTypeI57035C statusDetails) {
    this.statusDetails = statusDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusTypeI32775S statusTypeI32775S = (StatusTypeI32775S) o;
    return Objects.equals(this.statusDetails, statusTypeI32775S.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusTypeI32775S {\n");
    
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

