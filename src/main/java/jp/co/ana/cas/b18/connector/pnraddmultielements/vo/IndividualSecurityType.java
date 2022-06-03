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
 * IndividualSecurityType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class IndividualSecurityType   {
  @JsonProperty("accessMode")
  private String accessMode;

  @JsonProperty("office")
  private String office;

  @JsonProperty("officeIdentifier")
  private String officeIdentifier;

  public IndividualSecurityType accessMode(String accessMode) {
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

  public IndividualSecurityType office(String office) {
    this.office = office;
    return this;
  }

  /**
   * Get office
   * @return office
  */
  @ApiModelProperty(value = "")


  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public IndividualSecurityType officeIdentifier(String officeIdentifier) {
    this.officeIdentifier = officeIdentifier;
    return this;
  }

  /**
   * Get officeIdentifier
   * @return officeIdentifier
  */
  @ApiModelProperty(value = "")


  public String getOfficeIdentifier() {
    return officeIdentifier;
  }

  public void setOfficeIdentifier(String officeIdentifier) {
    this.officeIdentifier = officeIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualSecurityType individualSecurityType = (IndividualSecurityType) o;
    return Objects.equals(this.accessMode, individualSecurityType.accessMode) &&
        Objects.equals(this.office, individualSecurityType.office) &&
        Objects.equals(this.officeIdentifier, individualSecurityType.officeIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, office, officeIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualSecurityType {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    officeIdentifier: ").append(toIndentedString(officeIdentifier)).append("\n");
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

