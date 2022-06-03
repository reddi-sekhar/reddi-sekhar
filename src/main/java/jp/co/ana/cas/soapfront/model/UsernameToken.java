package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * UsernameToken.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-05-09T17:16:25.118849100+09:00[Asia/Tokyo]")
public class UsernameToken   {
  
  /** The created. */
  @JsonProperty("created")
  private String created;

  /** The nonce. */
  @JsonProperty("nonce")
  private String nonce;

  /** The password. */
  @JsonProperty("password")
  private String password;

  /** The username. */
  @JsonProperty("username")
  private String username;

  /**
   * Created.
   *
   * @param created the created
   * @return the username token
   */
  public UsernameToken created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created.
   *
   * @return created
   */
  @ApiModelProperty(value = "")


  public String getCreated() {
    return created;
  }

  /**
   * Sets the created.
   *
   * @param created the new created
   */
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * Nonce.
   *
   * @param nonce the nonce
   * @return the username token
   */
  public UsernameToken nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Get nonce.
   *
   * @return nonce
   */
  @ApiModelProperty(value = "")


  public String getNonce() {
    return nonce;
  }

  /**
   * Sets the nonce.
   *
   * @param nonce the new nonce
   */
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  /**
   * Password.
   *
   * @param password the password
   * @return the username token
   */
  public UsernameToken password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password.
   *
   * @return password
   */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  /**
   * Sets the password.
   *
   * @param password the new password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Username.
   *
   * @param username the username
   * @return the username token
   */
  public UsernameToken username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username.
   *
   * @return username
   */
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  /**
   * Sets the username.
   *
   * @param username the new username
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsernameToken usernameToken = (UsernameToken) o;
    return Objects.equals(this.created, usernameToken.created)
        && Objects.equals(this.nonce, usernameToken.nonce)
        && Objects.equals(this.password, usernameToken.password)
        && Objects.equals(this.username, usernameToken.username);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(created, nonce, password, username);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernameToken {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

