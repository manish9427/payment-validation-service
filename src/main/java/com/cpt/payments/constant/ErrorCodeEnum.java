package com.cpt.payments.constant;

public enum ErrorCodeEnum {
	
	//create errorCode & errorMessage files as part of this enum errorCode "100001",
	GENERIC_ERROR("10000","Unable to process request, please try again later"),
	INVALID_AMOUNT("10001","Amount cannot be negative, please correct the amount and try again");
	
	private String errorCode;
	private String errorMessage;
	
	ErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
	
    public String getErrorCode() {
        return errorCode;
    }
    
    public String getErrorMessage() {
        return errorMessage;
    }
}
