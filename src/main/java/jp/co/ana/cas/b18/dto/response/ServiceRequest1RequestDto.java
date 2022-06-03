package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.SsrDetails1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceRequest1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ServiceRequest1RequestDto   {
  @JsonProperty("ssr")
  private SsrDetails1RequestDto ssr;

  public ServiceRequest1RequestDto ssr(SsrDetails1RequestDto ssr) {
    this.ssr = ssr;
    return this;
  }

  /**
   * Get ssr
   * @return ssr
  */
  @ApiModelProperty(value = "")

  @Valid

  public SsrDetails1RequestDto getSsr() {
    return ssr;
  }

  public void setSsr(SsrDetails1RequestDto ssr) {
    this.ssr = ssr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRequest1RequestDto serviceRequest1RequestDto = (ServiceRequest1RequestDto) o;
    return Objects.equals(this.ssr, serviceRequest1RequestDto.ssr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequest1RequestDto {\n");
    
    sb.append("    ssr: ").append(toIndentedString(ssr)).append("\n");
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

