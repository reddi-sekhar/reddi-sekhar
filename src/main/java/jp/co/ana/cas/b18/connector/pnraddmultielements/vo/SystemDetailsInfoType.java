package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsTypeI192689C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemDetailsInfoType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SystemDetailsInfoType   {
  @JsonProperty("deliveringSystem")
  private SystemDetailsTypeI192689C deliveringSystem;

  @JsonProperty("workstationId")
  private String workstationId;

  public SystemDetailsInfoType deliveringSystem(SystemDetailsTypeI192689C deliveringSystem) {
    this.deliveringSystem = deliveringSystem;
    return this;
  }

  /**
   * Get deliveringSystem
   * @return deliveringSystem
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsTypeI192689C getDeliveringSystem() {
    return deliveringSystem;
  }

  public void setDeliveringSystem(SystemDetailsTypeI192689C deliveringSystem) {
    this.deliveringSystem = deliveringSystem;
  }

  public SystemDetailsInfoType workstationId(String workstationId) {
    this.workstationId = workstationId;
    return this;
  }

  /**
   * Get workstationId
   * @return workstationId
  */
  @ApiModelProperty(value = "")


  public String getWorkstationId() {
    return workstationId;
  }

  public void setWorkstationId(String workstationId) {
    this.workstationId = workstationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDetailsInfoType systemDetailsInfoType = (SystemDetailsInfoType) o;
    return Objects.equals(this.deliveringSystem, systemDetailsInfoType.deliveringSystem) &&
        Objects.equals(this.workstationId, systemDetailsInfoType.workstationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveringSystem, workstationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDetailsInfoType {\n");
    
    sb.append("    deliveringSystem: ").append(toIndentedString(deliveringSystem)).append("\n");
    sb.append("    workstationId: ").append(toIndentedString(workstationId)).append("\n");
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

