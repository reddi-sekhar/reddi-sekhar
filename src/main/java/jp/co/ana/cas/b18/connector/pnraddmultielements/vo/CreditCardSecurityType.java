package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AuthenticationDataType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardSecurityType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CreditCardSecurityType   {
  @JsonProperty("authenticationDataDetails")
  private AuthenticationDataType authenticationDataDetails;

  public CreditCardSecurityType authenticationDataDetails(AuthenticationDataType authenticationDataDetails) {
    this.authenticationDataDetails = authenticationDataDetails;
    return this;
  }

  /**
   * Get authenticationDataDetails
   * @return authenticationDataDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuthenticationDataType getAuthenticationDataDetails() {
    return authenticationDataDetails;
  }

  public void setAuthenticationDataDetails(AuthenticationDataType authenticationDataDetails) {
    this.authenticationDataDetails = authenticationDataDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardSecurityType creditCardSecurityType = (CreditCardSecurityType) o;
    return Objects.equals(this.authenticationDataDetails, creditCardSecurityType.authenticationDataDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationDataDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardSecurityType {\n");
    
    sb.append("    authenticationDataDetails: ").append(toIndentedString(authenticationDataDetails)).append("\n");
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

