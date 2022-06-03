package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TstGeneralInformationDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TstGeneralInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TstGeneralInformationType   {
  @JsonProperty("generalInformation")
  private TstGeneralInformationDetailsType generalInformation;

  public TstGeneralInformationType generalInformation(TstGeneralInformationDetailsType generalInformation) {
    this.generalInformation = generalInformation;
    return this;
  }

  /**
   * Get generalInformation
   * @return generalInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TstGeneralInformationDetailsType getGeneralInformation() {
    return generalInformation;
  }

  public void setGeneralInformation(TstGeneralInformationDetailsType generalInformation) {
    this.generalInformation = generalInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TstGeneralInformationType tstGeneralInformationType = (TstGeneralInformationType) o;
    return Objects.equals(this.generalInformation, tstGeneralInformationType.generalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TstGeneralInformationType {\n");
    
    sb.append("    generalInformation: ").append(toIndentedString(generalInformation)).append("\n");
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

