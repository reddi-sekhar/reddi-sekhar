package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ApplicationType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class ApplicationType   {
  
  /** The application label. */
  @JsonProperty("applicationLabel")
  private String applicationLabel;

  /** The index number. */
  @JsonProperty("indexNumber")
  private String indexNumber;

  /**
   * Application label.
   *
   * @param applicationLabel the application label
   * @return the application type
   */
  public ApplicationType applicationLabel(String applicationLabel) {
    this.applicationLabel = applicationLabel;
    return this;
  }

  /**
   * Get applicationLabel.
   *
   * @return applicationLabel
   */
  @ApiModelProperty(value = "")


  public String getApplicationLabel() {
    return applicationLabel;
  }

  /**
   * Sets the application label.
   *
   * @param applicationLabel the new application label
   */
  public void setApplicationLabel(String applicationLabel) {
    this.applicationLabel = applicationLabel;
  }

  /**
   * Index number.
   *
   * @param indexNumber the index number
   * @return the application type
   */
  public ApplicationType indexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

  /**
   * Get indexNumber.
   *
   * @return indexNumber
   */
  @ApiModelProperty(value = "")


  public String getIndexNumber() {
    return indexNumber;
  }

  /**
   * Sets the index number.
   *
   * @param indexNumber the new index number
   */
  public void setIndexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationType applicationType = (ApplicationType) o;
    return Objects.equals(this.applicationLabel, applicationType.applicationLabel)
        && Objects.equals(this.indexNumber, applicationType.indexNumber);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(applicationLabel, indexNumber);
  }

  /**
   * To string.
   *
   * @return the string
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

