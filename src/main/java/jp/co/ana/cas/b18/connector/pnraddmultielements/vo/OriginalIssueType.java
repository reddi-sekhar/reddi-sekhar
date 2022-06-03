package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IssueInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OriginalIssueType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OriginalIssueType   {
  @JsonProperty("baseFare")
  private BigDecimal baseFare;

  @JsonProperty("freeflow")
  private String freeflow;

  @JsonProperty("issue")
  @Valid
  private List<IssueInformationType> issue = null;

  @JsonProperty("passengerType")
  private String passengerType;

  @JsonProperty("penalty")
  private BigDecimal penalty;

  @JsonProperty("totalTax")
  private BigDecimal totalTax;

  @JsonProperty("voucherIndicator")
  private String voucherIndicator;

  public OriginalIssueType baseFare(BigDecimal baseFare) {
    this.baseFare = baseFare;
    return this;
  }

  /**
   * Get baseFare
   * @return baseFare
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getBaseFare() {
    return baseFare;
  }

  public void setBaseFare(BigDecimal baseFare) {
    this.baseFare = baseFare;
  }

  public OriginalIssueType freeflow(String freeflow) {
    this.freeflow = freeflow;
    return this;
  }

  /**
   * Get freeflow
   * @return freeflow
  */
  @ApiModelProperty(value = "")


  public String getFreeflow() {
    return freeflow;
  }

  public void setFreeflow(String freeflow) {
    this.freeflow = freeflow;
  }

  public OriginalIssueType issue(List<IssueInformationType> issue) {
    this.issue = issue;
    return this;
  }

  public OriginalIssueType addIssueItem(IssueInformationType issueItem) {
    if (this.issue == null) {
      this.issue = new ArrayList<>();
    }
    this.issue.add(issueItem);
    return this;
  }

  /**
   * Get issue
   * @return issue
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<IssueInformationType> getIssue() {
    return issue;
  }

  public void setIssue(List<IssueInformationType> issue) {
    this.issue = issue;
  }

  public OriginalIssueType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public OriginalIssueType penalty(BigDecimal penalty) {
    this.penalty = penalty;
    return this;
  }

  /**
   * Get penalty
   * @return penalty
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPenalty() {
    return penalty;
  }

  public void setPenalty(BigDecimal penalty) {
    this.penalty = penalty;
  }

  public OriginalIssueType totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Get totalTax
   * @return totalTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }

  public OriginalIssueType voucherIndicator(String voucherIndicator) {
    this.voucherIndicator = voucherIndicator;
    return this;
  }

  /**
   * Get voucherIndicator
   * @return voucherIndicator
  */
  @ApiModelProperty(value = "")


  public String getVoucherIndicator() {
    return voucherIndicator;
  }

  public void setVoucherIndicator(String voucherIndicator) {
    this.voucherIndicator = voucherIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalIssueType originalIssueType = (OriginalIssueType) o;
    return Objects.equals(this.baseFare, originalIssueType.baseFare) &&
        Objects.equals(this.freeflow, originalIssueType.freeflow) &&
        Objects.equals(this.issue, originalIssueType.issue) &&
        Objects.equals(this.passengerType, originalIssueType.passengerType) &&
        Objects.equals(this.penalty, originalIssueType.penalty) &&
        Objects.equals(this.totalTax, originalIssueType.totalTax) &&
        Objects.equals(this.voucherIndicator, originalIssueType.voucherIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseFare, freeflow, issue, passengerType, penalty, totalTax, voucherIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalIssueType {\n");
    
    sb.append("    baseFare: ").append(toIndentedString(baseFare)).append("\n");
    sb.append("    freeflow: ").append(toIndentedString(freeflow)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    voucherIndicator: ").append(toIndentedString(voucherIndicator)).append("\n");
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

