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
 * FreeTextDetailTransactionResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FreeTextDetailTransactionResponseDto   {
  @JsonProperty("textSubjectQualifier")
  private String textSubjectQualifier;

  @JsonProperty("source")
  private String source;

  @JsonProperty("encoding")
  private String encoding;

  public FreeTextDetailTransactionResponseDto textSubjectQualifier(String textSubjectQualifier) {
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

  public FreeTextDetailTransactionResponseDto source(String source) {
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

  public FreeTextDetailTransactionResponseDto encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Encoding: - 1 for ASCII 7 bit (no national characters)
   * @return encoding
  */
  @ApiModelProperty(value = "Encoding: - 1 for ASCII 7 bit (no national characters)")

@Size(min=1,max=3) 
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextDetailTransactionResponseDto freeTextDetailTransactionResponseDto = (FreeTextDetailTransactionResponseDto) o;
    return Objects.equals(this.textSubjectQualifier, freeTextDetailTransactionResponseDto.textSubjectQualifier) &&
        Objects.equals(this.source, freeTextDetailTransactionResponseDto.source) &&
        Objects.equals(this.encoding, freeTextDetailTransactionResponseDto.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSubjectQualifier, source, encoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextDetailTransactionResponseDto {\n");
    
    sb.append("    textSubjectQualifier: ").append(toIndentedString(textSubjectQualifier)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

