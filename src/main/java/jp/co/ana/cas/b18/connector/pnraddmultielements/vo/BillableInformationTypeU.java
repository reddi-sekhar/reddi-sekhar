package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiagnosisTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BillableInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class BillableInformationTypeU   {
  @JsonProperty("billingInfo")
  @Valid
  private List<DiagnosisTypeU> billingInfo = null;

  public BillableInformationTypeU billingInfo(List<DiagnosisTypeU> billingInfo) {
    this.billingInfo = billingInfo;
    return this;
  }

  public BillableInformationTypeU addBillingInfoItem(DiagnosisTypeU billingInfoItem) {
    if (this.billingInfo == null) {
      this.billingInfo = new ArrayList<>();
    }
    this.billingInfo.add(billingInfoItem);
    return this;
  }

  /**
   * Get billingInfo
   * @return billingInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DiagnosisTypeU> getBillingInfo() {
    return billingInfo;
  }

  public void setBillingInfo(List<DiagnosisTypeU> billingInfo) {
    this.billingInfo = billingInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableInformationTypeU billableInformationTypeU = (BillableInformationTypeU) o;
    return Objects.equals(this.billingInfo, billableInformationTypeU.billingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableInformationTypeU {\n");
    
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
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

