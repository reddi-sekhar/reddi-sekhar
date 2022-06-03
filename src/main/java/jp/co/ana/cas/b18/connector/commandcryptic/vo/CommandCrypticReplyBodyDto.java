package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.CommandCrypticReply;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandCrypticReplyBodyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCrypticReplyBodyDto   {
  @JsonProperty("commandCrypticReply")
  private CommandCrypticReply commandCrypticReply;

  public CommandCrypticReplyBodyDto commandCrypticReply(CommandCrypticReply commandCrypticReply) {
    this.commandCrypticReply = commandCrypticReply;
    return this;
  }

  /**
   * Get commandCrypticReply
   * @return commandCrypticReply
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticReply getCommandCrypticReply() {
    return commandCrypticReply;
  }

  public void setCommandCrypticReply(CommandCrypticReply commandCrypticReply) {
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
    CommandCrypticReplyBodyDto commandCrypticReplyBodyDto = (CommandCrypticReplyBodyDto) o;
    return Objects.equals(this.commandCrypticReply, commandCrypticReplyBodyDto.commandCrypticReply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandCrypticReply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticReplyBodyDto {\n");
    
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

