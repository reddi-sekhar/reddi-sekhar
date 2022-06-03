package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationDetailsTypeI8308C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxFieldsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareDataType   {
  @JsonProperty("issueIdentifier")
  private String issueIdentifier;

  @JsonProperty("monetaryInfo")
  @Valid
  private List<MonetaryInformationDetailsTypeI8308C> monetaryInfo = null;

  @JsonProperty("taxFields")
  @Valid
  private List<TaxFieldsType> taxFields = null;

  public FareDataType issueIdentifier(String issueIdentifier) {
    this.issueIdentifier = issueIdentifier;
    return this;
  }

  /**
   * Get issueIdentifier
   * @return issueIdentifier
  */
  @ApiModelProperty(value = "")


  public String getIssueIdentifier() {
    return issueIdentifier;
  }

  public void setIssueIdentifier(String issueIdentifier) {
    this.issueIdentifier = issueIdentifier;
  }

  public FareDataType monetaryInfo(List<MonetaryInformationDetailsTypeI8308C> monetaryInfo) {
    this.monetaryInfo = monetaryInfo;
    return this;
  }

  public FareDataType addMonetaryInfoItem(MonetaryInformationDetailsTypeI8308C monetaryInfoItem) {
    if (this.monetaryInfo == null) {
      this.monetaryInfo = new ArrayList<>();
    }
    this.monetaryInfo.add(monetaryInfoItem);
    return this;
  }

  /**
   * Get monetaryInfo
   * @return monetaryInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryInformationDetailsTypeI8308C> getMonetaryInfo() {
    return monetaryInfo;
  }

  public void setMonetaryInfo(List<MonetaryInformationDetailsTypeI8308C> monetaryInfo) {
    this.monetaryInfo = monetaryInfo;
  }

  public FareDataType taxFields(List<TaxFieldsType> taxFields) {
    this.taxFields = taxFields;
    return this;
  }

  public FareDataType addTaxFieldsItem(TaxFieldsType taxFieldsItem) {
    if (this.taxFields == null) {
      this.taxFields = new ArrayList<>();
    }
    this.taxFields.add(taxFieldsItem);
    return this;
  }

  /**
   * Get taxFields
   * @return taxFields
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxFieldsType> getTaxFields() {
    return taxFields;
  }

  public void setTaxFields(List<TaxFieldsType> taxFields) {
    this.taxFields = taxFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareDataType fareDataType = (FareDataType) o;
    return Objects.equals(this.issueIdentifier, fareDataType.issueIdentifier) &&
        Objects.equals(this.monetaryInfo, fareDataType.monetaryInfo) &&
        Objects.equals(this.taxFields, fareDataType.taxFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIdentifier, monetaryInfo, taxFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareDataType {\n");
    
    sb.append("    issueIdentifier: ").append(toIndentedString(issueIdentifier)).append("\n");
    sb.append("    monetaryInfo: ").append(toIndentedString(monetaryInfo)).append("\n");
    sb.append("    taxFields: ").append(toIndentedString(taxFields)).append("\n");
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

