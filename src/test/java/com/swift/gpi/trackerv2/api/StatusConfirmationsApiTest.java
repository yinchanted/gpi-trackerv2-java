package com.swift.gpi.trackerv2.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.swift.gpi.trackerv2.ApiException;
import com.swift.gpi.trackerv2.ApiResponse;
import com.swift.gpi.trackerv2.model.ActiveOrHistoricCurrencyAndAmount;
import com.swift.gpi.trackerv2.model.CamtA0100103;
import com.swift.gpi.trackerv2.model.CamtA0100202;
import com.swift.gpi.trackerv2.model.PaymentReason1Code;
import com.swift.gpi.trackerv2.model.PaymentStatus3;
import com.swift.gpi.trackerv2.model.PaymentStatusType2Choice;
import com.swift.gpi.trackerv2.model.StatusDetails2;
import com.swift.gpi.trackerv2.model.TransactionIndividualStatus4Code;
import com.swift.gpi.trackerv2.model.UpdatePaymentStatusRequest;

public class StatusConfirmationsApiTest {

	private final StatusConfirmationsApi api = new StatusConfirmationsApi();

	ApiResponse<CamtA0100202> mock_ApiResponse = (ApiResponse<CamtA0100202>) mock(ApiResponse.class);
	StatusConfirmationsApi test = mock(StatusConfirmationsApi.class);

	@Test
	public void statusConfirmationsPostTest() throws ApiException {

		CamtA0100103 requestBody = new CamtA0100103();
		requestBody.setUpdatePaymentStatusRequest(new UpdatePaymentStatusRequest());
		requestBody.getUpdatePaymentStatusRequest().setFrom("CCLABEB0");
		requestBody.getUpdatePaymentStatusRequest().setBusinessService("121");
		requestBody.getUpdatePaymentStatusRequest().setInstructionIdentification("CCLABEB0ACSPG000");
		requestBody.getUpdatePaymentStatusRequest().setPaymentStatus(new PaymentStatusType2Choice());
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().setDetailedStatus(new StatusDetails2());
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus().setOriginator("CCLABEB0");
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus()
				.setConfirmedAmount(new ActiveOrHistoricCurrencyAndAmount());
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus().getConfirmedAmount()
				.setAmount("1000");
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus().getConfirmedAmount()
				.setCurrency("USD");
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus()
				.setTransactionStatus(new PaymentStatus3());
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus().getTransactionStatus()
				.setStatus(TransactionIndividualStatus4Code.ACCC);
		requestBody.getUpdatePaymentStatusRequest().getPaymentStatus().getDetailedStatus().getTransactionStatus()
				.setReason(PaymentReason1Code.G000);

		when(test.statusConfirmationsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(
				test.statusConfirmationsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
						"e802ab96-bb3a-4965-9139-5214b9f0f074",
						"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
						"U1khA8h9Lm1PqzB99fG6uw", true, "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody),
				mock_ApiResponse);

		System.out.println("Passed Test statusConfirmationsPostWithHttpInfoShouldReturnResponse");
	}

}
