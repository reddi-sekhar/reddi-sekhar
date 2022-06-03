package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType127279S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InteractiveFreeTextTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccregReason
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccregReason   {
  @JsonProperty("deliveryInformation")
  private InteractiveFreeTextTypeI deliveryInformation;

  @JsonProperty("reasons")
  private CodedAttributeType127279S reasons;

  public AccregReason deliveryInformation(InteractiveFreeTextTypeI deliveryInformation) {
    this.deliveryInformation = deliveryInformation;
    return this;
  }

  /**
   * Get deliveryInformation
   * @return deliveryInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InteractiveFreeTextTypeI getDeliveryInformation() {
    return deliveryInformation;
  }

  public void setDeliveryInformation(InteractiveFreeTextTypeI deliveryInformation) {
    this.deliveryInformation = deliveryInformation;
  }

  public AccregReason reasons(CodedAttributeType127279S reasons) {
    this.reasons = reasons;
    return this;
  }

  /**
   * Get reasons
   * @return reasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeType127279S getReasons() {
    return reasons;
  }

  public void setReasons(CodedAttributeType127279S reasons) {
    this.reasons = reasons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccregReason accregReason = (AccregReason) o;
    return Objects.equals(this.deliveryInformation, accregReason.deliveryInformation) &&
        Objects.equals(this.reasons, accregReason.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryInformation, reasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccregReason {\n");
    
    sb.append("    deliveryInformation: ").append(toIndentedString(deliveryInformation)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

