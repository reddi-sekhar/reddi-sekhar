package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AgreementTypeIdentificationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AgreementIdentificationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AgreementIdentificationTypeU   {
  @JsonProperty("agreementDetails")
  private AgreementTypeIdentificationTypeU agreementDetails;

  public AgreementIdentificationTypeU agreementDetails(AgreementTypeIdentificationTypeU agreementDetails) {
    this.agreementDetails = agreementDetails;
    return this;
  }

  /**
   * Get agreementDetails
   * @return agreementDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AgreementTypeIdentificationTypeU getAgreementDetails() {
    return agreementDetails;
  }

  public void setAgreementDetails(AgreementTypeIdentificationTypeU agreementDetails) {
    this.agreementDetails = agreementDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementIdentificationTypeU agreementIdentificationTypeU = (AgreementIdentificationTypeU) o;
    return Objects.equals(this.agreementDetails, agreementIdentificationTypeU.agreementDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementIdentificationTypeU {\n");
    
    sb.append("    agreementDetails: ").append(toIndentedString(agreementDetails)).append("\n");
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

