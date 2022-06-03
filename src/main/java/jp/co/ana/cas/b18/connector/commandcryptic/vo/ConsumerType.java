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
 * ConsumerType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class ConsumerType   {
  @JsonProperty("uniqueID")
  private String uniqueID;

  public ConsumerType uniqueID(String uniqueID) {
    this.uniqueID = uniqueID;
    return this;
  }

  /**
   * Get uniqueID
   * @return uniqueID
  */
  @ApiModelProperty(value = "")


  public String getUniqueID() {
    return uniqueID;
  }

  public void setUniqueID(String uniqueID) {
    this.uniqueID = uniqueID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerType consumerType = (ConsumerType) o;
    return Objects.equals(this.uniqueID, consumerType.uniqueID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerType {\n");
    
    sb.append("    uniqueID: ").append(toIndentedString(uniqueID)).append("\n");
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

