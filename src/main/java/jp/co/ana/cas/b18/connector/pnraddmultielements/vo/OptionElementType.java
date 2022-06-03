package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IndividualSecurityType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OptionElementInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OptionElementType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OptionElementType   {
  @JsonProperty("individualSecurity")
  @Valid
  private List<IndividualSecurityType> individualSecurity = null;

  @JsonProperty("optionElementInfo")
  private OptionElementInformationType optionElementInfo;

  public OptionElementType individualSecurity(List<IndividualSecurityType> individualSecurity) {
    this.individualSecurity = individualSecurity;
    return this;
  }

  public OptionElementType addIndividualSecurityItem(IndividualSecurityType individualSecurityItem) {
    if (this.individualSecurity == null) {
      this.individualSecurity = new ArrayList<>();
    }
    this.individualSecurity.add(individualSecurityItem);
    return this;
  }

  /**
   * Get individualSecurity
   * @return individualSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<IndividualSecurityType> getIndividualSecurity() {
    return individualSecurity;
  }

  public void setIndividualSecurity(List<IndividualSecurityType> individualSecurity) {
    this.individualSecurity = individualSecurity;
  }

  public OptionElementType optionElementInfo(OptionElementInformationType optionElementInfo) {
    this.optionElementInfo = optionElementInfo;
    return this;
  }

  /**
   * Get optionElementInfo
   * @return optionElementInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElementInformationType getOptionElementInfo() {
    return optionElementInfo;
  }

  public void setOptionElementInfo(OptionElementInformationType optionElementInfo) {
    this.optionElementInfo = optionElementInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionElementType optionElementType = (OptionElementType) o;
    return Objects.equals(this.individualSecurity, optionElementType.individualSecurity) &&
        Objects.equals(this.optionElementInfo, optionElementType.optionElementInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individualSecurity, optionElementInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElementType {\n");
    
    sb.append("    individualSecurity: ").append(toIndentedString(individualSecurity)).append("\n");
    sb.append("    optionElementInfo: ").append(toIndentedString(optionElementInfo)).append("\n");
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

