package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RuleTextTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RuleTextTypeU   {
  @JsonProperty("freeText")
  @Valid
  private List<String> freeText = null;

  @JsonProperty("textType")
  private String textType;

  public RuleTextTypeU freeText(List<String> freeText) {
    this.freeText = freeText;
    return this;
  }

  public RuleTextTypeU addFreeTextItem(String freeTextItem) {
    if (this.freeText == null) {
      this.freeText = new ArrayList<>();
    }
    this.freeText.add(freeTextItem);
    return this;
  }

  /**
   * Get freeText
   * @return freeText
  */
  @ApiModelProperty(value = "")


  public List<String> getFreeText() {
    return freeText;
  }

  public void setFreeText(List<String> freeText) {
    this.freeText = freeText;
  }

  public RuleTextTypeU textType(String textType) {
    this.textType = textType;
    return this;
  }

  /**
   * Get textType
   * @return textType
  */
  @ApiModelProperty(value = "")


  public String getTextType() {
    return textType;
  }

  public void setTextType(String textType) {
    this.textType = textType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleTextTypeU ruleTextTypeU = (RuleTextTypeU) o;
    return Objects.equals(this.freeText, ruleTextTypeU.freeText) &&
        Objects.equals(this.textType, ruleTextTypeU.textType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText, textType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleTextTypeU {\n");
    
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
    sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
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

