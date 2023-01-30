/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import java.time.OffsetDateTime;
import org.openapitools.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.http.codec.multipart.Part;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface UserApi {

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/user",
        accept = "application/json",
        contentType = "*/*"
    )
    Mono<ResponseEntity<Void>> createUser(
         @RequestBody Mono<User> body
    );


    /**
     * POST /user/createWithArray : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/user/createWithArray",
        accept = "application/json",
        contentType = "*/*"
    )
    Mono<ResponseEntity<Void>> createUsersWithArrayInput(
         @RequestBody Flux<User> body
    );


    /**
     * POST /user/createWithList : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/user/createWithList",
        accept = "application/json",
        contentType = "*/*"
    )
    Mono<ResponseEntity<Void>> createUsersWithListInput(
         @RequestBody Flux<User> body
    );


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @HttpExchange(
        method = "DELETE",
        value = "/user/{username}",
        accept = "application/json"
    )
    Mono<ResponseEntity<Void>> deleteUser(
         @PathVariable("username") String username
    );


    /**
     * GET /user/{username} : Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @HttpExchange(
        method = "GET",
        value = "/user/{username}",
        accept = "application/json"
    )
    Mono<ResponseEntity<User>> getUserByName(
         @PathVariable("username") String username
    );


    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @HttpExchange(
        method = "GET",
        value = "/user/login",
        accept = "application/json"
    )
    Mono<ResponseEntity<String>> loginUser(
         @RequestParam(value = "username", required = true) String username,
         @RequestParam(value = "password", required = true) String password
    );


    /**
     * GET /user/logout : Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "GET",
        value = "/user/logout",
        accept = "application/json"
    )
    Mono<ResponseEntity<Void>> logoutUser(
        
    );


    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param body Updated user object (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @HttpExchange(
        method = "PUT",
        value = "/user/{username}",
        accept = "application/json",
        contentType = "*/*"
    )
    Mono<ResponseEntity<Void>> updateUser(
         @PathVariable("username") String username,
         @RequestBody Mono<User> body
    );

}
