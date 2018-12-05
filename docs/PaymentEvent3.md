
# PaymentEvent3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uetr** | **String** | Contains the unique end to end transaction reference of a payment. | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels. |  [optional]
**participant** | **Boolean** | Indicates whether the requestor institution participates in the payment transaction identified by the unique end to end transaction reference identification  (UETR). | 
**networkReference** | **String** | Reference assigned by the network when sending the payment. | 
**messageNameIdentification** | **String** | Specifies the original message name identifier to which the message refers. | 
**instructionIdentification** | **String** | Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. | 
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**to** | **String** | The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer). |  [optional]
**invalidityReason** | **String** | Specifies the reason why the event is invalid. | 



