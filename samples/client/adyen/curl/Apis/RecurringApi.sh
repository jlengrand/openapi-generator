#!/bin/sh

## RecurringApi

### Delete a token for stored payment details
# deleteStoredPaymentMethodsStoredPaymentMethodId

curl -X DELETE https://checkout-test.adyen.com/v71/storedPaymentMethods/{storedPaymentMethodId} \


-H "x-API-key: YOUR_API_KEY"


### Get tokens for stored payment details
# getStoredPaymentMethods

curl -X GET https://checkout-test.adyen.com/v71/storedPaymentMethods \


-H "x-API-key: YOUR_API_KEY"

