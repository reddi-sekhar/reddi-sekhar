package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AuthorizationApprovalDataType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericAuthorisationResultType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class GenericAuthorisationResultType   {
  @JsonProperty("approvalCodeData")
  private AuthorizationApprovalDataType approvalCodeData;

  public GenericAuthorisationResultType approvalCodeData(AuthorizationApprovalDataType approvalCodeData) {
    this.approvalCodeData = approvalCodeData;
    return this;
  }

  /**
   * Get approvalCodeData
   * @return approvalCodeData
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuthorizationApprovalDataType getApprovalCodeData() {
    return approvalCodeData;
  }

  public void setApprovalCodeData(AuthorizationApprovalDataType approvalCodeData) {
    this.approvalCodeData = approvalCodeData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericAuthorisationResultType genericAuthorisationResultType = (GenericAuthorisationResultType) o;
    return Objects.equals(this.approvalCodeData, genericAuthorisationResultType.approvalCodeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCodeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericAuthorisationResultType {\n");
    
    sb.append("    approvalCodeData: ").append(toIndentedString(approvalCodeData)).append("\n");
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

