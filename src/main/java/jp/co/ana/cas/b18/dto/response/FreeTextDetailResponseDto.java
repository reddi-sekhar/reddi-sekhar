package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FreeTextDetailResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FreeTextDetailResponseDto   {
  @JsonProperty("textSubjectQualifier")
  private String textSubjectQualifier;

  @JsonProperty("informationType")
  private String informationType;

  @JsonProperty("source")
  private String source;

  @JsonProperty("language")
  private String language;

  public FreeTextDetailResponseDto textSubjectQualifier(String textSubjectQualifier) {
    this.textSubjectQualifier = textSubjectQualifier;
    return this;
  }

  /**
   * Identifies whether the free text is coded or not coded
   * @return textSubjectQualifier
  */
  @ApiModelProperty(example = "3", value = "Identifies whether the free text is coded or not coded")

@Size(min=1,max=3) 
  public String getTextSubjectQualifier() {
    return textSubjectQualifier;
  }

  public void setTextSubjectQualifier(String textSubjectQualifier) {
    this.textSubjectQualifier = textSubjectQualifier;
  }

  public FreeTextDetailResponseDto informationType(String informationType) {
    this.informationType = informationType;
    return this;
  }

  /**
   * Coded text, or specifies type of info Surface segment
   * @return informationType
  */
  @ApiModelProperty(value = "Coded text, or specifies type of info Surface segment")

@Size(min=1,max=4) 
  public String getInformationType() {
    return informationType;
  }

  public void setInformationType(String informationType) {
    this.informationType = informationType;
  }

  public FreeTextDetailResponseDto source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Company code
   * @return source
  */
  @ApiModelProperty(value = "Company code")

@Size(min=1,max=3) 
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public FreeTextDetailResponseDto language(String language) {
    this.language = language;
    return this;
  }

  /**
   * ISO code for language of free text
   * @return language
  */
  @ApiModelProperty(value = "ISO code for language of free text")

@Size(min=1,max=3) 
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextDetailResponseDto freeTextDetailResponseDto = (FreeTextDetailResponseDto) o;
    return Objects.equals(this.textSubjectQualifier, freeTextDetailResponseDto.textSubjectQualifier) &&
        Objects.equals(this.informationType, freeTextDetailResponseDto.informationType) &&
        Objects.equals(this.source, freeTextDetailResponseDto.source) &&
        Objects.equals(this.language, freeTextDetailResponseDto.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSubjectQualifier, informationType, source, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextDetailResponseDto {\n");
    
    sb.append("    textSubjectQualifier: ").append(toIndentedString(textSubjectQualifier)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

