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
 * BookingClassDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class BookingClassDetailsResponseDto   {
  @JsonProperty("designator")
  private String designator;

  public BookingClassDetailsResponseDto designator(String designator) {
    this.designator = designator;
    return this;
  }

  /**
   * Class Combination
   * @return designator
  */
  @ApiModelProperty(value = "Class Combination")

@Size(min=1,max=1) 
  public String getDesignator() {
    return designator;
  }

  public void setDesignator(String designator) {
    this.designator = designator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingClassDetailsResponseDto bookingClassDetailsResponseDto = (BookingClassDetailsResponseDto) o;
    return Objects.equals(this.designator, bookingClassDetailsResponseDto.designator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingClassDetailsResponseDto {\n");
    
    sb.append("    designator: ").append(toIndentedString(designator)).append("\n");
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

