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
 * MiscellaneousRemarkType1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class MiscellaneousRemarkType1RequestDto   {
  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("type")
  private String type;

  public MiscellaneousRemarkType1RequestDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Free text and message sequence numbers of the remarks.
   * @return freetext
  */
  @ApiModelProperty(value = "Free text and message sequence numbers of the remarks.")

@Size(min=1,max=127) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public MiscellaneousRemarkType1RequestDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Remarks Type
   * @return type
  */
  @ApiModelProperty(required = true, value = "Remarks Type")
  @NotNull

@Size(min=1,max=3) 
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
    MiscellaneousRemarkType1RequestDto miscellaneousRemarkType1RequestDto = (MiscellaneousRemarkType1RequestDto) o;
    return Objects.equals(this.freetext, miscellaneousRemarkType1RequestDto.freetext) &&
        Objects.equals(this.type, miscellaneousRemarkType1RequestDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetext, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarkType1RequestDto {\n");
    
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
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

