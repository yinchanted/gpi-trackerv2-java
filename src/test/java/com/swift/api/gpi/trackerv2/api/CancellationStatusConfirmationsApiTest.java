
package com.swift.api.gpi.trackerv2.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.swift.api.gpi.trackerv2.ApiException;
import com.swift.api.gpi.trackerv2.ApiResponse;
import com.swift.api.gpi.trackerv2.model.CamtA0700102;
import com.swift.api.gpi.trackerv2.model.CamtA0700202;
import com.swift.api.gpi.trackerv2.model.CancellationResponseDetails1;
import com.swift.api.gpi.trackerv2.model.InvestigationExecutionConfirmation5Code;
import com.swift.api.gpi.trackerv2.model.InvestigationExecutionStatusReason1;
import com.swift.api.gpi.trackerv2.model.PaymentCancellationRejection3Code;
import com.swift.api.gpi.trackerv2.model.PendingPaymentCancellationReason1Code;
import com.swift.api.gpi.trackerv2.model.TransactionCancellationStatusRequest;

public class CancellationStatusConfirmationsApiTest {

	@Test
	public void cancellationStatusConfirmationsPostTest() throws ApiException {

		CancellationStatusConfirmationsApi api = mock(CancellationStatusConfirmationsApi.class);
		ApiResponse<CamtA0700202> mock_Response = (ApiResponse<CamtA0700202>) mock(ApiResponse.class);

		CamtA0700102 requestBody = new CamtA0700102();
		requestBody.setTransactionCancellationStatusRequest(new TransactionCancellationStatusRequest());
		requestBody.getTransactionCancellationStatusRequest().setFrom("CCLABEB0");
		requestBody.getTransactionCancellationStatusRequest().setBusinessService("121");
		requestBody.getTransactionCancellationStatusRequest().setUetr("");
		requestBody.getTransactionCancellationStatusRequest().assignmentIdentification("");
		requestBody.getTransactionCancellationStatusRequest().resolvedCaseIdentification("");
		requestBody.getTransactionCancellationStatusRequest()
				.setUnderlyingCancellationDetails(new CancellationResponseDetails1());
		requestBody.getTransactionCancellationStatusRequest().getUnderlyingCancellationDetails()
				.setInvestigationExecutionStatus(InvestigationExecutionConfirmation5Code.CNCL);
		requestBody.getTransactionCancellationStatusRequest().getUnderlyingCancellationDetails()
				.setInvestigationExecutionStatusReason(new InvestigationExecutionStatusReason1());
		requestBody.getTransactionCancellationStatusRequest().getUnderlyingCancellationDetails()
				.getInvestigationExecutionStatusReason().setRejected(PaymentCancellationRejection3Code.AGNT);
		requestBody.getTransactionCancellationStatusRequest().getUnderlyingCancellationDetails()
				.getInvestigationExecutionStatusReason().setPending(PendingPaymentCancellationReason1Code.PTNA);
		requestBody.getTransactionCancellationStatusRequest().setOriginator("");

		when(api.cancellationStatusConfirmationsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "", requestBody)).thenReturn(mock_Response);

		Assert.assertEquals(api.cancellationStatusConfirmationsPostWithHttpInfo("001", "1.0",
				"2018-03-23T15:56:26.728Z", "e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "", requestBody), mock_Response);

	}

}
