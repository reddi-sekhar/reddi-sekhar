package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PackageIdentificationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PackageDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PackageDescriptionType   {
  @JsonProperty("packageDetails")
  private PackageIdentificationType packageDetails;

  @JsonProperty("packageType")
  private String packageType;

  public PackageDescriptionType packageDetails(PackageIdentificationType packageDetails) {
    this.packageDetails = packageDetails;
    return this;
  }

  /**
   * Get packageDetails
   * @return packageDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PackageIdentificationType getPackageDetails() {
    return packageDetails;
  }

  public void setPackageDetails(PackageIdentificationType packageDetails) {
    this.packageDetails = packageDetails;
  }

  public PackageDescriptionType packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * Get packageType
   * @return packageType
  */
  @ApiModelProperty(value = "")


  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDescriptionType packageDescriptionType = (PackageDescriptionType) o;
    return Objects.equals(this.packageDetails, packageDescriptionType.packageDetails) &&
        Objects.equals(this.packageType, packageDescriptionType.packageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageDetails, packageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDescriptionType {\n");
    
    sb.append("    packageDetails: ").append(toIndentedString(packageDetails)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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

