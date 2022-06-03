package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.LongTextString;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.MessageActionDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandCrypticReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCrypticReply   {
  @JsonProperty("longTextString")
  private LongTextString longTextString;

  @JsonProperty("messageActionDetails")
  private MessageActionDetails messageActionDetails;

  public CommandCrypticReply longTextString(LongTextString longTextString) {
    this.longTextString = longTextString;
    return this;
  }

  /**
   * Get longTextString
   * @return longTextString
  */
  @ApiModelProperty(value = "")

  @Valid

  public LongTextString getLongTextString() {
    return longTextString;
  }

  public void setLongTextString(LongTextString longTextString) {
    this.longTextString = longTextString;
  }

  public CommandCrypticReply messageActionDetails(MessageActionDetails messageActionDetails) {
    this.messageActionDetails = messageActionDetails;
    return this;
  }

  /**
   * Get messageActionDetails
   * @return messageActionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageActionDetails getMessageActionDetails() {
    return messageActionDetails;
  }

  public void setMessageActionDetails(MessageActionDetails messageActionDetails) {
    this.messageActionDetails = messageActionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandCrypticReply commandCrypticReply = (CommandCrypticReply) o;
    return Objects.equals(this.longTextString, commandCrypticReply.longTextString) &&
        Objects.equals(this.messageActionDetails, commandCrypticReply.messageActionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longTextString, messageActionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticReply {\n");
    
    sb.append("    longTextString: ").append(toIndentedString(longTextString)).append("\n");
    sb.append("    messageActionDetails: ").append(toIndentedString(messageActionDetails)).append("\n");
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

