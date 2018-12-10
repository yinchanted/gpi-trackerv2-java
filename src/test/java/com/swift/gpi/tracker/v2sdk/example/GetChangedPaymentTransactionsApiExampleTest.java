package com.swift.gpi.tracker.v2sdk.example;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.swift.gpi.tracker.v2sdk.ApiException;
import com.swift.gpi.tracker.v2sdk.ApiResponse;
import com.swift.gpi.tracker.v2sdk.api.GetChangedPaymentTransactionsApi;
import com.swift.gpi.tracker.v2sdk.helper.UtilHelper;
import com.swift.gpi.tracker.v2sdk.model.CamtA0400103;
import com.swift.gpi.tracker.v2sdk.model.CamtA0400203;
import com.swift.gpi.tracker.v2sdk.model.GetChangedPaymentTransactionsRequest;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class GetChangedPaymentTransactionsApiExampleTest {

	private final static GetChangedPaymentTransactionsApi api = new GetChangedPaymentTransactionsApi();

	static String laUApplicationID;
	static String laUVersion;
	static String laUCallTime;
	static String laURequestNonce;
	static String laUResponseNonce;
	static String laUSigned;
	static String laUSignature;
	static String xApi;
	static String xRecord;
	static boolean signnature_required;
	static URI uri = null;

	@BeforeClass
	public static void setup() throws NoSuchAlgorithmException, IOException {
		laUApplicationID = UtilHelper.getInstance().mymap.get("laUApplicationID");
		laUVersion = UtilHelper.getInstance().mymap.get("laUVersion");
		laUCallTime = UtilHelper.getInstance().mymap.get("laUCallTime");
		laURequestNonce = UtilHelper.getInstance().mymap.get("laURequestNonce");
		laUResponseNonce = UtilHelper.getInstance().mymap.get("laUResponseNonce");
		laUSigned = UtilHelper.getInstance().mymap.get("laUSigned");
		laUSignature = UtilHelper.getInstance().mymap.get("laUSignature");
		xApi = UtilHelper.getInstance().mymap.get("xApi");
		signnature_required = Boolean.parseBoolean(
				UtilHelper.getInstance().mymap.get("GetChangedPaymentTransactionsApiTest.signatureRequired"));

	}

	@Test
	public void getChangedPaymentTransactionsPostTest() throws ApiException, NoSuchAlgorithmException, IOException,
			ProcessingException, URISyntaxException, InterruptedException {

		CamtA0400103 requestBody = new CamtA0400103();
		requestBody.setGetChangedPaymentTransactionsRequest(new GetChangedPaymentTransactionsRequest());
		List<String> myInstitution = asList("BANABEBB");
		requestBody.getGetChangedPaymentTransactionsRequest().setMyInstitution(myInstitution);
		requestBody.getGetChangedPaymentTransactionsRequest().setStartTime("2018-01-01T00:00:00.0Z");
		requestBody.getGetChangedPaymentTransactionsRequest().setMore("a");
		// Print the JSON structure constructed
		System.out.println(api.getApiClient().getJSON().serialize(requestBody));

		// TODO: Set always to 'true' and provide gpi Connector's certificate
		// for a production environment
		api.getApiClient().setVerifyingSsl(true);
		// api.getApiClient().setSslCaCert(sslCaCert);
		// api.getApiClient().setKeyManagers(managers);
		try {
			ApiResponse<CamtA0400203> response = api.getChangedPaymentTransactionsPostWithHttpInfo(laUApplicationID,
					laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApi, requestBody);
			// Print response
			CamtA0400203 responseBody = response.getData();
			System.out.println(api.getApiClient().getJSON().serialize(responseBody));
			System.out.println(response.getStatusCode());
		} catch (ApiException e) {
			// TODO: handle exception
			// reading from Swagger.json
			System.out.println("Response Code =" + e.getCode() + " Response Message=" + e.getMessage());

		}
	}

	@Test
	public void getChangedPaymentTransactionsPost404ErrorTest() throws ApiException, NoSuchAlgorithmException,
			IOException, ProcessingException, URISyntaxException, InterruptedException {
		Thread.sleep(2000);
		CamtA0400103 requestBody = new CamtA0400103();
		CamtA0400203 responseBody = null;
		try {
			ApiResponse<CamtA0400203> response = api.getChangedPaymentTransactionsPostWithHttpInfo(laUApplicationID,
					laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApi, requestBody);
			// Print response
			responseBody = response.getData();
			System.out.println(responseBody.getGetChangedPaymentTransactionsResponse());
			System.out.println(api.getApiClient().getJSON().serialize(responseBody));
		} catch (ApiException e) {
			// TODO: handle exception
			// reading from Swagger.json
			System.out.println("Response Code =" + e.getCode() + " Response Message=" + e.getMessage());

		}

	}

	@Test
	public void getChangedPaymentTransactionsPost401ErrorTestWithInvalidXApi() throws ApiException,
			NoSuchAlgorithmException, IOException, ProcessingException, URISyntaxException, InterruptedException {
		Thread.sleep(2000);
		CamtA0400103 requestBody = new CamtA0400103();
		CamtA0400203 responseBody = null;
		try {
			ApiResponse<CamtA0400203> response = api.getChangedPaymentTransactionsPostWithHttpInfo(laUApplicationID,
					laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, "wrong", requestBody);
			// Print response
			responseBody = response.getData();
			System.out.println(responseBody.getGetChangedPaymentTransactionsResponse());
			System.out.println(api.getApiClient().getJSON().serialize(responseBody));
		} catch (ApiException e) {
			// TODO: handle exception
			// reading from Swagger.json
			System.out.println(e.getMessage());
			assertEquals(e.getMessage(), "Missing or invalid API key.");
		}

	}

}
