/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model for testing model name starting with number
 */
@JsonPropertyOrder({
  Model200Response.JSON_PROPERTY_NAME,
  Model200Response.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class Model200Response {
  public static final String JSON_PROPERTY_NAME = "name";
  private Integer name;

  public static final String JSON_PROPERTY_PROPERTY_CLASS = "class";
  private String propertyClass;

  public Model200Response() {
  }

  /**
  * Constructor with all args parameters
  */
  public Model200Response(@JsonProperty(JSON_PROPERTY_NAME) Integer name, @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS) String propertyClass) {
    this.name = name;
    this.propertyClass = propertyClass;
  }

  public Model200Response name(Integer name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Integer name) {
    this.name = name;
  }

  public Model200Response propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPropertyClass() {
    return propertyClass;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model200Response _200response = (Model200Response) o;
    return Objects.equals(this.name, _200response.name) &&
        Objects.equals(this.propertyClass, _200response.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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

  public static class Builder {

    private Model200Response instance;

    public Builder() {
      this(new Model200Response());
    }

    protected Builder(Model200Response instance) {
      this.instance = instance;
    }

    public Model200Response.Builder name(Integer name) {
      this.instance.name = name;
      return this;
    }
    public Model200Response.Builder propertyClass(String propertyClass) {
      this.instance.propertyClass = propertyClass;
      return this;
    }


    /**
    * returns a built Model200Response instance.
    *
    * The builder is not reusable.
    */
    public Model200Response build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static Model200Response.Builder builder() {
    return new Model200Response.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Model200Response.Builder toBuilder() {
    return new Model200Response.Builder()
      .name(getName())
      .propertyClass(getPropertyClass());
  }


}

