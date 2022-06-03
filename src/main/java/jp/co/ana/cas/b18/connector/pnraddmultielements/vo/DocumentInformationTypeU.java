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
 * DocumentInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DocumentInformationTypeU   {
  @JsonProperty("countryOfIssue")
  private String countryOfIssue;

  @JsonProperty("documentNumber")
  private String documentNumber;

  @JsonProperty("typeOfDocument")
  private String typeOfDocument;

  public DocumentInformationTypeU countryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
    return this;
  }

  /**
   * Get countryOfIssue
   * @return countryOfIssue
  */
  @ApiModelProperty(value = "")


  public String getCountryOfIssue() {
    return countryOfIssue;
  }

  public void setCountryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
  }

  public DocumentInformationTypeU documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  */
  @ApiModelProperty(value = "")


  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public DocumentInformationTypeU typeOfDocument(String typeOfDocument) {
    this.typeOfDocument = typeOfDocument;
    return this;
  }

  /**
   * Get typeOfDocument
   * @return typeOfDocument
  */
  @ApiModelProperty(value = "")


  public String getTypeOfDocument() {
    return typeOfDocument;
  }

  public void setTypeOfDocument(String typeOfDocument) {
    this.typeOfDocument = typeOfDocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentInformationTypeU documentInformationTypeU = (DocumentInformationTypeU) o;
    return Objects.equals(this.countryOfIssue, documentInformationTypeU.countryOfIssue) &&
        Objects.equals(this.documentNumber, documentInformationTypeU.documentNumber) &&
        Objects.equals(this.typeOfDocument, documentInformationTypeU.typeOfDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfIssue, documentNumber, typeOfDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentInformationTypeU {\n");
    
    sb.append("    countryOfIssue: ").append(toIndentedString(countryOfIssue)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    typeOfDocument: ").append(toIndentedString(typeOfDocument)).append("\n");
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

