package com.swift.gpi.trackerv2.example;

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
import com.swift.gpi.trackerv2.ApiException;
import com.swift.gpi.trackerv2.ApiResponse;
import com.swift.gpi.trackerv2.api.GetPaymentTransactionDetailsApi;
import com.swift.gpi.trackerv2.helper.UtilHelper;
import com.swift.gpi.trackerv2.model.CamtA0200103;
import com.swift.gpi.trackerv2.model.CamtA0200203;
import com.swift.gpi.trackerv2.model.GetPaymentTransactionDetailsRequest;

import junitparams.JUnitParamsRunner;

/**
 * API tests for GetPaymentTransactionDetailsApi
 */
@RunWith(JUnitParamsRunner.class)
public class GetPaymentTransactionDetailsApiExampleTest {

	private final static GetPaymentTransactionDetailsApi api = new GetPaymentTransactionDetailsApi();

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
				UtilHelper.getInstance().mymap.get("GetPaymentTransactionDetailsApiTest.signatureRequired"));

	}

	@Test
	public void getPaymentTransactionDetailsPostTest() throws ApiException, NoSuchAlgorithmException, IOException,
			ProcessingException, URISyntaxException, InterruptedException {
		Thread.sleep(2000);
		CamtA0200103 requestBody = new CamtA0200103();
		requestBody.setGetPaymentTransactionDetailsRequest(new GetPaymentTransactionDetailsRequest());
		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetPaymentTransactionDetailsRequest().setMyInstitution(myInstitution);
		requestBody.getGetPaymentTransactionDetailsRequest().setUetr("34d1fcca-5c17-41d4-bd59-723ec1940a0f");

		// requestBody.getGetPaymentTransactionDetailsRequest().setTransactionIdentification("a2949d20-53d6-4999-85f5-f4a0dd9adf40");

		// Print the JSON structure constructed
		System.out.println(api.getApiClient().getJSON().serialize(requestBody));

		// TODO: Set always to 'true' and provide gpi Connector's certificate
		// for a production environment
		api.getApiClient().setVerifyingSsl(true);

		ApiResponse<CamtA0200203> response = api.getPaymentTransactionDetailsPostWithHttpInfo(laUApplicationID,
				laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApi, requestBody);
		// Print response
		CamtA0200203 responseBody = response.getData();
		System.out.println(api.getApiClient().getJSON().serialize(responseBody));
		System.out.println(response.getStatusCode());

	}

	@Test
	public void getPaymentTransactionDetailsPost404ErrorTest() throws ApiException, NoSuchAlgorithmException,
			IOException, ProcessingException, URISyntaxException, InterruptedException {
		Thread.sleep(2000);
		CamtA0200103 requestBody = new CamtA0200103();
		CamtA0200203 responseBody = null;
		try {
			ApiResponse<CamtA0200203> response = api.getPaymentTransactionDetailsPostWithHttpInfo(laUApplicationID,
					laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApi, requestBody);
			// Print response
			responseBody = response.getData();
			System.out.println(responseBody.getGetPaymentTransactionDetailsResponse());
			System.out.println(api.getApiClient().getJSON().serialize(responseBody));
		} catch (ApiException e) {
			// TODO: handle exception
			// reading from Swagger.json
			System.out.println("Response Code =" + e.getCode() + " Response Message=" + e.getMessage());

		}

	}

	@Test
	public void getPaymentTransactionDetailsPost401ErrorTestWithInvalidXApi() throws ApiException,
			NoSuchAlgorithmException, IOException, ProcessingException, URISyntaxException, InterruptedException {
		Thread.sleep(2000);
		CamtA0200103 requestBody = new CamtA0200103();
		CamtA0200203 responseBody = null;
		try {
			ApiResponse<CamtA0200203> response = api.getPaymentTransactionDetailsPostWithHttpInfo(laUApplicationID,
					laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, "wrong", requestBody);
			// Print response
			responseBody = response.getData();
			System.out.println(responseBody.getGetPaymentTransactionDetailsResponse());
			System.out.println(api.getApiClient().getJSON().serialize(responseBody));
		} catch (ApiException e) {
			// TODO: handle exception
			// reading from Swagger.json
			System.out.println(e.getMessage());
			assertEquals(e.getMessage(), "Missing or invalid API key.");
		}

	}

}
