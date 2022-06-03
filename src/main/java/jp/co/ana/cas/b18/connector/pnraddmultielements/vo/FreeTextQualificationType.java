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
 * FreeTextQualificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FreeTextQualificationType   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("status")
  private String status;

  @JsonProperty("subjectQualifier")
  private String subjectQualifier;

  @JsonProperty("type")
  private String type;

  public FreeTextQualificationType companyId(String companyId) {
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

  public FreeTextQualificationType status(String status) {
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

  public FreeTextQualificationType subjectQualifier(String subjectQualifier) {
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

  public FreeTextQualificationType type(String type) {
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
    FreeTextQualificationType freeTextQualificationType = (FreeTextQualificationType) o;
    return Objects.equals(this.companyId, freeTextQualificationType.companyId) &&
        Objects.equals(this.status, freeTextQualificationType.status) &&
        Objects.equals(this.subjectQualifier, freeTextQualificationType.subjectQualifier) &&
        Objects.equals(this.type, freeTextQualificationType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, status, subjectQualifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextQualificationType {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

