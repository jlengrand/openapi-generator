package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Animal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Cat
 */

@JsonIgnoreProperties(
  value = "className", // ignore manually set className, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the className to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = BigCat.class, name = "BigCat")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class Cat extends Animal {

  private Optional<Boolean> declawed = Optional.empty();

  public Cat() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Cat(String className) {
    super(className);
  }

  public Cat declawed(Boolean declawed) {
    this.declawed = Optional.of(declawed);
    return this;
  }

  /**
   * Get declawed
   * @return declawed
  */
  
  @ApiModelProperty(value = "")
  @JsonProperty("declawed")
  public Optional<Boolean> getDeclawed() {
    return declawed;
  }

  public void setDeclawed(Optional<Boolean> declawed) {
    this.declawed = declawed;
  }


  public Cat className(String className) {
    super.className(className);
    return this;
  }

  public Cat color(String color) {
    super.color(color);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return Objects.equals(this.declawed, cat.declawed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declawed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
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
  
  public static class Builder extends Animal.Builder {

    private Cat instance;

    public Builder() {
      this(new Cat());
    }

    protected Builder(Cat instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(Cat value) { 
      super.copyOf(instance);
      this.instance.setDeclawed(value.declawed);
      return this;
    }

    public Cat.Builder declawed(Boolean declawed) {
      this.instance.declawed(declawed);
      return this;
    }
    
    @Override
    public Cat.Builder className(String className) {
      this.instance.className(className);
      return this;
    }
    
    @Override
    public Cat.Builder color(String color) {
      this.instance.color(color);
      return this;
    }
    
    /**
    * returns a built Cat instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Cat build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static Cat.Builder builder() {
    return new Cat.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Cat.Builder toBuilder() {
    Cat.Builder builder = new Cat.Builder();
    return builder.copyOf(this);
  }

}

