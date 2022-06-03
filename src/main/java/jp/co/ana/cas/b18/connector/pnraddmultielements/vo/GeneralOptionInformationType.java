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
 * GeneralOptionInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class GeneralOptionInformationType   {
  @JsonProperty("freetext")
  @Valid
  private List<String> freetext = null;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updateIndicator")
  private String updateIndicator;

  public GeneralOptionInformationType freetext(List<String> freetext) {
    this.freetext = freetext;
    return this;
  }

  public GeneralOptionInformationType addFreetextItem(String freetextItem) {
    if (this.freetext == null) {
      this.freetext = new ArrayList<>();
    }
    this.freetext.add(freetextItem);
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public List<String> getFreetext() {
    return freetext;
  }

  public void setFreetext(List<String> freetext) {
    this.freetext = freetext;
  }

  public GeneralOptionInformationType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeneralOptionInformationType updateIndicator(String updateIndicator) {
    this.updateIndicator = updateIndicator;
    return this;
  }

  /**
   * Get updateIndicator
   * @return updateIndicator
  */
  @ApiModelProperty(value = "")


  public String getUpdateIndicator() {
    return updateIndicator;
  }

  public void setUpdateIndicator(String updateIndicator) {
    this.updateIndicator = updateIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralOptionInformationType generalOptionInformationType = (GeneralOptionInformationType) o;
    return Objects.equals(this.freetext, generalOptionInformationType.freetext) &&
        Objects.equals(this.type, generalOptionInformationType.type) &&
        Objects.equals(this.updateIndicator, generalOptionInformationType.updateIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetext, type, updateIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralOptionInformationType {\n");
    
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateIndicator: ").append(toIndentedString(updateIndicator)).append("\n");
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

