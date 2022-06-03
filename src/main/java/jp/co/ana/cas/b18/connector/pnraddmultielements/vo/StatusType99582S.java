package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusDetailsType148479C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusType99582S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StatusType99582S   {
  @JsonProperty("statusInformation")
  @Valid
  private List<StatusDetailsType148479C> statusInformation = null;

  public StatusType99582S statusInformation(List<StatusDetailsType148479C> statusInformation) {
    this.statusInformation = statusInformation;
    return this;
  }

  public StatusType99582S addStatusInformationItem(StatusDetailsType148479C statusInformationItem) {
    if (this.statusInformation == null) {
      this.statusInformation = new ArrayList<>();
    }
    this.statusInformation.add(statusInformationItem);
    return this;
  }

  /**
   * Get statusInformation
   * @return statusInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusDetailsType148479C> getStatusInformation() {
    return statusInformation;
  }

  public void setStatusInformation(List<StatusDetailsType148479C> statusInformation) {
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
    StatusType99582S statusType99582S = (StatusType99582S) o;
    return Objects.equals(this.statusInformation, statusType99582S.statusInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusType99582S {\n");
    
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

