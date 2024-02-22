#!/bin/sh

## ClassicCheckoutSDKApi

### Create a payment session
# postPaymentSession

curl -X POST https://checkout-test.adyen.com/v71/paymentSession \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Verify a payment result
# postPaymentsResult

curl -X POST https://checkout-test.adyen.com/v71/payments/result \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

