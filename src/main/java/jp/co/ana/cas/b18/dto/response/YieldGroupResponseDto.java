package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.YieldDataGroupResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * YieldGroupResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class YieldGroupResponseDto   {
  @JsonProperty("yieldDataGroup")
  private YieldDataGroupResponseDto yieldDataGroup;

  public YieldGroupResponseDto yieldDataGroup(YieldDataGroupResponseDto yieldDataGroup) {
    this.yieldDataGroup = yieldDataGroup;
    return this;
  }

  /**
   * Get yieldDataGroup
   * @return yieldDataGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public YieldDataGroupResponseDto getYieldDataGroup() {
    return yieldDataGroup;
  }

  public void setYieldDataGroup(YieldDataGroupResponseDto yieldDataGroup) {
    this.yieldDataGroup = yieldDataGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YieldGroupResponseDto yieldGroupResponseDto = (YieldGroupResponseDto) o;
    return Objects.equals(this.yieldDataGroup, yieldGroupResponseDto.yieldDataGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yieldDataGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YieldGroupResponseDto {\n");
    
    sb.append("    yieldDataGroup: ").append(toIndentedString(yieldDataGroup)).append("\n");
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

