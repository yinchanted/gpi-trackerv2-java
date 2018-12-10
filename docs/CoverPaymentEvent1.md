
# CoverPaymentEvent1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) | Specifies the status of a transaction, in a coded form. | 
**debtor** | **String** | Party that owes an amount of money to the (ultimate) creditor. |  [optional]
**agent** | [**List&lt;PaymentEvent2&gt;**](PaymentEvent2.md) | Identifies the agent(s) currently participating in a transaction. | 
**creditor** | **String** | Party to which an amount of money is due. |  [optional]
**initiationTime** | **String** | Date and Time at which the message enters the Gpi system. | 
**completionTime** | **String** | Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC. |  [optional]
**instructedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  This amount has to be transported unchanged through the transaction chain. |  [optional]
**lastUpdateTime** | **String** | Last date and time at which the status of this transaction was updated. | 



