package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRReply;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRReplyBodyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRReplyBodyDto   {
  @JsonProperty("pnrreply")
  private PNRReply pnrreply;

  public PNRReplyBodyDto pnrreply(PNRReply pnrreply) {
    this.pnrreply = pnrreply;
    return this;
  }

  /**
   * Get pnrreply
   * @return pnrreply
  */
  @ApiModelProperty(value = "")

  @Valid

  public PNRReply getPnrreply() {
    return pnrreply;
  }

  public void setPnrreply(PNRReply pnrreply) {
    this.pnrreply = pnrreply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRReplyBodyDto pnRReplyBodyDto = (PNRReplyBodyDto) o;
    return Objects.equals(this.pnrreply, pnRReplyBodyDto.pnrreply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrreply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRReplyBodyDto {\n");
    
    sb.append("    pnrreply: ").append(toIndentedString(pnrreply)).append("\n");
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

