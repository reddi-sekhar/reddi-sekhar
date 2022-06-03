package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DistributionChannelType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TerminalIdentificationDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TerminalIdentificationDescriptionType   {
  @JsonProperty("distributionChannel")
  private DistributionChannelType distributionChannel;

  @JsonProperty("terminalID")
  private String terminalID;

  public TerminalIdentificationDescriptionType distributionChannel(DistributionChannelType distributionChannel) {
    this.distributionChannel = distributionChannel;
    return this;
  }

  /**
   * Get distributionChannel
   * @return distributionChannel
  */
  @ApiModelProperty(value = "")

  @Valid

  public DistributionChannelType getDistributionChannel() {
    return distributionChannel;
  }

  public void setDistributionChannel(DistributionChannelType distributionChannel) {
    this.distributionChannel = distributionChannel;
  }

  public TerminalIdentificationDescriptionType terminalID(String terminalID) {
    this.terminalID = terminalID;
    return this;
  }

  /**
   * Get terminalID
   * @return terminalID
  */
  @ApiModelProperty(value = "")


  public String getTerminalID() {
    return terminalID;
  }

  public void setTerminalID(String terminalID) {
    this.terminalID = terminalID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalIdentificationDescriptionType terminalIdentificationDescriptionType = (TerminalIdentificationDescriptionType) o;
    return Objects.equals(this.distributionChannel, terminalIdentificationDescriptionType.distributionChannel) &&
        Objects.equals(this.terminalID, terminalIdentificationDescriptionType.terminalID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionChannel, terminalID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalIdentificationDescriptionType {\n");
    
    sb.append("    distributionChannel: ").append(toIndentedString(distributionChannel)).append("\n");
    sb.append("    terminalID: ").append(toIndentedString(terminalID)).append("\n");
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

