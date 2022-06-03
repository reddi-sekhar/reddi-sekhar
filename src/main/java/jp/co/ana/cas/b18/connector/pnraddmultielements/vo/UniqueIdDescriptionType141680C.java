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
 * UniqueIdDescriptionType141680C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class UniqueIdDescriptionType141680C   {
  @JsonProperty("creationDay")
  private String creationDay;

  @JsonProperty("creationHour")
  private String creationHour;

  @JsonProperty("creationMinutes")
  private String creationMinutes;

  @JsonProperty("creationMonth")
  private String creationMonth;

  @JsonProperty("creationYear")
  private String creationYear;

  @JsonProperty("description")
  private String description;

  @JsonProperty("primeId")
  private String primeId;

  @JsonProperty("referenceQualifier")
  private String referenceQualifier;

  @JsonProperty("secondaryId")
  private String secondaryId;

  @JsonProperty("status")
  private String status;

  @JsonProperty("systemQualifier")
  private String systemQualifier;

  @JsonProperty("versionNumber")
  private String versionNumber;

  public UniqueIdDescriptionType141680C creationDay(String creationDay) {
    this.creationDay = creationDay;
    return this;
  }

  /**
   * Get creationDay
   * @return creationDay
  */
  @ApiModelProperty(value = "")


  public String getCreationDay() {
    return creationDay;
  }

  public void setCreationDay(String creationDay) {
    this.creationDay = creationDay;
  }

  public UniqueIdDescriptionType141680C creationHour(String creationHour) {
    this.creationHour = creationHour;
    return this;
  }

  /**
   * Get creationHour
   * @return creationHour
  */
  @ApiModelProperty(value = "")


  public String getCreationHour() {
    return creationHour;
  }

  public void setCreationHour(String creationHour) {
    this.creationHour = creationHour;
  }

  public UniqueIdDescriptionType141680C creationMinutes(String creationMinutes) {
    this.creationMinutes = creationMinutes;
    return this;
  }

  /**
   * Get creationMinutes
   * @return creationMinutes
  */
  @ApiModelProperty(value = "")


  public String getCreationMinutes() {
    return creationMinutes;
  }

  public void setCreationMinutes(String creationMinutes) {
    this.creationMinutes = creationMinutes;
  }

  public UniqueIdDescriptionType141680C creationMonth(String creationMonth) {
    this.creationMonth = creationMonth;
    return this;
  }

  /**
   * Get creationMonth
   * @return creationMonth
  */
  @ApiModelProperty(value = "")


  public String getCreationMonth() {
    return creationMonth;
  }

  public void setCreationMonth(String creationMonth) {
    this.creationMonth = creationMonth;
  }

  public UniqueIdDescriptionType141680C creationYear(String creationYear) {
    this.creationYear = creationYear;
    return this;
  }

  /**
   * Get creationYear
   * @return creationYear
  */
  @ApiModelProperty(value = "")


  public String getCreationYear() {
    return creationYear;
  }

  public void setCreationYear(String creationYear) {
    this.creationYear = creationYear;
  }

  public UniqueIdDescriptionType141680C description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UniqueIdDescriptionType141680C primeId(String primeId) {
    this.primeId = primeId;
    return this;
  }

  /**
   * Get primeId
   * @return primeId
  */
  @ApiModelProperty(value = "")


  public String getPrimeId() {
    return primeId;
  }

  public void setPrimeId(String primeId) {
    this.primeId = primeId;
  }

  public UniqueIdDescriptionType141680C referenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
    return this;
  }

  /**
   * Get referenceQualifier
   * @return referenceQualifier
  */
  @ApiModelProperty(value = "")


  public String getReferenceQualifier() {
    return referenceQualifier;
  }

  public void setReferenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
  }

  public UniqueIdDescriptionType141680C secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

  /**
   * Get secondaryId
   * @return secondaryId
  */
  @ApiModelProperty(value = "")


  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public UniqueIdDescriptionType141680C status(String status) {
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

  public UniqueIdDescriptionType141680C systemQualifier(String systemQualifier) {
    this.systemQualifier = systemQualifier;
    return this;
  }

  /**
   * Get systemQualifier
   * @return systemQualifier
  */
  @ApiModelProperty(value = "")


  public String getSystemQualifier() {
    return systemQualifier;
  }

  public void setSystemQualifier(String systemQualifier) {
    this.systemQualifier = systemQualifier;
  }

  public UniqueIdDescriptionType141680C versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
  */
  @ApiModelProperty(value = "")


  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueIdDescriptionType141680C uniqueIdDescriptionType141680C = (UniqueIdDescriptionType141680C) o;
    return Objects.equals(this.creationDay, uniqueIdDescriptionType141680C.creationDay) &&
        Objects.equals(this.creationHour, uniqueIdDescriptionType141680C.creationHour) &&
        Objects.equals(this.creationMinutes, uniqueIdDescriptionType141680C.creationMinutes) &&
        Objects.equals(this.creationMonth, uniqueIdDescriptionType141680C.creationMonth) &&
        Objects.equals(this.creationYear, uniqueIdDescriptionType141680C.creationYear) &&
        Objects.equals(this.description, uniqueIdDescriptionType141680C.description) &&
        Objects.equals(this.primeId, uniqueIdDescriptionType141680C.primeId) &&
        Objects.equals(this.referenceQualifier, uniqueIdDescriptionType141680C.referenceQualifier) &&
        Objects.equals(this.secondaryId, uniqueIdDescriptionType141680C.secondaryId) &&
        Objects.equals(this.status, uniqueIdDescriptionType141680C.status) &&
        Objects.equals(this.systemQualifier, uniqueIdDescriptionType141680C.systemQualifier) &&
        Objects.equals(this.versionNumber, uniqueIdDescriptionType141680C.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDay, creationHour, creationMinutes, creationMonth, creationYear, description, primeId, referenceQualifier, secondaryId, status, systemQualifier, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueIdDescriptionType141680C {\n");
    
    sb.append("    creationDay: ").append(toIndentedString(creationDay)).append("\n");
    sb.append("    creationHour: ").append(toIndentedString(creationHour)).append("\n");
    sb.append("    creationMinutes: ").append(toIndentedString(creationMinutes)).append("\n");
    sb.append("    creationMonth: ").append(toIndentedString(creationMonth)).append("\n");
    sb.append("    creationYear: ").append(toIndentedString(creationYear)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    primeId: ").append(toIndentedString(primeId)).append("\n");
    sb.append("    referenceQualifier: ").append(toIndentedString(referenceQualifier)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    systemQualifier: ").append(toIndentedString(systemQualifier)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

