package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodeshareFlightDataTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OtherSegmentDataTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PointOfSaleDataTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerTransactionDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CustomerTransactionDataType   {
  @JsonProperty("codeShare")
  private CodeshareFlightDataTypeI codeShare;

  @JsonProperty("connection")
  private Long connection;

  @JsonProperty("flight")
  private OtherSegmentDataTypeI flight;

  @JsonProperty("pos")
  private PointOfSaleDataTypeI pos;

  public CustomerTransactionDataType codeShare(CodeshareFlightDataTypeI codeShare) {
    this.codeShare = codeShare;
    return this;
  }

  /**
   * Get codeShare
   * @return codeShare
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodeshareFlightDataTypeI getCodeShare() {
    return codeShare;
  }

  public void setCodeShare(CodeshareFlightDataTypeI codeShare) {
    this.codeShare = codeShare;
  }

  public CustomerTransactionDataType connection(Long connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
  */
  @ApiModelProperty(value = "")


  public Long getConnection() {
    return connection;
  }

  public void setConnection(Long connection) {
    this.connection = connection;
  }

  public CustomerTransactionDataType flight(OtherSegmentDataTypeI flight) {
    this.flight = flight;
    return this;
  }

  /**
   * Get flight
   * @return flight
  */
  @ApiModelProperty(value = "")

  @Valid

  public OtherSegmentDataTypeI getFlight() {
    return flight;
  }

  public void setFlight(OtherSegmentDataTypeI flight) {
    this.flight = flight;
  }

  public CustomerTransactionDataType pos(PointOfSaleDataTypeI pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
  */
  @ApiModelProperty(value = "")

  @Valid

  public PointOfSaleDataTypeI getPos() {
    return pos;
  }

  public void setPos(PointOfSaleDataTypeI pos) {
    this.pos = pos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTransactionDataType customerTransactionDataType = (CustomerTransactionDataType) o;
    return Objects.equals(this.codeShare, customerTransactionDataType.codeShare) &&
        Objects.equals(this.connection, customerTransactionDataType.connection) &&
        Objects.equals(this.flight, customerTransactionDataType.flight) &&
        Objects.equals(this.pos, customerTransactionDataType.pos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeShare, connection, flight, pos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTransactionDataType {\n");
    
    sb.append("    codeShare: ").append(toIndentedString(codeShare)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
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

