package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RuleStatusTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RuleStatusTypeU   {
  @JsonProperty("processIndicator")
  private String processIndicator;

  @JsonProperty("statusType")
  private String statusType;

  public RuleStatusTypeU processIndicator(String processIndicator) {
    this.processIndicator = processIndicator;
    return this;
  }

  /**
   * Get processIndicator
   * @return processIndicator
  */
  @ApiModelProperty(value = "")


  public String getProcessIndicator() {
    return processIndicator;
  }

  public void setProcessIndicator(String processIndicator) {
    this.processIndicator = processIndicator;
  }

  public RuleStatusTypeU statusType(String statusType) {
    this.statusType = statusType;
    return this;
  }

  /**
   * Get statusType
   * @return statusType
  */
  @ApiModelProperty(value = "")


  public String getStatusType() {
    return statusType;
  }

  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleStatusTypeU ruleStatusTypeU = (RuleStatusTypeU) o;
    return Objects.equals(this.processIndicator, ruleStatusTypeU.processIndicator) &&
        Objects.equals(this.statusType, ruleStatusTypeU.statusType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processIndicator, statusType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleStatusTypeU {\n");
    
    sb.append("    processIndicator: ").append(toIndentedString(processIndicator)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
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

