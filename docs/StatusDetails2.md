
# StatusDetails2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originator** | **String** | Party that issues the status. | 
**fundsAvailable** | **String** | Date and time at which the funds are available,  as reported in the ACSC status update. |  [optional]
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) | Specifies the status of the transaction. | 
**forwardedToAgent** | **String** | Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.  This element can only be used in case the status is ACSP and the reason is G000 or G001. |  [optional]
**confirmedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | The amount confirmed by the Originator. Depending on the Transaction Status, this amount can be the credited amount, pending amount, rejected amount or transferred amount. | 
**foreignExchangeDetails** | [**CurrencyExchange8**](CurrencyExchange8.md) | Specifies the exchange rate details between two currencies. |  [optional]
**chargeAmount** | [**List&lt;ActiveOrHistoricCurrencyAndAmount&gt;**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money asked or paid for the charge. |  [optional]



