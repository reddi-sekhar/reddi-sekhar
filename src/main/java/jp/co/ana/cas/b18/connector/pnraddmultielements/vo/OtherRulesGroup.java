package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RuleInformationTypeU136720S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredPeriodInformationType207595S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OtherRulesGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OtherRulesGroup   {
  @JsonProperty("dateTimeInfo")
  @Valid
  private List<StructuredPeriodInformationType207595S> dateTimeInfo = null;

  @JsonProperty("otherRules")
  private RuleInformationTypeU136720S otherRules;

  public OtherRulesGroup dateTimeInfo(List<StructuredPeriodInformationType207595S> dateTimeInfo) {
    this.dateTimeInfo = dateTimeInfo;
    return this;
  }

  public OtherRulesGroup addDateTimeInfoItem(StructuredPeriodInformationType207595S dateTimeInfoItem) {
    if (this.dateTimeInfo == null) {
      this.dateTimeInfo = new ArrayList<>();
    }
    this.dateTimeInfo.add(dateTimeInfoItem);
    return this;
  }

  /**
   * Get dateTimeInfo
   * @return dateTimeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredPeriodInformationType207595S> getDateTimeInfo() {
    return dateTimeInfo;
  }

  public void setDateTimeInfo(List<StructuredPeriodInformationType207595S> dateTimeInfo) {
    this.dateTimeInfo = dateTimeInfo;
  }

  public OtherRulesGroup otherRules(RuleInformationTypeU136720S otherRules) {
    this.otherRules = otherRules;
    return this;
  }

  /**
   * Get otherRules
   * @return otherRules
  */
  @ApiModelProperty(value = "")

  @Valid

  public RuleInformationTypeU136720S getOtherRules() {
    return otherRules;
  }

  public void setOtherRules(RuleInformationTypeU136720S otherRules) {
    this.otherRules = otherRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherRulesGroup otherRulesGroup = (OtherRulesGroup) o;
    return Objects.equals(this.dateTimeInfo, otherRulesGroup.dateTimeInfo) &&
        Objects.equals(this.otherRules, otherRulesGroup.otherRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimeInfo, otherRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherRulesGroup {\n");
    
    sb.append("    dateTimeInfo: ").append(toIndentedString(dateTimeInfo)).append("\n");
    sb.append("    otherRules: ").append(toIndentedString(otherRules)).append("\n");
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

