package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ApplicationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType127265S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AcceptanceChannel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AcceptanceChannel   {
  @JsonProperty("acceptanceOrigin")
  private UserIdentificationType127265S acceptanceOrigin;

  @JsonProperty("applicationType")
  private ApplicationType applicationType;

  public AcceptanceChannel acceptanceOrigin(UserIdentificationType127265S acceptanceOrigin) {
    this.acceptanceOrigin = acceptanceOrigin;
    return this;
  }

  /**
   * Get acceptanceOrigin
   * @return acceptanceOrigin
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType127265S getAcceptanceOrigin() {
    return acceptanceOrigin;
  }

  public void setAcceptanceOrigin(UserIdentificationType127265S acceptanceOrigin) {
    this.acceptanceOrigin = acceptanceOrigin;
  }

  public AcceptanceChannel applicationType(ApplicationType applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationType getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(ApplicationType applicationType) {
    this.applicationType = applicationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptanceChannel acceptanceChannel = (AcceptanceChannel) o;
    return Objects.equals(this.acceptanceOrigin, acceptanceChannel.acceptanceOrigin) &&
        Objects.equals(this.applicationType, acceptanceChannel.applicationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceOrigin, applicationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptanceChannel {\n");
    
    sb.append("    acceptanceOrigin: ").append(toIndentedString(acceptanceOrigin)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
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

