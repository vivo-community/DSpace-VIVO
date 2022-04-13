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
import java.util.ArrayList;
import java.util.List;
import org.vivoweb.dspacevivo.model.Statement;
import org.vivoweb.dspacevivo.model.StatementLiteral;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-03-30T15:02:28.675-04:00[America/New_York]")public class Item   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("dspaceBitstreamURL")
  private String dspaceBitstreamURL = null;

  @JsonProperty("dspaceIsPartOfCollectionID")
  private String dspaceIsPartOfCollectionID = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("listOfStatements")
  private List<Statement> listOfStatements = null;

  @JsonProperty("listOfStatementLiterals")
  private List<StatementLiteral> listOfStatementLiterals = null;

  public Item id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(example = "123456789/4", required = true, description = "")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item dspaceBitstreamURL(String dspaceBitstreamURL) {
    this.dspaceBitstreamURL = dspaceBitstreamURL;
    return this;
  }

  /**
   * Get dspaceBitstreamURL
   * @return dspaceBitstreamURL
   **/
  @JsonProperty("dspaceBitstreamURL")
  @Schema(example = "http://localhost:4000/bitstream/123456789/3/1/pdf1.pdf", required = true, description = "")
  @NotNull
  public String getDspaceBitstreamURL() {
    return dspaceBitstreamURL;
  }

  public void setDspaceBitstreamURL(String dspaceBitstreamURL) {
    this.dspaceBitstreamURL = dspaceBitstreamURL;
  }

  public Item dspaceIsPartOfCollectionID(String dspaceIsPartOfCollectionID) {
    this.dspaceIsPartOfCollectionID = dspaceIsPartOfCollectionID;
    return this;
  }

  /**
   * Get dspaceIsPartOfCollectionID
   * @return dspaceIsPartOfCollectionID
   **/
  @JsonProperty("dspaceIsPartOfCollectionID")
  @Schema(example = "123456789/2", required = true, description = "")
  @NotNull
  public String getDspaceIsPartOfCollectionID() {
    return dspaceIsPartOfCollectionID;
  }

  public void setDspaceIsPartOfCollectionID(String dspaceIsPartOfCollectionID) {
    this.dspaceIsPartOfCollectionID = dspaceIsPartOfCollectionID;
  }

  public Item uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   **/
  @JsonProperty("uri")
  @Schema(example = "http://localhost:4000/handle/123456789/3", required = true, description = "")
  @NotNull
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Item url(String url) {
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

  public Item listOfStatements(List<Statement> listOfStatements) {
    this.listOfStatements = listOfStatements;
    return this;
  }

  public Item addListOfStatementsItem(Statement listOfStatementsItem) {
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

  public Item listOfStatementLiterals(List<StatementLiteral> listOfStatementLiterals) {
    this.listOfStatementLiterals = listOfStatementLiterals;
    return this;
  }

  public Item addListOfStatementLiteralsItem(StatementLiteral listOfStatementLiteralsItem) {
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
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.dspaceBitstreamURL, item.dspaceBitstreamURL) &&
        Objects.equals(this.dspaceIsPartOfCollectionID, item.dspaceIsPartOfCollectionID) &&
        Objects.equals(this.uri, item.uri) &&
        Objects.equals(this.url, item.url) &&
        Objects.equals(this.listOfStatements, item.listOfStatements) &&
        Objects.equals(this.listOfStatementLiterals, item.listOfStatementLiterals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dspaceBitstreamURL, dspaceIsPartOfCollectionID, uri, url, listOfStatements, listOfStatementLiterals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dspaceBitstreamURL: ").append(toIndentedString(dspaceBitstreamURL)).append("\n");
    sb.append("    dspaceIsPartOfCollectionID: ").append(toIndentedString(dspaceIsPartOfCollectionID)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
