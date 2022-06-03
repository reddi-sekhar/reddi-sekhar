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
 * LocationTypeI1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class LocationTypeI1RequestDto   {
  @JsonProperty("cityCode")
  private String cityCode;

  public LocationTypeI1RequestDto cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * City Code
   * @return cityCode
  */
  @ApiModelProperty(required = true, value = "City Code")
  @NotNull

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
    LocationTypeI1RequestDto locationTypeI1RequestDto = (LocationTypeI1RequestDto) o;
    return Objects.equals(this.cityCode, locationTypeI1RequestDto.cityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationTypeI1RequestDto {\n");
    
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

