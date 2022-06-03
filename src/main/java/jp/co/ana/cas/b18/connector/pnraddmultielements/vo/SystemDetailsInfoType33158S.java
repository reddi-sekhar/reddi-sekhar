package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsTypeI57708C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemDetailsInfoType33158S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SystemDetailsInfoType33158S   {
  @JsonProperty("deliveringSystem")
  private SystemDetailsTypeI57708C deliveringSystem;

  public SystemDetailsInfoType33158S deliveringSystem(SystemDetailsTypeI57708C deliveringSystem) {
    this.deliveringSystem = deliveringSystem;
    return this;
  }

  /**
   * Get deliveringSystem
   * @return deliveringSystem
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsTypeI57708C getDeliveringSystem() {
    return deliveringSystem;
  }

  public void setDeliveringSystem(SystemDetailsTypeI57708C deliveringSystem) {
    this.deliveringSystem = deliveringSystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDetailsInfoType33158S systemDetailsInfoType33158S = (SystemDetailsInfoType33158S) o;
    return Objects.equals(this.deliveringSystem, systemDetailsInfoType33158S.deliveringSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveringSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDetailsInfoType33158S {\n");
    
    sb.append("    deliveringSystem: ").append(toIndentedString(deliveringSystem)).append("\n");
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

