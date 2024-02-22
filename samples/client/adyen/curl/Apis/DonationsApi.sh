#!/bin/sh

## DonationsApi

### Start a transaction for donations
# postDonations

curl -X POST https://checkout-test.adyen.com/v71/donations \
-H 'Content-Type: application/json' \ 
-H 'Accept: application/json' \ 
-H "x-API-key: YOUR_API_KEY"

