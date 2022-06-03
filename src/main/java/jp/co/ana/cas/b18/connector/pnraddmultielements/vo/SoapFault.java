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
 * SoapFault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SoapFault   {
  @JsonProperty("faultactor")
  private String faultactor;

  @JsonProperty("faultcode")
  private String faultcode;

  @JsonProperty("faultstring")
  private String faultstring;

  public SoapFault faultactor(String faultactor) {
    this.faultactor = faultactor;
    return this;
  }

  /**
   * Get faultactor
   * @return faultactor
  */
  @ApiModelProperty(value = "")


  public String getFaultactor() {
    return faultactor;
  }

  public void setFaultactor(String faultactor) {
    this.faultactor = faultactor;
  }

  public SoapFault faultcode(String faultcode) {
    this.faultcode = faultcode;
    return this;
  }

  /**
   * Get faultcode
   * @return faultcode
  */
  @ApiModelProperty(value = "")


  public String getFaultcode() {
    return faultcode;
  }

  public void setFaultcode(String faultcode) {
    this.faultcode = faultcode;
  }

  public SoapFault faultstring(String faultstring) {
    this.faultstring = faultstring;
    return this;
  }

  /**
   * Get faultstring
   * @return faultstring
  */
  @ApiModelProperty(value = "")


  public String getFaultstring() {
    return faultstring;
  }

  public void setFaultstring(String faultstring) {
    this.faultstring = faultstring;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoapFault soapFault = (SoapFault) o;
    return Objects.equals(this.faultactor, soapFault.faultactor) &&
        Objects.equals(this.faultcode, soapFault.faultcode) &&
        Objects.equals(this.faultstring, soapFault.faultstring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultactor, faultcode, faultstring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoapFault {\n");
    
    sb.append("    faultactor: ").append(toIndentedString(faultactor)).append("\n");
    sb.append("    faultcode: ").append(toIndentedString(faultcode)).append("\n");
    sb.append("    faultstring: ").append(toIndentedString(faultstring)).append("\n");
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

