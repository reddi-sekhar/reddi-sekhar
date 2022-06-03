package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DateOfBirth1RequestDto;
import jp.co.ana.cas.b18.dto.response.EnhancedTravellerInformation1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnhancedPassengerData1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class EnhancedPassengerData1RequestDto   {
  @JsonProperty("dateOfBirthInEnhancedPaxData")
  private DateOfBirth1RequestDto dateOfBirthInEnhancedPaxData;

  @JsonProperty("enhancedTravellerInformation")
  private EnhancedTravellerInformation1RequestDto enhancedTravellerInformation;

  public EnhancedPassengerData1RequestDto dateOfBirthInEnhancedPaxData(DateOfBirth1RequestDto dateOfBirthInEnhancedPaxData) {
    this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
    return this;
  }

  /**
   * Get dateOfBirthInEnhancedPaxData
   * @return dateOfBirthInEnhancedPaxData
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateOfBirth1RequestDto getDateOfBirthInEnhancedPaxData() {
    return dateOfBirthInEnhancedPaxData;
  }

  public void setDateOfBirthInEnhancedPaxData(DateOfBirth1RequestDto dateOfBirthInEnhancedPaxData) {
    this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
  }

  public EnhancedPassengerData1RequestDto enhancedTravellerInformation(EnhancedTravellerInformation1RequestDto enhancedTravellerInformation) {
    this.enhancedTravellerInformation = enhancedTravellerInformation;
    return this;
  }

  /**
   * Get enhancedTravellerInformation
   * @return enhancedTravellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public EnhancedTravellerInformation1RequestDto getEnhancedTravellerInformation() {
    return enhancedTravellerInformation;
  }

  public void setEnhancedTravellerInformation(EnhancedTravellerInformation1RequestDto enhancedTravellerInformation) {
    this.enhancedTravellerInformation = enhancedTravellerInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedPassengerData1RequestDto enhancedPassengerData1RequestDto = (EnhancedPassengerData1RequestDto) o;
    return Objects.equals(this.dateOfBirthInEnhancedPaxData, enhancedPassengerData1RequestDto.dateOfBirthInEnhancedPaxData) &&
        Objects.equals(this.enhancedTravellerInformation, enhancedPassengerData1RequestDto.enhancedTravellerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirthInEnhancedPaxData, enhancedTravellerInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedPassengerData1RequestDto {\n");
    
    sb.append("    dateOfBirthInEnhancedPaxData: ").append(toIndentedString(dateOfBirthInEnhancedPaxData)).append("\n");
    sb.append("    enhancedTravellerInformation: ").append(toIndentedString(enhancedTravellerInformation)).append("\n");
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

