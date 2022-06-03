package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.Session;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransactionFlowLinkType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRReplyHeaderDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRReplyHeaderDto   {
  @JsonProperty("session")
  private Session session;

  @JsonProperty("transactionFlowLinkType")
  private TransactionFlowLinkType transactionFlowLinkType;

  public PNRReplyHeaderDto session(Session session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
  */
  @ApiModelProperty(value = "")

  @Valid

  public Session getSession() {
    return session;
  }

  public void setSession(Session session) {
    this.session = session;
  }

  public PNRReplyHeaderDto transactionFlowLinkType(TransactionFlowLinkType transactionFlowLinkType) {
    this.transactionFlowLinkType = transactionFlowLinkType;
    return this;
  }

  /**
   * Get transactionFlowLinkType
   * @return transactionFlowLinkType
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFlowLinkType getTransactionFlowLinkType() {
    return transactionFlowLinkType;
  }

  public void setTransactionFlowLinkType(TransactionFlowLinkType transactionFlowLinkType) {
    this.transactionFlowLinkType = transactionFlowLinkType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRReplyHeaderDto pnRReplyHeaderDto = (PNRReplyHeaderDto) o;
    return Objects.equals(this.session, pnRReplyHeaderDto.session) &&
        Objects.equals(this.transactionFlowLinkType, pnRReplyHeaderDto.transactionFlowLinkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session, transactionFlowLinkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRReplyHeaderDto {\n");
    
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    transactionFlowLinkType: ").append(toIndentedString(transactionFlowLinkType)).append("\n");
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

