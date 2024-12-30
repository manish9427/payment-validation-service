package com.cpt.payments.service.impl.validators;

import org.springframework.stereotype.Service;

import com.cpt.payments.dao.MerchantPaymentRequestDao;
import com.cpt.payments.dto.PaymentRequestDTO;
import com.cpt.payments.service.interfaces.Validator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentAttemptThresholdCheck implements Validator {

	private MerchantPaymentRequestDao merchantPaymentRequestDao;
	
	
	public PaymentAttemptThresholdCheck(MerchantPaymentRequestDao merchantPaymentRequestDao) {
		this.merchantPaymentRequestDao = merchantPaymentRequestDao;
	}
	
	@Override
	public void validate(PaymentRequestDTO paymentRequestDTO) {
		log.info("Validating payment request:{}", paymentRequestDTO);
	}

}
