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
 * IssueInformationTypeRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class IssueInformationTypeRequestDto   {
  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("documentNumber")
  private String documentNumber;

  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("coupon1")
  private String coupon1;

  @JsonProperty("coupon2")
  private String coupon2;

  @JsonProperty("coupon3")
  private String coupon3;

  @JsonProperty("coupon4")
  private String coupon4;

  @JsonProperty("dateOfIssue")
  private String dateOfIssue;

  @JsonProperty("iataNumber")
  private String iataNumber;

  public IssueInformationTypeRequestDto airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

  /**
   * Numeric airline code
   * @return airlineCode
  */
  @ApiModelProperty(required = true, value = "Numeric airline code")
  @NotNull

@Size(min=3,max=3) 
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public IssueInformationTypeRequestDto documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * {Original issue , exchange for} document number
   * @return documentNumber
  */
  @ApiModelProperty(required = true, value = "{Original issue , exchange for} document number")
  @NotNull

@Size(min=1,max=10) 
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public IssueInformationTypeRequestDto cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * City code of the issue
   * @return cityCode
  */
  @ApiModelProperty(value = "City code of the issue")

@Size(min=3,max=3) 
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public IssueInformationTypeRequestDto coupon1(String coupon1) {
    this.coupon1 = coupon1;
    return this;
  }

  /**
   * 1st coupon number
   * @return coupon1
  */
  @ApiModelProperty(value = "1st coupon number")

@Size(min=1,max=1) 
  public String getCoupon1() {
    return coupon1;
  }

  public void setCoupon1(String coupon1) {
    this.coupon1 = coupon1;
  }

  public IssueInformationTypeRequestDto coupon2(String coupon2) {
    this.coupon2 = coupon2;
    return this;
  }

  /**
   * 2nd coupon number
   * @return coupon2
  */
  @ApiModelProperty(value = "2nd coupon number")

@Size(min=1,max=1) 
  public String getCoupon2() {
    return coupon2;
  }

  public void setCoupon2(String coupon2) {
    this.coupon2 = coupon2;
  }

  public IssueInformationTypeRequestDto coupon3(String coupon3) {
    this.coupon3 = coupon3;
    return this;
  }

  /**
   * 3rd coupon number
   * @return coupon3
  */
  @ApiModelProperty(value = "3rd coupon number")

@Size(min=1,max=1) 
  public String getCoupon3() {
    return coupon3;
  }

  public void setCoupon3(String coupon3) {
    this.coupon3 = coupon3;
  }

  public IssueInformationTypeRequestDto coupon4(String coupon4) {
    this.coupon4 = coupon4;
    return this;
  }

  /**
   * 4th coupon number
   * @return coupon4
  */
  @ApiModelProperty(value = "4th coupon number")

@Size(min=1,max=1) 
  public String getCoupon4() {
    return coupon4;
  }

  public void setCoupon4(String coupon4) {
    this.coupon4 = coupon4;
  }

  public IssueInformationTypeRequestDto dateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Get dateOfIssue
   * @return dateOfIssue
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public IssueInformationTypeRequestDto iataNumber(String iataNumber) {
    this.iataNumber = iataNumber;
    return this;
  }

  /**
   * IATA number
   * @return iataNumber
  */
  @ApiModelProperty(value = "IATA number")

@Size(min=1,max=9) 
  public String getIataNumber() {
    return iataNumber;
  }

  public void setIataNumber(String iataNumber) {
    this.iataNumber = iataNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueInformationTypeRequestDto issueInformationTypeRequestDto = (IssueInformationTypeRequestDto) o;
    return Objects.equals(this.airlineCode, issueInformationTypeRequestDto.airlineCode) &&
        Objects.equals(this.documentNumber, issueInformationTypeRequestDto.documentNumber) &&
        Objects.equals(this.cityCode, issueInformationTypeRequestDto.cityCode) &&
        Objects.equals(this.coupon1, issueInformationTypeRequestDto.coupon1) &&
        Objects.equals(this.coupon2, issueInformationTypeRequestDto.coupon2) &&
        Objects.equals(this.coupon3, issueInformationTypeRequestDto.coupon3) &&
        Objects.equals(this.coupon4, issueInformationTypeRequestDto.coupon4) &&
        Objects.equals(this.dateOfIssue, issueInformationTypeRequestDto.dateOfIssue) &&
        Objects.equals(this.iataNumber, issueInformationTypeRequestDto.iataNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineCode, documentNumber, cityCode, coupon1, coupon2, coupon3, coupon4, dateOfIssue, iataNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueInformationTypeRequestDto {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    coupon1: ").append(toIndentedString(coupon1)).append("\n");
    sb.append("    coupon2: ").append(toIndentedString(coupon2)).append("\n");
    sb.append("    coupon3: ").append(toIndentedString(coupon3)).append("\n");
    sb.append("    coupon4: ").append(toIndentedString(coupon4)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    iataNumber: ").append(toIndentedString(iataNumber)).append("\n");
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

