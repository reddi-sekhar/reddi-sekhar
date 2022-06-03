package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.IntelligentWorkstationInfo;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.LongTextString1;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.MessageAction;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.NumberOfUnits;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandCryptic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCryptic   {
  @JsonProperty("intelligentWorkstationInfo")
  private IntelligentWorkstationInfo intelligentWorkstationInfo;

  @JsonProperty("longTextString")
  private LongTextString1 longTextString;

  @JsonProperty("messageAction")
  private MessageAction messageAction;

  @JsonProperty("numberOfUnits")
  private NumberOfUnits numberOfUnits;

  public CommandCryptic intelligentWorkstationInfo(IntelligentWorkstationInfo intelligentWorkstationInfo) {
    this.intelligentWorkstationInfo = intelligentWorkstationInfo;
    return this;
  }

  /**
   * Get intelligentWorkstationInfo
   * @return intelligentWorkstationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public IntelligentWorkstationInfo getIntelligentWorkstationInfo() {
    return intelligentWorkstationInfo;
  }

  public void setIntelligentWorkstationInfo(IntelligentWorkstationInfo intelligentWorkstationInfo) {
    this.intelligentWorkstationInfo = intelligentWorkstationInfo;
  }

  public CommandCryptic longTextString(LongTextString1 longTextString) {
    this.longTextString = longTextString;
    return this;
  }

  /**
   * Get longTextString
   * @return longTextString
  */
  @ApiModelProperty(value = "")

  @Valid

  public LongTextString1 getLongTextString() {
    return longTextString;
  }

  public void setLongTextString(LongTextString1 longTextString) {
    this.longTextString = longTextString;
  }

  public CommandCryptic messageAction(MessageAction messageAction) {
    this.messageAction = messageAction;
    return this;
  }

  /**
   * Get messageAction
   * @return messageAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageAction getMessageAction() {
    return messageAction;
  }

  public void setMessageAction(MessageAction messageAction) {
    this.messageAction = messageAction;
  }

  public CommandCryptic numberOfUnits(NumberOfUnits numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Get numberOfUnits
   * @return numberOfUnits
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnits getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(NumberOfUnits numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandCryptic commandCryptic = (CommandCryptic) o;
    return Objects.equals(this.intelligentWorkstationInfo, commandCryptic.intelligentWorkstationInfo) &&
        Objects.equals(this.longTextString, commandCryptic.longTextString) &&
        Objects.equals(this.messageAction, commandCryptic.messageAction) &&
        Objects.equals(this.numberOfUnits, commandCryptic.numberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intelligentWorkstationInfo, longTextString, messageAction, numberOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCryptic {\n");
    
    sb.append("    intelligentWorkstationInfo: ").append(toIndentedString(intelligentWorkstationInfo)).append("\n");
    sb.append("    longTextString: ").append(toIndentedString(longTextString)).append("\n");
    sb.append("    messageAction: ").append(toIndentedString(messageAction)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
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

