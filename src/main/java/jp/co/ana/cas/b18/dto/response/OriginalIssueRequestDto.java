package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.IssueInformationTypeRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OriginalIssueRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OriginalIssueRequestDto   {
  @JsonProperty("freeflow")
  private String freeflow;

  @JsonProperty("issue")
  @Valid
  private List<IssueInformationTypeRequestDto> issue = null;

  @JsonProperty("passengerType")
  private String passengerType;

  @JsonProperty("voucherIndicator")
  private String voucherIndicator;

  public OriginalIssueRequestDto freeflow(String freeflow) {
    this.freeflow = freeflow;
    return this;
  }

  /**
   * Free flow text
   * @return freeflow
  */
  @ApiModelProperty(value = "Free flow text")

@Size(min=1,max=126) 
  public String getFreeflow() {
    return freeflow;
  }

  public void setFreeflow(String freeflow) {
    this.freeflow = freeflow;
  }

  public OriginalIssueRequestDto issue(List<IssueInformationTypeRequestDto> issue) {
    this.issue = issue;
    return this;
  }

  public OriginalIssueRequestDto addIssueItem(IssueInformationTypeRequestDto issueItem) {
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

  public List<IssueInformationTypeRequestDto> getIssue() {
    return issue;
  }

  public void setIssue(List<IssueInformationTypeRequestDto> issue) {
    this.issue = issue;
  }

  public OriginalIssueRequestDto passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Passenger Type
   * @return passengerType
  */
  @ApiModelProperty(value = "Passenger Type")

@Size(min=1,max=3) 
  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public OriginalIssueRequestDto voucherIndicator(String voucherIndicator) {
    this.voucherIndicator = voucherIndicator;
    return this;
  }

  /**
   * Voucher Indicator
   * @return voucherIndicator
  */
  @ApiModelProperty(value = "Voucher Indicator")

@Size(min=1,max=2) 
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
    OriginalIssueRequestDto originalIssueRequestDto = (OriginalIssueRequestDto) o;
    return Objects.equals(this.freeflow, originalIssueRequestDto.freeflow) &&
        Objects.equals(this.issue, originalIssueRequestDto.issue) &&
        Objects.equals(this.passengerType, originalIssueRequestDto.passengerType) &&
        Objects.equals(this.voucherIndicator, originalIssueRequestDto.voucherIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeflow, issue, passengerType, voucherIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalIssueRequestDto {\n");
    
    sb.append("    freeflow: ").append(toIndentedString(freeflow)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

