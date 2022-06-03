package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ConsumerType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class ConsumerType   {
  
  /** The unique ID. */
  @JsonProperty("uniqueID")
  private String uniqueID;

  /**
   * Unique ID.
   *
   * @param uniqueID the unique ID
   * @return the consumer type
   */
  public ConsumerType uniqueID(String uniqueID) {
    this.uniqueID = uniqueID;
    return this;
  }

  /**
   * Get uniqueID.
   *
   * @return uniqueID
   */
  @ApiModelProperty(value = "")


  public String getUniqueID() {
    return uniqueID;
  }

  /**
   * Sets the unique ID.
   *
   * @param uniqueID the new unique ID
   */
  public void setUniqueID(String uniqueID) {
    this.uniqueID = uniqueID;
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
    ConsumerType consumerType = (ConsumerType) o;
    return Objects.equals(this.uniqueID, consumerType.uniqueID);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(uniqueID);
  }

  /**
   * To string.
   *
   * @return the string
   */
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

