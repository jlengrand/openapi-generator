#!/bin/sh

## UtilityApi

### Get an Apple Pay session
# postApplePaySessions

curl -X POST https://checkout-test.adyen.com/v71/applePay/sessions \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Create originKey values for domains
# postOriginKeys

curl -X POST https://checkout-test.adyen.com/v71/originKeys \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

