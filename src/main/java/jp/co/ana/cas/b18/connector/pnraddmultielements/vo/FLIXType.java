package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AirportGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType128813S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemDescriptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FLIXType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FLIXType   {
  @JsonProperty("airportGroup")
  private AirportGroup airportGroup;

  @JsonProperty("flixAndSourceTypes")
  private ItemDescriptionType flixAndSourceTypes;

  @JsonProperty("flixComment")
  private FreeTextInformationType128813S flixComment;

  public FLIXType airportGroup(AirportGroup airportGroup) {
    this.airportGroup = airportGroup;
    return this;
  }

  /**
   * Get airportGroup
   * @return airportGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public AirportGroup getAirportGroup() {
    return airportGroup;
  }

  public void setAirportGroup(AirportGroup airportGroup) {
    this.airportGroup = airportGroup;
  }

  public FLIXType flixAndSourceTypes(ItemDescriptionType flixAndSourceTypes) {
    this.flixAndSourceTypes = flixAndSourceTypes;
    return this;
  }

  /**
   * Get flixAndSourceTypes
   * @return flixAndSourceTypes
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemDescriptionType getFlixAndSourceTypes() {
    return flixAndSourceTypes;
  }

  public void setFlixAndSourceTypes(ItemDescriptionType flixAndSourceTypes) {
    this.flixAndSourceTypes = flixAndSourceTypes;
  }

  public FLIXType flixComment(FreeTextInformationType128813S flixComment) {
    this.flixComment = flixComment;
    return this;
  }

  /**
   * Get flixComment
   * @return flixComment
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType128813S getFlixComment() {
    return flixComment;
  }

  public void setFlixComment(FreeTextInformationType128813S flixComment) {
    this.flixComment = flixComment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FLIXType flIXType = (FLIXType) o;
    return Objects.equals(this.airportGroup, flIXType.airportGroup) &&
        Objects.equals(this.flixAndSourceTypes, flIXType.flixAndSourceTypes) &&
        Objects.equals(this.flixComment, flIXType.flixComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportGroup, flixAndSourceTypes, flixComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FLIXType {\n");
    
    sb.append("    airportGroup: ").append(toIndentedString(airportGroup)).append("\n");
    sb.append("    flixAndSourceTypes: ").append(toIndentedString(flixAndSourceTypes)).append("\n");
    sb.append("    flixComment: ").append(toIndentedString(flixComment)).append("\n");
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

