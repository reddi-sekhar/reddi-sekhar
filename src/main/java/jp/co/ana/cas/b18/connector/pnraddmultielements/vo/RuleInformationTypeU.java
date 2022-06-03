package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RuleDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RuleStatusTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RuleInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RuleInformationTypeU   {
  @JsonProperty("ruleDetails")
  private RuleDetailsTypeU ruleDetails;

  @JsonProperty("ruleStatusDetails")
  private RuleStatusTypeU ruleStatusDetails;

  public RuleInformationTypeU ruleDetails(RuleDetailsTypeU ruleDetails) {
    this.ruleDetails = ruleDetails;
    return this;
  }

  /**
   * Get ruleDetails
   * @return ruleDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RuleDetailsTypeU getRuleDetails() {
    return ruleDetails;
  }

  public void setRuleDetails(RuleDetailsTypeU ruleDetails) {
    this.ruleDetails = ruleDetails;
  }

  public RuleInformationTypeU ruleStatusDetails(RuleStatusTypeU ruleStatusDetails) {
    this.ruleStatusDetails = ruleStatusDetails;
    return this;
  }

  /**
   * Get ruleStatusDetails
   * @return ruleStatusDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RuleStatusTypeU getRuleStatusDetails() {
    return ruleStatusDetails;
  }

  public void setRuleStatusDetails(RuleStatusTypeU ruleStatusDetails) {
    this.ruleStatusDetails = ruleStatusDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleInformationTypeU ruleInformationTypeU = (RuleInformationTypeU) o;
    return Objects.equals(this.ruleDetails, ruleInformationTypeU.ruleDetails) &&
        Objects.equals(this.ruleStatusDetails, ruleInformationTypeU.ruleStatusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleDetails, ruleStatusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleInformationTypeU {\n");
    
    sb.append("    ruleDetails: ").append(toIndentedString(ruleDetails)).append("\n");
    sb.append("    ruleStatusDetails: ").append(toIndentedString(ruleStatusDetails)).append("\n");
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

