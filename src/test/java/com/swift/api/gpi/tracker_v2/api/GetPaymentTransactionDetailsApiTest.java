
package com.swift.api.gpi.tracker_v2.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.api.gpi.tracker_v2.ApiException;
import com.swift.api.gpi.tracker_v2.ApiResponse;
import com.swift.api.gpi.tracker_v2.model.CamtA0200103;
import com.swift.api.gpi.tracker_v2.model.CamtA0200203;
import com.swift.api.gpi.tracker_v2.model.GetPaymentTransactionDetailsRequest;

public class GetPaymentTransactionDetailsApiTest {
	ApiResponse<CamtA0200203> mock_ApiResponse = (ApiResponse<CamtA0200203>) mock(ApiResponse.class);
	GetPaymentTransactionDetailsApi test = mock(GetPaymentTransactionDetailsApi.class);

	@Test
	public void getPaymentTransactionDetailsPostTest() throws ApiException {
		CamtA0200103 requestBody = new CamtA0200103();
		requestBody.setGetPaymentTransactionDetailsRequest(new GetPaymentTransactionDetailsRequest());

		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetPaymentTransactionDetailsRequest().setMyInstitution(myInstitution);
		requestBody.getGetPaymentTransactionDetailsRequest().setUetr("b916a97d-a699-4f20-b8c2-2b07e2684a27");

		when(test.getPaymentTransactionDetailsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(test.getPaymentTransactionDetailsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody), mock_ApiResponse);

		System.out.println("Passed Test getPaymentTransactionDetailsPostWithHttpInfoShouldReturnResponse");
		// TODO: test validations
	}

}
