package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ManualDocumentType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ManualDocumentRegistrationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ManualDocumentRegistrationType   {
  @JsonProperty("document")
  private ManualDocumentType document;

  @JsonProperty("freeflow")
  private String freeflow;

  @JsonProperty("passengerType")
  private String passengerType;

  public ManualDocumentRegistrationType document(ManualDocumentType document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  @ApiModelProperty(value = "")

  @Valid

  public ManualDocumentType getDocument() {
    return document;
  }

  public void setDocument(ManualDocumentType document) {
    this.document = document;
  }

  public ManualDocumentRegistrationType freeflow(String freeflow) {
    this.freeflow = freeflow;
    return this;
  }

  /**
   * Get freeflow
   * @return freeflow
  */
  @ApiModelProperty(value = "")


  public String getFreeflow() {
    return freeflow;
  }

  public void setFreeflow(String freeflow) {
    this.freeflow = freeflow;
  }

  public ManualDocumentRegistrationType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualDocumentRegistrationType manualDocumentRegistrationType = (ManualDocumentRegistrationType) o;
    return Objects.equals(this.document, manualDocumentRegistrationType.document) &&
        Objects.equals(this.freeflow, manualDocumentRegistrationType.freeflow) &&
        Objects.equals(this.passengerType, manualDocumentRegistrationType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, freeflow, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualDocumentRegistrationType {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    freeflow: ").append(toIndentedString(freeflow)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

