/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Client;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "$another-fake?", description = "the $another-fake? API")
public interface AnotherFakeApi {

    default AnotherFakeApiDelegate getDelegate() {
        return new AnotherFakeApiDelegate() {};
    }

    /**
     * PATCH /another-fake/dummy : To test special tags
     * To test special tags and operation ID starting with number
     *
     * @param client client model (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "$another-fake?" },
        value = "To test special tags",
        nickname = "call123testSpecialTags",
        notes = "To test special tags and operation ID starting with number",
        response = Client.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = Client.class)
    })
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/another-fake/dummy",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Client> call123testSpecialTags(
        @ApiParam(value = "client model", required = true) @Valid @RequestBody Client client
    ) {
        return getDelegate().call123testSpecialTags(client);
    }

}
