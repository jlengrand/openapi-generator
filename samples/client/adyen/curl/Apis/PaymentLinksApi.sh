#!/bin/sh

## PaymentLinksApi

### Get a payment link
# getPaymentLinksLinkId

curl -X GET https://checkout-test.adyen.com/v71/paymentLinks/{linkId} \


-H "x-API-key: YOUR_API_KEY"


### Update the status of a payment link
# patchPaymentLinksLinkId

curl -X PATCH https://checkout-test.adyen.com/v71/paymentLinks/{linkId} \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Create a payment link
# postPaymentLinks

curl -X POST https://checkout-test.adyen.com/v71/paymentLinks \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

