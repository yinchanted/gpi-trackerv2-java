
# GetPaymentTransactionDetailsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uetr** | **String** | Contains the unique end to end transaction reference of a payment. | 
**transactionStatus** | [**PaymentStatus3**](PaymentStatus3.md) | Specifies the status of a transaction, in a coded form. | 
**cancellationStatus** | [**PaymentTransactionCancellationStatus1**](PaymentTransactionCancellationStatus1.md) |  |  [optional]
**initiationTime** | **String** | Date and Time at which the message enters the tracking system (e.g. gpi). | 
**completionTime** | **String** | Time at which the Instructed Bank reports that the transaction has been completed.   Date and time based on the creation date of the status confirmation containing a final status ACSC |  [optional]
**lastUpdateTime** | **String** | Last date and time at which the status of this transaction was updated. | 
**paymentEvent** | [**List&lt;PaymentEvent7&gt;**](PaymentEvent7.md) | This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned. |  [optional]



