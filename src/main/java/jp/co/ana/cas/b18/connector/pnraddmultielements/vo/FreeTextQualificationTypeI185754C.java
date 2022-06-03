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
 * FreeTextQualificationTypeI185754C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextQualificationTypeI185754C   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("informationType")
  private String informationType;

  @JsonProperty("textSubjectQualifier")
  private String textSubjectQualifier;

  public FreeTextQualificationTypeI185754C companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FreeTextQualificationTypeI185754C informationType(String informationType) {
    this.informationType = informationType;
    return this;
  }

  /**
   * Get informationType
   * @return informationType
  */
  @ApiModelProperty(value = "")


  public String getInformationType() {
    return informationType;
  }

  public void setInformationType(String informationType) {
    this.informationType = informationType;
  }

  public FreeTextQualificationTypeI185754C textSubjectQualifier(String textSubjectQualifier) {
    this.textSubjectQualifier = textSubjectQualifier;
    return this;
  }

  /**
   * Get textSubjectQualifier
   * @return textSubjectQualifier
  */
  @ApiModelProperty(value = "")


  public String getTextSubjectQualifier() {
    return textSubjectQualifier;
  }

  public void setTextSubjectQualifier(String textSubjectQualifier) {
    this.textSubjectQualifier = textSubjectQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextQualificationTypeI185754C freeTextQualificationTypeI185754C = (FreeTextQualificationTypeI185754C) o;
    return Objects.equals(this.companyId, freeTextQualificationTypeI185754C.companyId) &&
        Objects.equals(this.informationType, freeTextQualificationTypeI185754C.informationType) &&
        Objects.equals(this.textSubjectQualifier, freeTextQualificationTypeI185754C.textSubjectQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, informationType, textSubjectQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextQualificationTypeI185754C {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
    sb.append("    textSubjectQualifier: ").append(toIndentedString(textSubjectQualifier)).append("\n");
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

