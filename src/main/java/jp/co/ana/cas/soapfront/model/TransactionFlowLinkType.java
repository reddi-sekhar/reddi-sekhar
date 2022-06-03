package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * TransactionFlowLinkType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class TransactionFlowLinkType   {
  
  /** The consumer. */
  @JsonProperty("consumer")
  private ConsumerType consumer;

  /** The receiver. */
  @JsonProperty("receiver")
  private ReceiverType receiver;

  /**
   * Consumer.
   *
   * @param consumer the consumer
   * @return the transaction flow link type
   */
  public TransactionFlowLinkType consumer(ConsumerType consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Get consumer.
   *
   * @return consumer
   */
  @ApiModelProperty(value = "")

  @Valid

  public ConsumerType getConsumer() {
    return consumer;
  }

  /**
   * Sets the consumer.
   *
   * @param consumer the new consumer
   */
  public void setConsumer(ConsumerType consumer) {
    this.consumer = consumer;
  }

  /**
   * Receiver.
   *
   * @param receiver the receiver
   * @return the transaction flow link type
   */
  public TransactionFlowLinkType receiver(ReceiverType receiver) {
    this.receiver = receiver;
    return this;
  }

  /**
   * Get receiver.
   *
   * @return receiver
   */
  @ApiModelProperty(value = "")

  @Valid

  public ReceiverType getReceiver() {
    return receiver;
  }

  /**
   * Sets the receiver.
   *
   * @param receiver the new receiver
   */
  public void setReceiver(ReceiverType receiver) {
    this.receiver = receiver;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFlowLinkType transactionFlowLinkType = (TransactionFlowLinkType) o;
    return Objects.equals(this.consumer, transactionFlowLinkType.consumer)
        && Objects.equals(this.receiver, transactionFlowLinkType.receiver);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(consumer, receiver);
  }

  /**
   * To string.
   *
   * @return the string
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

