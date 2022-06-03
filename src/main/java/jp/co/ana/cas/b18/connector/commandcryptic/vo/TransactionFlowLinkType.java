package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.ConsumerType;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.ReceiverType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionFlowLinkType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class TransactionFlowLinkType   {
  @JsonProperty("consumer")
  private ConsumerType consumer;

  @JsonProperty("receiver")
  private ReceiverType receiver;

  public TransactionFlowLinkType consumer(ConsumerType consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Get consumer
   * @return consumer
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConsumerType getConsumer() {
    return consumer;
  }

  public void setConsumer(ConsumerType consumer) {
    this.consumer = consumer;
  }

  public TransactionFlowLinkType receiver(ReceiverType receiver) {
    this.receiver = receiver;
    return this;
  }

  /**
   * Get receiver
   * @return receiver
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReceiverType getReceiver() {
    return receiver;
  }

  public void setReceiver(ReceiverType receiver) {
    this.receiver = receiver;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFlowLinkType transactionFlowLinkType = (TransactionFlowLinkType) o;
    return Objects.equals(this.consumer, transactionFlowLinkType.consumer) &&
        Objects.equals(this.receiver, transactionFlowLinkType.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumer, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFlowLinkType {\n");
    
    sb.append("    consumer: ").append(toIndentedString(consumer)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
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

