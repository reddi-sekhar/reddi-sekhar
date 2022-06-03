package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.AttributeDetailsPnrTypeResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PnrTypeResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PnrTypeResponseDto   {
  @JsonProperty("attributeDetails")
  @Valid
  private List<AttributeDetailsPnrTypeResponseDto> attributeDetails = null;

  public PnrTypeResponseDto attributeDetails(List<AttributeDetailsPnrTypeResponseDto> attributeDetails) {
    this.attributeDetails = attributeDetails;
    return this;
  }

  public PnrTypeResponseDto addAttributeDetailsItem(AttributeDetailsPnrTypeResponseDto attributeDetailsItem) {
    if (this.attributeDetails == null) {
      this.attributeDetails = new ArrayList<>();
    }
    this.attributeDetails.add(attributeDetailsItem);
    return this;
  }

  /**
   * Get attributeDetails
   * @return attributeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AttributeDetailsPnrTypeResponseDto> getAttributeDetails() {
    return attributeDetails;
  }

  public void setAttributeDetails(List<AttributeDetailsPnrTypeResponseDto> attributeDetails) {
    this.attributeDetails = attributeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrTypeResponseDto pnrTypeResponseDto = (PnrTypeResponseDto) o;
    return Objects.equals(this.attributeDetails, pnrTypeResponseDto.attributeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrTypeResponseDto {\n");
    
    sb.append("    attributeDetails: ").append(toIndentedString(attributeDetails)).append("\n");
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

