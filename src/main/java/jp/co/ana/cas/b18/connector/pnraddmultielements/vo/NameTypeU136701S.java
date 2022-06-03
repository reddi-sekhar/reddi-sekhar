package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NameInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NameTypeU136701S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NameTypeU136701S   {
  @JsonProperty("nameInformation")
  private NameInformationTypeU nameInformation;

  public NameTypeU136701S nameInformation(NameInformationTypeU nameInformation) {
    this.nameInformation = nameInformation;
    return this;
  }

  /**
   * Get nameInformation
   * @return nameInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameInformationTypeU getNameInformation() {
    return nameInformation;
  }

  public void setNameInformation(NameInformationTypeU nameInformation) {
    this.nameInformation = nameInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameTypeU136701S nameTypeU136701S = (NameTypeU136701S) o;
    return Objects.equals(this.nameInformation, nameTypeU136701S.nameInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameTypeU136701S {\n");
    
    sb.append("    nameInformation: ").append(toIndentedString(nameInformation)).append("\n");
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

