package com.cpt.payments.dto;

import lombok.Data;

@Data
public class PaymentResponseDTO {
	private String txnId;
	private String redirectUrl;
	
	public PaymentResponseDTO(String txnId, String redirectUrl) {
		this.txnId = txnId;
        this.redirectUrl = redirectUrl;
	}
}
