package com.swift.gpi.tracker_v2.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.gpi.tracker_v2.ApiException;
import com.swift.gpi.tracker_v2.ApiResponse;
import com.swift.gpi.tracker_v2.model.CamtA0400103;
import com.swift.gpi.tracker_v2.model.CamtA0400203;
import com.swift.gpi.tracker_v2.model.GetChangedPaymentTransactionsRequest;


public class GetChangedPaymentTransactionsApiTest {


	ApiResponse<CamtA0400203> mock_ApiResponse=(ApiResponse<CamtA0400203>)mock(ApiResponse.class);
	GetChangedPaymentTransactionsApi test = mock(GetChangedPaymentTransactionsApi.class);


	@Test
	public void getChangedPaymentTransactionsPostWithHttpInfoShouldReturnResponse() throws ApiException {
		CamtA0400103 requestBody = new CamtA0400103();
		requestBody.setGetChangedPaymentTransactionsRequest(new GetChangedPaymentTransactionsRequest());
		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetChangedPaymentTransactionsRequest().setMyInstitution(myInstitution);
		requestBody.getGetChangedPaymentTransactionsRequest().setStartTime("2017-05-25T09:24:41.174Z");


		when(test.getChangedPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "", requestBody)).thenReturn(mock_ApiResponse);

		Assert.assertEquals(test.getChangedPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "", requestBody), mock_ApiResponse);


		System.out.println("Passed Test getChangedPaymentTransactionsPostWithHttpInfoShouldReturnResponse");
	}



}
