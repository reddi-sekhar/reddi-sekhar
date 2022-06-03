package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.SsrResponseDto;
import jp.co.ana.cas.b18.dto.response.SsrbResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceRequestResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ServiceRequestResponseDto   {
  @JsonProperty("ssr")
  private SsrResponseDto ssr;

  @JsonProperty("ssrb")
  @Valid
  private List<SsrbResponseDto> ssrb = null;

  public ServiceRequestResponseDto ssr(SsrResponseDto ssr) {
    this.ssr = ssr;
    return this;
  }

  /**
   * Get ssr
   * @return ssr
  */
  @ApiModelProperty(value = "")

  @Valid

  public SsrResponseDto getSsr() {
    return ssr;
  }

  public void setSsr(SsrResponseDto ssr) {
    this.ssr = ssr;
  }

  public ServiceRequestResponseDto ssrb(List<SsrbResponseDto> ssrb) {
    this.ssrb = ssrb;
    return this;
  }

  public ServiceRequestResponseDto addSsrbItem(SsrbResponseDto ssrbItem) {
    if (this.ssrb == null) {
      this.ssrb = new ArrayList<>();
    }
    this.ssrb.add(ssrbItem);
    return this;
  }

  /**
   * Get ssrb
   * @return ssrb
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SsrbResponseDto> getSsrb() {
    return ssrb;
  }

  public void setSsrb(List<SsrbResponseDto> ssrb) {
    this.ssrb = ssrb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRequestResponseDto serviceRequestResponseDto = (ServiceRequestResponseDto) o;
    return Objects.equals(this.ssr, serviceRequestResponseDto.ssr) &&
        Objects.equals(this.ssrb, serviceRequestResponseDto.ssrb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssr, ssrb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequestResponseDto {\n");
    
    sb.append("    ssr: ").append(toIndentedString(ssr)).append("\n");
    sb.append("    ssrb: ").append(toIndentedString(ssrb)).append("\n");
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

