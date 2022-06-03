package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ClassDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassConfigurationDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ClassConfigurationDetailsType   {
  @JsonProperty("classDetails")
  private ClassDetailsType classDetails;

  public ClassConfigurationDetailsType classDetails(ClassDetailsType classDetails) {
    this.classDetails = classDetails;
    return this;
  }

  /**
   * Get classDetails
   * @return classDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ClassDetailsType getClassDetails() {
    return classDetails;
  }

  public void setClassDetails(ClassDetailsType classDetails) {
    this.classDetails = classDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassConfigurationDetailsType classConfigurationDetailsType = (ClassConfigurationDetailsType) o;
    return Objects.equals(this.classDetails, classConfigurationDetailsType.classDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassConfigurationDetailsType {\n");
    
    sb.append("    classDetails: ").append(toIndentedString(classDetails)).append("\n");
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

