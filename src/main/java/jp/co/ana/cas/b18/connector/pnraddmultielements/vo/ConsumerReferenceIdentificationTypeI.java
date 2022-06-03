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
 * ConsumerReferenceIdentificationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ConsumerReferenceIdentificationTypeI   {
  @JsonProperty("referenceNumber")
  private String referenceNumber;

  @JsonProperty("referenceQualifier")
  private String referenceQualifier;

  public ConsumerReferenceIdentificationTypeI referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
  */
  @ApiModelProperty(value = "")


  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public ConsumerReferenceIdentificationTypeI referenceQualifier(String referenceQualifier) {
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
    ConsumerReferenceIdentificationTypeI consumerReferenceIdentificationTypeI = (ConsumerReferenceIdentificationTypeI) o;
    return Objects.equals(this.referenceNumber, consumerReferenceIdentificationTypeI.referenceNumber) &&
        Objects.equals(this.referenceQualifier, consumerReferenceIdentificationTypeI.referenceQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, referenceQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerReferenceIdentificationTypeI {\n");
    
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
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

