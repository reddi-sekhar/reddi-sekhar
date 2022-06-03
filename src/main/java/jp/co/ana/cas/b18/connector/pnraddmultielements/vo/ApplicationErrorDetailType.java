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
 * ApplicationErrorDetailType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ApplicationErrorDetailType   {
  @JsonProperty("errorCategory")
  private String errorCategory;

  @JsonProperty("errorCode")
  private String errorCode;

  public ApplicationErrorDetailType errorCategory(String errorCategory) {
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

  public ApplicationErrorDetailType errorCode(String errorCode) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationErrorDetailType applicationErrorDetailType = (ApplicationErrorDetailType) o;
    return Objects.equals(this.errorCategory, applicationErrorDetailType.errorCategory) &&
        Objects.equals(this.errorCode, applicationErrorDetailType.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCategory, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationErrorDetailType {\n");
    
    sb.append("    errorCategory: ").append(toIndentedString(errorCategory)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

