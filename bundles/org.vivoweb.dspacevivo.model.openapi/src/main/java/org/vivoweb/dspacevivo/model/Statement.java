/*
 * DSpace - VIVO integration project
 * This is the \"DSpace - VIVO integration project\" based on the OpenAPI 3.0 specification. You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3. Some useful links: - [DSpace-VIVO - Integration project of DSpace metadata with VIVO](https://github.com/vivo-community/DSpace-VIVO)  - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.vivoweb.dspacevivo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Statement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-03-30T15:02:28.675-04:00[America/New_York]")public class Statement   {
  @JsonProperty("subjectUri")
  private String subjectUri = null;

  @JsonProperty("predicateUri")
  private String predicateUri = null;

  @JsonProperty("objectUri")
  private String objectUri = null;

  public Statement subjectUri(String subjectUri) {
    this.subjectUri = subjectUri;
    return this;
  }

  /**
   * Get subjectUri
   * @return subjectUri
   **/
  @JsonProperty("subjectUri")
  @Schema(example = "http://localhost:4000/handle/123456789/3", required = true, description = "")
  @NotNull
  public String getSubjectUri() {
    return subjectUri;
  }

  public void setSubjectUri(String subjectUri) {
    this.subjectUri = subjectUri;
  }

  public Statement predicateUri(String predicateUri) {
    this.predicateUri = predicateUri;
    return this;
  }

  /**
   * Get predicateUri
   * @return predicateUri
   **/
  @JsonProperty("predicateUri")
  @Schema(example = "dcterms:isPartOf", required = true, description = "")
  @NotNull
  public String getPredicateUri() {
    return predicateUri;
  }

  public void setPredicateUri(String predicateUri) {
    this.predicateUri = predicateUri;
  }

  public Statement objectUri(String objectUri) {
    this.objectUri = objectUri;
    return this;
  }

  /**
   * Get objectUri
   * @return objectUri
   **/
  @JsonProperty("objectUri")
  @Schema(example = "http://localhost:4000/handle/123456789/3", required = true, description = "")
  @NotNull
  public String getObjectUri() {
    return objectUri;
  }

  public void setObjectUri(String objectUri) {
    this.objectUri = objectUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.subjectUri, statement.subjectUri) &&
        Objects.equals(this.predicateUri, statement.predicateUri) &&
        Objects.equals(this.objectUri, statement.objectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectUri, predicateUri, objectUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    
    sb.append("    subjectUri: ").append(toIndentedString(subjectUri)).append("\n");
    sb.append("    predicateUri: ").append(toIndentedString(predicateUri)).append("\n");
    sb.append("    objectUri: ").append(toIndentedString(objectUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
