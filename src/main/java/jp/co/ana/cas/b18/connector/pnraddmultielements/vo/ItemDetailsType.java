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
 * ItemDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemDetailsType   {
  @JsonProperty("cardCheck")
  private String cardCheck;

  @JsonProperty("cardNumber")
  private Long cardNumber;

  @JsonProperty("cardType")
  private Long cardType;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("owner")
  private Long owner;

  @JsonProperty("version")
  private Long version;

  public ItemDetailsType cardCheck(String cardCheck) {
    this.cardCheck = cardCheck;
    return this;
  }

  /**
   * Get cardCheck
   * @return cardCheck
  */
  @ApiModelProperty(value = "")


  public String getCardCheck() {
    return cardCheck;
  }

  public void setCardCheck(String cardCheck) {
    this.cardCheck = cardCheck;
  }

  public ItemDetailsType cardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  */
  @ApiModelProperty(value = "")


  public Long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
  }

  public ItemDetailsType cardType(Long cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Get cardType
   * @return cardType
  */
  @ApiModelProperty(value = "")


  public Long getCardType() {
    return cardType;
  }

  public void setCardType(Long cardType) {
    this.cardType = cardType;
  }

  public ItemDetailsType companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ItemDetailsType owner(Long owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @ApiModelProperty(value = "")


  public Long getOwner() {
    return owner;
  }

  public void setOwner(Long owner) {
    this.owner = owner;
  }

  public ItemDetailsType version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")


  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetailsType itemDetailsType = (ItemDetailsType) o;
    return Objects.equals(this.cardCheck, itemDetailsType.cardCheck) &&
        Objects.equals(this.cardNumber, itemDetailsType.cardNumber) &&
        Objects.equals(this.cardType, itemDetailsType.cardType) &&
        Objects.equals(this.companyId, itemDetailsType.companyId) &&
        Objects.equals(this.owner, itemDetailsType.owner) &&
        Objects.equals(this.version, itemDetailsType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCheck, cardNumber, cardType, companyId, owner, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailsType {\n");
    
    sb.append("    cardCheck: ").append(toIndentedString(cardCheck)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

