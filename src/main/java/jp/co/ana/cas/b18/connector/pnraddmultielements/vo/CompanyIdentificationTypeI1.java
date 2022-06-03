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
 * CompanyIdentificationTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CompanyIdentificationTypeI1   {
  @JsonProperty("identification")
  private String identification;

  @JsonProperty("secondIdentification")
  private String secondIdentification;

  public CompanyIdentificationTypeI1 identification(String identification) {
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

  public CompanyIdentificationTypeI1 secondIdentification(String secondIdentification) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIdentificationTypeI1 companyIdentificationTypeI1 = (CompanyIdentificationTypeI1) o;
    return Objects.equals(this.identification, companyIdentificationTypeI1.identification) &&
        Objects.equals(this.secondIdentification, companyIdentificationTypeI1.secondIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, secondIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIdentificationTypeI1 {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    secondIdentification: ").append(toIndentedString(secondIdentification)).append("\n");
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

