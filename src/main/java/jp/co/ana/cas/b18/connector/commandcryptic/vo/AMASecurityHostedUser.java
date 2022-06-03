package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.ApplicationType;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.LocationType;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.UserID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AMASecurityHostedUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class AMASecurityHostedUser   {
  @JsonProperty("application")
  private ApplicationType application;

  @JsonProperty("fullLocation")
  private LocationType fullLocation;

  @JsonProperty("userID")
  private UserID userID;

  @JsonProperty("workstationID")
  private String workstationID;

  public AMASecurityHostedUser application(ApplicationType application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationType getApplication() {
    return application;
  }

  public void setApplication(ApplicationType application) {
    this.application = application;
  }

  public AMASecurityHostedUser fullLocation(LocationType fullLocation) {
    this.fullLocation = fullLocation;
    return this;
  }

  /**
   * Get fullLocation
   * @return fullLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationType getFullLocation() {
    return fullLocation;
  }

  public void setFullLocation(LocationType fullLocation) {
    this.fullLocation = fullLocation;
  }

  public AMASecurityHostedUser userID(UserID userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserID getUserID() {
    return userID;
  }

  public void setUserID(UserID userID) {
    this.userID = userID;
  }

  public AMASecurityHostedUser workstationID(String workstationID) {
    this.workstationID = workstationID;
    return this;
  }

  /**
   * Get workstationID
   * @return workstationID
  */
  @ApiModelProperty(value = "")


  public String getWorkstationID() {
    return workstationID;
  }

  public void setWorkstationID(String workstationID) {
    this.workstationID = workstationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AMASecurityHostedUser amASecurityHostedUser = (AMASecurityHostedUser) o;
    return Objects.equals(this.application, amASecurityHostedUser.application) &&
        Objects.equals(this.fullLocation, amASecurityHostedUser.fullLocation) &&
        Objects.equals(this.userID, amASecurityHostedUser.userID) &&
        Objects.equals(this.workstationID, amASecurityHostedUser.workstationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, fullLocation, userID, workstationID);
  }

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
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

