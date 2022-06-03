package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DocumentDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentInformationDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DocumentInformationDetailsTypeI   {
  @JsonProperty("documentDetails")
  private DocumentDetailsTypeI documentDetails;

  public DocumentInformationDetailsTypeI documentDetails(DocumentDetailsTypeI documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  /**
   * Get documentDetails
   * @return documentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentDetailsTypeI getDocumentDetails() {
    return documentDetails;
  }

  public void setDocumentDetails(DocumentDetailsTypeI documentDetails) {
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
    DocumentInformationDetailsTypeI documentInformationDetailsTypeI = (DocumentInformationDetailsTypeI) o;
    return Objects.equals(this.documentDetails, documentInformationDetailsTypeI.documentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentInformationDetailsTypeI {\n");
    
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

