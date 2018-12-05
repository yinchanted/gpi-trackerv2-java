
# TransactionCancellationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.   To be used when there is a choice of processing services or processing service levels.  Example: 001 | 
**uetr** | **String** | Contains the unique end to end transaction reference of a payment. | 
**assignmentIdentification** | **String** | Uniquely identifies the case assignment. | 
**resolvedCaseIdentification** | **String** | Uniquely identifies the case. | 
**underlyingCancellationDetails** | [**CancellationResponseDetails1**](CancellationResponseDetails1.md) | Provides further information with regards to the cancellation of the payments event. | 
**originator** | **String** | Party that issues the status. | 
**forwardedToAgent** | **String** | Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001. |  [optional]



