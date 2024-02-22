#!/bin/sh

## StoreApi

### Delete purchase order by ID
# deleteOrder

curl -X DELETE http://petstore.swagger.io/v2/store/order/{orderId} \


-H "x-API-key: YOUR_API_KEY"


### Returns pet inventories by status
# getInventory

curl -X GET http://petstore.swagger.io/v2/store/inventory \


-H "x-API-key: YOUR_API_KEY"


### Find purchase order by ID
# getOrderById

curl -X GET http://petstore.swagger.io/v2/store/order/{orderId} \


-H "x-API-key: YOUR_API_KEY"


### Place an order for a pet
# placeOrder

curl -X POST http://petstore.swagger.io/v2/store/order \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

