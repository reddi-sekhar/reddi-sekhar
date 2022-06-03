package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MessageReferenceType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ResponseIdentificationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificVisaLinkCreditCardInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecificVisaLinkCreditCardInformationType   {
  @JsonProperty("msgRef")
  private MessageReferenceType msgRef;

  @JsonProperty("respIdentification")
  private ResponseIdentificationType respIdentification;

  public SpecificVisaLinkCreditCardInformationType msgRef(MessageReferenceType msgRef) {
    this.msgRef = msgRef;
    return this;
  }

  /**
   * Get msgRef
   * @return msgRef
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageReferenceType getMsgRef() {
    return msgRef;
  }

  public void setMsgRef(MessageReferenceType msgRef) {
    this.msgRef = msgRef;
  }

  public SpecificVisaLinkCreditCardInformationType respIdentification(ResponseIdentificationType respIdentification) {
    this.respIdentification = respIdentification;
    return this;
  }

  /**
   * Get respIdentification
   * @return respIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponseIdentificationType getRespIdentification() {
    return respIdentification;
  }

  public void setRespIdentification(ResponseIdentificationType respIdentification) {
    this.respIdentification = respIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificVisaLinkCreditCardInformationType specificVisaLinkCreditCardInformationType = (SpecificVisaLinkCreditCardInformationType) o;
    return Objects.equals(this.msgRef, specificVisaLinkCreditCardInformationType.msgRef) &&
        Objects.equals(this.respIdentification, specificVisaLinkCreditCardInformationType.respIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgRef, respIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificVisaLinkCreditCardInformationType {\n");
    
    sb.append("    msgRef: ").append(toIndentedString(msgRef)).append("\n");
    sb.append("    respIdentification: ").append(toIndentedString(respIdentification)).append("\n");
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

