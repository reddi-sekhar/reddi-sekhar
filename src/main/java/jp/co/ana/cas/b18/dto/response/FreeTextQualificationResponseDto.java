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
 * FreeTextQualificationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FreeTextQualificationResponseDto   {
  @JsonProperty("textSubjectQualifier")
  private String textSubjectQualifier;

  @JsonProperty("informationType")
  private String informationType;

  public FreeTextQualificationResponseDto textSubjectQualifier(String textSubjectQualifier) {
    this.textSubjectQualifier = textSubjectQualifier;
    return this;
  }

  /**
   * Categorise the format of the text (free text, coded,...)
   * @return textSubjectQualifier
  */
  @ApiModelProperty(example = "3", value = "Categorise the format of the text (free text, coded,...)")

@Size(min=1,max=3) 
  public String getTextSubjectQualifier() {
    return textSubjectQualifier;
  }

  public void setTextSubjectQualifier(String textSubjectQualifier) {
    this.textSubjectQualifier = textSubjectQualifier;
  }

  public FreeTextQualificationResponseDto informationType(String informationType) {
    this.informationType = informationType;
    return this;
  }

  /**
   * provides a code identifying the information
   * @return informationType
  */
  @ApiModelProperty(example = "AR", value = "provides a code identifying the information")

@Size(min=1,max=4) 
  public String getInformationType() {
    return informationType;
  }

  public void setInformationType(String informationType) {
    this.informationType = informationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextQualificationResponseDto freeTextQualificationResponseDto = (FreeTextQualificationResponseDto) o;
    return Objects.equals(this.textSubjectQualifier, freeTextQualificationResponseDto.textSubjectQualifier) &&
        Objects.equals(this.informationType, freeTextQualificationResponseDto.informationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSubjectQualifier, informationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextQualificationResponseDto {\n");
    
    sb.append("    textSubjectQualifier: ").append(toIndentedString(textSubjectQualifier)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
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

