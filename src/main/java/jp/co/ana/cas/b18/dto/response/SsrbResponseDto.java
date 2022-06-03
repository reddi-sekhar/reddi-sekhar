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
 * SsrbResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SsrbResponseDto   {
  @JsonProperty("crossRef")
  private String crossRef;

  @JsonProperty("data")
  private String data;

  @JsonProperty("seatType")
  @Valid
  private List<String> seatType = null;

  public SsrbResponseDto crossRef(String crossRef) {
    this.crossRef = crossRef;
    return this;
  }

  /**
   * Refers a Traveller / Reference number for association purpose
   * @return crossRef
  */
  @ApiModelProperty(value = "Refers a Traveller / Reference number for association purpose")

@Size(min=1,max=5) 
  public String getCrossRef() {
    return crossRef;
  }

  public void setCrossRef(String crossRef) {
    this.crossRef = crossRef;
  }

  public SsrbResponseDto data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Seat number + row (seat SSR)  Number of seats (Group seat SSR)
   * @return data
  */
  @ApiModelProperty(value = "Seat number + row (seat SSR)  Number of seats (Group seat SSR)")

@Size(min=1,max=4) 
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SsrbResponseDto seatType(List<String> seatType) {
    this.seatType = seatType;
    return this;
  }

  public SsrbResponseDto addSeatTypeItem(String seatTypeItem) {
    if (this.seatType == null) {
      this.seatType = new ArrayList<>();
    }
    this.seatType.add(seatTypeItem);
    return this;
  }

  /**
   * Get seatType
   * @return seatType
  */
  @ApiModelProperty(value = "")


  public List<String> getSeatType() {
    return seatType;
  }

  public void setSeatType(List<String> seatType) {
    this.seatType = seatType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsrbResponseDto ssrbResponseDto = (SsrbResponseDto) o;
    return Objects.equals(this.crossRef, ssrbResponseDto.crossRef) &&
        Objects.equals(this.data, ssrbResponseDto.data) &&
        Objects.equals(this.seatType, ssrbResponseDto.seatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossRef, data, seatType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsrbResponseDto {\n");
    
    sb.append("    crossRef: ").append(toIndentedString(crossRef)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    seatType: ").append(toIndentedString(seatType)).append("\n");
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

