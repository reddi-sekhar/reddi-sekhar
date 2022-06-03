package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * CompanyNameType.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class CompanyNameType   {
  
  /** The code. */
  @JsonProperty("code")
  private String code;

  /** The code context. */
  @JsonProperty("codeContext")
  private String codeContext;

  /** The company short name. */
  @JsonProperty("companyShortName")
  private String companyShortName;

  /** The department. */
  @JsonProperty("department")
  private String department;

  /** The division. */
  @JsonProperty("division")
  private String division;

  /** The travel sector. */
  @JsonProperty("travelSector")
  private String travelSector;

  /** The value. */
  @JsonProperty("value")
  private String value;

  /**
   * Code.
   *
   * @param code the code
   * @return the company name type
   */
  public CompanyNameType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code.
   *
   * @return code
   */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  /**
   * Sets the code.
   *
   * @param code the new code
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Code context.
   *
   * @param codeContext the code context
   * @return the company name type
   */
  public CompanyNameType codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Get codeContext.
   *
   * @return codeContext
   */
  @ApiModelProperty(value = "")


  public String getCodeContext() {
    return codeContext;
  }

  /**
   * Sets the code context.
   *
   * @param codeContext the new code context
   */
  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  /**
   * Company short name.
   *
   * @param companyShortName the company short name
   * @return the company name type
   */
  public CompanyNameType companyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
    return this;
  }

  /**
   * Get companyShortName.
   *
   * @return companyShortName
   */
  @ApiModelProperty(value = "")


  public String getCompanyShortName() {
    return companyShortName;
  }

  /**
   * Sets the company short name.
   *
   * @param companyShortName the new company short name
   */
  public void setCompanyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
  }

  /**
   * Department.
   *
   * @param department the department
   * @return the company name type
   */
  public CompanyNameType department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department.
   *
   * @return department
   */
  @ApiModelProperty(value = "")


  public String getDepartment() {
    return department;
  }

  /**
   * Sets the department.
   *
   * @param department the new department
   */
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * Division.
   *
   * @param division the division
   * @return the company name type
   */
  public CompanyNameType division(String division) {
    this.division = division;
    return this;
  }

  /**
   * Get division.
   *
   * @return division
   */
  @ApiModelProperty(value = "")


  public String getDivision() {
    return division;
  }

  /**
   * Sets the division.
   *
   * @param division the new division
   */
  public void setDivision(String division) {
    this.division = division;
  }

  /**
   * Travel sector.
   *
   * @param travelSector the travel sector
   * @return the company name type
   */
  public CompanyNameType travelSector(String travelSector) {
    this.travelSector = travelSector;
    return this;
  }

  /**
   * Get travelSector.
   *
   * @return travelSector
   */
  @ApiModelProperty(value = "")


  public String getTravelSector() {
    return travelSector;
  }

  /**
   * Sets the travel sector.
   *
   * @param travelSector the new travel sector
   */
  public void setTravelSector(String travelSector) {
    this.travelSector = travelSector;
  }

  /**
   * Value.
   *
   * @param value the value
   * @return the company name type
   */
  public CompanyNameType value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value.
   *
   * @return value
   */
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(String value) {
    this.value = value;
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
    CompanyNameType companyNameType = (CompanyNameType) o;
    return Objects.equals(this.code, companyNameType.code)
        && Objects.equals(this.codeContext, companyNameType.codeContext)
        && Objects.equals(this.companyShortName, companyNameType.companyShortName)
        && Objects.equals(this.department, companyNameType.department)
        && Objects.equals(this.division, companyNameType.division)
        && Objects.equals(this.travelSector, companyNameType.travelSector)
        && Objects.equals(this.value, companyNameType.value);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(code, codeContext, companyShortName,
        department, division, travelSector, value);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyNameType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeContext: ").append(toIndentedString(codeContext)).append("\n");
    sb.append("    companyShortName: ").append(toIndentedString(companyShortName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    travelSector: ").append(toIndentedString(travelSector)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

