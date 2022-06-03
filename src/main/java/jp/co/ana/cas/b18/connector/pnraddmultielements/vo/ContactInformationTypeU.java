package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ContactInformationDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ContactInformationTypeU   {
  @JsonProperty("contactInformation")
  @Valid
  private List<ContactInformationDetailsTypeU> contactInformation = null;

  public ContactInformationTypeU contactInformation(List<ContactInformationDetailsTypeU> contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

  public ContactInformationTypeU addContactInformationItem(ContactInformationDetailsTypeU contactInformationItem) {
    if (this.contactInformation == null) {
      this.contactInformation = new ArrayList<>();
    }
    this.contactInformation.add(contactInformationItem);
    return this;
  }

  /**
   * Get contactInformation
   * @return contactInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactInformationDetailsTypeU> getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(List<ContactInformationDetailsTypeU> contactInformation) {
    this.contactInformation = contactInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInformationTypeU contactInformationTypeU = (ContactInformationTypeU) o;
    return Objects.equals(this.contactInformation, contactInformationTypeU.contactInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInformationTypeU {\n");
    
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
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

