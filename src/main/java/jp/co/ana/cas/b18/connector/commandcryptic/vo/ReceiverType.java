package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReceiverType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class ReceiverType   {
  @JsonProperty("serverID")
  private String serverID;

  public ReceiverType serverID(String serverID) {
    this.serverID = serverID;
    return this;
  }

  /**
   * Get serverID
   * @return serverID
  */
  @ApiModelProperty(value = "")


  public String getServerID() {
    return serverID;
  }

  public void setServerID(String serverID) {
    this.serverID = serverID;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(serverID);
  }

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
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

