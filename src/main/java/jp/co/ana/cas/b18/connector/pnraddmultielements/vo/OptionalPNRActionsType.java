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
 * OptionalPNRActionsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OptionalPNRActionsType   {
  @JsonProperty("optionCode")
  @Valid
  private List<Long> optionCode = null;

  public OptionalPNRActionsType optionCode(List<Long> optionCode) {
    this.optionCode = optionCode;
    return this;
  }

  public OptionalPNRActionsType addOptionCodeItem(Long optionCodeItem) {
    if (this.optionCode == null) {
      this.optionCode = new ArrayList<>();
    }
    this.optionCode.add(optionCodeItem);
    return this;
  }

  /**
   * Get optionCode
   * @return optionCode
  */
  @ApiModelProperty(value = "")


  public List<Long> getOptionCode() {
    return optionCode;
  }

  public void setOptionCode(List<Long> optionCode) {
    this.optionCode = optionCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalPNRActionsType optionalPNRActionsType = (OptionalPNRActionsType) o;
    return Objects.equals(this.optionCode, optionalPNRActionsType.optionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalPNRActionsType {\n");
    
    sb.append("    optionCode: ").append(toIndentedString(optionCode)).append("\n");
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

