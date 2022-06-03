package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageReferenceType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MessageReferenceType   {
  @JsonProperty("authorCharacteristicIndicator")
  private String authorCharacteristicIndicator;

  @JsonProperty("authorResponseCode")
  private String authorResponseCode;

  @JsonProperty("cardLevelResult")
  private String cardLevelResult;

  @JsonProperty("retrievalReferenceNumber")
  private String retrievalReferenceNumber;

  @JsonProperty("terminalType")
  private String terminalType;

  public MessageReferenceType authorCharacteristicIndicator(String authorCharacteristicIndicator) {
    this.authorCharacteristicIndicator = authorCharacteristicIndicator;
    return this;
  }

  /**
   * Get authorCharacteristicIndicator
   * @return authorCharacteristicIndicator
  */
  @ApiModelProperty(value = "")


  public String getAuthorCharacteristicIndicator() {
    return authorCharacteristicIndicator;
  }

  public void setAuthorCharacteristicIndicator(String authorCharacteristicIndicator) {
    this.authorCharacteristicIndicator = authorCharacteristicIndicator;
  }

  public MessageReferenceType authorResponseCode(String authorResponseCode) {
    this.authorResponseCode = authorResponseCode;
    return this;
  }

  /**
   * Get authorResponseCode
   * @return authorResponseCode
  */
  @ApiModelProperty(value = "")


  public String getAuthorResponseCode() {
    return authorResponseCode;
  }

  public void setAuthorResponseCode(String authorResponseCode) {
    this.authorResponseCode = authorResponseCode;
  }

  public MessageReferenceType cardLevelResult(String cardLevelResult) {
    this.cardLevelResult = cardLevelResult;
    return this;
  }

  /**
   * Get cardLevelResult
   * @return cardLevelResult
  */
  @ApiModelProperty(value = "")


  public String getCardLevelResult() {
    return cardLevelResult;
  }

  public void setCardLevelResult(String cardLevelResult) {
    this.cardLevelResult = cardLevelResult;
  }

  public MessageReferenceType retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

  /**
   * Get retrievalReferenceNumber
   * @return retrievalReferenceNumber
  */
  @ApiModelProperty(value = "")


  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  public MessageReferenceType terminalType(String terminalType) {
    this.terminalType = terminalType;
    return this;
  }

  /**
   * Get terminalType
   * @return terminalType
  */
  @ApiModelProperty(value = "")


  public String getTerminalType() {
    return terminalType;
  }

  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageReferenceType messageReferenceType = (MessageReferenceType) o;
    return Objects.equals(this.authorCharacteristicIndicator, messageReferenceType.authorCharacteristicIndicator) &&
        Objects.equals(this.authorResponseCode, messageReferenceType.authorResponseCode) &&
        Objects.equals(this.cardLevelResult, messageReferenceType.cardLevelResult) &&
        Objects.equals(this.retrievalReferenceNumber, messageReferenceType.retrievalReferenceNumber) &&
        Objects.equals(this.terminalType, messageReferenceType.terminalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorCharacteristicIndicator, authorResponseCode, cardLevelResult, retrievalReferenceNumber, terminalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageReferenceType {\n");
    
    sb.append("    authorCharacteristicIndicator: ").append(toIndentedString(authorCharacteristicIndicator)).append("\n");
    sb.append("    authorResponseCode: ").append(toIndentedString(authorResponseCode)).append("\n");
    sb.append("    cardLevelResult: ").append(toIndentedString(cardLevelResult)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
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

