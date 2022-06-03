package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType127282S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType94497S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DetailedPaymentDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MeanOfPaymentDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentDataGroupType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentGroupType   {
  @JsonProperty("dummy")
  private Object dummy;

  @JsonProperty("groupUsage")
  private CodedAttributeType127282S groupUsage;

  @JsonProperty("mopDetailedData")
  private DetailedPaymentDataType mopDetailedData;

  @JsonProperty("mopInformation")
  private MeanOfPaymentDataType mopInformation;

  @JsonProperty("paymentData")
  private PaymentDataGroupType paymentData;

  @JsonProperty("paymentSupplementaryData")
  @Valid
  private List<CodedAttributeType94497S> paymentSupplementaryData = null;

  public PaymentGroupType dummy(Object dummy) {
    this.dummy = dummy;
    return this;
  }

  /**
   * Get dummy
   * @return dummy
  */
  @ApiModelProperty(value = "")


  public Object getDummy() {
    return dummy;
  }

  public void setDummy(Object dummy) {
    this.dummy = dummy;
  }

  public PaymentGroupType groupUsage(CodedAttributeType127282S groupUsage) {
    this.groupUsage = groupUsage;
    return this;
  }

  /**
   * Get groupUsage
   * @return groupUsage
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeType127282S getGroupUsage() {
    return groupUsage;
  }

  public void setGroupUsage(CodedAttributeType127282S groupUsage) {
    this.groupUsage = groupUsage;
  }

  public PaymentGroupType mopDetailedData(DetailedPaymentDataType mopDetailedData) {
    this.mopDetailedData = mopDetailedData;
    return this;
  }

  /**
   * Get mopDetailedData
   * @return mopDetailedData
  */
  @ApiModelProperty(value = "")

  @Valid

  public DetailedPaymentDataType getMopDetailedData() {
    return mopDetailedData;
  }

  public void setMopDetailedData(DetailedPaymentDataType mopDetailedData) {
    this.mopDetailedData = mopDetailedData;
  }

  public PaymentGroupType mopInformation(MeanOfPaymentDataType mopInformation) {
    this.mopInformation = mopInformation;
    return this;
  }

  /**
   * Get mopInformation
   * @return mopInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public MeanOfPaymentDataType getMopInformation() {
    return mopInformation;
  }

  public void setMopInformation(MeanOfPaymentDataType mopInformation) {
    this.mopInformation = mopInformation;
  }

  public PaymentGroupType paymentData(PaymentDataGroupType paymentData) {
    this.paymentData = paymentData;
    return this;
  }

  /**
   * Get paymentData
   * @return paymentData
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentDataGroupType getPaymentData() {
    return paymentData;
  }

  public void setPaymentData(PaymentDataGroupType paymentData) {
    this.paymentData = paymentData;
  }

  public PaymentGroupType paymentSupplementaryData(List<CodedAttributeType94497S> paymentSupplementaryData) {
    this.paymentSupplementaryData = paymentSupplementaryData;
    return this;
  }

  public PaymentGroupType addPaymentSupplementaryDataItem(CodedAttributeType94497S paymentSupplementaryDataItem) {
    if (this.paymentSupplementaryData == null) {
      this.paymentSupplementaryData = new ArrayList<>();
    }
    this.paymentSupplementaryData.add(paymentSupplementaryDataItem);
    return this;
  }

  /**
   * Get paymentSupplementaryData
   * @return paymentSupplementaryData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CodedAttributeType94497S> getPaymentSupplementaryData() {
    return paymentSupplementaryData;
  }

  public void setPaymentSupplementaryData(List<CodedAttributeType94497S> paymentSupplementaryData) {
    this.paymentSupplementaryData = paymentSupplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentGroupType paymentGroupType = (PaymentGroupType) o;
    return Objects.equals(this.dummy, paymentGroupType.dummy) &&
        Objects.equals(this.groupUsage, paymentGroupType.groupUsage) &&
        Objects.equals(this.mopDetailedData, paymentGroupType.mopDetailedData) &&
        Objects.equals(this.mopInformation, paymentGroupType.mopInformation) &&
        Objects.equals(this.paymentData, paymentGroupType.paymentData) &&
        Objects.equals(this.paymentSupplementaryData, paymentGroupType.paymentSupplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dummy, groupUsage, mopDetailedData, mopInformation, paymentData, paymentSupplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGroupType {\n");
    
    sb.append("    dummy: ").append(toIndentedString(dummy)).append("\n");
    sb.append("    groupUsage: ").append(toIndentedString(groupUsage)).append("\n");
    sb.append("    mopDetailedData: ").append(toIndentedString(mopDetailedData)).append("\n");
    sb.append("    mopInformation: ").append(toIndentedString(mopInformation)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentSupplementaryData: ").append(toIndentedString(paymentSupplementaryData)).append("\n");
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

