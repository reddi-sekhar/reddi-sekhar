package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsBodyDto;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElementsHeaderDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRAddMultiElementsRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRAddMultiElementsRequestDto   {
  @JsonProperty("soapBody")
  private PNRAddMultiElementsBodyDto soapBody;

  @JsonProperty("soapHeader")
  private PNRAddMultiElementsHeaderDto soapHeader;

  public PNRAddMultiElementsRequestDto soapBody(PNRAddMultiElementsBodyDto soapBody) {
    this.soapBody = soapBody;
    return this;
  }

  /**
   * Get soapBody
   * @return soapBody
  */
  @ApiModelProperty(value = "")

  @Valid

  public PNRAddMultiElementsBodyDto getSoapBody() {
    return soapBody;
  }

  public void setSoapBody(PNRAddMultiElementsBodyDto soapBody) {
    this.soapBody = soapBody;
  }

  public PNRAddMultiElementsRequestDto soapHeader(PNRAddMultiElementsHeaderDto soapHeader) {
    this.soapHeader = soapHeader;
    return this;
  }

  /**
   * Get soapHeader
   * @return soapHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public PNRAddMultiElementsHeaderDto getSoapHeader() {
    return soapHeader;
  }

  public void setSoapHeader(PNRAddMultiElementsHeaderDto soapHeader) {
    this.soapHeader = soapHeader;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRAddMultiElementsRequestDto pnRAddMultiElementsRequestDto = (PNRAddMultiElementsRequestDto) o;
    return Objects.equals(this.soapBody, pnRAddMultiElementsRequestDto.soapBody) &&
        Objects.equals(this.soapHeader, pnRAddMultiElementsRequestDto.soapHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soapBody, soapHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRAddMultiElementsRequestDto {\n");
    
    sb.append("    soapBody: ").append(toIndentedString(soapBody)).append("\n");
    sb.append("    soapHeader: ").append(toIndentedString(soapHeader)).append("\n");
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

