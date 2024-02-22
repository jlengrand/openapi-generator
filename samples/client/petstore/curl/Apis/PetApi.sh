#!/bin/sh

## PetApi

### Add a new pet to the store
# addPet

curl -X POST http://petstore.swagger.io/v2/pet \
-H 'Content-Type: application/json' \ -H 'Content-Type: application/xml' \ 
-H 'Accept: application/json' \ -H 'Accept: application/xml' \ 
-H "x-API-key: YOUR_API_KEY"


### Deletes a pet
# deletePet

curl -X DELETE http://petstore.swagger.io/v2/pet/{petId} \


-H "x-API-key: YOUR_API_KEY"


### Finds Pets by status
# findPetsByStatus

curl -X GET http://petstore.swagger.io/v2/pet/findByStatus \


-H "x-API-key: YOUR_API_KEY"


### Finds Pets by tags
# findPetsByTags

curl -X GET http://petstore.swagger.io/v2/pet/findByTags \


-H "x-API-key: YOUR_API_KEY"


### Find pet by ID
# getPetById

curl -X GET http://petstore.swagger.io/v2/pet/{petId} \


-H "x-API-key: YOUR_API_KEY"


### Update an existing pet
# updatePet

curl -X PUT http://petstore.swagger.io/v2/pet \
-H 'Content-Type: application/json' \ -H 'Content-Type: application/xml' \ 
-H 'Accept: application/json' \ -H 'Accept: application/xml' \ 
-H "x-API-key: YOUR_API_KEY"


### Updates a pet in the store with form data
# updatePetWithForm

curl -X POST http://petstore.swagger.io/v2/pet/{petId} \
-H 'Content-Type: application/x-www-form-urlencoded' \ 
-H 'Accept: application/x-www-form-urlencoded' \ 
-H "x-API-key: YOUR_API_KEY"


### uploads an image
# uploadFile

curl -X POST http://petstore.swagger.io/v2/pet/{petId}/uploadImage \
-H 'Content-Type: multipart/form-data' \ 
-H 'Accept: multipart/form-data' \ 
-H "x-API-key: YOUR_API_KEY"

