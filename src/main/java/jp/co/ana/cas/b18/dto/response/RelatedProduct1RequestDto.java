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
 * RelatedProduct1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class RelatedProduct1RequestDto   {
  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("status")
  private String status;

  public RelatedProduct1RequestDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity
   * @return quantity
  */
  @ApiModelProperty(value = "Quantity")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public RelatedProduct1RequestDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status
   * @return status
  */
  @ApiModelProperty(required = true, value = "Status")
  @NotNull

@Size(min=1,max=2) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedProduct1RequestDto relatedProduct1RequestDto = (RelatedProduct1RequestDto) o;
    return Objects.equals(this.quantity, relatedProduct1RequestDto.quantity) &&
        Objects.equals(this.status, relatedProduct1RequestDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedProduct1RequestDto {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

