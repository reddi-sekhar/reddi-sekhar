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
 * DocumentDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DocumentDetailsType   {
  @JsonProperty("countryOfIssue")
  private String countryOfIssue;

  @JsonProperty("expiryDate")
  private String expiryDate;

  @JsonProperty("issueDate")
  private String issueDate;

  @JsonProperty("number")
  private String number;

  @JsonProperty("type")
  private String type;

  public DocumentDetailsType countryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
    return this;
  }

  /**
   * Get countryOfIssue
   * @return countryOfIssue
  */
  @ApiModelProperty(value = "")


  public String getCountryOfIssue() {
    return countryOfIssue;
  }

  public void setCountryOfIssue(String countryOfIssue) {
    this.countryOfIssue = countryOfIssue;
  }

  public DocumentDetailsType expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  */
  @ApiModelProperty(value = "")


  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public DocumentDetailsType issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
  */
  @ApiModelProperty(value = "")


  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  public DocumentDetailsType number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DocumentDetailsType type(String type) {
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
    DocumentDetailsType documentDetailsType = (DocumentDetailsType) o;
    return Objects.equals(this.countryOfIssue, documentDetailsType.countryOfIssue) &&
        Objects.equals(this.expiryDate, documentDetailsType.expiryDate) &&
        Objects.equals(this.issueDate, documentDetailsType.issueDate) &&
        Objects.equals(this.number, documentDetailsType.number) &&
        Objects.equals(this.type, documentDetailsType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfIssue, expiryDate, issueDate, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDetailsType {\n");
    
    sb.append("    countryOfIssue: ").append(toIndentedString(countryOfIssue)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

