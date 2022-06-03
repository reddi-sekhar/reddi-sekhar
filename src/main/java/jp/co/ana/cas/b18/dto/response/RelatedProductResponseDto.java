package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedProductResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class RelatedProductResponseDto   {
  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("status")
  @Valid
  private List<String> status = null;

  public RelatedProductResponseDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity
   * @return quantity
  */
  @ApiModelProperty(example = "1", value = "Quantity")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public RelatedProductResponseDto status(List<String> status) {
    this.status = status;
    return this;
  }

  public RelatedProductResponseDto addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
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
    RelatedProductResponseDto relatedProductResponseDto = (RelatedProductResponseDto) o;
    return Objects.equals(this.quantity, relatedProductResponseDto.quantity) &&
        Objects.equals(this.status, relatedProductResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedProductResponseDto {\n");
    
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

