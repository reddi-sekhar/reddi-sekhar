package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ActionIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeType195221S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingOrTicketingSubsequentType195222S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType195220S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDetailsType195223S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SSRPackInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SSRPackInformation   {
  @JsonProperty("bookingMethod")
  private ActionIdentificationType bookingMethod;

  @JsonProperty("elementCounter")
  private ItemNumberType elementCounter;

  @JsonProperty("elementReference")
  private ReferenceInfoType195220S elementReference;

  @JsonProperty("pricingInformation")
  private PricingOrTicketingSubsequentType195222S pricingInformation;

  @JsonProperty("serviceIdentifier")
  private SpecialRequirementsDetailsType195223S serviceIdentifier;

  @JsonProperty("tableValues")
  @Valid
  private List<AttributeType195221S> tableValues = null;

  public SSRPackInformation bookingMethod(ActionIdentificationType bookingMethod) {
    this.bookingMethod = bookingMethod;
    return this;
  }

  /**
   * Get bookingMethod
   * @return bookingMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActionIdentificationType getBookingMethod() {
    return bookingMethod;
  }

  public void setBookingMethod(ActionIdentificationType bookingMethod) {
    this.bookingMethod = bookingMethod;
  }

  public SSRPackInformation elementCounter(ItemNumberType elementCounter) {
    this.elementCounter = elementCounter;
    return this;
  }

  /**
   * Get elementCounter
   * @return elementCounter
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemNumberType getElementCounter() {
    return elementCounter;
  }

  public void setElementCounter(ItemNumberType elementCounter) {
    this.elementCounter = elementCounter;
  }

  public SSRPackInformation elementReference(ReferenceInfoType195220S elementReference) {
    this.elementReference = elementReference;
    return this;
  }

  /**
   * Get elementReference
   * @return elementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType195220S getElementReference() {
    return elementReference;
  }

  public void setElementReference(ReferenceInfoType195220S elementReference) {
    this.elementReference = elementReference;
  }

  public SSRPackInformation pricingInformation(PricingOrTicketingSubsequentType195222S pricingInformation) {
    this.pricingInformation = pricingInformation;
    return this;
  }

  /**
   * Get pricingInformation
   * @return pricingInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingOrTicketingSubsequentType195222S getPricingInformation() {
    return pricingInformation;
  }

  public void setPricingInformation(PricingOrTicketingSubsequentType195222S pricingInformation) {
    this.pricingInformation = pricingInformation;
  }

  public SSRPackInformation serviceIdentifier(SpecialRequirementsDetailsType195223S serviceIdentifier) {
    this.serviceIdentifier = serviceIdentifier;
    return this;
  }

  /**
   * Get serviceIdentifier
   * @return serviceIdentifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsDetailsType195223S getServiceIdentifier() {
    return serviceIdentifier;
  }

  public void setServiceIdentifier(SpecialRequirementsDetailsType195223S serviceIdentifier) {
    this.serviceIdentifier = serviceIdentifier;
  }

  public SSRPackInformation tableValues(List<AttributeType195221S> tableValues) {
    this.tableValues = tableValues;
    return this;
  }

  public SSRPackInformation addTableValuesItem(AttributeType195221S tableValuesItem) {
    if (this.tableValues == null) {
      this.tableValues = new ArrayList<>();
    }
    this.tableValues.add(tableValuesItem);
    return this;
  }

  /**
   * Get tableValues
   * @return tableValues
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AttributeType195221S> getTableValues() {
    return tableValues;
  }

  public void setTableValues(List<AttributeType195221S> tableValues) {
    this.tableValues = tableValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSRPackInformation ssRPackInformation = (SSRPackInformation) o;
    return Objects.equals(this.bookingMethod, ssRPackInformation.bookingMethod) &&
        Objects.equals(this.elementCounter, ssRPackInformation.elementCounter) &&
        Objects.equals(this.elementReference, ssRPackInformation.elementReference) &&
        Objects.equals(this.pricingInformation, ssRPackInformation.pricingInformation) &&
        Objects.equals(this.serviceIdentifier, ssRPackInformation.serviceIdentifier) &&
        Objects.equals(this.tableValues, ssRPackInformation.tableValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingMethod, elementCounter, elementReference, pricingInformation, serviceIdentifier, tableValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSRPackInformation {\n");
    
    sb.append("    bookingMethod: ").append(toIndentedString(bookingMethod)).append("\n");
    sb.append("    elementCounter: ").append(toIndentedString(elementCounter)).append("\n");
    sb.append("    elementReference: ").append(toIndentedString(elementReference)).append("\n");
    sb.append("    pricingInformation: ").append(toIndentedString(pricingInformation)).append("\n");
    sb.append("    serviceIdentifier: ").append(toIndentedString(serviceIdentifier)).append("\n");
    sb.append("    tableValues: ").append(toIndentedString(tableValues)).append("\n");
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

