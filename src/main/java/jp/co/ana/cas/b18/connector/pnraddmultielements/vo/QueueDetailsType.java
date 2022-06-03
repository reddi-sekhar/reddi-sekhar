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
 * QueueDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QueueDetailsType   {
  @JsonProperty("queueName")
  private String queueName;

  @JsonProperty("queueNum1")
  private Long queueNum1;

  public QueueDetailsType queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
  */
  @ApiModelProperty(value = "")


  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public QueueDetailsType queueNum1(Long queueNum1) {
    this.queueNum1 = queueNum1;
    return this;
  }

  /**
   * Get queueNum1
   * @return queueNum1
  */
  @ApiModelProperty(value = "")


  public Long getQueueNum1() {
    return queueNum1;
  }

  public void setQueueNum1(Long queueNum1) {
    this.queueNum1 = queueNum1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueDetailsType queueDetailsType = (QueueDetailsType) o;
    return Objects.equals(this.queueName, queueDetailsType.queueName) &&
        Objects.equals(this.queueNum1, queueDetailsType.queueNum1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueName, queueNum1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueDetailsType {\n");
    
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueNum1: ").append(toIndentedString(queueNum1)).append("\n");
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

