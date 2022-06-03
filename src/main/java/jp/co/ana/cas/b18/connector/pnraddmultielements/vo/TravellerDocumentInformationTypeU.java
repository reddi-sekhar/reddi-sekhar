package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DocumentInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ValidityDatesTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerDocumentInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerDocumentInformationTypeU   {
  @JsonProperty("datesOfValidity")
  private ValidityDatesTypeU datesOfValidity;

  @JsonProperty("documentInformation")
  private DocumentInformationTypeU documentInformation;

  public TravellerDocumentInformationTypeU datesOfValidity(ValidityDatesTypeU datesOfValidity) {
    this.datesOfValidity = datesOfValidity;
    return this;
  }

  /**
   * Get datesOfValidity
   * @return datesOfValidity
  */
  @ApiModelProperty(value = "")

  @Valid

  public ValidityDatesTypeU getDatesOfValidity() {
    return datesOfValidity;
  }

  public void setDatesOfValidity(ValidityDatesTypeU datesOfValidity) {
    this.datesOfValidity = datesOfValidity;
  }

  public TravellerDocumentInformationTypeU documentInformation(DocumentInformationTypeU documentInformation) {
    this.documentInformation = documentInformation;
    return this;
  }

  /**
   * Get documentInformation
   * @return documentInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentInformationTypeU getDocumentInformation() {
    return documentInformation;
  }

  public void setDocumentInformation(DocumentInformationTypeU documentInformation) {
    this.documentInformation = documentInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerDocumentInformationTypeU travellerDocumentInformationTypeU = (TravellerDocumentInformationTypeU) o;
    return Objects.equals(this.datesOfValidity, travellerDocumentInformationTypeU.datesOfValidity) &&
        Objects.equals(this.documentInformation, travellerDocumentInformationTypeU.documentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datesOfValidity, documentInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerDocumentInformationTypeU {\n");
    
    sb.append("    datesOfValidity: ").append(toIndentedString(datesOfValidity)).append("\n");
    sb.append("    documentInformation: ").append(toIndentedString(documentInformation)).append("\n");
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

