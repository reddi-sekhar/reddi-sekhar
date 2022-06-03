package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticBodyDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticHeaderDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandCrypticRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCrypticRequestDto   {
  @JsonProperty("soapBody")
  private CommandCrypticBodyDto soapBody;

  @JsonProperty("soapHeader")
  private CommandCrypticHeaderDto soapHeader;

  public CommandCrypticRequestDto soapBody(CommandCrypticBodyDto soapBody) {
    this.soapBody = soapBody;
    return this;
  }

  /**
   * Get soapBody
   * @return soapBody
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticBodyDto getSoapBody() {
    return soapBody;
  }

  public void setSoapBody(CommandCrypticBodyDto soapBody) {
    this.soapBody = soapBody;
  }

  public CommandCrypticRequestDto soapHeader(CommandCrypticHeaderDto soapHeader) {
    this.soapHeader = soapHeader;
    return this;
  }

  /**
   * Get soapHeader
   * @return soapHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticHeaderDto getSoapHeader() {
    return soapHeader;
  }

  public void setSoapHeader(CommandCrypticHeaderDto soapHeader) {
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
    CommandCrypticRequestDto commandCrypticRequestDto = (CommandCrypticRequestDto) o;
    return Objects.equals(this.soapBody, commandCrypticRequestDto.soapBody) &&
        Objects.equals(this.soapHeader, commandCrypticRequestDto.soapHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soapBody, soapHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticRequestDto {\n");
    
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

