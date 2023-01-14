package com.task.openapi.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DrugCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-13T22:12:47.351285600+04:00[Asia/Yerevan]")
public class DrugCreateRequest {

  @JsonProperty("name")
  private String name;

  @JsonProperty("nationalDrugCode")
  private Integer nationalDrugCode;

  @JsonProperty("description")
  private String description;

  public DrugCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DrugCreateRequest nationalDrugCode(Integer nationalDrugCode) {
    this.nationalDrugCode = nationalDrugCode;
    return this;
  }

  /**
   * Get nationalDrugCode
   * @return nationalDrugCode
  */
  @NotNull 
  @Schema(name = "nationalDrugCode", required = true)
  public Integer getNationalDrugCode() {
    return nationalDrugCode;
  }

  public void setNationalDrugCode(Integer nationalDrugCode) {
    this.nationalDrugCode = nationalDrugCode;
  }

  public DrugCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugCreateRequest drugCreateRequest = (DrugCreateRequest) o;
    return Objects.equals(this.name, drugCreateRequest.name) &&
        Objects.equals(this.nationalDrugCode, drugCreateRequest.nationalDrugCode) &&
        Objects.equals(this.description, drugCreateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nationalDrugCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nationalDrugCode: ").append(toIndentedString(nationalDrugCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

