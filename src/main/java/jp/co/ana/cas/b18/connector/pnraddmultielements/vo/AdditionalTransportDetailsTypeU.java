package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TerminalInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalTransportDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AdditionalTransportDetailsTypeU   {
  @JsonProperty("terminalInformation")
  @Valid
  private List<TerminalInformationTypeU> terminalInformation = null;

  public AdditionalTransportDetailsTypeU terminalInformation(List<TerminalInformationTypeU> terminalInformation) {
    this.terminalInformation = terminalInformation;
    return this;
  }

  public AdditionalTransportDetailsTypeU addTerminalInformationItem(TerminalInformationTypeU terminalInformationItem) {
    if (this.terminalInformation == null) {
      this.terminalInformation = new ArrayList<>();
    }
    this.terminalInformation.add(terminalInformationItem);
    return this;
  }

  /**
   * Get terminalInformation
   * @return terminalInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TerminalInformationTypeU> getTerminalInformation() {
    return terminalInformation;
  }

  public void setTerminalInformation(List<TerminalInformationTypeU> terminalInformation) {
    this.terminalInformation = terminalInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalTransportDetailsTypeU additionalTransportDetailsTypeU = (AdditionalTransportDetailsTypeU) o;
    return Objects.equals(this.terminalInformation, additionalTransportDetailsTypeU.terminalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalTransportDetailsTypeU {\n");
    
    sb.append("    terminalInformation: ").append(toIndentedString(terminalInformation)).append("\n");
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

