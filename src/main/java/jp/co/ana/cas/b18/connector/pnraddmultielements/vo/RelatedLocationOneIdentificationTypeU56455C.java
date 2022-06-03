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
 * RelatedLocationOneIdentificationTypeU56455C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RelatedLocationOneIdentificationTypeU56455C   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("qualifier")
  private String qualifier;

  public RelatedLocationOneIdentificationTypeU56455C code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RelatedLocationOneIdentificationTypeU56455C qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedLocationOneIdentificationTypeU56455C relatedLocationOneIdentificationTypeU56455C = (RelatedLocationOneIdentificationTypeU56455C) o;
    return Objects.equals(this.code, relatedLocationOneIdentificationTypeU56455C.code) &&
        Objects.equals(this.qualifier, relatedLocationOneIdentificationTypeU56455C.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedLocationOneIdentificationTypeU56455C {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

