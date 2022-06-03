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
 * PartyIdentifierType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PartyIdentifierType   {
  @JsonProperty("partyCodeQualifier")
  private String partyCodeQualifier;

  public PartyIdentifierType partyCodeQualifier(String partyCodeQualifier) {
    this.partyCodeQualifier = partyCodeQualifier;
    return this;
  }

  /**
   * Get partyCodeQualifier
   * @return partyCodeQualifier
  */
  @ApiModelProperty(value = "")


  public String getPartyCodeQualifier() {
    return partyCodeQualifier;
  }

  public void setPartyCodeQualifier(String partyCodeQualifier) {
    this.partyCodeQualifier = partyCodeQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyIdentifierType partyIdentifierType = (PartyIdentifierType) o;
    return Objects.equals(this.partyCodeQualifier, partyIdentifierType.partyCodeQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyCodeQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentifierType {\n");
    
    sb.append("    partyCodeQualifier: ").append(toIndentedString(partyCodeQualifier)).append("\n");
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

