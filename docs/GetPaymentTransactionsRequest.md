
# GetPaymentTransactionsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**myInstitution** | **List&lt;String&gt;** | Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details. | 
**timeWindow** | [**DateTimePeriodDetails**](DateTimePeriodDetails.md) | Time window for this institution to which the search applies. | 
**paymentScenarioReturnCriteria** | [**PaymentScenario2Code**](PaymentScenario2Code.md) | Criteria that specify which payment scenario is to be returned by the search. | 
**agent** | [**List&lt;AgentType1&gt;**](AgentType1.md) | Identifies agent(s) involved in a payment transaction. |  [optional]
**location** | [**Location1Code**](Location1Code.md) | Specifies the location of the search. |  [optional]
**instructionIdentification** | **String** | Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.  Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. |  [optional]
**transactionStatus** | [**List&lt;PaymentStatus3&gt;**](PaymentStatus3.md) | Specifies the status of a transaction, in a coded form. |  [optional]
**amount** | [**AmountType1**](AmountType1.md) | Specifies the amount range for a given currency and amount type. |  [optional]
**event** | [**PaymentTransactionState1Code**](PaymentTransactionState1Code.md) | Specifies one of the states of the payment transaction. | 
**subjectToCancellationProcessIndicator** | **Boolean** | Indicates whether only payment transactions under a past or present stop and recall process should be retrieved.   Absence means no. |  [optional]
**maximumNumber** | **String** | Indicates the maximum number of entries returned. | 
**more** | **String** | Contains the token to get the next set of responses. |  [optional]



