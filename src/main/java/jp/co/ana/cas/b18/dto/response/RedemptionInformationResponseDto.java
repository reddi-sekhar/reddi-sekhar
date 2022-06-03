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
 * RedemptionInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class RedemptionInformationResponseDto   {
  @JsonProperty("category")
  private String category;

  @JsonProperty("approvalCode")
  private String approvalCode;

  public RedemptionInformationResponseDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * the award code returned by loyalty system in booking time and send to loyalty system in ticketing time.
   * @return category
  */
  @ApiModelProperty(value = "the award code returned by loyalty system in booking time and send to loyalty system in ticketing time.")

@Size(min=1,max=6) 
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public RedemptionInformationResponseDto approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  /**
   * approvalCode
   * @return approvalCode
  */
  @ApiModelProperty(value = "approvalCode")

@Size(min=1,max=14) 
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionInformationResponseDto redemptionInformationResponseDto = (RedemptionInformationResponseDto) o;
    return Objects.equals(this.category, redemptionInformationResponseDto.category) &&
        Objects.equals(this.approvalCode, redemptionInformationResponseDto.approvalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, approvalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionInformationResponseDto {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
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

