package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextQualificationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InteractiveFreeTextTypeI136698S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InteractiveFreeTextTypeI136698S   {
  @JsonProperty("freetextDetail")
  private FreeTextQualificationTypeI freetextDetail;

  @JsonProperty("text")
  @Valid
  private List<String> text = null;

  public InteractiveFreeTextTypeI136698S freetextDetail(FreeTextQualificationTypeI freetextDetail) {
    this.freetextDetail = freetextDetail;
    return this;
  }

  /**
   * Get freetextDetail
   * @return freetextDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextQualificationTypeI getFreetextDetail() {
    return freetextDetail;
  }

  public void setFreetextDetail(FreeTextQualificationTypeI freetextDetail) {
    this.freetextDetail = freetextDetail;
  }

  public InteractiveFreeTextTypeI136698S text(List<String> text) {
    this.text = text;
    return this;
  }

  public InteractiveFreeTextTypeI136698S addTextItem(String textItem) {
    if (this.text == null) {
      this.text = new ArrayList<>();
    }
    this.text.add(textItem);
    return this;
  }

  /**
   * Get text
   * @return text
  */
  @ApiModelProperty(value = "")


  public List<String> getText() {
    return text;
  }

  public void setText(List<String> text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveFreeTextTypeI136698S interactiveFreeTextTypeI136698S = (InteractiveFreeTextTypeI136698S) o;
    return Objects.equals(this.freetextDetail, interactiveFreeTextTypeI136698S.freetextDetail) &&
        Objects.equals(this.text, interactiveFreeTextTypeI136698S.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetextDetail, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveFreeTextTypeI136698S {\n");
    
    sb.append("    freetextDetail: ").append(toIndentedString(freetextDetail)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

