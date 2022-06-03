package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * Location.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class Location   {
  
  /** The airport. */
  @JsonProperty("airport")
  private Airport airport;

  /** The city. */
  @JsonProperty("city")
  private City city;

  /**
   * Airport.
   *
   * @param airport the airport
   * @return the location
   */
  public Location airport(Airport airport) {
    this.airport = airport;
    return this;
  }

  /**
   * Get airport.
   *
   * @return airport
   */
  @ApiModelProperty(value = "")

  @Valid

  public Airport getAirport() {
    return airport;
  }

  /**
   * Sets the airport.
   *
   * @param airport the new airport
   */
  public void setAirport(Airport airport) {
    this.airport = airport;
  }

  /**
   * City.
   *
   * @param city the city
   * @return the location
   */
  public Location city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city.
   *
   * @return city
   */
  @ApiModelProperty(value = "")

  @Valid

  public City getCity() {
    return city;
  }

  /**
   * Sets the city.
   *
   * @param city the new city
   */
  public void setCity(City city) {
    this.city = city;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.airport, location.airport)
        && Objects.equals(this.city, location.city);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(airport, city);
  }

  /**
   * To string.
   *
   * @return the string
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

