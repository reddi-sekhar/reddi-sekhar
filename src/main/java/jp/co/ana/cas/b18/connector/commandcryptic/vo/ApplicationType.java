package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class ApplicationType   {
  @JsonProperty("applicationLabel")
  private String applicationLabel;

  @JsonProperty("indexNumber")
  private String indexNumber;

  public ApplicationType applicationLabel(String applicationLabel) {
    this.applicationLabel = applicationLabel;
    return this;
  }

  /**
   * Get applicationLabel
   * @return applicationLabel
  */
  @ApiModelProperty(value = "")


  public String getApplicationLabel() {
    return applicationLabel;
  }

  public void setApplicationLabel(String applicationLabel) {
    this.applicationLabel = applicationLabel;
  }

  public ApplicationType indexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

  /**
   * Get indexNumber
   * @return indexNumber
  */
  @ApiModelProperty(value = "")


  public String getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
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
    return Objects.equals(this.applicationLabel, applicationType.applicationLabel) &&
        Objects.equals(this.indexNumber, applicationType.indexNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLabel, indexNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationType {\n");
    
    sb.append("    applicationLabel: ").append(toIndentedString(applicationLabel)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
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

