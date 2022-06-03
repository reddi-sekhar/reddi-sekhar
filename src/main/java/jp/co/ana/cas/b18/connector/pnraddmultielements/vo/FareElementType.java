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
 * FareElementType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareElementType   {
  @JsonProperty("baggageAllowance")
  private String baggageAllowance;

  @JsonProperty("connection")
  private String connection;

  @JsonProperty("fareBasis")
  private String fareBasis;

  @JsonProperty("notValidAfter")
  private String notValidAfter;

  @JsonProperty("notValidBefore")
  private String notValidBefore;

  @JsonProperty("primaryCode")
  private String primaryCode;

  @JsonProperty("ticketDesignator")
  private String ticketDesignator;

  public FareElementType baggageAllowance(String baggageAllowance) {
    this.baggageAllowance = baggageAllowance;
    return this;
  }

  /**
   * Get baggageAllowance
   * @return baggageAllowance
  */
  @ApiModelProperty(value = "")


  public String getBaggageAllowance() {
    return baggageAllowance;
  }

  public void setBaggageAllowance(String baggageAllowance) {
    this.baggageAllowance = baggageAllowance;
  }

  public FareElementType connection(String connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
  */
  @ApiModelProperty(value = "")


  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public FareElementType fareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
    return this;
  }

  /**
   * Get fareBasis
   * @return fareBasis
  */
  @ApiModelProperty(value = "")


  public String getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }

  public FareElementType notValidAfter(String notValidAfter) {
    this.notValidAfter = notValidAfter;
    return this;
  }

  /**
   * Get notValidAfter
   * @return notValidAfter
  */
  @ApiModelProperty(value = "")


  public String getNotValidAfter() {
    return notValidAfter;
  }

  public void setNotValidAfter(String notValidAfter) {
    this.notValidAfter = notValidAfter;
  }

  public FareElementType notValidBefore(String notValidBefore) {
    this.notValidBefore = notValidBefore;
    return this;
  }

  /**
   * Get notValidBefore
   * @return notValidBefore
  */
  @ApiModelProperty(value = "")


  public String getNotValidBefore() {
    return notValidBefore;
  }

  public void setNotValidBefore(String notValidBefore) {
    this.notValidBefore = notValidBefore;
  }

  public FareElementType primaryCode(String primaryCode) {
    this.primaryCode = primaryCode;
    return this;
  }

  /**
   * Get primaryCode
   * @return primaryCode
  */
  @ApiModelProperty(value = "")


  public String getPrimaryCode() {
    return primaryCode;
  }

  public void setPrimaryCode(String primaryCode) {
    this.primaryCode = primaryCode;
  }

  public FareElementType ticketDesignator(String ticketDesignator) {
    this.ticketDesignator = ticketDesignator;
    return this;
  }

  /**
   * Get ticketDesignator
   * @return ticketDesignator
  */
  @ApiModelProperty(value = "")


  public String getTicketDesignator() {
    return ticketDesignator;
  }

  public void setTicketDesignator(String ticketDesignator) {
    this.ticketDesignator = ticketDesignator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareElementType fareElementType = (FareElementType) o;
    return Objects.equals(this.baggageAllowance, fareElementType.baggageAllowance) &&
        Objects.equals(this.connection, fareElementType.connection) &&
        Objects.equals(this.fareBasis, fareElementType.fareBasis) &&
        Objects.equals(this.notValidAfter, fareElementType.notValidAfter) &&
        Objects.equals(this.notValidBefore, fareElementType.notValidBefore) &&
        Objects.equals(this.primaryCode, fareElementType.primaryCode) &&
        Objects.equals(this.ticketDesignator, fareElementType.ticketDesignator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baggageAllowance, connection, fareBasis, notValidAfter, notValidBefore, primaryCode, ticketDesignator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareElementType {\n");
    
    sb.append("    baggageAllowance: ").append(toIndentedString(baggageAllowance)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
    sb.append("    notValidAfter: ").append(toIndentedString(notValidAfter)).append("\n");
    sb.append("    notValidBefore: ").append(toIndentedString(notValidBefore)).append("\n");
    sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
    sb.append("    ticketDesignator: ").append(toIndentedString(ticketDesignator)).append("\n");
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

