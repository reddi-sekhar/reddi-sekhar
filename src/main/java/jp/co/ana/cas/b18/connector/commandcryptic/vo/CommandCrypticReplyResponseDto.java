package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReplyBodyDto;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReplyHeaderDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandCrypticReplyResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCrypticReplyResponseDto   {
  @JsonProperty("soapBody")
  private CommandCrypticReplyBodyDto soapBody;

  @JsonProperty("soapHeader")
  private CommandCrypticReplyHeaderDto soapHeader;

  public CommandCrypticReplyResponseDto soapBody(CommandCrypticReplyBodyDto soapBody) {
    this.soapBody = soapBody;
    return this;
  }

  /**
   * Get soapBody
   * @return soapBody
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticReplyBodyDto getSoapBody() {
    return soapBody;
  }

  public void setSoapBody(CommandCrypticReplyBodyDto soapBody) {
    this.soapBody = soapBody;
  }

  public CommandCrypticReplyResponseDto soapHeader(CommandCrypticReplyHeaderDto soapHeader) {
    this.soapHeader = soapHeader;
    return this;
  }

  /**
   * Get soapHeader
   * @return soapHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticReplyHeaderDto getSoapHeader() {
    return soapHeader;
  }

  public void setSoapHeader(CommandCrypticReplyHeaderDto soapHeader) {
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
    CommandCrypticReplyResponseDto commandCrypticReplyResponseDto = (CommandCrypticReplyResponseDto) o;
    return Objects.equals(this.soapBody, commandCrypticReplyResponseDto.soapBody) &&
        Objects.equals(this.soapHeader, commandCrypticReplyResponseDto.soapHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soapBody, soapHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticReplyResponseDto {\n");
    
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

