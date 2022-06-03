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
 * AuthorizationApprovalDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AuthorizationApprovalDataType   {
  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("sourceOfApproval")
  private String sourceOfApproval;

  public AuthorizationApprovalDataType approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  /**
   * Get approvalCode
   * @return approvalCode
  */
  @ApiModelProperty(value = "")


  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public AuthorizationApprovalDataType sourceOfApproval(String sourceOfApproval) {
    this.sourceOfApproval = sourceOfApproval;
    return this;
  }

  /**
   * Get sourceOfApproval
   * @return sourceOfApproval
  */
  @ApiModelProperty(value = "")


  public String getSourceOfApproval() {
    return sourceOfApproval;
  }

  public void setSourceOfApproval(String sourceOfApproval) {
    this.sourceOfApproval = sourceOfApproval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationApprovalDataType authorizationApprovalDataType = (AuthorizationApprovalDataType) o;
    return Objects.equals(this.approvalCode, authorizationApprovalDataType.approvalCode) &&
        Objects.equals(this.sourceOfApproval, authorizationApprovalDataType.sourceOfApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, sourceOfApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationApprovalDataType {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    sourceOfApproval: ").append(toIndentedString(sourceOfApproval)).append("\n");
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

