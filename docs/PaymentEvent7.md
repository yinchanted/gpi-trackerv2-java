
# PaymentEvent7

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkReference** | **String** | Reference assigned by the network when sending the payment. | 
**messageNameIdentification** | **String** | Specifies the original message name identifier to which the message refers. | 
**businessService** | **String** | Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.  To be used when there is a choice of processing services or processing service levels. |  [optional]
**trackerEventType** | [**TrackerEventType1Code**](TrackerEventType1Code.md) | Indicates the type of payment event. | 
**valid** | **Boolean** | Indicates if a payment is consistent (YES) or not (NO). | 
**invalidityReason** | **String** | Contains the additional information in case the event is not a valid component of a payment transaction. |  [optional]
**invalidityDescription** | **String** | Contains a textual description as to why the event is not a valid component of a payments transaction. |  [optional]
**instructionIdentification** | **String** | Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. |  [optional]
**relatedReference** | **String** | Identification referring to the underlying payment transaction. |  [optional]
**caseIdentification** | **String** | Uniquely identifies the case. |  [optional]
**originalInstructionIdentification** | **String** | Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction. |  [optional]
**assignmentIdentification** | **String** | Uniquely identifies the case assignment. |  [optional]
**resolvedCaseIdentification** | **String** | Uniquely identifies the case. |  [optional]
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) | Specifies the status of a transaction, in a coded form. |  [optional]
**underlyingCancellationDetails** | [**UnderlyingCancellationDetails2**](UnderlyingCancellationDetails2.md) | Provides further information with regards to the cancellation of the payments event. |  [optional]
**forwardedToAgent** | **String** | Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001. |  [optional]
**fundsAvailable** | **String** | Date and time at which the funds are available,  as reported in the ACSC status update.  Must only be used when TransactionStatus is \&quot;ACSC\&quot;. |  [optional]
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**to** | **String** | The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer). | 
**originator** | **String** | Party that issues the status. |  [optional]
**serialParties** | [**CustomerCreditTransferTransactionParties1**](CustomerCreditTransferTransactionParties1.md) | Specifies the parties involved in a serial payment scenario. |  [optional]
**coverParties** | [**CreditTransferTransactionParties1**](CreditTransferTransactionParties1.md) | Specifies the parties involved in a cover payment scenario. |  [optional]
**senderAcknowledgementReceipt** | **String** | Date and time at which the sender was acknowledged receipt of the message. | 
**receivedDate** | **String** | Date and time at which the message was acknowledged by the receiver. |  [optional]
**instructedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money to be moved between the debtor (ordering customer) and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  Usage: This amount has to be transported unchanged through the transaction chain. |  [optional]
**confirmedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | The amount confirmed by the Originator. Depending on the Transaction Status, this amount can be the credited amount, pending amount, rejected amount or transferred amount. |  [optional]
**interbankSettlementAmount** | [**ActiveCurrencyAndAmount**](ActiveCurrencyAndAmount.md) | Amount of money moved between the instructing agent and the instructed agent. |  [optional]
**interbankSettlementDate** | **String** | Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due. |  [optional]
**chargeBearer** | [**ChargeBearerType3Code**](ChargeBearerType3Code.md) | Specifies which party/parties will bear the charges associated with the processing of the payment transaction. |  [optional]
**chargeAmount** | [**List&lt;ActiveOrHistoricCurrencyAndAmount&gt;**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money asked or paid for the charge. |  [optional]
**foreignExchangeDetails** | [**CurrencyExchange8**](CurrencyExchange8.md) | Specifies the exchange rate details between two currencies. |  [optional]
**updatePayment** | **String** | Implements the correlation between a payment message and a status update on it.   Contains the network reference of the payment for which the status confirmation was applicable. |  [optional]
**duplicateMessageReference** | **String** | Network reference of the Payment that is the original recorded Payment. |  [optional]
**copiedBusinessService** | **String** | Specifies the copied business service of the market infrastructure. |  [optional]
**lastUpdateTime** | **String** | Last date and time at which the status of this Payment event was updated. | 



