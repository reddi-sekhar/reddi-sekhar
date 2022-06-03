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
 * MiscellaneousRemarkType198195C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarkType198195C   {
  @JsonProperty("businessFunction")
  private String businessFunction;

  @JsonProperty("encoding")
  private String encoding;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("language")
  private String language;

  @JsonProperty("source")
  private String source;

  @JsonProperty("type")
  private String type;

  public MiscellaneousRemarkType198195C businessFunction(String businessFunction) {
    this.businessFunction = businessFunction;
    return this;
  }

  /**
   * Get businessFunction
   * @return businessFunction
  */
  @ApiModelProperty(value = "")


  public String getBusinessFunction() {
    return businessFunction;
  }

  public void setBusinessFunction(String businessFunction) {
    this.businessFunction = businessFunction;
  }

  public MiscellaneousRemarkType198195C encoding(String encoding) {
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

  public MiscellaneousRemarkType198195C freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public MiscellaneousRemarkType198195C language(String language) {
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

  public MiscellaneousRemarkType198195C source(String source) {
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

  public MiscellaneousRemarkType198195C type(String type) {
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
    MiscellaneousRemarkType198195C miscellaneousRemarkType198195C = (MiscellaneousRemarkType198195C) o;
    return Objects.equals(this.businessFunction, miscellaneousRemarkType198195C.businessFunction) &&
        Objects.equals(this.encoding, miscellaneousRemarkType198195C.encoding) &&
        Objects.equals(this.freetext, miscellaneousRemarkType198195C.freetext) &&
        Objects.equals(this.language, miscellaneousRemarkType198195C.language) &&
        Objects.equals(this.source, miscellaneousRemarkType198195C.source) &&
        Objects.equals(this.type, miscellaneousRemarkType198195C.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessFunction, encoding, freetext, language, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarkType198195C {\n");
    
    sb.append("    businessFunction: ").append(toIndentedString(businessFunction)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

