package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

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
 * SpecialRequirementsTypeDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsTypeDetailsTypeI1   {
  @JsonProperty("boardpoint")
  private String boardpoint;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("freetext")
  @Valid
  private List<String> freetext = null;

  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("offpoint")
  private String offpoint;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("status")
  private String status;

  @JsonProperty("type")
  private String type;

  public SpecialRequirementsTypeDetailsTypeI1 boardpoint(String boardpoint) {
    this.boardpoint = boardpoint;
    return this;
  }

  /**
   * Get boardpoint
   * @return boardpoint
  */
  @ApiModelProperty(value = "")


  public String getBoardpoint() {
    return boardpoint;
  }

  public void setBoardpoint(String boardpoint) {
    this.boardpoint = boardpoint;
  }

  public SpecialRequirementsTypeDetailsTypeI1 companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public SpecialRequirementsTypeDetailsTypeI1 freetext(List<String> freetext) {
    this.freetext = freetext;
    return this;
  }

  public SpecialRequirementsTypeDetailsTypeI1 addFreetextItem(String freetextItem) {
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

  public SpecialRequirementsTypeDetailsTypeI1 indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
  */
  @ApiModelProperty(value = "")


  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public SpecialRequirementsTypeDetailsTypeI1 offpoint(String offpoint) {
    this.offpoint = offpoint;
    return this;
  }

  /**
   * Get offpoint
   * @return offpoint
  */
  @ApiModelProperty(value = "")


  public String getOffpoint() {
    return offpoint;
  }

  public void setOffpoint(String offpoint) {
    this.offpoint = offpoint;
  }

  public SpecialRequirementsTypeDetailsTypeI1 quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public SpecialRequirementsTypeDetailsTypeI1 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SpecialRequirementsTypeDetailsTypeI1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


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
    SpecialRequirementsTypeDetailsTypeI1 specialRequirementsTypeDetailsTypeI1 = (SpecialRequirementsTypeDetailsTypeI1) o;
    return Objects.equals(this.boardpoint, specialRequirementsTypeDetailsTypeI1.boardpoint) &&
        Objects.equals(this.companyId, specialRequirementsTypeDetailsTypeI1.companyId) &&
        Objects.equals(this.freetext, specialRequirementsTypeDetailsTypeI1.freetext) &&
        Objects.equals(this.indicator, specialRequirementsTypeDetailsTypeI1.indicator) &&
        Objects.equals(this.offpoint, specialRequirementsTypeDetailsTypeI1.offpoint) &&
        Objects.equals(this.quantity, specialRequirementsTypeDetailsTypeI1.quantity) &&
        Objects.equals(this.status, specialRequirementsTypeDetailsTypeI1.status) &&
        Objects.equals(this.type, specialRequirementsTypeDetailsTypeI1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardpoint, companyId, freetext, indicator, offpoint, quantity, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsTypeDetailsTypeI1 {\n");
    
    sb.append("    boardpoint: ").append(toIndentedString(boardpoint)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    offpoint: ").append(toIndentedString(offpoint)).append("\n");
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

