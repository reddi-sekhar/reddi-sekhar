package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SignOutProcessResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SignOutProcessResponseDto {
	@JsonProperty("pnrReply")
	private PnrReplyResponseDto pnrReply;

	public SignOutProcessResponseDto pnrReply(PnrReplyResponseDto pnrReply) {
		this.pnrReply = pnrReply;
		return this;
	}

	/**
	 * Get pnrReply
	 * 
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

	@ApiModelProperty(value = "")

	@Valid

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SignOutProcessResponseDto signOutProcessResponseDto = (SignOutProcessResponseDto) o;
		return Objects.equals(this.pnrReply, signOutProcessResponseDto.pnrReply);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SignOutProcessResponseDto {\n");

		sb.append("    pnrReply: ").append(toIndentedString(pnrReply)).append("\n");
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
