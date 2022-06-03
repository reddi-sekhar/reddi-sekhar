package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ApplicationIdentificationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ApplicationType   {
  @JsonProperty("applicationDetails")
  private ApplicationIdentificationType applicationDetails;

  public ApplicationType applicationDetails(ApplicationIdentificationType applicationDetails) {
    this.applicationDetails = applicationDetails;
    return this;
  }

  /**
   * Get applicationDetails
   * @return applicationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationIdentificationType getApplicationDetails() {
    return applicationDetails;
  }

  public void setApplicationDetails(ApplicationIdentificationType applicationDetails) {
    this.applicationDetails = applicationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationType applicationType = (ApplicationType) o;
    return Objects.equals(this.applicationDetails, applicationType.applicationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationType {\n");
    
    sb.append("    applicationDetails: ").append(toIndentedString(applicationDetails)).append("\n");
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

