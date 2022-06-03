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
 * OffpointDetailResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OffpointDetailResponseDto   {
  @JsonProperty("cityCode")
  private String cityCode;

  public OffpointDetailResponseDto cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * AIR segment : off point city code
   * @return cityCode
  */
  @ApiModelProperty(example = "FRA", value = "AIR segment : off point city code")

@Size(min=1,max=5) 
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffpointDetailResponseDto offpointDetailResponseDto = (OffpointDetailResponseDto) o;
    return Objects.equals(this.cityCode, offpointDetailResponseDto.cityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffpointDetailResponseDto {\n");
    
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
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

