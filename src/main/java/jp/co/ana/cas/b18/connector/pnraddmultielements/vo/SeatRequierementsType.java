package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatRequierementsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SeatRequierementsType   {
  @JsonProperty("boardpoint")
  private String boardpoint;

  @JsonProperty("offpoint")
  private String offpoint;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("type")
  private String type;

  public SeatRequierementsType boardpoint(String boardpoint) {
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

  public SeatRequierementsType offpoint(String offpoint) {
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

  public SeatRequierementsType qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public SeatRequierementsType type(String type) {
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
    SeatRequierementsType seatRequierementsType = (SeatRequierementsType) o;
    return Objects.equals(this.boardpoint, seatRequierementsType.boardpoint) &&
        Objects.equals(this.offpoint, seatRequierementsType.offpoint) &&
        Objects.equals(this.qualifier, seatRequierementsType.qualifier) &&
        Objects.equals(this.type, seatRequierementsType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardpoint, offpoint, qualifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatRequierementsType {\n");
    
    sb.append("    boardpoint: ").append(toIndentedString(boardpoint)).append("\n");
    sb.append("    offpoint: ").append(toIndentedString(offpoint)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

