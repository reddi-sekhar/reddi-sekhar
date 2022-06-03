package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ApplicationErrorInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType136708S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorWarning
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ErrorWarning   {
  @JsonProperty("applicationError")
  private ApplicationErrorInformationType applicationError;

  @JsonProperty("errorFreeText")
  private FreeTextInformationType136708S errorFreeText;

  public ErrorWarning applicationError(ApplicationErrorInformationType applicationError) {
    this.applicationError = applicationError;
    return this;
  }

  /**
   * Get applicationError
   * @return applicationError
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationErrorInformationType getApplicationError() {
    return applicationError;
  }

  public void setApplicationError(ApplicationErrorInformationType applicationError) {
    this.applicationError = applicationError;
  }

  public ErrorWarning errorFreeText(FreeTextInformationType136708S errorFreeText) {
    this.errorFreeText = errorFreeText;
    return this;
  }

  /**
   * Get errorFreeText
   * @return errorFreeText
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType136708S getErrorFreeText() {
    return errorFreeText;
  }

  public void setErrorFreeText(FreeTextInformationType136708S errorFreeText) {
    this.errorFreeText = errorFreeText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWarning errorWarning = (ErrorWarning) o;
    return Objects.equals(this.applicationError, errorWarning.applicationError) &&
        Objects.equals(this.errorFreeText, errorWarning.errorFreeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationError, errorFreeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWarning {\n");
    
    sb.append("    applicationError: ").append(toIndentedString(applicationError)).append("\n");
    sb.append("    errorFreeText: ").append(toIndentedString(errorFreeText)).append("\n");
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

