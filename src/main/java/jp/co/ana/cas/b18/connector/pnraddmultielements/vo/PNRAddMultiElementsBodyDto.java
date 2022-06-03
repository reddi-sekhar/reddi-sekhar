package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRAddMultiElements;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRAddMultiElementsBodyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRAddMultiElementsBodyDto   {
  @JsonProperty("pnraddMultiElements")
  private PNRAddMultiElements pnraddMultiElements;

  public PNRAddMultiElementsBodyDto pnraddMultiElements(PNRAddMultiElements pnraddMultiElements) {
    this.pnraddMultiElements = pnraddMultiElements;
    return this;
  }

  /**
   * Get pnraddMultiElements
   * @return pnraddMultiElements
  */
  @ApiModelProperty(value = "")

  @Valid

  public PNRAddMultiElements getPnraddMultiElements() {
    return pnraddMultiElements;
  }

  public void setPnraddMultiElements(PNRAddMultiElements pnraddMultiElements) {
    this.pnraddMultiElements = pnraddMultiElements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRAddMultiElementsBodyDto pnRAddMultiElementsBodyDto = (PNRAddMultiElementsBodyDto) o;
    return Objects.equals(this.pnraddMultiElements, pnRAddMultiElementsBodyDto.pnraddMultiElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnraddMultiElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRAddMultiElementsBodyDto {\n");
    
    sb.append("    pnraddMultiElements: ").append(toIndentedString(pnraddMultiElements)).append("\n");
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

