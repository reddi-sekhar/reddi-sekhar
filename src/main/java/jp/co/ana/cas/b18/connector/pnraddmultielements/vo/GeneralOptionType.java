package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.GeneralOptionInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeneralOptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class GeneralOptionType   {
  @JsonProperty("optionDetail")
  private GeneralOptionInformationType optionDetail;

  public GeneralOptionType optionDetail(GeneralOptionInformationType optionDetail) {
    this.optionDetail = optionDetail;
    return this;
  }

  /**
   * Get optionDetail
   * @return optionDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public GeneralOptionInformationType getOptionDetail() {
    return optionDetail;
  }

  public void setOptionDetail(GeneralOptionInformationType optionDetail) {
    this.optionDetail = optionDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralOptionType generalOptionType = (GeneralOptionType) o;
    return Objects.equals(this.optionDetail, generalOptionType.optionDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralOptionType {\n");
    
    sb.append("    optionDetail: ").append(toIndentedString(optionDetail)).append("\n");
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

