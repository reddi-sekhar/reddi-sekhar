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
 * AuthenticationDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AuthenticationDataType   {
  @JsonProperty("authenticationIndicator")
  private String authenticationIndicator;

  @JsonProperty("caavAlgorithm")
  private Long caavAlgorithm;

  @JsonProperty("creditCardCompany")
  private String creditCardCompany;

  @JsonProperty("pares")
  private String pares;

  @JsonProperty("veres")
  private String veres;

  public AuthenticationDataType authenticationIndicator(String authenticationIndicator) {
    this.authenticationIndicator = authenticationIndicator;
    return this;
  }

  /**
   * Get authenticationIndicator
   * @return authenticationIndicator
  */
  @ApiModelProperty(value = "")


  public String getAuthenticationIndicator() {
    return authenticationIndicator;
  }

  public void setAuthenticationIndicator(String authenticationIndicator) {
    this.authenticationIndicator = authenticationIndicator;
  }

  public AuthenticationDataType caavAlgorithm(Long caavAlgorithm) {
    this.caavAlgorithm = caavAlgorithm;
    return this;
  }

  /**
   * Get caavAlgorithm
   * @return caavAlgorithm
  */
  @ApiModelProperty(value = "")


  public Long getCaavAlgorithm() {
    return caavAlgorithm;
  }

  public void setCaavAlgorithm(Long caavAlgorithm) {
    this.caavAlgorithm = caavAlgorithm;
  }

  public AuthenticationDataType creditCardCompany(String creditCardCompany) {
    this.creditCardCompany = creditCardCompany;
    return this;
  }

  /**
   * Get creditCardCompany
   * @return creditCardCompany
  */
  @ApiModelProperty(value = "")


  public String getCreditCardCompany() {
    return creditCardCompany;
  }

  public void setCreditCardCompany(String creditCardCompany) {
    this.creditCardCompany = creditCardCompany;
  }

  public AuthenticationDataType pares(String pares) {
    this.pares = pares;
    return this;
  }

  /**
   * Get pares
   * @return pares
  */
  @ApiModelProperty(value = "")


  public String getPares() {
    return pares;
  }

  public void setPares(String pares) {
    this.pares = pares;
  }

  public AuthenticationDataType veres(String veres) {
    this.veres = veres;
    return this;
  }

  /**
   * Get veres
   * @return veres
  */
  @ApiModelProperty(value = "")


  public String getVeres() {
    return veres;
  }

  public void setVeres(String veres) {
    this.veres = veres;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationDataType authenticationDataType = (AuthenticationDataType) o;
    return Objects.equals(this.authenticationIndicator, authenticationDataType.authenticationIndicator) &&
        Objects.equals(this.caavAlgorithm, authenticationDataType.caavAlgorithm) &&
        Objects.equals(this.creditCardCompany, authenticationDataType.creditCardCompany) &&
        Objects.equals(this.pares, authenticationDataType.pares) &&
        Objects.equals(this.veres, authenticationDataType.veres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationIndicator, caavAlgorithm, creditCardCompany, pares, veres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationDataType {\n");
    
    sb.append("    authenticationIndicator: ").append(toIndentedString(authenticationIndicator)).append("\n");
    sb.append("    caavAlgorithm: ").append(toIndentedString(caavAlgorithm)).append("\n");
    sb.append("    creditCardCompany: ").append(toIndentedString(creditCardCompany)).append("\n");
    sb.append("    pares: ").append(toIndentedString(pares)).append("\n");
    sb.append("    veres: ").append(toIndentedString(veres)).append("\n");
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

