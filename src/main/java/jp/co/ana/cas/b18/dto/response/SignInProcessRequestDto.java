package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CommandCrypticRequestDto;
import jp.co.ana.cas.b18.dto.response.PnrAddMultiElementsRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SignInProcessRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SignInProcessRequestDto   {
  @JsonProperty("pnrAddMultiElements")
  private PnrAddMultiElementsRequestDto pnrAddMultiElements;

  @JsonProperty("commandCryptic")
  private CommandCrypticRequestDto commandCryptic;

  public SignInProcessRequestDto pnrAddMultiElements(PnrAddMultiElementsRequestDto pnrAddMultiElements) {
    this.pnrAddMultiElements = pnrAddMultiElements;
    return this;
  }

  /**
   * Get pnrAddMultiElements
   * @return pnrAddMultiElements
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrAddMultiElementsRequestDto getPnrAddMultiElements() {
    return pnrAddMultiElements;
  }

  public void setPnrAddMultiElements(PnrAddMultiElementsRequestDto pnrAddMultiElements) {
    this.pnrAddMultiElements = pnrAddMultiElements;
  }

  public SignInProcessRequestDto commandCryptic(CommandCrypticRequestDto commandCryptic) {
    this.commandCryptic = commandCryptic;
    return this;
  }

  /**
   * Get commandCryptic
   * @return commandCryptic
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommandCrypticRequestDto getCommandCryptic() {
    return commandCryptic;
  }

  public void setCommandCryptic(CommandCrypticRequestDto commandCryptic) {
    this.commandCryptic = commandCryptic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignInProcessRequestDto signInProcessRequestDto = (SignInProcessRequestDto) o;
    return Objects.equals(this.pnrAddMultiElements, signInProcessRequestDto.pnrAddMultiElements) &&
        Objects.equals(this.commandCryptic, signInProcessRequestDto.commandCryptic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrAddMultiElements, commandCryptic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignInProcessRequestDto {\n");
    
    sb.append("    pnrAddMultiElements: ").append(toIndentedString(pnrAddMultiElements)).append("\n");
    sb.append("    commandCryptic: ").append(toIndentedString(commandCryptic)).append("\n");
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

