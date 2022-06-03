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
 * CompanyIdentificationTypeI2785C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyIdentificationTypeI2785C   {
  @JsonProperty("identification")
  private String identification;

  @JsonProperty("secondIdentification")
  private String secondIdentification;

  @JsonProperty("sourceCode")
  private String sourceCode;

  public CompanyIdentificationTypeI2785C identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @ApiModelProperty(value = "")


  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CompanyIdentificationTypeI2785C secondIdentification(String secondIdentification) {
    this.secondIdentification = secondIdentification;
    return this;
  }

  /**
   * Get secondIdentification
   * @return secondIdentification
  */
  @ApiModelProperty(value = "")


  public String getSecondIdentification() {
    return secondIdentification;
  }

  public void setSecondIdentification(String secondIdentification) {
    this.secondIdentification = secondIdentification;
  }

  public CompanyIdentificationTypeI2785C sourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

  /**
   * Get sourceCode
   * @return sourceCode
  */
  @ApiModelProperty(value = "")


  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIdentificationTypeI2785C companyIdentificationTypeI2785C = (CompanyIdentificationTypeI2785C) o;
    return Objects.equals(this.identification, companyIdentificationTypeI2785C.identification) &&
        Objects.equals(this.secondIdentification, companyIdentificationTypeI2785C.secondIdentification) &&
        Objects.equals(this.sourceCode, companyIdentificationTypeI2785C.sourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, secondIdentification, sourceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIdentificationTypeI2785C {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    secondIdentification: ").append(toIndentedString(secondIdentification)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
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

