package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * LocationType1.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class LocationType1   {
  
  /** The location. */
  @JsonProperty("location")
  private Location location;

  /** The location category. */
  @JsonProperty("locationCategory")
  private CategoryType locationCategory;

  /**
   * Location.
   *
   * @param location the location
   * @return the location type 1
   */
  public LocationType1 location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location.
   *
   * @return location
   */
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  /**
   * Sets the location.
   *
   * @param location the new location
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Location category.
   *
   * @param locationCategory the location category
   * @return the location type 1
   */
  public LocationType1 locationCategory(CategoryType locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

  /**
   * Get locationCategory.
   *
   * @return locationCategory
   */
  @ApiModelProperty(value = "")

  @Valid

  public CategoryType getLocationCategory() {
    return locationCategory;
  }

  /**
   * Sets the location category.
   *
   * @param locationCategory the new location category
   */
  public void setLocationCategory(CategoryType locationCategory) {
    this.locationCategory = locationCategory;
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
    LocationType1 locationType1 = (LocationType1) o;
    return Objects.equals(this.location, locationType1.location)
        && Objects.equals(this.locationCategory, locationType1.locationCategory);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(location, locationCategory);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationType1 {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationCategory: ").append(toIndentedString(locationCategory)).append("\n");
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

