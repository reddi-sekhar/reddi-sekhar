package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType127282S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DcsSegmentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DcsSegmentInfo   {
  @JsonProperty("booking")
  private Object booking;

  @JsonProperty("paxType")
  private ReferenceInformationTypeI paxType;

  @JsonProperty("typeOfCOP")
  private CodedAttributeType127282S typeOfCOP;

  public DcsSegmentInfo booking(Object booking) {
    this.booking = booking;
    return this;
  }

  /**
   * Get booking
   * @return booking
  */
  @ApiModelProperty(value = "")


  public Object getBooking() {
    return booking;
  }

  public void setBooking(Object booking) {
    this.booking = booking;
  }

  public DcsSegmentInfo paxType(ReferenceInformationTypeI paxType) {
    this.paxType = paxType;
    return this;
  }

  /**
   * Get paxType
   * @return paxType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationTypeI getPaxType() {
    return paxType;
  }

  public void setPaxType(ReferenceInformationTypeI paxType) {
    this.paxType = paxType;
  }

  public DcsSegmentInfo typeOfCOP(CodedAttributeType127282S typeOfCOP) {
    this.typeOfCOP = typeOfCOP;
    return this;
  }

  /**
   * Get typeOfCOP
   * @return typeOfCOP
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeType127282S getTypeOfCOP() {
    return typeOfCOP;
  }

  public void setTypeOfCOP(CodedAttributeType127282S typeOfCOP) {
    this.typeOfCOP = typeOfCOP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcsSegmentInfo dcsSegmentInfo = (DcsSegmentInfo) o;
    return Objects.equals(this.booking, dcsSegmentInfo.booking) &&
        Objects.equals(this.paxType, dcsSegmentInfo.paxType) &&
        Objects.equals(this.typeOfCOP, dcsSegmentInfo.typeOfCOP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booking, paxType, typeOfCOP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcsSegmentInfo {\n");
    
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
    sb.append("    paxType: ").append(toIndentedString(paxType)).append("\n");
    sb.append("    typeOfCOP: ").append(toIndentedString(typeOfCOP)).append("\n");
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

