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
 * DiagnosisTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiagnosisTypeU   {
  @JsonProperty("billingDetails")
  private String billingDetails;

  @JsonProperty("billingQualifier")
  private String billingQualifier;

  public DiagnosisTypeU billingDetails(String billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }

  /**
   * Get billingDetails
   * @return billingDetails
  */
  @ApiModelProperty(value = "")


  public String getBillingDetails() {
    return billingDetails;
  }

  public void setBillingDetails(String billingDetails) {
    this.billingDetails = billingDetails;
  }

  public DiagnosisTypeU billingQualifier(String billingQualifier) {
    this.billingQualifier = billingQualifier;
    return this;
  }

  /**
   * Get billingQualifier
   * @return billingQualifier
  */
  @ApiModelProperty(value = "")


  public String getBillingQualifier() {
    return billingQualifier;
  }

  public void setBillingQualifier(String billingQualifier) {
    this.billingQualifier = billingQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisTypeU diagnosisTypeU = (DiagnosisTypeU) o;
    return Objects.equals(this.billingDetails, diagnosisTypeU.billingDetails) &&
        Objects.equals(this.billingQualifier, diagnosisTypeU.billingQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDetails, billingQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosisTypeU {\n");
    
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
    sb.append("    billingQualifier: ").append(toIndentedString(billingQualifier)).append("\n");
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

