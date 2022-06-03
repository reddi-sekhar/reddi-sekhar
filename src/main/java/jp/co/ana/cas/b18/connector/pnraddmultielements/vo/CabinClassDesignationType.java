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
 * CabinClassDesignationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CabinClassDesignationType   {
  @JsonProperty("classDesignator")
  private String classDesignator;

  public CabinClassDesignationType classDesignator(String classDesignator) {
    this.classDesignator = classDesignator;
    return this;
  }

  /**
   * Get classDesignator
   * @return classDesignator
  */
  @ApiModelProperty(value = "")


  public String getClassDesignator() {
    return classDesignator;
  }

  public void setClassDesignator(String classDesignator) {
    this.classDesignator = classDesignator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CabinClassDesignationType cabinClassDesignationType = (CabinClassDesignationType) o;
    return Objects.equals(this.classDesignator, cabinClassDesignationType.classDesignator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classDesignator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinClassDesignationType {\n");
    
    sb.append("    classDesignator: ").append(toIndentedString(classDesignator)).append("\n");
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

