package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommunicationContactDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommunicationContactType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommunicationContactType   {
  @JsonProperty("communication")
  private CommunicationContactDetailsType communication;

  public CommunicationContactType communication(CommunicationContactDetailsType communication) {
    this.communication = communication;
    return this;
  }

  /**
   * Get communication
   * @return communication
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommunicationContactDetailsType getCommunication() {
    return communication;
  }

  public void setCommunication(CommunicationContactDetailsType communication) {
    this.communication = communication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationContactType communicationContactType = (CommunicationContactType) o;
    return Objects.equals(this.communication, communicationContactType.communication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationContactType {\n");
    
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
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

