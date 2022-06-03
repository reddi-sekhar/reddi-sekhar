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
 * ExtendedSecurityDetailsType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ExtendedSecurityDetailsType1   {
  @JsonProperty("accessMode")
  private String accessMode;

  @JsonProperty("inhouseIdentification")
  private String inhouseIdentification;

  @JsonProperty("typeOfEntity")
  private String typeOfEntity;

  public ExtendedSecurityDetailsType1 accessMode(String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * Get accessMode
   * @return accessMode
  */
  @ApiModelProperty(value = "")


  public String getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }

  public ExtendedSecurityDetailsType1 inhouseIdentification(String inhouseIdentification) {
    this.inhouseIdentification = inhouseIdentification;
    return this;
  }

  /**
   * Get inhouseIdentification
   * @return inhouseIdentification
  */
  @ApiModelProperty(value = "")


  public String getInhouseIdentification() {
    return inhouseIdentification;
  }

  public void setInhouseIdentification(String inhouseIdentification) {
    this.inhouseIdentification = inhouseIdentification;
  }

  public ExtendedSecurityDetailsType1 typeOfEntity(String typeOfEntity) {
    this.typeOfEntity = typeOfEntity;
    return this;
  }

  /**
   * Get typeOfEntity
   * @return typeOfEntity
  */
  @ApiModelProperty(value = "")


  public String getTypeOfEntity() {
    return typeOfEntity;
  }

  public void setTypeOfEntity(String typeOfEntity) {
    this.typeOfEntity = typeOfEntity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedSecurityDetailsType1 extendedSecurityDetailsType1 = (ExtendedSecurityDetailsType1) o;
    return Objects.equals(this.accessMode, extendedSecurityDetailsType1.accessMode) &&
        Objects.equals(this.inhouseIdentification, extendedSecurityDetailsType1.inhouseIdentification) &&
        Objects.equals(this.typeOfEntity, extendedSecurityDetailsType1.typeOfEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, inhouseIdentification, typeOfEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedSecurityDetailsType1 {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    inhouseIdentification: ").append(toIndentedString(inhouseIdentification)).append("\n");
    sb.append("    typeOfEntity: ").append(toIndentedString(typeOfEntity)).append("\n");
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

