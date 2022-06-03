package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ConsumerReferenceIdentificationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsumerReferenceInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ConsumerReferenceInformationTypeI   {
  @JsonProperty("customerReferences")
  @Valid
  private List<ConsumerReferenceIdentificationTypeI> customerReferences = null;

  public ConsumerReferenceInformationTypeI customerReferences(List<ConsumerReferenceIdentificationTypeI> customerReferences) {
    this.customerReferences = customerReferences;
    return this;
  }

  public ConsumerReferenceInformationTypeI addCustomerReferencesItem(ConsumerReferenceIdentificationTypeI customerReferencesItem) {
    if (this.customerReferences == null) {
      this.customerReferences = new ArrayList<>();
    }
    this.customerReferences.add(customerReferencesItem);
    return this;
  }

  /**
   * Get customerReferences
   * @return customerReferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ConsumerReferenceIdentificationTypeI> getCustomerReferences() {
    return customerReferences;
  }

  public void setCustomerReferences(List<ConsumerReferenceIdentificationTypeI> customerReferences) {
    this.customerReferences = customerReferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerReferenceInformationTypeI consumerReferenceInformationTypeI = (ConsumerReferenceInformationTypeI) o;
    return Objects.equals(this.customerReferences, consumerReferenceInformationTypeI.customerReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerReferenceInformationTypeI {\n");
    
    sb.append("    customerReferences: ").append(toIndentedString(customerReferences)).append("\n");
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

