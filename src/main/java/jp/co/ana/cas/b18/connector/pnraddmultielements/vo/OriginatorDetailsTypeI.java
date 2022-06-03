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
 * OriginatorDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OriginatorDetailsTypeI   {
  @JsonProperty("codedCountry")
  private String codedCountry;

  @JsonProperty("codedCurrency")
  private String codedCurrency;

  @JsonProperty("codedLanguage")
  private String codedLanguage;

  public OriginatorDetailsTypeI codedCountry(String codedCountry) {
    this.codedCountry = codedCountry;
    return this;
  }

  /**
   * Get codedCountry
   * @return codedCountry
  */
  @ApiModelProperty(value = "")


  public String getCodedCountry() {
    return codedCountry;
  }

  public void setCodedCountry(String codedCountry) {
    this.codedCountry = codedCountry;
  }

  public OriginatorDetailsTypeI codedCurrency(String codedCurrency) {
    this.codedCurrency = codedCurrency;
    return this;
  }

  /**
   * Get codedCurrency
   * @return codedCurrency
  */
  @ApiModelProperty(value = "")


  public String getCodedCurrency() {
    return codedCurrency;
  }

  public void setCodedCurrency(String codedCurrency) {
    this.codedCurrency = codedCurrency;
  }

  public OriginatorDetailsTypeI codedLanguage(String codedLanguage) {
    this.codedLanguage = codedLanguage;
    return this;
  }

  /**
   * Get codedLanguage
   * @return codedLanguage
  */
  @ApiModelProperty(value = "")


  public String getCodedLanguage() {
    return codedLanguage;
  }

  public void setCodedLanguage(String codedLanguage) {
    this.codedLanguage = codedLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginatorDetailsTypeI originatorDetailsTypeI = (OriginatorDetailsTypeI) o;
    return Objects.equals(this.codedCountry, originatorDetailsTypeI.codedCountry) &&
        Objects.equals(this.codedCurrency, originatorDetailsTypeI.codedCurrency) &&
        Objects.equals(this.codedLanguage, originatorDetailsTypeI.codedLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codedCountry, codedCurrency, codedLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginatorDetailsTypeI {\n");
    
    sb.append("    codedCountry: ").append(toIndentedString(codedCountry)).append("\n");
    sb.append("    codedCurrency: ").append(toIndentedString(codedCurrency)).append("\n");
    sb.append("    codedLanguage: ").append(toIndentedString(codedLanguage)).append("\n");
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

