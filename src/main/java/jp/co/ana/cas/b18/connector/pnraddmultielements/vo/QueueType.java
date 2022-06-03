package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateRangeType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.GategoryType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OtherInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QueueDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueueType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QueueType   {
  @JsonProperty("categoryDetail")
  private GategoryType categoryDetail;

  @JsonProperty("dateRange")
  private DateRangeType dateRange;

  @JsonProperty("informations")
  private OtherInformationType informations;

  @JsonProperty("queueDetail")
  private QueueDetailsType queueDetail;

  public QueueType categoryDetail(GategoryType categoryDetail) {
    this.categoryDetail = categoryDetail;
    return this;
  }

  /**
   * Get categoryDetail
   * @return categoryDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public GategoryType getCategoryDetail() {
    return categoryDetail;
  }

  public void setCategoryDetail(GategoryType categoryDetail) {
    this.categoryDetail = categoryDetail;
  }

  public QueueType dateRange(DateRangeType dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateRangeType getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRangeType dateRange) {
    this.dateRange = dateRange;
  }

  public QueueType informations(OtherInformationType informations) {
    this.informations = informations;
    return this;
  }

  /**
   * Get informations
   * @return informations
  */
  @ApiModelProperty(value = "")

  @Valid

  public OtherInformationType getInformations() {
    return informations;
  }

  public void setInformations(OtherInformationType informations) {
    this.informations = informations;
  }

  public QueueType queueDetail(QueueDetailsType queueDetail) {
    this.queueDetail = queueDetail;
    return this;
  }

  /**
   * Get queueDetail
   * @return queueDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public QueueDetailsType getQueueDetail() {
    return queueDetail;
  }

  public void setQueueDetail(QueueDetailsType queueDetail) {
    this.queueDetail = queueDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueType queueType = (QueueType) o;
    return Objects.equals(this.categoryDetail, queueType.categoryDetail) &&
        Objects.equals(this.dateRange, queueType.dateRange) &&
        Objects.equals(this.informations, queueType.informations) &&
        Objects.equals(this.queueDetail, queueType.queueDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryDetail, dateRange, informations, queueDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueType {\n");
    
    sb.append("    categoryDetail: ").append(toIndentedString(categoryDetail)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    informations: ").append(toIndentedString(informations)).append("\n");
    sb.append("    queueDetail: ").append(toIndentedString(queueDetail)).append("\n");
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

