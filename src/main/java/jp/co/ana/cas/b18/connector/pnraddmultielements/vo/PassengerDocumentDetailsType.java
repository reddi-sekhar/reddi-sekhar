package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DocumentDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerDocumentDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PassengerDocumentDetailsType   {
  @JsonProperty("birthDate")
  private String birthDate;

  @JsonProperty("documentDetails")
  private DocumentDetailsType documentDetails;

  public PassengerDocumentDetailsType birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  */
  @ApiModelProperty(value = "")


  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public PassengerDocumentDetailsType documentDetails(DocumentDetailsType documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  /**
   * Get documentDetails
   * @return documentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentDetailsType getDocumentDetails() {
    return documentDetails;
  }

  public void setDocumentDetails(DocumentDetailsType documentDetails) {
    this.documentDetails = documentDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerDocumentDetailsType passengerDocumentDetailsType = (PassengerDocumentDetailsType) o;
    return Objects.equals(this.birthDate, passengerDocumentDetailsType.birthDate) &&
        Objects.equals(this.documentDetails, passengerDocumentDetailsType.documentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, documentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerDocumentDetailsType {\n");
    
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
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

