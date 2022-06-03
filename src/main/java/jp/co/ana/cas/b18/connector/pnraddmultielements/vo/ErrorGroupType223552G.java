package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ApplicationErrorInformationType185486S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType185487S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorGroupType223552G
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ErrorGroupType223552G   {
  @JsonProperty("errorOrWarningCodeDetails")
  private ApplicationErrorInformationType185486S errorOrWarningCodeDetails;

  @JsonProperty("errorWarningDescription")
  private FreeTextInformationType185487S errorWarningDescription;

  public ErrorGroupType223552G errorOrWarningCodeDetails(ApplicationErrorInformationType185486S errorOrWarningCodeDetails) {
    this.errorOrWarningCodeDetails = errorOrWarningCodeDetails;
    return this;
  }

  /**
   * Get errorOrWarningCodeDetails
   * @return errorOrWarningCodeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationErrorInformationType185486S getErrorOrWarningCodeDetails() {
    return errorOrWarningCodeDetails;
  }

  public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType185486S errorOrWarningCodeDetails) {
    this.errorOrWarningCodeDetails = errorOrWarningCodeDetails;
  }

  public ErrorGroupType223552G errorWarningDescription(FreeTextInformationType185487S errorWarningDescription) {
    this.errorWarningDescription = errorWarningDescription;
    return this;
  }

  /**
   * Get errorWarningDescription
   * @return errorWarningDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType185487S getErrorWarningDescription() {
    return errorWarningDescription;
  }

  public void setErrorWarningDescription(FreeTextInformationType185487S errorWarningDescription) {
    this.errorWarningDescription = errorWarningDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorGroupType223552G errorGroupType223552G = (ErrorGroupType223552G) o;
    return Objects.equals(this.errorOrWarningCodeDetails, errorGroupType223552G.errorOrWarningCodeDetails) &&
        Objects.equals(this.errorWarningDescription, errorGroupType223552G.errorWarningDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorOrWarningCodeDetails, errorWarningDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorGroupType223552G {\n");
    
    sb.append("    errorOrWarningCodeDetails: ").append(toIndentedString(errorOrWarningCodeDetails)).append("\n");
    sb.append("    errorWarningDescription: ").append(toIndentedString(errorWarningDescription)).append("\n");
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

