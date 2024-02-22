#!/bin/sh

## PaymentsApi

### Get the result of a payment session
# getSessionsSessionId

curl -X GET https://checkout-test.adyen.com/v71/sessions/{sessionId} \


-H "x-API-key: YOUR_API_KEY"


### Get the list of brands on the card
# postCardDetails

curl -X POST https://checkout-test.adyen.com/v71/cardDetails \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Get a list of available payment methods
# postPaymentMethods

curl -X POST https://checkout-test.adyen.com/v71/paymentMethods \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Start a transaction
# postPayments

curl -X POST https://checkout-test.adyen.com/v71/payments \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Submit details for a payment
# postPaymentsDetails

curl -X POST https://checkout-test.adyen.com/v71/payments/details \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Create a payment session
# postSessions

curl -X POST https://checkout-test.adyen.com/v71/sessions \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

