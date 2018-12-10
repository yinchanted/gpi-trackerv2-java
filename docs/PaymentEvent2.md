
# PaymentEvent2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**to** | **String** | The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer). | 
**received** | **Boolean** | Indicates whether a payment has been received or not.  | 



