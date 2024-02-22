#!/bin/sh

## OrdersApi

### Create an order
# postOrders

curl -X POST https://checkout-test.adyen.com/v71/orders \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Cancel an order
# postOrdersCancel

curl -X POST https://checkout-test.adyen.com/v71/orders/cancel \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Get the balance of a gift card
# postPaymentMethodsBalance

curl -X POST https://checkout-test.adyen.com/v71/paymentMethods/balance \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

