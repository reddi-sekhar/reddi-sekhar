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
 * CommunicationContactDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommunicationContactDetailsTypeU   {
  @JsonProperty("contactQualifier")
  private String contactQualifier;

  @JsonProperty("email")
  private String email;

  public CommunicationContactDetailsTypeU contactQualifier(String contactQualifier) {
    this.contactQualifier = contactQualifier;
    return this;
  }

  /**
   * Get contactQualifier
   * @return contactQualifier
  */
  @ApiModelProperty(value = "")


  public String getContactQualifier() {
    return contactQualifier;
  }

  public void setContactQualifier(String contactQualifier) {
    this.contactQualifier = contactQualifier;
  }

  public CommunicationContactDetailsTypeU email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationContactDetailsTypeU communicationContactDetailsTypeU = (CommunicationContactDetailsTypeU) o;
    return Objects.equals(this.contactQualifier, communicationContactDetailsTypeU.contactQualifier) &&
        Objects.equals(this.email, communicationContactDetailsTypeU.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactQualifier, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationContactDetailsTypeU {\n");
    
    sb.append("    contactQualifier: ").append(toIndentedString(contactQualifier)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

