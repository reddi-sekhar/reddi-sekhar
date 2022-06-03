package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IndividualSecurityResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class IndividualSecurityResponseDto   {
  @JsonProperty("office")
  private String office;

  @JsonProperty("officeIdentifier")
  private String officeIdentifier;

  @JsonProperty("accessMode")
  private String accessMode;

  public IndividualSecurityResponseDto office(String office) {
    this.office = office;
    return this;
  }

  /**
   * Office Id
   * @return office
  */
  @ApiModelProperty(value = "Office Id")

@Size(min=1,max=9) 
  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public IndividualSecurityResponseDto officeIdentifier(String officeIdentifier) {
    this.officeIdentifier = officeIdentifier;
    return this;
  }

  /**
   *  Office identifier
   * @return officeIdentifier
  */
  @ApiModelProperty(value = " Office identifier")

@Size(min=1,max=1) 
  public String getOfficeIdentifier() {
    return officeIdentifier;
  }

  public void setOfficeIdentifier(String officeIdentifier) {
    this.officeIdentifier = officeIdentifier;
  }

  public IndividualSecurityResponseDto accessMode(String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   *  Access Mode Details
   * @return accessMode
  */
  @ApiModelProperty(value = " Access Mode Details")

@Size(min=1,max=1) 
  public String getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualSecurityResponseDto individualSecurityResponseDto = (IndividualSecurityResponseDto) o;
    return Objects.equals(this.office, individualSecurityResponseDto.office) &&
        Objects.equals(this.officeIdentifier, individualSecurityResponseDto.officeIdentifier) &&
        Objects.equals(this.accessMode, individualSecurityResponseDto.accessMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(office, officeIdentifier, accessMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualSecurityResponseDto {\n");
    
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    officeIdentifier: ").append(toIndentedString(officeIdentifier)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
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

