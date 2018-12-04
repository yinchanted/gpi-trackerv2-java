package com.swift.api.gpi.tracker_v2.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.swift.api.gpi.tracker_v2.ApiException;
import com.swift.api.gpi.tracker_v2.ApiResponse;
import com.swift.api.gpi.tracker_v2.model.CamtA0600102;
import com.swift.api.gpi.tracker_v2.model.CamtA0600202;
import com.swift.api.gpi.tracker_v2.model.CancelTransactionRequest;
import com.swift.api.gpi.tracker_v2.model.CancellationReason6Code;
import com.swift.api.gpi.tracker_v2.model.CancellationRequestDetails1;
import com.swift.api.gpi.tracker_v2.model.PendingPaymentCancellationReason2Code;

public class CancelTransactionsApiTest {

	@Test
	public void cancelTransactionsPostTest() throws ApiException {
		CancelTransactionsApi api = mock(CancelTransactionsApi.class);
		ApiResponse<CamtA0600202> mock_Response = (ApiResponse<CamtA0600202>) mock(ApiResponse.class);
		CamtA0600102 requestBody = new CamtA0600102();
		requestBody.setCancelTransactionRequest(new CancelTransactionRequest());
		requestBody.getCancelTransactionRequest().setFrom("");
		requestBody.getCancelTransactionRequest().setBusinessService("");
		requestBody.getCancelTransactionRequest().setCaseIdentification("");
		requestBody.getCancelTransactionRequest().setUetr("");
		requestBody.getCancelTransactionRequest().setOriginalInstructionIdentification("");
		requestBody.getCancelTransactionRequest().setUnderlyingCancellationDetails(new CancellationRequestDetails1());
		requestBody.getCancelTransactionRequest().getUnderlyingCancellationDetails()
				.setCancellationReasonInformation(CancellationReason6Code.AGNT);
		requestBody.getCancelTransactionRequest().getUnderlyingCancellationDetails()
				.setIndemnityAgreement(PendingPaymentCancellationReason2Code.INDM);

		when(api.cancelTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "", requestBody)).thenReturn(mock_Response);

		Assert.assertEquals(api.cancelTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "", requestBody), mock_Response);

		// Print response

	}

}
