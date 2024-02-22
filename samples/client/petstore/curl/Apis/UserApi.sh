#!/bin/sh

## UserApi

### Create user
# createUser

curl -X POST http://petstore.swagger.io/v2/user \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Creates list of users with given input array
# createUsersWithArrayInput

curl -X POST http://petstore.swagger.io/v2/user/createWithArray \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Creates list of users with given input array
# createUsersWithListInput

curl -X POST http://petstore.swagger.io/v2/user/createWithList \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Delete user
# deleteUser

curl -X DELETE http://petstore.swagger.io/v2/user/{username} \


-H "x-API-key: YOUR_API_KEY"


### Get user by user name
# getUserByName

curl -X GET http://petstore.swagger.io/v2/user/{username} \


-H "x-API-key: YOUR_API_KEY"


### Logs user into the system
# loginUser

curl -X GET http://petstore.swagger.io/v2/user/login \


-H "x-API-key: YOUR_API_KEY"


### Logs out current logged in user session
# logoutUser

curl -X GET http://petstore.swagger.io/v2/user/logout \


-H "x-API-key: YOUR_API_KEY"


### Updated user
# updateUser

curl -X PUT http://petstore.swagger.io/v2/user/{username} \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

