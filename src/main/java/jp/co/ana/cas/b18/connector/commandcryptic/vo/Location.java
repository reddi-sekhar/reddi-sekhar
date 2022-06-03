package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.Airport;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.City;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class Location   {
  @JsonProperty("airport")
  private Airport airport;

  @JsonProperty("city")
  private City city;

  public Location airport(Airport airport) {
    this.airport = airport;
    return this;
  }

  /**
   * Get airport
   * @return airport
  */
  @ApiModelProperty(value = "")

  @Valid

  public Airport getAirport() {
    return airport;
  }

  public void setAirport(Airport airport) {
    this.airport = airport;
  }

  public Location city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")

  @Valid

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.airport, location.airport) &&
        Objects.equals(this.city, location.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airport, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

