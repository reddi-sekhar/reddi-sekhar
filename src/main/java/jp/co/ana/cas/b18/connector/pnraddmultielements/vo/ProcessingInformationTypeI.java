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
 * ProcessingInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProcessingInformationTypeI   {
  @JsonProperty("actionQualifier")
  private String actionQualifier;

  @JsonProperty("referenceQualifier")
  private String referenceQualifier;

  public ProcessingInformationTypeI actionQualifier(String actionQualifier) {
    this.actionQualifier = actionQualifier;
    return this;
  }

  /**
   * Get actionQualifier
   * @return actionQualifier
  */
  @ApiModelProperty(value = "")


  public String getActionQualifier() {
    return actionQualifier;
  }

  public void setActionQualifier(String actionQualifier) {
    this.actionQualifier = actionQualifier;
  }

  public ProcessingInformationTypeI referenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
    return this;
  }

  /**
   * Get referenceQualifier
   * @return referenceQualifier
  */
  @ApiModelProperty(value = "")


  public String getReferenceQualifier() {
    return referenceQualifier;
  }

  public void setReferenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessingInformationTypeI processingInformationTypeI = (ProcessingInformationTypeI) o;
    return Objects.equals(this.actionQualifier, processingInformationTypeI.actionQualifier) &&
        Objects.equals(this.referenceQualifier, processingInformationTypeI.referenceQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionQualifier, referenceQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingInformationTypeI {\n");
    
    sb.append("    actionQualifier: ").append(toIndentedString(actionQualifier)).append("\n");
    sb.append("    referenceQualifier: ").append(toIndentedString(referenceQualifier)).append("\n");
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

