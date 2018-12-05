
# UpdatePaymentStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels.   | 
**updatePaymentScenario** | [**PaymentScenario1Code**](PaymentScenario1Code.md) | Specifies which payment scenario is to be updated. | 
**uetr** | **String** | Contains the unique end to end transaction reference.   Format is lowercase separated by hyphens. | 
**instructionIdentification** | **String** | Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. | 
**paymentStatus** | [**PaymentStatusType2Choice**](PaymentStatusType2Choice.md) | Contains the details on the payment status. | 



