package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RuleDetailsTypeU198224C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RuleTextTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RuleInformationTypeU136720S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RuleInformationTypeU136720S   {
  @JsonProperty("ruleDetails")
  @Valid
  private List<RuleDetailsTypeU198224C> ruleDetails = null;

  @JsonProperty("ruleText")
  private RuleTextTypeU ruleText;

  public RuleInformationTypeU136720S ruleDetails(List<RuleDetailsTypeU198224C> ruleDetails) {
    this.ruleDetails = ruleDetails;
    return this;
  }

  public RuleInformationTypeU136720S addRuleDetailsItem(RuleDetailsTypeU198224C ruleDetailsItem) {
    if (this.ruleDetails == null) {
      this.ruleDetails = new ArrayList<>();
    }
    this.ruleDetails.add(ruleDetailsItem);
    return this;
  }

  /**
   * Get ruleDetails
   * @return ruleDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RuleDetailsTypeU198224C> getRuleDetails() {
    return ruleDetails;
  }

  public void setRuleDetails(List<RuleDetailsTypeU198224C> ruleDetails) {
    this.ruleDetails = ruleDetails;
  }

  public RuleInformationTypeU136720S ruleText(RuleTextTypeU ruleText) {
    this.ruleText = ruleText;
    return this;
  }

  /**
   * Get ruleText
   * @return ruleText
  */
  @ApiModelProperty(value = "")

  @Valid

  public RuleTextTypeU getRuleText() {
    return ruleText;
  }

  public void setRuleText(RuleTextTypeU ruleText) {
    this.ruleText = ruleText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleInformationTypeU136720S ruleInformationTypeU136720S = (RuleInformationTypeU136720S) o;
    return Objects.equals(this.ruleDetails, ruleInformationTypeU136720S.ruleDetails) &&
        Objects.equals(this.ruleText, ruleInformationTypeU136720S.ruleText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleDetails, ruleText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleInformationTypeU136720S {\n");
    
    sb.append("    ruleDetails: ").append(toIndentedString(ruleDetails)).append("\n");
    sb.append("    ruleText: ").append(toIndentedString(ruleText)).append("\n");
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

