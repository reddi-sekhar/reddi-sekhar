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
 * QuotaRelatedInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QuotaRelatedInformationType   {
  @JsonProperty("availability")
  private Long availability;

  @JsonProperty("counter")
  private Long counter;

  @JsonProperty("maxQuantity")
  private Long maxQuantity;

  @JsonProperty("quotaCounterName")
  private String quotaCounterName;

  @JsonProperty("quotaGrade")
  private String quotaGrade;

  @JsonProperty("quotaNotReachedMsgNb")
  private String quotaNotReachedMsgNb;

  @JsonProperty("quotaReachedMsgNb")
  private String quotaReachedMsgNb;

  @JsonProperty("quotaReachedReplyStatus")
  private String quotaReachedReplyStatus;

  @JsonProperty("quotaType")
  private String quotaType;

  public QuotaRelatedInformationType availability(Long availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @ApiModelProperty(value = "")


  public Long getAvailability() {
    return availability;
  }

  public void setAvailability(Long availability) {
    this.availability = availability;
  }

  public QuotaRelatedInformationType counter(Long counter) {
    this.counter = counter;
    return this;
  }

  /**
   * Get counter
   * @return counter
  */
  @ApiModelProperty(value = "")


  public Long getCounter() {
    return counter;
  }

  public void setCounter(Long counter) {
    this.counter = counter;
  }

  public QuotaRelatedInformationType maxQuantity(Long maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

  /**
   * Get maxQuantity
   * @return maxQuantity
  */
  @ApiModelProperty(value = "")


  public Long getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Long maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public QuotaRelatedInformationType quotaCounterName(String quotaCounterName) {
    this.quotaCounterName = quotaCounterName;
    return this;
  }

  /**
   * Get quotaCounterName
   * @return quotaCounterName
  */
  @ApiModelProperty(value = "")


  public String getQuotaCounterName() {
    return quotaCounterName;
  }

  public void setQuotaCounterName(String quotaCounterName) {
    this.quotaCounterName = quotaCounterName;
  }

  public QuotaRelatedInformationType quotaGrade(String quotaGrade) {
    this.quotaGrade = quotaGrade;
    return this;
  }

  /**
   * Get quotaGrade
   * @return quotaGrade
  */
  @ApiModelProperty(value = "")


  public String getQuotaGrade() {
    return quotaGrade;
  }

  public void setQuotaGrade(String quotaGrade) {
    this.quotaGrade = quotaGrade;
  }

  public QuotaRelatedInformationType quotaNotReachedMsgNb(String quotaNotReachedMsgNb) {
    this.quotaNotReachedMsgNb = quotaNotReachedMsgNb;
    return this;
  }

  /**
   * Get quotaNotReachedMsgNb
   * @return quotaNotReachedMsgNb
  */
  @ApiModelProperty(value = "")


  public String getQuotaNotReachedMsgNb() {
    return quotaNotReachedMsgNb;
  }

  public void setQuotaNotReachedMsgNb(String quotaNotReachedMsgNb) {
    this.quotaNotReachedMsgNb = quotaNotReachedMsgNb;
  }

  public QuotaRelatedInformationType quotaReachedMsgNb(String quotaReachedMsgNb) {
    this.quotaReachedMsgNb = quotaReachedMsgNb;
    return this;
  }

  /**
   * Get quotaReachedMsgNb
   * @return quotaReachedMsgNb
  */
  @ApiModelProperty(value = "")


  public String getQuotaReachedMsgNb() {
    return quotaReachedMsgNb;
  }

  public void setQuotaReachedMsgNb(String quotaReachedMsgNb) {
    this.quotaReachedMsgNb = quotaReachedMsgNb;
  }

  public QuotaRelatedInformationType quotaReachedReplyStatus(String quotaReachedReplyStatus) {
    this.quotaReachedReplyStatus = quotaReachedReplyStatus;
    return this;
  }

  /**
   * Get quotaReachedReplyStatus
   * @return quotaReachedReplyStatus
  */
  @ApiModelProperty(value = "")


  public String getQuotaReachedReplyStatus() {
    return quotaReachedReplyStatus;
  }

  public void setQuotaReachedReplyStatus(String quotaReachedReplyStatus) {
    this.quotaReachedReplyStatus = quotaReachedReplyStatus;
  }

  public QuotaRelatedInformationType quotaType(String quotaType) {
    this.quotaType = quotaType;
    return this;
  }

  /**
   * Get quotaType
   * @return quotaType
  */
  @ApiModelProperty(value = "")


  public String getQuotaType() {
    return quotaType;
  }

  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaRelatedInformationType quotaRelatedInformationType = (QuotaRelatedInformationType) o;
    return Objects.equals(this.availability, quotaRelatedInformationType.availability) &&
        Objects.equals(this.counter, quotaRelatedInformationType.counter) &&
        Objects.equals(this.maxQuantity, quotaRelatedInformationType.maxQuantity) &&
        Objects.equals(this.quotaCounterName, quotaRelatedInformationType.quotaCounterName) &&
        Objects.equals(this.quotaGrade, quotaRelatedInformationType.quotaGrade) &&
        Objects.equals(this.quotaNotReachedMsgNb, quotaRelatedInformationType.quotaNotReachedMsgNb) &&
        Objects.equals(this.quotaReachedMsgNb, quotaRelatedInformationType.quotaReachedMsgNb) &&
        Objects.equals(this.quotaReachedReplyStatus, quotaRelatedInformationType.quotaReachedReplyStatus) &&
        Objects.equals(this.quotaType, quotaRelatedInformationType.quotaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, counter, maxQuantity, quotaCounterName, quotaGrade, quotaNotReachedMsgNb, quotaReachedMsgNb, quotaReachedReplyStatus, quotaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaRelatedInformationType {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    quotaCounterName: ").append(toIndentedString(quotaCounterName)).append("\n");
    sb.append("    quotaGrade: ").append(toIndentedString(quotaGrade)).append("\n");
    sb.append("    quotaNotReachedMsgNb: ").append(toIndentedString(quotaNotReachedMsgNb)).append("\n");
    sb.append("    quotaReachedMsgNb: ").append(toIndentedString(quotaReachedMsgNb)).append("\n");
    sb.append("    quotaReachedReplyStatus: ").append(toIndentedString(quotaReachedReplyStatus)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
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

