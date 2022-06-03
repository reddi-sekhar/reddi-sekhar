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
 * AccommodationAllocationInformationDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccommodationAllocationInformationDetailsTypeU   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("referenceId")
  private String referenceId;

  public AccommodationAllocationInformationDetailsTypeU code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccommodationAllocationInformationDetailsTypeU referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  */
  @ApiModelProperty(value = "")


  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccommodationAllocationInformationDetailsTypeU accommodationAllocationInformationDetailsTypeU = (AccommodationAllocationInformationDetailsTypeU) o;
    return Objects.equals(this.code, accommodationAllocationInformationDetailsTypeU.code) &&
        Objects.equals(this.referenceId, accommodationAllocationInformationDetailsTypeU.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccommodationAllocationInformationDetailsTypeU {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

