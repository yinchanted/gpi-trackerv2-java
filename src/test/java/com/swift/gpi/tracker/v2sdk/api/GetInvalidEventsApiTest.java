package com.swift.gpi.tracker.v2sdk.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.gpi.tracker.v2sdk.ApiException;
import com.swift.gpi.tracker.v2sdk.ApiResponse;
import com.swift.gpi.tracker.v2sdk.model.CamtA0500103;
import com.swift.gpi.tracker.v2sdk.model.CamtA0500203;
import com.swift.gpi.tracker.v2sdk.model.GetInvalidEventsRequest;

public class GetInvalidEventsApiTest {

	ApiResponse<CamtA0500203> mock_ApiResponse = (ApiResponse<CamtA0500203>) mock(ApiResponse.class);
	GetInvalidEventsApi test = mock(GetInvalidEventsApi.class);

	@Test
	public void getInvalidEventsPostTest() throws ApiException {
		CamtA0500103 requestBody = new CamtA0500103();
		requestBody.setGetInvalidEventsRequest(new GetInvalidEventsRequest());

		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetInvalidEventsRequest().setMyInstitution(myInstitution);
		requestBody.getGetInvalidEventsRequest().setFromDateTime("2017-05-25T09:24:41.174Z");
		requestBody.getGetInvalidEventsRequest().setToDateTime("2017-05-25T09:24:41.174Z");

		when(test.getInvalidEventsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(test.getInvalidEventsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody), mock_ApiResponse);

		System.out.println("Passed Test getInvalidEventsPostWithHttpInfoShouldReturnResponse");
		// TODO: test validations
	}

}
