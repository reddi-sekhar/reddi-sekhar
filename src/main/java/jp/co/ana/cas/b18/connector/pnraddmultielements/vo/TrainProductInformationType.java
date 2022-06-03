package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrainDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrainProductInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TrainProductInformationType   {
  @JsonProperty("trainDetails")
  private TrainDetailsType trainDetails;

  @JsonProperty("type")
  private String type;

  public TrainProductInformationType trainDetails(TrainDetailsType trainDetails) {
    this.trainDetails = trainDetails;
    return this;
  }

  /**
   * Get trainDetails
   * @return trainDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrainDetailsType getTrainDetails() {
    return trainDetails;
  }

  public void setTrainDetails(TrainDetailsType trainDetails) {
    this.trainDetails = trainDetails;
  }

  public TrainProductInformationType type(String type) {
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
    TrainProductInformationType trainProductInformationType = (TrainProductInformationType) o;
    return Objects.equals(this.trainDetails, trainProductInformationType.trainDetails) &&
        Objects.equals(this.type, trainProductInformationType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainDetails, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainProductInformationType {\n");
    
    sb.append("    trainDetails: ").append(toIndentedString(trainDetails)).append("\n");
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

