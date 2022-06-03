package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CabinDetailsCabinResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CabinDetailsCabinResponseDto   {
  @JsonProperty("classDesignator")
  private String classDesignator;

  public CabinDetailsCabinResponseDto classDesignator(String classDesignator) {
    this.classDesignator = classDesignator;
    return this;
  }

  /**
   * Designates the class of service on the means of transport  in which the passenger will travel
   * @return classDesignator
  */
  @ApiModelProperty(value = "Designates the class of service on the means of transport  in which the passenger will travel")

@Size(min=1,max=1) 
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
    CabinDetailsCabinResponseDto cabinDetailsCabinResponseDto = (CabinDetailsCabinResponseDto) o;
    return Objects.equals(this.classDesignator, cabinDetailsCabinResponseDto.classDesignator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classDesignator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinDetailsCabinResponseDto {\n");
    
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

