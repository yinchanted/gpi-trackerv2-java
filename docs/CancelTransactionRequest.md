
# CancelTransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels. | 
**caseIdentification** | **String** | Uniquely identifies the case. | 
**uetr** | **String** | Contains the unique end to end transaction reference of a payment. | 
**originalInstructionIdentification** | **String** | Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction. |  [optional]
**underlyingCancellationDetails** | [**CancellationRequestDetails1**](CancellationRequestDetails1.md) | Provides further information with regards to the cancellation of the payments event. | 



