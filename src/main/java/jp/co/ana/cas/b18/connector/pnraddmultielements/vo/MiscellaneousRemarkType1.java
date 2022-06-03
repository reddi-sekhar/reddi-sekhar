package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MiscellaneousRemarkType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MiscellaneousRemarkType1   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("category")
  private String category;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("officeId")
  @Valid
  private List<String> officeId = null;

  @JsonProperty("providerType")
  private String providerType;

  @JsonProperty("type")
  private String type;

  public MiscellaneousRemarkType1 amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MiscellaneousRemarkType1 category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public MiscellaneousRemarkType1 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public MiscellaneousRemarkType1 freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public MiscellaneousRemarkType1 officeId(List<String> officeId) {
    this.officeId = officeId;
    return this;
  }

  public MiscellaneousRemarkType1 addOfficeIdItem(String officeIdItem) {
    if (this.officeId == null) {
      this.officeId = new ArrayList<>();
    }
    this.officeId.add(officeIdItem);
    return this;
  }

  /**
   * Get officeId
   * @return officeId
  */
  @ApiModelProperty(value = "")


  public List<String> getOfficeId() {
    return officeId;
  }

  public void setOfficeId(List<String> officeId) {
    this.officeId = officeId;
  }

  public MiscellaneousRemarkType1 providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * Get providerType
   * @return providerType
  */
  @ApiModelProperty(value = "")


  public String getProviderType() {
    return providerType;
  }

  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }

  public MiscellaneousRemarkType1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiscellaneousRemarkType1 miscellaneousRemarkType1 = (MiscellaneousRemarkType1) o;
    return Objects.equals(this.amount, miscellaneousRemarkType1.amount) &&
        Objects.equals(this.category, miscellaneousRemarkType1.category) &&
        Objects.equals(this.currency, miscellaneousRemarkType1.currency) &&
        Objects.equals(this.freetext, miscellaneousRemarkType1.freetext) &&
        Objects.equals(this.officeId, miscellaneousRemarkType1.officeId) &&
        Objects.equals(this.providerType, miscellaneousRemarkType1.providerType) &&
        Objects.equals(this.type, miscellaneousRemarkType1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, category, currency, freetext, officeId, providerType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiscellaneousRemarkType1 {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

