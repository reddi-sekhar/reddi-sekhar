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
 * UserIdentificationType9456S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class UserIdentificationType9456S   {
  @JsonProperty("originator")
  private String originator;

  public UserIdentificationType9456S originator(String originator) {
    this.originator = originator;
    return this;
  }

  /**
   * Get originator
   * @return originator
  */
  @ApiModelProperty(value = "")


  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentificationType9456S userIdentificationType9456S = (UserIdentificationType9456S) o;
    return Objects.equals(this.originator, userIdentificationType9456S.originator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentificationType9456S {\n");
    
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
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

