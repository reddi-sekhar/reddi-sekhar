package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CommandCrypticReplyResponseDto;
import jp.co.ana.cas.b18.dto.response.PnrReplyResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SignInProcessResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SignInProcessResponseDto   {
  @JsonProperty("pnrReply")
  private PnrReplyResponseDto pnrReply;

  @JsonProperty("commandCrypticReply")
  private CommandCrypticReplyResponseDto commandCrypticReply;

  public SignInProcessResponseDto pnrReply(PnrReplyResponseDto pnrReply) {
    this.pnrReply = pnrReply;
    return this;
  }

  /**
   * Get pnrReply
   * @return pnrReply
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrReplyResponseDto getPnrReply() {
    return pnrReply;
  }

  public void setPnrReply(PnrReplyResponseDto pnrReply) {
    this.pnrReply = pnrReply;
  }

  public SignInProcessResponseDto commandCrypticReply(CommandCrypticReplyResponseDto commandCrypticReply) {
    this.commandCrypticReply = commandCrypticReply;
    return this;
  }

  /**
   * Get commandCrypticReply
   * @return commandCrypticReply
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticReplyResponseDto getCommandCrypticReply() {
    return commandCrypticReply;
  }

  public void setCommandCrypticReply(CommandCrypticReplyResponseDto commandCrypticReply) {
    this.commandCrypticReply = commandCrypticReply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignInProcessResponseDto signInProcessResponseDto = (SignInProcessResponseDto) o;
    return Objects.equals(this.pnrReply, signInProcessResponseDto.pnrReply) &&
        Objects.equals(this.commandCrypticReply, signInProcessResponseDto.commandCrypticReply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrReply, commandCrypticReply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignInProcessResponseDto {\n");
    
    sb.append("    pnrReply: ").append(toIndentedString(pnrReply)).append("\n");
    sb.append("    commandCrypticReply: ").append(toIndentedString(commandCrypticReply)).append("\n");
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

