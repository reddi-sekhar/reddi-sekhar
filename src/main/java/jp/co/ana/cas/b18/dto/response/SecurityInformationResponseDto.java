package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.QueueingInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.ResponsibilityInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.SecondRpInformationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SecurityInformationResponseDto   {
  @JsonProperty("responsibilityInformation")
  private ResponsibilityInformationResponseDto responsibilityInformation;

  @JsonProperty("queueingInformation")
  private QueueingInformationResponseDto queueingInformation;

  @JsonProperty("secondRpInformation")
  private SecondRpInformationResponseDto secondRpInformation;

  public SecurityInformationResponseDto responsibilityInformation(ResponsibilityInformationResponseDto responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
    return this;
  }

  /**
   * Get responsibilityInformation
   * @return responsibilityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponsibilityInformationResponseDto getResponsibilityInformation() {
    return responsibilityInformation;
  }

  public void setResponsibilityInformation(ResponsibilityInformationResponseDto responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
  }

  public SecurityInformationResponseDto queueingInformation(QueueingInformationResponseDto queueingInformation) {
    this.queueingInformation = queueingInformation;
    return this;
  }

  /**
   * Get queueingInformation
   * @return queueingInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public QueueingInformationResponseDto getQueueingInformation() {
    return queueingInformation;
  }

  public void setQueueingInformation(QueueingInformationResponseDto queueingInformation) {
    this.queueingInformation = queueingInformation;
  }

  public SecurityInformationResponseDto secondRpInformation(SecondRpInformationResponseDto secondRpInformation) {
    this.secondRpInformation = secondRpInformation;
    return this;
  }

  /**
   * Get secondRpInformation
   * @return secondRpInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecondRpInformationResponseDto getSecondRpInformation() {
    return secondRpInformation;
  }

  public void setSecondRpInformation(SecondRpInformationResponseDto secondRpInformation) {
    this.secondRpInformation = secondRpInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityInformationResponseDto securityInformationResponseDto = (SecurityInformationResponseDto) o;
    return Objects.equals(this.responsibilityInformation, securityInformationResponseDto.responsibilityInformation) &&
        Objects.equals(this.queueingInformation, securityInformationResponseDto.queueingInformation) &&
        Objects.equals(this.secondRpInformation, securityInformationResponseDto.secondRpInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsibilityInformation, queueingInformation, secondRpInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityInformationResponseDto {\n");
    
    sb.append("    responsibilityInformation: ").append(toIndentedString(responsibilityInformation)).append("\n");
    sb.append("    queueingInformation: ").append(toIndentedString(queueingInformation)).append("\n");
    sb.append("    secondRpInformation: ").append(toIndentedString(secondRpInformation)).append("\n");
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

