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
 * InternalIDDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InternalIDDetailsType   {
  @JsonProperty("inhouseId")
  private String inhouseId;

  @JsonProperty("type")
  private String type;

  public InternalIDDetailsType inhouseId(String inhouseId) {
    this.inhouseId = inhouseId;
    return this;
  }

  /**
   * Get inhouseId
   * @return inhouseId
  */
  @ApiModelProperty(value = "")


  public String getInhouseId() {
    return inhouseId;
  }

  public void setInhouseId(String inhouseId) {
    this.inhouseId = inhouseId;
  }

  public InternalIDDetailsType type(String type) {
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
    InternalIDDetailsType internalIDDetailsType = (InternalIDDetailsType) o;
    return Objects.equals(this.inhouseId, internalIDDetailsType.inhouseId) &&
        Objects.equals(this.type, internalIDDetailsType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inhouseId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalIDDetailsType {\n");
    
    sb.append("    inhouseId: ").append(toIndentedString(inhouseId)).append("\n");
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

