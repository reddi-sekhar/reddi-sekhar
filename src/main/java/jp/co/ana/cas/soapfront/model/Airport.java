package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;


/**
 * Airport.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class Airport   {
  
  /** The building code. */
  @JsonProperty("buildingCode")
  private String buildingCode;

  /** The code context. */
  @JsonProperty("codeContext")
  private String codeContext;

  /** The gate. */
  @JsonProperty("gate")
  private String gate;

  /** The location code. */
  @JsonProperty("locationCode")
  private String locationCode;

  /** The terminal. */
  @JsonProperty("terminal")
  private String terminal;

  /**
   * Building code.
   *
   * @param buildingCode the building code
   * @return the airport
   */
  public Airport buildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
    return this;
  }

  /**
   * Get buildingCode.
   *
   * @return buildingCode
   */
  @ApiModelProperty(value = "")


  public String getBuildingCode() {
    return buildingCode;
  }

  /**
   * Sets the building code.
   *
   * @param buildingCode the new building code
   */
  public void setBuildingCode(String buildingCode) {
    this.buildingCode = buildingCode;
  }

  /**
   * Code context.
   *
   * @param codeContext the code context
   * @return the airport
   */
  public Airport codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Get codeContext.
   *
   * @return codeContext
   */
  @ApiModelProperty(value = "")


  public String getCodeContext() {
    return codeContext;
  }

  /**
   * Sets the code context.
   *
   * @param codeContext the new code context
   */
  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  /**
   * Gate.
   *
   * @param gate the gate
   * @return the airport
   */
  public Airport gate(String gate) {
    this.gate = gate;
    return this;
  }

  /**
   * Get gate.
   *
   * @return gate
   */
  @ApiModelProperty(value = "")


  public String getGate() {
    return gate;
  }

  /**
   * Sets the gate.
   *
   * @param gate the new gate
   */
  public void setGate(String gate) {
    this.gate = gate;
  }

  /**
   * Location code.
   *
   * @param locationCode the location code
   * @return the airport
   */
  public Airport locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * Get locationCode.
   *
   * @return locationCode
   */
  @ApiModelProperty(value = "")


  public String getLocationCode() {
    return locationCode;
  }

  /**
   * Sets the location code.
   *
   * @param locationCode the new location code
   */
  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  /**
   * Terminal.
   *
   * @param terminal the terminal
   * @return the airport
   */
  public Airport terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal.
   *
   * @return terminal
   */
  @ApiModelProperty(value = "")


  public String getTerminal() {
    return terminal;
  }

  /**
   * Sets the terminal.
   *
   * @param terminal the new terminal
   */
  public void setTerminal(String terminal) {
    this.terminal = terminal;
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
    Airport airport = (Airport) o;
    return Objects.equals(this.buildingCode, airport.buildingCode)
        && Objects.equals(this.codeContext, airport.codeContext)
        && Objects.equals(this.gate, airport.gate)
        && Objects.equals(this.locationCode, airport.locationCode)
        && Objects.equals(this.terminal, airport.terminal);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(buildingCode, codeContext, gate, locationCode, terminal);
  }

  /**
   * To string.
   *
   * @return the string
   */
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

