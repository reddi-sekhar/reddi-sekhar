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
 * TravellerNameDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerNameDetailsType   {
  @JsonProperty("displayedName")
  private String displayedName;

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("nameType")
  private String nameType;

  @JsonProperty("referenceName")
  private String referenceName;

  @JsonProperty("romanizationMethod")
  private String romanizationMethod;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("title")
  private String title;

  public TravellerNameDetailsType displayedName(String displayedName) {
    this.displayedName = displayedName;
    return this;
  }

  /**
   * Get displayedName
   * @return displayedName
  */
  @ApiModelProperty(value = "")


  public String getDisplayedName() {
    return displayedName;
  }

  public void setDisplayedName(String displayedName) {
    this.displayedName = displayedName;
  }

  public TravellerNameDetailsType givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  @ApiModelProperty(value = "")


  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public TravellerNameDetailsType nameType(String nameType) {
    this.nameType = nameType;
    return this;
  }

  /**
   * Get nameType
   * @return nameType
  */
  @ApiModelProperty(value = "")


  public String getNameType() {
    return nameType;
  }

  public void setNameType(String nameType) {
    this.nameType = nameType;
  }

  public TravellerNameDetailsType referenceName(String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

  /**
   * Get referenceName
   * @return referenceName
  */
  @ApiModelProperty(value = "")


  public String getReferenceName() {
    return referenceName;
  }

  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }

  public TravellerNameDetailsType romanizationMethod(String romanizationMethod) {
    this.romanizationMethod = romanizationMethod;
    return this;
  }

  /**
   * Get romanizationMethod
   * @return romanizationMethod
  */
  @ApiModelProperty(value = "")


  public String getRomanizationMethod() {
    return romanizationMethod;
  }

  public void setRomanizationMethod(String romanizationMethod) {
    this.romanizationMethod = romanizationMethod;
  }

  public TravellerNameDetailsType surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public TravellerNameDetailsType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerNameDetailsType travellerNameDetailsType = (TravellerNameDetailsType) o;
    return Objects.equals(this.displayedName, travellerNameDetailsType.displayedName) &&
        Objects.equals(this.givenName, travellerNameDetailsType.givenName) &&
        Objects.equals(this.nameType, travellerNameDetailsType.nameType) &&
        Objects.equals(this.referenceName, travellerNameDetailsType.referenceName) &&
        Objects.equals(this.romanizationMethod, travellerNameDetailsType.romanizationMethod) &&
        Objects.equals(this.surname, travellerNameDetailsType.surname) &&
        Objects.equals(this.title, travellerNameDetailsType.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayedName, givenName, nameType, referenceName, romanizationMethod, surname, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerNameDetailsType {\n");
    
    sb.append("    displayedName: ").append(toIndentedString(displayedName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
    sb.append("    romanizationMethod: ").append(toIndentedString(romanizationMethod)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

