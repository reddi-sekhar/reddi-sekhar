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
 * Airport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class Airport   {
  @JsonProperty("buildingCode")
  private String buildingCode;

  @JsonProperty("codeContext")
  private String codeContext;

  @JsonProperty("gate")
  private String gate;

  @JsonProperty("locationCode")
  private String locationCode;

  @JsonProperty("terminal")
  private String terminal;

  public Airport buildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
    return this;
  }

  /**
   * Get buildingCode
   * @return buildingCode
  */
  @ApiModelProperty(value = "")


  public String getBuildingCode() {
    return buildingCode;
  }

  public void setBuildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
  }

  public Airport codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Get codeContext
   * @return codeContext
  */
  @ApiModelProperty(value = "")


  public String getCodeContext() {
    return codeContext;
  }

  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  public Airport gate(String gate) {
    this.gate = gate;
    return this;
  }

  /**
   * Get gate
   * @return gate
  */
  @ApiModelProperty(value = "")


  public String getGate() {
    return gate;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public Airport locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * Get locationCode
   * @return locationCode
  */
  @ApiModelProperty(value = "")


  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public Airport terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal
   * @return terminal
  */
  @ApiModelProperty(value = "")


  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airport airport = (Airport) o;
    return Objects.equals(this.buildingCode, airport.buildingCode) &&
        Objects.equals(this.codeContext, airport.codeContext) &&
        Objects.equals(this.gate, airport.gate) &&
        Objects.equals(this.locationCode, airport.locationCode) &&
        Objects.equals(this.terminal, airport.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingCode, codeContext, gate, locationCode, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airport {\n");
    
    sb.append("    buildingCode: ").append(toIndentedString(buildingCode)).append("\n");
    sb.append("    codeContext: ").append(toIndentedString(codeContext)).append("\n");
    sb.append("    gate: ").append(toIndentedString(gate)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

