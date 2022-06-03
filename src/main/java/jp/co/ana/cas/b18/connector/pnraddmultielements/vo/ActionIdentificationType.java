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
 * ActionIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ActionIdentificationType   {
  @JsonProperty("actionRequestCode")
  private String actionRequestCode;

  public ActionIdentificationType actionRequestCode(String actionRequestCode) {
    this.actionRequestCode = actionRequestCode;
    return this;
  }

  /**
   * Get actionRequestCode
   * @return actionRequestCode
  */
  @ApiModelProperty(value = "")


  public String getActionRequestCode() {
    return actionRequestCode;
  }

  public void setActionRequestCode(String actionRequestCode) {
    this.actionRequestCode = actionRequestCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionIdentificationType actionIdentificationType = (ActionIdentificationType) o;
    return Objects.equals(this.actionRequestCode, actionIdentificationType.actionRequestCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionRequestCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionIdentificationType {\n");
    
    sb.append("    actionRequestCode: ").append(toIndentedString(actionRequestCode)).append("\n");
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

