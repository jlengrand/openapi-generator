/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.ApiCategory
import org.openapitools.client.models.ApiTag

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.google.gson.annotations.JsonAdapter
import java.io.IOException
import com.google.gson.annotations.SerializedName

/**
 * A pet for sale in the pet store
 *
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */


data class ApiPet (

    @SerializedName("name")
    val name: kotlin.String,

    @SerializedName("photoUrls")
    val photoUrls: kotlin.collections.List<kotlin.String>,

    @SerializedName("id")
    val id: kotlin.Long? = null,

    @SerializedName("category")
    val category: ApiCategory? = null,

    @SerializedName("tags")
    val tags: kotlin.collections.List<ApiTag>? = null,

    /* pet status in the store */
    @SerializedName("status")
    @Deprecated(message = "This property is deprecated.")
    val status: ApiPet.Status? = null

) {

    /**
     * pet status in the store
     *
     * Values: AVAILABLE,PENDING,SOLD
     */
    enum class Status(val value: kotlin.String) {
        @SerializedName(value = "available") AVAILABLE("available"),
        @SerializedName(value = "pending") PENDING("pending"),
        @SerializedName(value = "sold") SOLD("sold");
    }

    class CustomTypeAdapterFactory : TypeAdapterFactory {
        override fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
            if (!ApiPet::class.java.isAssignableFrom(type.rawType)) {
              return null // this class only serializes 'ApiPet' and its subtypes
            }
            val elementAdapter = gson.getAdapter(JsonElement::class.java)
            val thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(ApiPet::class.java))

            @Suppress("UNCHECKED_CAST")
            return object : TypeAdapter<ApiPet>() {
                @Throws(IOException::class)
                override fun write(out: JsonWriter, value: ApiPet) {
                    val obj = thisAdapter.toJsonTree(value).getAsJsonObject()
                    elementAdapter.write(out, obj)
                }

                @Throws(IOException::class)
                override fun read(jsonReader: JsonReader): ApiPet  {
                    val jsonElement = elementAdapter.read(jsonReader)
                    validateJsonElement(jsonElement)
                    return thisAdapter.fromJsonTree(jsonElement)
                }
            }.nullSafe() as TypeAdapter<T>
        }
    }

    companion object {
        var openapiFields = HashSet<String>()
        var openapiRequiredFields = HashSet<String>()
      
        init {
            // a set of all properties/fields (JSON key names)
            openapiFields.add("name")
            openapiFields.add("photoUrls")
            openapiFields.add("id")
            openapiFields.add("category")
            openapiFields.add("tags")
            openapiFields.add("status")

            // a set of required properties/fields (JSON key names)
            openapiRequiredFields.add("name")
            openapiRequiredFields.add("photoUrls")
        }
      
       /**
        * Validates the JSON Element and throws an exception if issues found
        *
        * @param jsonElement JSON Element
        * @throws IOException if the JSON Element is invalid with respect to ApiPet
        */
        @Throws(IOException::class)
        fun validateJsonElement(jsonElement: JsonElement?) {
            if (jsonElement == null) {
              require(openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                String.format("The required field(s) %s in ApiPet is not found in the empty JSON string", ApiPet.openapiRequiredFields.toString())
              }
            }
      
            // check to make sure all required properties/fields are present in the JSON string
            for (requiredField in openapiRequiredFields) {
              requireNotNull(jsonElement!!.getAsJsonObject()[requiredField]) {
                String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString())
              }
            }
            val jsonObj = jsonElement!!.getAsJsonObject()
            require(jsonObj["name"].isJsonPrimitive) {
              String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj["name"].toString())
            }
            // ensure the required json array is present
            requireNotNull(jsonObj["photoUrls"]) {
              "Expected the field `photoUrls` to be an array in the JSON string but got `null`"
            }
            require(jsonObj["photoUrls"].isJsonArray()) {
              String.format("Expected the field `photoUrls` to be an array in the JSON string but got `%s`", jsonObj["photoUrls"].toString())
            }
            // validate the optional field `category`
            if (jsonObj["category"] != null && !jsonObj["category"].isJsonNull) {
              ApiCategory.validateJsonElement(jsonObj["category"])
            }
            if (jsonObj["tags"] != null && !jsonObj["tags"].isJsonNull) {
              val jsonArraytags = jsonObj.getAsJsonArray("tags")
              if (jsonArraytags != null) {
                // ensure the json data is an array
                require(jsonObj["tags"].isJsonArray) {
                  String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj["tags"].toString())
                }
      
                // validate the optional field `tags` (array)
                for (i in 0 until jsonArraytags.size()) {
                  ApiTag.validateJsonElement(jsonArraytags[i])
                }
              }
            }
            if (jsonObj["status"] != null && !jsonObj["status"].isJsonNull) {
              require(jsonObj.get("status").isJsonPrimitive) {
                String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj["status"].toString())
              }
            }
            // validate the optional field `status`
            if (jsonObj["status"] != null && !jsonObj["status"].isJsonNull) {
                require(Status.values().any { it.value == jsonObj["status"].asString }) {
                    String.format("Expected the field `status` to be valid `Status` enum value in the JSON string but got `%s`", jsonObj["status"].toString())
                }
            }
        }
    }

}

