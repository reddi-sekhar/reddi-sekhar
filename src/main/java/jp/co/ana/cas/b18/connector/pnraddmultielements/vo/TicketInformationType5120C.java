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
 * TicketInformationType5120C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketInformationType5120C   {
  @JsonProperty("location")
  private String location;

  @JsonProperty("queueingOfficeId")
  private String queueingOfficeId;

  public TicketInformationType5120C location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public TicketInformationType5120C queueingOfficeId(String queueingOfficeId) {
    this.queueingOfficeId = queueingOfficeId;
    return this;
  }

  /**
   * Get queueingOfficeId
   * @return queueingOfficeId
  */
  @ApiModelProperty(value = "")


  public String getQueueingOfficeId() {
    return queueingOfficeId;
  }

  public void setQueueingOfficeId(String queueingOfficeId) {
    this.queueingOfficeId = queueingOfficeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketInformationType5120C ticketInformationType5120C = (TicketInformationType5120C) o;
    return Objects.equals(this.location, ticketInformationType5120C.location) &&
        Objects.equals(this.queueingOfficeId, ticketInformationType5120C.queueingOfficeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, queueingOfficeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketInformationType5120C {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    queueingOfficeId: ").append(toIndentedString(queueingOfficeId)).append("\n");
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

