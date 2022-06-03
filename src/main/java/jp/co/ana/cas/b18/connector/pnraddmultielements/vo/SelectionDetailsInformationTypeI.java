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
 * SelectionDetailsInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SelectionDetailsInformationTypeI   {
  @JsonProperty("option")
  private String option;

  @JsonProperty("optionInformation")
  private String optionInformation;

  public SelectionDetailsInformationTypeI option(String option) {
    this.option = option;
    return this;
  }

  /**
   * Get option
   * @return option
  */
  @ApiModelProperty(value = "")


  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public SelectionDetailsInformationTypeI optionInformation(String optionInformation) {
    this.optionInformation = optionInformation;
    return this;
  }

  /**
   * Get optionInformation
   * @return optionInformation
  */
  @ApiModelProperty(value = "")


  public String getOptionInformation() {
    return optionInformation;
  }

  public void setOptionInformation(String optionInformation) {
    this.optionInformation = optionInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionDetailsInformationTypeI selectionDetailsInformationTypeI = (SelectionDetailsInformationTypeI) o;
    return Objects.equals(this.option, selectionDetailsInformationTypeI.option) &&
        Objects.equals(this.optionInformation, selectionDetailsInformationTypeI.optionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, optionInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionDetailsInformationTypeI {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    optionInformation: ").append(toIndentedString(optionInformation)).append("\n");
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

