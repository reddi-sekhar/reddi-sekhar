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
 * IndividualSecurityType3194C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class IndividualSecurityType3194C   {
  @JsonProperty("accessMode")
  private String accessMode;

  @JsonProperty("identification")
  private String identification;

  public IndividualSecurityType3194C accessMode(String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * Get accessMode
   * @return accessMode
  */
  @ApiModelProperty(value = "")


  public String getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }

  public IndividualSecurityType3194C identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @ApiModelProperty(value = "")


  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualSecurityType3194C individualSecurityType3194C = (IndividualSecurityType3194C) o;
    return Objects.equals(this.accessMode, individualSecurityType3194C.accessMode) &&
        Objects.equals(this.identification, individualSecurityType3194C.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualSecurityType3194C {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

