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
 * ApplicationErrorDetailType198235C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ApplicationErrorDetailType198235C   {
  @JsonProperty("errorCategory")
  private String errorCategory;

  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("errorCodeOwner")
  private String errorCodeOwner;

  public ApplicationErrorDetailType198235C errorCategory(String errorCategory) {
    this.errorCategory = errorCategory;
    return this;
  }

  /**
   * Get errorCategory
   * @return errorCategory
  */
  @ApiModelProperty(value = "")


  public String getErrorCategory() {
    return errorCategory;
  }

  public void setErrorCategory(String errorCategory) {
    this.errorCategory = errorCategory;
  }

  public ApplicationErrorDetailType198235C errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @ApiModelProperty(value = "")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ApplicationErrorDetailType198235C errorCodeOwner(String errorCodeOwner) {
    this.errorCodeOwner = errorCodeOwner;
    return this;
  }

  /**
   * Get errorCodeOwner
   * @return errorCodeOwner
  */
  @ApiModelProperty(value = "")


  public String getErrorCodeOwner() {
    return errorCodeOwner;
  }

  public void setErrorCodeOwner(String errorCodeOwner) {
    this.errorCodeOwner = errorCodeOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationErrorDetailType198235C applicationErrorDetailType198235C = (ApplicationErrorDetailType198235C) o;
    return Objects.equals(this.errorCategory, applicationErrorDetailType198235C.errorCategory) &&
        Objects.equals(this.errorCode, applicationErrorDetailType198235C.errorCode) &&
        Objects.equals(this.errorCodeOwner, applicationErrorDetailType198235C.errorCodeOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCategory, errorCode, errorCodeOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationErrorDetailType198235C {\n");
    
    sb.append("    errorCategory: ").append(toIndentedString(errorCategory)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorCodeOwner: ").append(toIndentedString(errorCodeOwner)).append("\n");
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

