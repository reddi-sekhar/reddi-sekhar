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
 * SsrResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SsrResponseDto   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("status")
  private String status;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("boardpoint")
  private String boardpoint;

  @JsonProperty("offpoint")
  private String offpoint;

  @JsonProperty("freeText")
  @Valid
  private List<String> freeText = null;

  public SsrResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * ATA/IATA defined Special Service Requirement code
   * @return type
  */
  @ApiModelProperty(example = "FQTV", value = "ATA/IATA defined Special Service Requirement code")

@Size(min=1,max=4) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SsrResponseDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Use defined code or an ATA/IATA defined action code 
   * @return status
  */
  @ApiModelProperty(example = "HK", value = "Use defined code or an ATA/IATA defined action code ")

@Size(min=1,max=3) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SsrResponseDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Number of services requested 
   * @return quantity
  */
  @ApiModelProperty(example = "1", value = "Number of services requested ")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public SsrResponseDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Airline code or YY
   * @return companyId
  */
  @ApiModelProperty(example = "YY", value = "Airline code or YY")

@Size(min=1,max=3) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public SsrResponseDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Seat Special service request  or  Frequent Flyer SSR.
   * @return indicator
  */
  @ApiModelProperty(example = "P02", value = "Seat Special service request  or  Frequent Flyer SSR.")

@Size(min=1,max=3) 
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public SsrResponseDto boardpoint(String boardpoint) {
    this.boardpoint = boardpoint;
    return this;
  }

  /**
   * Board Point
   * @return boardpoint
  */
  @ApiModelProperty(value = "Board Point")

@Size(min=3,max=3) 
  public String getBoardpoint() {
    return boardpoint;
  }

  public void setBoardpoint(String boardpoint) {
    this.boardpoint = boardpoint;
  }

  public SsrResponseDto offpoint(String offpoint) {
    this.offpoint = offpoint;
    return this;
  }

  /**
   * Off Point
   * @return offpoint
  */
  @ApiModelProperty(value = "Off Point")

@Size(min=3,max=3) 
  public String getOffpoint() {
    return offpoint;
  }

  public void setOffpoint(String offpoint) {
    this.offpoint = offpoint;
  }

  public SsrResponseDto freeText(List<String> freeText) {
    this.freeText = freeText;
    return this;
  }

  public SsrResponseDto addFreeTextItem(String freeTextItem) {
    if (this.freeText == null) {
      this.freeText = new ArrayList<>();
    }
    this.freeText.add(freeTextItem);
    return this;
  }

  /**
   * Get freeText
   * @return freeText
  */
  @ApiModelProperty(value = "")


  public List<String> getFreeText() {
    return freeText;
  }

  public void setFreeText(List<String> freeText) {
    this.freeText = freeText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsrResponseDto ssrResponseDto = (SsrResponseDto) o;
    return Objects.equals(this.type, ssrResponseDto.type) &&
        Objects.equals(this.status, ssrResponseDto.status) &&
        Objects.equals(this.quantity, ssrResponseDto.quantity) &&
        Objects.equals(this.companyId, ssrResponseDto.companyId) &&
        Objects.equals(this.indicator, ssrResponseDto.indicator) &&
        Objects.equals(this.boardpoint, ssrResponseDto.boardpoint) &&
        Objects.equals(this.offpoint, ssrResponseDto.offpoint) &&
        Objects.equals(this.freeText, ssrResponseDto.freeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, quantity, companyId, indicator, boardpoint, offpoint, freeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsrResponseDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    boardpoint: ").append(toIndentedString(boardpoint)).append("\n");
    sb.append("    offpoint: ").append(toIndentedString(offpoint)).append("\n");
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
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

