package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IntelligentWorkstationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class IntelligentWorkstationInfo   {
  @JsonProperty("companyIdentification")
  private String companyIdentification;

  public IntelligentWorkstationInfo companyIdentification(String companyIdentification) {
    this.companyIdentification = companyIdentification;
    return this;
  }

  /**
   * Get companyIdentification
   * @return companyIdentification
  */
  @ApiModelProperty(value = "")


  public String getCompanyIdentification() {
    return companyIdentification;
  }

  public void setCompanyIdentification(String companyIdentification) {
    this.companyIdentification = companyIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelligentWorkstationInfo intelligentWorkstationInfo = (IntelligentWorkstationInfo) o;
    return Objects.equals(this.companyIdentification, intelligentWorkstationInfo.companyIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelligentWorkstationInfo {\n");
    
    sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
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

