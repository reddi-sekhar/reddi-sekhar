package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OtherPaxNamesDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OtherPaxNamesDetails1RequestDto   {
  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("title")
  private String title;

  public OtherPaxNamesDetails1RequestDto givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Traveler First Name
   * @return givenName
  */
  @ApiModelProperty(value = "Traveler First Name")

@Size(min=1,max=56) 
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public OtherPaxNamesDetails1RequestDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Traveler Last Name or Group name.
   * @return surname
  */
  @ApiModelProperty(value = "Traveler Last Name or Group name.")

@Size(min=1,max=57) 
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public OtherPaxNamesDetails1RequestDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title separated from the firstname
   * @return title
  */
  @ApiModelProperty(value = "Title separated from the firstname")

@Size(min=1,max=70) 
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
    OtherPaxNamesDetails1RequestDto otherPaxNamesDetails1RequestDto = (OtherPaxNamesDetails1RequestDto) o;
    return Objects.equals(this.givenName, otherPaxNamesDetails1RequestDto.givenName) &&
        Objects.equals(this.surname, otherPaxNamesDetails1RequestDto.surname) &&
        Objects.equals(this.title, otherPaxNamesDetails1RequestDto.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, surname, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherPaxNamesDetails1RequestDto {\n");
    
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
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

