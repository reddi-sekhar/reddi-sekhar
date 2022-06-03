package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProviderInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffcodeType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceProductDetailsType20774S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceProductDetailsType20774S   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("extensionIdentification")
  @Valid
  private List<ProviderInformationType> extensionIdentification = null;

  @JsonProperty("productDetails")
  private ProviderInformationType productDetails;

  @JsonProperty("tariffCodeDetails")
  @Valid
  private List<TariffcodeType> tariffCodeDetails = null;

  public InsuranceProductDetailsType20774S companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

  /**
   * Get companyCode
   * @return companyCode
  */
  @ApiModelProperty(value = "")


  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public InsuranceProductDetailsType20774S countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InsuranceProductDetailsType20774S extensionIdentification(List<ProviderInformationType> extensionIdentification) {
    this.extensionIdentification = extensionIdentification;
    return this;
  }

  public InsuranceProductDetailsType20774S addExtensionIdentificationItem(ProviderInformationType extensionIdentificationItem) {
    if (this.extensionIdentification == null) {
      this.extensionIdentification = new ArrayList<>();
    }
    this.extensionIdentification.add(extensionIdentificationItem);
    return this;
  }

  /**
   * Get extensionIdentification
   * @return extensionIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProviderInformationType> getExtensionIdentification() {
    return extensionIdentification;
  }

  public void setExtensionIdentification(List<ProviderInformationType> extensionIdentification) {
    this.extensionIdentification = extensionIdentification;
  }

  public InsuranceProductDetailsType20774S productDetails(ProviderInformationType productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProviderInformationType getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProviderInformationType productDetails) {
    this.productDetails = productDetails;
  }

  public InsuranceProductDetailsType20774S tariffCodeDetails(List<TariffcodeType> tariffCodeDetails) {
    this.tariffCodeDetails = tariffCodeDetails;
    return this;
  }

  public InsuranceProductDetailsType20774S addTariffCodeDetailsItem(TariffcodeType tariffCodeDetailsItem) {
    if (this.tariffCodeDetails == null) {
      this.tariffCodeDetails = new ArrayList<>();
    }
    this.tariffCodeDetails.add(tariffCodeDetailsItem);
    return this;
  }

  /**
   * Get tariffCodeDetails
   * @return tariffCodeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffcodeType> getTariffCodeDetails() {
    return tariffCodeDetails;
  }

  public void setTariffCodeDetails(List<TariffcodeType> tariffCodeDetails) {
    this.tariffCodeDetails = tariffCodeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceProductDetailsType20774S insuranceProductDetailsType20774S = (InsuranceProductDetailsType20774S) o;
    return Objects.equals(this.companyCode, insuranceProductDetailsType20774S.companyCode) &&
        Objects.equals(this.countryCode, insuranceProductDetailsType20774S.countryCode) &&
        Objects.equals(this.extensionIdentification, insuranceProductDetailsType20774S.extensionIdentification) &&
        Objects.equals(this.productDetails, insuranceProductDetailsType20774S.productDetails) &&
        Objects.equals(this.tariffCodeDetails, insuranceProductDetailsType20774S.tariffCodeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, countryCode, extensionIdentification, productDetails, tariffCodeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceProductDetailsType20774S {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    extensionIdentification: ").append(toIndentedString(extensionIdentification)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    tariffCodeDetails: ").append(toIndentedString(tariffCodeDetails)).append("\n");
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

