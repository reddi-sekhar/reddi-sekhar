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
 * DiningIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiningIdentificationType   {
  @JsonProperty("diningDescription")
  private String diningDescription;

  public DiningIdentificationType diningDescription(String diningDescription) {
    this.diningDescription = diningDescription;
    return this;
  }

  /**
   * Get diningDescription
   * @return diningDescription
  */
  @ApiModelProperty(value = "")


  public String getDiningDescription() {
    return diningDescription;
  }

  public void setDiningDescription(String diningDescription) {
    this.diningDescription = diningDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiningIdentificationType diningIdentificationType = (DiningIdentificationType) o;
    return Objects.equals(this.diningDescription, diningIdentificationType.diningDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diningDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiningIdentificationType {\n");
    
    sb.append("    diningDescription: ").append(toIndentedString(diningDescription)).append("\n");
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

