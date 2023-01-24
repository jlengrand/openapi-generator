package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.*

/**
 * Describes the result of uploading an image resource
 * @param code 
 * @param type 
 * @param message 
 */
data class ModelApiResponse(

    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @get:JsonProperty("type") val type: kotlin.String? = null,

    @get:JsonProperty("message") val message: kotlin.String? = null
) {

}

