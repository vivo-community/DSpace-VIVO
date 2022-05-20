/*
 * DSpace-VIVO EXchange Data Schema (DVExDS)
 * This is the \"DSpace-VIVO EXchange Data Schema (DVExDS)\" based on the OpenAPI 3.0.2 specification. You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3. Some useful links: - [DSpace-VIVO - Integration project of DSpace metadata with VIVO](https://github.com/vivo-community/DSpace-VIVO)  - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.1.0
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
 * StatementLiteral
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-05-20T15:51:48.468630-04:00[America/New_York]")public class StatementLiteral   {
  @JsonProperty("dspaceType")
  private String dspaceType = "statementLiteral";

  @JsonProperty("subjectUri")
  private String subjectUri = null;

  @JsonProperty("predicateUri")
  private String predicateUri = null;

  @JsonProperty("objectLiteral")
  private String objectLiteral = null;

  @JsonProperty("literalType")
  private String literalType = null;

  /**
   * Get dspaceType
   * @return dspaceType
   **/
  @JsonProperty("dspaceType")
  @Schema(description = "")
  public String getDspaceType() {
    return dspaceType;
  }

  public StatementLiteral subjectUri(String subjectUri) {
    this.subjectUri = subjectUri;
    return this;
  }

  /**
   * Get subjectUri
   * @return subjectUri
   **/
  @JsonProperty("subjectUri")
  @Schema(example = "http://dspacevivo.vivoweb.org/individual/123456789_68", required = true, description = "")
  @NotNull
  public String getSubjectUri() {
    return subjectUri;
  }

  public void setSubjectUri(String subjectUri) {
    this.subjectUri = subjectUri;
  }

  public StatementLiteral predicateUri(String predicateUri) {
    this.predicateUri = predicateUri;
    return this;
  }

  /**
   * Get predicateUri
   * @return predicateUri
   **/
  @JsonProperty("predicateUri")
  @Schema(example = "dcterms:title", required = true, description = "")
  @NotNull
  public String getPredicateUri() {
    return predicateUri;
  }

  public void setPredicateUri(String predicateUri) {
    this.predicateUri = predicateUri;
  }

  public StatementLiteral objectLiteral(String objectLiteral) {
    this.objectLiteral = objectLiteral;
    return this;
  }

  /**
   * Get objectLiteral
   * @return objectLiteral
   **/
  @JsonProperty("objectLiteral")
  @Schema(example = "some title", required = true, description = "")
  @NotNull
  public String getObjectLiteral() {
    return objectLiteral;
  }

  public void setObjectLiteral(String objectLiteral) {
    this.objectLiteral = objectLiteral;
  }

  public StatementLiteral literalType(String literalType) {
    this.literalType = literalType;
    return this;
  }

  /**
   * Get literalType
   * @return literalType
   **/
  @JsonProperty("literalType")
  @Schema(example = "xsd:string", required = true, description = "")
  @NotNull
  public String getLiteralType() {
    return literalType;
  }

  public void setLiteralType(String literalType) {
    this.literalType = literalType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementLiteral statementLiteral = (StatementLiteral) o;
    return Objects.equals(this.dspaceType, statementLiteral.dspaceType) &&
        Objects.equals(this.subjectUri, statementLiteral.subjectUri) &&
        Objects.equals(this.predicateUri, statementLiteral.predicateUri) &&
        Objects.equals(this.objectLiteral, statementLiteral.objectLiteral) &&
        Objects.equals(this.literalType, statementLiteral.literalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dspaceType, subjectUri, predicateUri, objectLiteral, literalType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementLiteral {\n");
    
    sb.append("    dspaceType: ").append(toIndentedString(dspaceType)).append("\n");
    sb.append("    subjectUri: ").append(toIndentedString(subjectUri)).append("\n");
    sb.append("    predicateUri: ").append(toIndentedString(predicateUri)).append("\n");
    sb.append("    objectLiteral: ").append(toIndentedString(objectLiteral)).append("\n");
    sb.append("    literalType: ").append(toIndentedString(literalType)).append("\n");
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
