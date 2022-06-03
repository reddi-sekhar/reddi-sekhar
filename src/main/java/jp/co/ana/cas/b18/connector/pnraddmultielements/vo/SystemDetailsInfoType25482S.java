package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsTypeI46415C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemDetailsInfoType25482S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SystemDetailsInfoType25482S   {
  @JsonProperty("cascadingSystem")
  private SystemDetailsTypeI46415C cascadingSystem;

  public SystemDetailsInfoType25482S cascadingSystem(SystemDetailsTypeI46415C cascadingSystem) {
    this.cascadingSystem = cascadingSystem;
    return this;
  }

  /**
   * Get cascadingSystem
   * @return cascadingSystem
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsTypeI46415C getCascadingSystem() {
    return cascadingSystem;
  }

  public void setCascadingSystem(SystemDetailsTypeI46415C cascadingSystem) {
    this.cascadingSystem = cascadingSystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDetailsInfoType25482S systemDetailsInfoType25482S = (SystemDetailsInfoType25482S) o;
    return Objects.equals(this.cascadingSystem, systemDetailsInfoType25482S.cascadingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascadingSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDetailsInfoType25482S {\n");
    
    sb.append("    cascadingSystem: ").append(toIndentedString(cascadingSystem)).append("\n");
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

