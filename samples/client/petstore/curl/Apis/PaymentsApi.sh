#!/bin/sh

## PaymentsApi

### Get payment method by id
# getPaymentMethodById

curl -X GET https://checkout-test.adyen.com/v71/paymentMethods/{id} \


-H "x-API-key: YOUR_API_KEY"


### Get payment methods
# getPaymentMethods

curl -X GET https://checkout-test.adyen.com/v71/paymentMethods \


-H "x-API-key: YOUR_API_KEY"


### Make a payment
# postMakePayment

curl -X POST https://checkout-test.adyen.com/v71/payments \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

