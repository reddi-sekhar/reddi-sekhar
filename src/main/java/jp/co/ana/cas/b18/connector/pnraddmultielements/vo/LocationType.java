package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CategoryType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.Location;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LocationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class LocationType   {
  @JsonProperty("location")
  private Location location;

  @JsonProperty("locationCategory")
  private CategoryType locationCategory;

  public LocationType location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public LocationType locationCategory(CategoryType locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

  /**
   * Get locationCategory
   * @return locationCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public CategoryType getLocationCategory() {
    return locationCategory;
  }

  public void setLocationCategory(CategoryType locationCategory) {
    this.locationCategory = locationCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationType locationType = (LocationType) o;
    return Objects.equals(this.location, locationType.location) &&
        Objects.equals(this.locationCategory, locationType.locationCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationType {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationCategory: ").append(toIndentedString(locationCategory)).append("\n");
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

