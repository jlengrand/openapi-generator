#!/bin/sh

## ModificationsApi

### Cancel an authorised payment
# postCancels

curl -X POST https://checkout-test.adyen.com/v71/cancels \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Update an authorised amount
# postPaymentsPaymentPspReferenceAmountUpdates

curl -X POST https://checkout-test.adyen.com/v71/payments/{paymentPspReference}/amountUpdates \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Cancel an authorised payment
# postPaymentsPaymentPspReferenceCancels

curl -X POST https://checkout-test.adyen.com/v71/payments/{paymentPspReference}/cancels \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Capture an authorised payment
# postPaymentsPaymentPspReferenceCaptures

curl -X POST https://checkout-test.adyen.com/v71/payments/{paymentPspReference}/captures \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Refund a captured payment
# postPaymentsPaymentPspReferenceRefunds

curl -X POST https://checkout-test.adyen.com/v71/payments/{paymentPspReference}/refunds \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"


### Refund or cancel a payment
# postPaymentsPaymentPspReferenceReversals

curl -X POST https://checkout-test.adyen.com/v71/payments/{paymentPspReference}/reversals \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

