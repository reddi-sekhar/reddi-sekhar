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
 * ApplicationDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ApplicationDetailsResponseDto   {
  @JsonProperty("internalId")
  private String internalId;

  public ApplicationDetailsResponseDto internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * application internal identifier
   * @return internalId
  */
  @ApiModelProperty(example = "JFE", value = "application internal identifier")

@Size(min=1,max=35) 
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationDetailsResponseDto applicationDetailsResponseDto = (ApplicationDetailsResponseDto) o;
    return Objects.equals(this.internalId, applicationDetailsResponseDto.internalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationDetailsResponseDto {\n");
    
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
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

