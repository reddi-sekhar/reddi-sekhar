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
 * FreeTextQualificationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextQualificationTypeI   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("language")
  private String language;

  @JsonProperty("subjectQualifier")
  private String subjectQualifier;

  @JsonProperty("type")
  private String type;

  public FreeTextQualificationTypeI companyId(String companyId) {
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

  public FreeTextQualificationTypeI language(String language) {
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

  public FreeTextQualificationTypeI subjectQualifier(String subjectQualifier) {
    this.subjectQualifier = subjectQualifier;
    return this;
  }

  /**
   * Get subjectQualifier
   * @return subjectQualifier
  */
  @ApiModelProperty(value = "")


  public String getSubjectQualifier() {
    return subjectQualifier;
  }

  public void setSubjectQualifier(String subjectQualifier) {
    this.subjectQualifier = subjectQualifier;
  }

  public FreeTextQualificationTypeI type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextQualificationTypeI freeTextQualificationTypeI = (FreeTextQualificationTypeI) o;
    return Objects.equals(this.companyId, freeTextQualificationTypeI.companyId) &&
        Objects.equals(this.language, freeTextQualificationTypeI.language) &&
        Objects.equals(this.subjectQualifier, freeTextQualificationTypeI.subjectQualifier) &&
        Objects.equals(this.type, freeTextQualificationTypeI.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, language, subjectQualifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextQualificationTypeI {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    subjectQualifier: ").append(toIndentedString(subjectQualifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

