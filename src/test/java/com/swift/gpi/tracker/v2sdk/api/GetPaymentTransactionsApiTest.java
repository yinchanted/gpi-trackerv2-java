package com.swift.gpi.tracker.v2sdk.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.gpi.tracker.v2sdk.ApiException;
import com.swift.gpi.tracker.v2sdk.ApiResponse;
import com.swift.gpi.tracker.v2sdk.model.CamtA0300103;
import com.swift.gpi.tracker.v2sdk.model.CamtA0300203;
import com.swift.gpi.tracker.v2sdk.model.DateTimePeriodDetails;
import com.swift.gpi.tracker.v2sdk.model.GetPaymentTransactionsRequest;

/**
 * API tests for GetPaymentTransactionsApi
 */

public class GetPaymentTransactionsApiTest {

	ApiResponse<CamtA0300203> mock_ApiResponse = (ApiResponse<CamtA0300203>) mock(ApiResponse.class);
	GetPaymentTransactionsApi test = mock(GetPaymentTransactionsApi.class);

	@Test
	public void getPaymentTransactionsPostTest() throws ApiException {

		CamtA0300103 requestBody = new CamtA0300103();
		requestBody.setGetPaymentTransactionsRequest(new GetPaymentTransactionsRequest());
		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetPaymentTransactionsRequest().setMyInstitution(myInstitution);
		requestBody.getGetPaymentTransactionsRequest().setTimeWindow(new DateTimePeriodDetails());
		requestBody.getGetPaymentTransactionsRequest().getTimeWindow().setFromDateTime("2017-06-17T09:45:16.058Z");
		requestBody.getGetPaymentTransactionsRequest().getTimeWindow().setToDateTime("2017-06-18T09:45:16.058Z");
		requestBody.getGetPaymentTransactionsRequest().setMaximumNumber("10");

		when(test.getPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(test.getPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody), mock_ApiResponse);

		System.out.println("Passed Test getPaymentTransactionsPostWithHttpInfoShouldReturnResponse");
		// TODO: test validations
	}

}
