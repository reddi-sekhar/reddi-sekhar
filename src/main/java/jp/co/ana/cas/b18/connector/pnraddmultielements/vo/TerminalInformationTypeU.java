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
 * TerminalInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TerminalInformationTypeU   {
  @JsonProperty("arrivalTerminal")
  private String arrivalTerminal;

  public TerminalInformationTypeU arrivalTerminal(String arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
    return this;
  }

  /**
   * Get arrivalTerminal
   * @return arrivalTerminal
  */
  @ApiModelProperty(value = "")


  public String getArrivalTerminal() {
    return arrivalTerminal;
  }

  public void setArrivalTerminal(String arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalInformationTypeU terminalInformationTypeU = (TerminalInformationTypeU) o;
    return Objects.equals(this.arrivalTerminal, terminalInformationTypeU.arrivalTerminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalTerminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalInformationTypeU {\n");
    
    sb.append("    arrivalTerminal: ").append(toIndentedString(arrivalTerminal)).append("\n");
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

