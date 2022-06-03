package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ReceiverType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class ReceiverType   {
  
  /** The server ID. */
  @JsonProperty("serverID")
  private String serverID;

  /**
   * Server ID.
   *
   * @param serverID the server ID
   * @return the receiver type
   */
  public ReceiverType serverID(String serverID) {
    this.serverID = serverID;
    return this;
  }

  /**
   * Get serverID.
   *
   * @return serverID
   */
  @ApiModelProperty(value = "")


  public String getServerID() {
    return serverID;
  }

  /**
   * Sets the server ID.
   *
   * @param serverID the new server ID
   */
  public void setServerID(String serverID) {
    this.serverID = serverID;
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
    ReceiverType receiverType = (ReceiverType) o;
    return Objects.equals(this.serverID, receiverType.serverID);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(serverID);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiverType {\n");
    
    sb.append("    serverID: ").append(toIndentedString(serverID)).append("\n");
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

