package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueueingInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class QueueingInformationResponseDto   {
  @JsonProperty("queueingOfficeId")
  private String queueingOfficeId;

  public QueueingInformationResponseDto queueingOfficeId(String queueingOfficeId) {
    this.queueingOfficeId = queueingOfficeId;
    return this;
  }

  /**
   * 1. PNR Header: Amadeus Queuing Office Id
   * @return queueingOfficeId
  */
  @ApiModelProperty(example = "TYONH0980", value = "1. PNR Header: Amadeus Queuing Office Id")

@Size(min=1,max=24) 
  public String getQueueingOfficeId() {
    return queueingOfficeId;
  }

  public void setQueueingOfficeId(String queueingOfficeId) {
    this.queueingOfficeId = queueingOfficeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueingInformationResponseDto queueingInformationResponseDto = (QueueingInformationResponseDto) o;
    return Objects.equals(this.queueingOfficeId, queueingInformationResponseDto.queueingOfficeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueingOfficeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueingInformationResponseDto {\n");
    
    sb.append("    queueingOfficeId: ").append(toIndentedString(queueingOfficeId)).append("\n");
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

