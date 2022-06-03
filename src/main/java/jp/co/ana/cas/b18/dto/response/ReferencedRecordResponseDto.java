package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ReferencedReservationInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.SecurityInformationReferenceResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReferencedRecordResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReferencedRecordResponseDto   {
  @JsonProperty("referencedReservationInfo")
  private ReferencedReservationInfoResponseDto referencedReservationInfo;

  @JsonProperty("securityInformation")
  private SecurityInformationReferenceResponseDto securityInformation;

  public ReferencedRecordResponseDto referencedReservationInfo(ReferencedReservationInfoResponseDto referencedReservationInfo) {
    this.referencedReservationInfo = referencedReservationInfo;
    return this;
  }

  /**
   * Get referencedReservationInfo
   * @return referencedReservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencedReservationInfoResponseDto getReferencedReservationInfo() {
    return referencedReservationInfo;
  }

  public void setReferencedReservationInfo(ReferencedReservationInfoResponseDto referencedReservationInfo) {
    this.referencedReservationInfo = referencedReservationInfo;
  }

  public ReferencedRecordResponseDto securityInformation(SecurityInformationReferenceResponseDto securityInformation) {
    this.securityInformation = securityInformation;
    return this;
  }

  /**
   * Get securityInformation
   * @return securityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityInformationReferenceResponseDto getSecurityInformation() {
    return securityInformation;
  }

  public void setSecurityInformation(SecurityInformationReferenceResponseDto securityInformation) {
    this.securityInformation = securityInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedRecordResponseDto referencedRecordResponseDto = (ReferencedRecordResponseDto) o;
    return Objects.equals(this.referencedReservationInfo, referencedRecordResponseDto.referencedReservationInfo) &&
        Objects.equals(this.securityInformation, referencedRecordResponseDto.securityInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedReservationInfo, securityInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedRecordResponseDto {\n");
    
    sb.append("    referencedReservationInfo: ").append(toIndentedString(referencedReservationInfo)).append("\n");
    sb.append("    securityInformation: ").append(toIndentedString(securityInformation)).append("\n");
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

