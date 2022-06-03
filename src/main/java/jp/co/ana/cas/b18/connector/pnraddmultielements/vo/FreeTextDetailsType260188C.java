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
 * FreeTextDetailsType260188C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextDetailsType260188C   {
  @JsonProperty("encoding")
  private String encoding;

  @JsonProperty("informationType")
  private String informationType;

  @JsonProperty("language")
  private String language;

  @JsonProperty("source")
  private String source;

  @JsonProperty("textSubjectQualifier")
  private String textSubjectQualifier;

  public FreeTextDetailsType260188C encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @ApiModelProperty(value = "")


  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public FreeTextDetailsType260188C informationType(String informationType) {
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

  public FreeTextDetailsType260188C language(String language) {
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

  public FreeTextDetailsType260188C source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public FreeTextDetailsType260188C textSubjectQualifier(String textSubjectQualifier) {
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
    FreeTextDetailsType260188C freeTextDetailsType260188C = (FreeTextDetailsType260188C) o;
    return Objects.equals(this.encoding, freeTextDetailsType260188C.encoding) &&
        Objects.equals(this.informationType, freeTextDetailsType260188C.informationType) &&
        Objects.equals(this.language, freeTextDetailsType260188C.language) &&
        Objects.equals(this.source, freeTextDetailsType260188C.source) &&
        Objects.equals(this.textSubjectQualifier, freeTextDetailsType260188C.textSubjectQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, informationType, language, source, textSubjectQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextDetailsType260188C {\n");
    
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

