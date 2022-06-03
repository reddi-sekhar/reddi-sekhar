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
 * PartyNameBatchTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PartyNameBatchTypeU   {
  @JsonProperty("name1")
  private String name1;

  public PartyNameBatchTypeU name1(String name1) {
    this.name1 = name1;
    return this;
  }

  /**
   * Get name1
   * @return name1
  */
  @ApiModelProperty(value = "")


  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyNameBatchTypeU partyNameBatchTypeU = (PartyNameBatchTypeU) o;
    return Objects.equals(this.name1, partyNameBatchTypeU.name1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyNameBatchTypeU {\n");
    
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
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

