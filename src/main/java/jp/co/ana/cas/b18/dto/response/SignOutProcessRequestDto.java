package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SignOutProcessRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SignOutProcessRequestDto   {
  @JsonProperty("pnrAddMultiElements")
  private PnrAddMultiElementsRequestDto pnrAddMultiElements;

  public SignOutProcessRequestDto pnrAddMultiElements(PnrAddMultiElementsRequestDto pnrAddMultiElements) {
    this.pnrAddMultiElements = pnrAddMultiElements;
    return this;
  }

  /**
   * Get pnrAddMultiElements
   * @return pnrAddMultiElements
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrAddMultiElementsRequestDto getPnrAddMultiElements() {
    return pnrAddMultiElements;
  }

  public void setPnrAddMultiElements(PnrAddMultiElementsRequestDto pnrAddMultiElements) {
    this.pnrAddMultiElements = pnrAddMultiElements;
  }

  @ApiModelProperty(value = "")

  @Valid

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignOutProcessRequestDto signOutProcessRequestDto = (SignOutProcessRequestDto) o;
    return Objects.equals(this.pnrAddMultiElements, signOutProcessRequestDto.pnrAddMultiElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrAddMultiElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignOutProcessRequestDto {\n");
    
    sb.append("    pnrAddMultiElements: ").append(toIndentedString(pnrAddMultiElements)).append("\n");
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

