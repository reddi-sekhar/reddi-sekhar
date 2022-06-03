package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationDetailsTypeI4220C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonetaryInformationTypeI1689S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationTypeI1689S   {
  @JsonProperty("information")
  private MonetaryInformationDetailsTypeI4220C information;

  public MonetaryInformationTypeI1689S information(MonetaryInformationDetailsTypeI4220C information) {
    this.information = information;
    return this;
  }

  /**
   * Get information
   * @return information
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationDetailsTypeI4220C getInformation() {
    return information;
  }

  public void setInformation(MonetaryInformationDetailsTypeI4220C information) {
    this.information = information;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryInformationTypeI1689S monetaryInformationTypeI1689S = (MonetaryInformationTypeI1689S) o;
    return Objects.equals(this.information, monetaryInformationTypeI1689S.information);
  }

  @Override
  public int hashCode() {
    return Objects.hash(information);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationTypeI1689S {\n");
    
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
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

