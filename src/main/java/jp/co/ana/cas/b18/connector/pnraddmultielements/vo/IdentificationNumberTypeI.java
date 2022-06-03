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
 * IdentificationNumberTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class IdentificationNumberTypeI   {
  @JsonProperty("address")
  private String address;

  @JsonProperty("qualifier")
  private String qualifier;

  public IdentificationNumberTypeI address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IdentificationNumberTypeI qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationNumberTypeI identificationNumberTypeI = (IdentificationNumberTypeI) o;
    return Objects.equals(this.address, identificationNumberTypeI.address) &&
        Objects.equals(this.qualifier, identificationNumberTypeI.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationNumberTypeI {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

