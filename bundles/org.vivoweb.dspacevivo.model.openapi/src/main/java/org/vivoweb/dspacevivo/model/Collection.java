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
import java.util.ArrayList;
import java.util.List;
import org.vivoweb.dspacevivo.model.Item;
import org.vivoweb.dspacevivo.model.Statement;
import org.vivoweb.dspacevivo.model.StatementLiteral;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Collection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-05-29T23:34:38.851-05:00[America/Guayaquil]")public class Collection   {
  @JsonProperty("dspaceType")
  private String dspaceType = "collection";

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("hasItem")
  private List<Item> hasItem = null;

  @JsonProperty("isPartOfCommunityID")
  private List<String> isPartOfCommunityID = null;

  @JsonProperty("listOfStatements")
  private List<Statement> listOfStatements = null;

  @JsonProperty("listOfStatementLiterals")
  private List<StatementLiteral> listOfStatementLiterals = null;

  /**
   * Get dspaceType
   * @return dspaceType
   **/
  @JsonProperty("dspaceType")
  @Schema(description = "")
  public String getDspaceType() {
    return dspaceType;
  }

  public Collection id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(example = "123456789/2", required = true, description = "")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Collection uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   **/
  @JsonProperty("uri")
  @Schema(example = "http://localhost:4000/handle/123456789/2", required = true, description = "")
  @NotNull
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Collection url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @JsonProperty("url")
  @Schema(example = "http://localhost:4000/items/948d534a-e1d9-41b2-bb23-1ae2fe9cff4f", required = true, description = "")
  @NotNull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Collection hasItem(List<Item> hasItem) {
    this.hasItem = hasItem;
    return this;
  }

  public Collection addHasItemItem(Item hasItemItem) {
    if (this.hasItem == null) {
      this.hasItem = new ArrayList<>();
    }
    this.hasItem.add(hasItemItem);
    return this;
  }

  /**
   * Get hasItem
   * @return hasItem
   **/
  @JsonProperty("hasItem")
  @Schema(description = "")
  @Valid
  public List<Item> getHasItem() {
    return hasItem;
  }

  public void setHasItem(List<Item> hasItem) {
    this.hasItem = hasItem;
  }

  public Collection isPartOfCommunityID(List<String> isPartOfCommunityID) {
    this.isPartOfCommunityID = isPartOfCommunityID;
    return this;
  }

  public Collection addIsPartOfCommunityIDItem(String isPartOfCommunityIDItem) {
    if (this.isPartOfCommunityID == null) {
      this.isPartOfCommunityID = new ArrayList<>();
    }
    this.isPartOfCommunityID.add(isPartOfCommunityIDItem);
    return this;
  }

  /**
   * Get isPartOfCommunityID
   * @return isPartOfCommunityID
   **/
  @JsonProperty("isPartOfCommunityID")
  @Schema(description = "")
  public List<String> getIsPartOfCommunityID() {
    return isPartOfCommunityID;
  }

  public void setIsPartOfCommunityID(List<String> isPartOfCommunityID) {
    this.isPartOfCommunityID = isPartOfCommunityID;
  }

  public Collection listOfStatements(List<Statement> listOfStatements) {
    this.listOfStatements = listOfStatements;
    return this;
  }

  public Collection addListOfStatementsItem(Statement listOfStatementsItem) {
    if (this.listOfStatements == null) {
      this.listOfStatements = new ArrayList<>();
    }
    this.listOfStatements.add(listOfStatementsItem);
    return this;
  }

  /**
   * Get listOfStatements
   * @return listOfStatements
   **/
  @JsonProperty("listOfStatements")
  @Schema(description = "")
  @Valid
  public List<Statement> getListOfStatements() {
    return listOfStatements;
  }

  public void setListOfStatements(List<Statement> listOfStatements) {
    this.listOfStatements = listOfStatements;
  }

  public Collection listOfStatementLiterals(List<StatementLiteral> listOfStatementLiterals) {
    this.listOfStatementLiterals = listOfStatementLiterals;
    return this;
  }

  public Collection addListOfStatementLiteralsItem(StatementLiteral listOfStatementLiteralsItem) {
    if (this.listOfStatementLiterals == null) {
      this.listOfStatementLiterals = new ArrayList<>();
    }
    this.listOfStatementLiterals.add(listOfStatementLiteralsItem);
    return this;
  }

  /**
   * Get listOfStatementLiterals
   * @return listOfStatementLiterals
   **/
  @JsonProperty("listOfStatementLiterals")
  @Schema(description = "")
  @Valid
  public List<StatementLiteral> getListOfStatementLiterals() {
    return listOfStatementLiterals;
  }

  public void setListOfStatementLiterals(List<StatementLiteral> listOfStatementLiterals) {
    this.listOfStatementLiterals = listOfStatementLiterals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collection collection = (Collection) o;
    return Objects.equals(this.dspaceType, collection.dspaceType) &&
        Objects.equals(this.id, collection.id) &&
        Objects.equals(this.uri, collection.uri) &&
        Objects.equals(this.url, collection.url) &&
        Objects.equals(this.hasItem, collection.hasItem) &&
        Objects.equals(this.isPartOfCommunityID, collection.isPartOfCommunityID) &&
        Objects.equals(this.listOfStatements, collection.listOfStatements) &&
        Objects.equals(this.listOfStatementLiterals, collection.listOfStatementLiterals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dspaceType, id, uri, url, hasItem, isPartOfCommunityID, listOfStatements, listOfStatementLiterals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collection {\n");
    
    sb.append("    dspaceType: ").append(toIndentedString(dspaceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    hasItem: ").append(toIndentedString(hasItem)).append("\n");
    sb.append("    isPartOfCommunityID: ").append(toIndentedString(isPartOfCommunityID)).append("\n");
    sb.append("    listOfStatements: ").append(toIndentedString(listOfStatements)).append("\n");
    sb.append("    listOfStatementLiterals: ").append(toIndentedString(listOfStatementLiterals)).append("\n");
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
