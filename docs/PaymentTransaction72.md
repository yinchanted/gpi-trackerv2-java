
# PaymentTransaction72

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uetr** | **String** | Contains the unique end to end transaction reference of a payment. | 
**paymentScenarioReturned** | [**PaymentScenario3Code**](PaymentScenario3Code.md) | Specifies which payment scenario is returned by the search. | 
**myInstitution** | **String** | Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details. | 
**role** | [**PaymentsPartyType2Code**](PaymentsPartyType2Code.md) | Specifies the role of the party in the payment chain. | 
**eventTime** | **String** | Time determined by the Role that the entity defined in MyInstitution is playing in this transaction. | 
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) | Specifies the status of a transaction, in a coded form. | 
**cancellationStatus** | [**PaymentTransactionCancellationStatus3**](PaymentTransactionCancellationStatus3.md) |  |  [optional]
**debtorAgent** | **String** | Financial institution servicing an account for the debtor.     Debtor Agent in this case only refers to FI to FI Customer Credit Transfers. |  [optional]
**debtor** | **String** | Party that owes an amount of money to the (ultimate) creditor.    Debtor in this case only refers to Financial Institution Credit Transfer with cover. |  [optional]
**agent** | [**List&lt;PaymentEvent2&gt;**](PaymentEvent2.md) | Identifies the agent(s) currently participating in a transaction. |  [optional]
**creditorAgent** | **String** | Financial institution servicing an account for the creditor. |  [optional]
**creditor** | **String** | Party to which an amount of money is due.    This role is only to be used in Financial Institution Credit Transfer with cover |  [optional]
**initiationTime** | **String** | Date and Time at which the message enters the Gpi system. | 
**completionTime** | **String** | Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC. |  [optional]
**instructedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  This amount has to be transported unchanged through the transaction chain. |  [optional]
**confirmedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | The actual amount that has been paid to the ultimate beneficiary, after all charges etc... have been deducted. |  [optional]
**lastUpdateTime** | **String** | Last date and time at which the status of this transaction was updated. | 
**coverPaymentEvent** | [**List&lt;CoverPaymentEvent1&gt;**](CoverPaymentEvent1.md) | Specifies the payment events related to the underlying cover payment. |  [optional]



