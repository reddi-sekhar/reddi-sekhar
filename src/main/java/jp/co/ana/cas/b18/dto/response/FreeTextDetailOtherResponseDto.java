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
 * FreeTextDetailOtherResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FreeTextDetailOtherResponseDto   {
  @JsonProperty("subjectQualifier")
  private String subjectQualifier;

  @JsonProperty("type")
  private String type;

  @JsonProperty("status")
  private String status;

  @JsonProperty("companyId")
  private String companyId;

  public FreeTextDetailOtherResponseDto subjectQualifier(String subjectQualifier) {
    this.subjectQualifier = subjectQualifier;
    return this;
  }

  /**
   * Identifies whether the free text is coded or not coded
   * @return subjectQualifier
  */
  @ApiModelProperty(value = "Identifies whether the free text is coded or not coded")

@Size(min=1,max=3) 
  public String getSubjectQualifier() {
    return subjectQualifier;
  }

  public void setSubjectQualifier(String subjectQualifier) {
    this.subjectQualifier = subjectQualifier;
  }

  public FreeTextDetailOtherResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Information type, coded.
   * @return type
  */
  @ApiModelProperty(value = "Information type, coded.")

@Size(min=1,max=4) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FreeTextDetailOtherResponseDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Transmittable/non-transmittable indicator (S or X).
   * @return status
  */
  @ApiModelProperty(value = "Transmittable/non-transmittable indicator (S or X).")

@Size(min=1,max=3) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FreeTextDetailOtherResponseDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Airline or system code.
   * @return companyId
  */
  @ApiModelProperty(value = "Airline or system code.")

@Size(min=1,max=3) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextDetailOtherResponseDto freeTextDetailOtherResponseDto = (FreeTextDetailOtherResponseDto) o;
    return Objects.equals(this.subjectQualifier, freeTextDetailOtherResponseDto.subjectQualifier) &&
        Objects.equals(this.type, freeTextDetailOtherResponseDto.type) &&
        Objects.equals(this.status, freeTextDetailOtherResponseDto.status) &&
        Objects.equals(this.companyId, freeTextDetailOtherResponseDto.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectQualifier, type, status, companyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextDetailOtherResponseDto {\n");
    
    sb.append("    subjectQualifier: ").append(toIndentedString(subjectQualifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

