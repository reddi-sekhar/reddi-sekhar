package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredAddressInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredAddressInformationType5063C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredAddressType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredAddressType1   {
  @JsonProperty("address")
  private StructuredAddressInformationType1 address;

  @JsonProperty("informationType")
  private String informationType;

  @JsonProperty("optionalData")
  @Valid
  private List<StructuredAddressInformationType5063C> optionalData = null;

  public StructuredAddressType1 address(StructuredAddressInformationType1 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredAddressInformationType1 getAddress() {
    return address;
  }

  public void setAddress(StructuredAddressInformationType1 address) {
    this.address = address;
  }

  public StructuredAddressType1 informationType(String informationType) {
    this.informationType = informationType;
    return this;
  }

  /**
   * Get informationType
   * @return informationType
  */
  @ApiModelProperty(value = "")


  public String getInformationType() {
    return informationType;
  }

  public void setInformationType(String informationType) {
    this.informationType = informationType;
  }

  public StructuredAddressType1 optionalData(List<StructuredAddressInformationType5063C> optionalData) {
    this.optionalData = optionalData;
    return this;
  }

  public StructuredAddressType1 addOptionalDataItem(StructuredAddressInformationType5063C optionalDataItem) {
    if (this.optionalData == null) {
      this.optionalData = new ArrayList<>();
    }
    this.optionalData.add(optionalDataItem);
    return this;
  }

  /**
   * Get optionalData
   * @return optionalData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredAddressInformationType5063C> getOptionalData() {
    return optionalData;
  }

  public void setOptionalData(List<StructuredAddressInformationType5063C> optionalData) {
    this.optionalData = optionalData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAddressType1 structuredAddressType1 = (StructuredAddressType1) o;
    return Objects.equals(this.address, structuredAddressType1.address) &&
        Objects.equals(this.informationType, structuredAddressType1.informationType) &&
        Objects.equals(this.optionalData, structuredAddressType1.optionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, informationType, optionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAddressType1 {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
    sb.append("    optionalData: ").append(toIndentedString(optionalData)).append("\n");
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

