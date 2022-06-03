package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.PaxTypeResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DcsSegmentInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DcsSegmentInfoResponseDto   {
  @JsonProperty("paxType")
  private PaxTypeResponseDto paxType;

  public DcsSegmentInfoResponseDto paxType(PaxTypeResponseDto paxType) {
    this.paxType = paxType;
    return this;
  }

  /**
   * Get paxType
   * @return paxType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaxTypeResponseDto getPaxType() {
    return paxType;
  }

  public void setPaxType(PaxTypeResponseDto paxType) {
    this.paxType = paxType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcsSegmentInfoResponseDto dcsSegmentInfoResponseDto = (DcsSegmentInfoResponseDto) o;
    return Objects.equals(this.paxType, dcsSegmentInfoResponseDto.paxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcsSegmentInfoResponseDto {\n");
    
    sb.append("    paxType: ").append(toIndentedString(paxType)).append("\n");
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

