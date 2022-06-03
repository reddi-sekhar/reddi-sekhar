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
 * SsrDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SsrDetails1RequestDto   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("freetext")
  @Valid
  private List<String> freetext = null;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("status")
  private String status;

  @JsonProperty("type")
  private String type;

  public SsrDetails1RequestDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Airline code or YY
   * @return companyId
  */
  @ApiModelProperty(value = "Airline code or YY")

@Size(min=1,max=3) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public SsrDetails1RequestDto freetext(List<String> freetext) {
    this.freetext = freetext;
    return this;
  }

  public SsrDetails1RequestDto addFreetextItem(String freetextItem) {
    if (this.freetext == null) {
      this.freetext = new ArrayList<>();
    }
    this.freetext.add(freetextItem);
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public List<String> getFreetext() {
    return freetext;
  }

  public void setFreetext(List<String> freetext) {
    this.freetext = freetext;
  }

  public SsrDetails1RequestDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Number of services requested
   * @return quantity
  */
  @ApiModelProperty(value = "Number of services requested")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public SsrDetails1RequestDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * ATA/IATA status code
   * @return status
  */
  @ApiModelProperty(value = "ATA/IATA status code")

@Size(min=1,max=3) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SsrDetails1RequestDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * ATA/IATA defined Special Service Requirement code
   * @return type
  */
  @ApiModelProperty(value = "ATA/IATA defined Special Service Requirement code")

@Size(min=1,max=4) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsrDetails1RequestDto ssrDetails1RequestDto = (SsrDetails1RequestDto) o;
    return Objects.equals(this.companyId, ssrDetails1RequestDto.companyId) &&
        Objects.equals(this.freetext, ssrDetails1RequestDto.freetext) &&
        Objects.equals(this.quantity, ssrDetails1RequestDto.quantity) &&
        Objects.equals(this.status, ssrDetails1RequestDto.status) &&
        Objects.equals(this.type, ssrDetails1RequestDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, freetext, quantity, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsrDetails1RequestDto {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

