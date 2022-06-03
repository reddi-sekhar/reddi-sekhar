package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.IndividualSecurityResponseDto;
import jp.co.ana.cas.b18.dto.response.OptionElementInfoResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OptionElementResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OptionElementResponseDto   {
  @JsonProperty("optionElementInfo")
  private OptionElementInfoResponseDto optionElementInfo;

  @JsonProperty("individualSecurity")
  @Valid
  private List<IndividualSecurityResponseDto> individualSecurity = null;

  public OptionElementResponseDto optionElementInfo(OptionElementInfoResponseDto optionElementInfo) {
    this.optionElementInfo = optionElementInfo;
    return this;
  }

  /**
   * Get optionElementInfo
   * @return optionElementInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElementInfoResponseDto getOptionElementInfo() {
    return optionElementInfo;
  }

  public void setOptionElementInfo(OptionElementInfoResponseDto optionElementInfo) {
    this.optionElementInfo = optionElementInfo;
  }

  public OptionElementResponseDto individualSecurity(List<IndividualSecurityResponseDto> individualSecurity) {
    this.individualSecurity = individualSecurity;
    return this;
  }

  public OptionElementResponseDto addIndividualSecurityItem(IndividualSecurityResponseDto individualSecurityItem) {
    if (this.individualSecurity == null) {
      this.individualSecurity = new ArrayList<>();
    }
    this.individualSecurity.add(individualSecurityItem);
    return this;
  }

  /**
   * Get individualSecurity
   * @return individualSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<IndividualSecurityResponseDto> getIndividualSecurity() {
    return individualSecurity;
  }

  public void setIndividualSecurity(List<IndividualSecurityResponseDto> individualSecurity) {
    this.individualSecurity = individualSecurity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionElementResponseDto optionElementResponseDto = (OptionElementResponseDto) o;
    return Objects.equals(this.optionElementInfo, optionElementResponseDto.optionElementInfo) &&
        Objects.equals(this.individualSecurity, optionElementResponseDto.individualSecurity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionElementInfo, individualSecurity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElementResponseDto {\n");
    
    sb.append("    optionElementInfo: ").append(toIndentedString(optionElementInfo)).append("\n");
    sb.append("    individualSecurity: ").append(toIndentedString(individualSecurity)).append("\n");
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

