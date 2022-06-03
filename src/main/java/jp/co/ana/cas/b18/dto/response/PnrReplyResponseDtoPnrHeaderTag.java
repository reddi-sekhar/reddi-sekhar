package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.StatusInfromationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PnrReplyResponseDtoPnrHeaderTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PnrReplyResponseDtoPnrHeaderTag   {
  @JsonProperty("statusInformation")
  @Valid
  private List<StatusInfromationResponseDto> statusInformation = null;

  public PnrReplyResponseDtoPnrHeaderTag statusInformation(List<StatusInfromationResponseDto> statusInformation) {
    this.statusInformation = statusInformation;
    return this;
  }

  public PnrReplyResponseDtoPnrHeaderTag addStatusInformationItem(StatusInfromationResponseDto statusInformationItem) {
    if (this.statusInformation == null) {
      this.statusInformation = new ArrayList<>();
    }
    this.statusInformation.add(statusInformationItem);
    return this;
  }

  /**
   * Get statusInformation
   * @return statusInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusInfromationResponseDto> getStatusInformation() {
    return statusInformation;
  }

  public void setStatusInformation(List<StatusInfromationResponseDto> statusInformation) {
    this.statusInformation = statusInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrReplyResponseDtoPnrHeaderTag pnrReplyResponseDtoPnrHeaderTag = (PnrReplyResponseDtoPnrHeaderTag) o;
    return Objects.equals(this.statusInformation, pnrReplyResponseDtoPnrHeaderTag.statusInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrReplyResponseDtoPnrHeaderTag {\n");
    
    sb.append("    statusInformation: ").append(toIndentedString(statusInformation)).append("\n");
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

