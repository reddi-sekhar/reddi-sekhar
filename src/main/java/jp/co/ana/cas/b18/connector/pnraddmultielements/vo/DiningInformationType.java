package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiningIdentificationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiningInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiningInformationType   {
  @JsonProperty("diningIdentification")
  private DiningIdentificationType diningIdentification;

  public DiningInformationType diningIdentification(DiningIdentificationType diningIdentification) {
    this.diningIdentification = diningIdentification;
    return this;
  }

  /**
   * Get diningIdentification
   * @return diningIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiningIdentificationType getDiningIdentification() {
    return diningIdentification;
  }

  public void setDiningIdentification(DiningIdentificationType diningIdentification) {
    this.diningIdentification = diningIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiningInformationType diningInformationType = (DiningInformationType) o;
    return Objects.equals(this.diningIdentification, diningInformationType.diningIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diningIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiningInformationType {\n");
    
    sb.append("    diningIdentification: ").append(toIndentedString(diningIdentification)).append("\n");
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

