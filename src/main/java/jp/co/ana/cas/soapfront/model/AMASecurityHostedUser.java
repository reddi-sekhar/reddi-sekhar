package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * AMASecurityHostedUser.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class AMASecurityHostedUser   {
  
  /** The application. */
  @JsonProperty("application")
  private ApplicationType application;

  /** The full location. */
  @JsonProperty("fullLocation")
  private LocationType1 fullLocation;

  /** The user ID. */
  @JsonProperty("userID")
  private UserID userID;

  /** The workstation ID. */
  @JsonProperty("workstationID")
  private String workstationID;

  /**
   * Application.
   *
   * @param application the application
   * @return the AMA security hosted user
   */
  public AMASecurityHostedUser application(ApplicationType application) {
    this.application = application;
    return this;
  }

  /**
   * Get application.
   *
   * @return application
   */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationType getApplication() {
    return application;
  }

  /**
   * Sets the application.
   *
   * @param application the new application
   */
  public void setApplication(ApplicationType application) {
    this.application = application;
  }

  /**
   * Full location.
   *
   * @param fullLocation the full location
   * @return the AMA security hosted user
   */
  public AMASecurityHostedUser fullLocation(LocationType1 fullLocation) {
    this.fullLocation = fullLocation;
    return this;
  }

  /**
   * Get fullLocation.
   *
   * @return fullLocation
   */
  @ApiModelProperty(value = "")

  @Valid

  public LocationType1 getFullLocation() {
    return fullLocation;
  }

  /**
   * Sets the full location.
   *
   * @param fullLocation the new full location
   */
  public void setFullLocation(LocationType1 fullLocation) {
    this.fullLocation = fullLocation;
  }

  /**
   * User ID.
   *
   * @param userID the user ID
   * @return the AMA security hosted user
   */
  public AMASecurityHostedUser userID(UserID userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID.
   *
   * @return userID
   */
  @ApiModelProperty(value = "")

  @Valid

  public UserID getUserID() {
    return userID;
  }

  /**
   * Sets the user ID.
   *
   * @param userID the new user ID
   */
  public void setUserID(UserID userID) {
    this.userID = userID;
  }

  /**
   * Workstation ID.
   *
   * @param workstationID the workstation ID
   * @return the AMA security hosted user
   */
  public AMASecurityHostedUser workstationID(String workstationID) {
    this.workstationID = workstationID;
    return this;
  }

  /**
   * Get workstationID.
   *
   * @return workstationID
   */
  @ApiModelProperty(value = "")


  public String getWorkstationID() {
    return workstationID;
  }

  /**
   * Sets the workstation ID.
   *
   * @param workstationID the new workstation ID
   */
  public void setWorkstationID(String workstationID) {
    this.workstationID = workstationID;
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
    AMASecurityHostedUser amASecurityHostedUser = (AMASecurityHostedUser) o;
    return Objects.equals(this.application, amASecurityHostedUser.application)
        && Objects.equals(this.fullLocation, amASecurityHostedUser.fullLocation)
        && Objects.equals(this.userID, amASecurityHostedUser.userID)
        && Objects.equals(this.workstationID, amASecurityHostedUser.workstationID);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(application, fullLocation, userID, workstationID);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AMASecurityHostedUser {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    fullLocation: ").append(toIndentedString(fullLocation)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    workstationID: ").append(toIndentedString(workstationID)).append("\n");
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

