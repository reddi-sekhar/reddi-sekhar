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
 * FreeTextQualificationTypeI274593C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextQualificationTypeI274593C   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("informationType")
  private String informationType;

  @JsonProperty("language")
  private String language;

  @JsonProperty("status")
  private String status;

  @JsonProperty("textSubjectQualifier")
  private String textSubjectQualifier;

  public FreeTextQualificationTypeI274593C companyId(String companyId) {
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

  public FreeTextQualificationTypeI274593C informationType(String informationType) {
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

  public FreeTextQualificationTypeI274593C language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public FreeTextQualificationTypeI274593C status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FreeTextQualificationTypeI274593C textSubjectQualifier(String textSubjectQualifier) {
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
    FreeTextQualificationTypeI274593C freeTextQualificationTypeI274593C = (FreeTextQualificationTypeI274593C) o;
    return Objects.equals(this.companyId, freeTextQualificationTypeI274593C.companyId) &&
        Objects.equals(this.informationType, freeTextQualificationTypeI274593C.informationType) &&
        Objects.equals(this.language, freeTextQualificationTypeI274593C.language) &&
        Objects.equals(this.status, freeTextQualificationTypeI274593C.status) &&
        Objects.equals(this.textSubjectQualifier, freeTextQualificationTypeI274593C.textSubjectQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, informationType, language, status, textSubjectQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextQualificationTypeI274593C {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

