package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CommandCrypticBodyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class CommandCrypticBodyDto {
	@JsonProperty("commandCryptic")
	private CommandCryptic commandCryptic;

	public CommandCrypticBodyDto commandCryptic(CommandCryptic commandCryptic) {
		this.commandCryptic = commandCryptic;
		return this;
	}

	/**
	 * Get commandCryptic
	 * 
	 * @return commandCryptic
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CommandCryptic getCommandCryptic() {
		return commandCryptic;
	}

	public void setCommandCryptic(CommandCryptic commandCryptic) {
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
		CommandCrypticBodyDto commandCrypticBodyDto = (CommandCrypticBodyDto) o;
		return Objects.equals(this.commandCryptic, commandCrypticBodyDto.commandCryptic);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commandCryptic);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CommandCrypticBodyDto {\n");

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
