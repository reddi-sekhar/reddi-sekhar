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
 * FreetextDetail1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FreetextDetail1RequestDto   {
  @JsonProperty("subjectQualifier")
  private String subjectQualifier;

  @JsonProperty("type")
  private String type;

  public FreetextDetail1RequestDto subjectQualifier(String subjectQualifier) {
    this.subjectQualifier = subjectQualifier;
    return this;
  }

  /**
   * Identifies whether the free text is coded or not
   * @return subjectQualifier
  */
  @ApiModelProperty(required = true, value = "Identifies whether the free text is coded or not")
  @NotNull

@Size(min=1,max=3) 
  public String getSubjectQualifier() {
    return subjectQualifier;
  }

  public void setSubjectQualifier(String subjectQualifier) {
    this.subjectQualifier = subjectQualifier;
  }

  public FreetextDetail1RequestDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Free text type
   * @return type
  */
  @ApiModelProperty(value = "Free text type")

@Size(min=1,max=4) 
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
    FreetextDetail1RequestDto freetextDetail1RequestDto = (FreetextDetail1RequestDto) o;
    return Objects.equals(this.subjectQualifier, freetextDetail1RequestDto.subjectQualifier) &&
        Objects.equals(this.type, freetextDetail1RequestDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectQualifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreetextDetail1RequestDto {\n");
    
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

