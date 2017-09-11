package com.c2.template.exception;

public class C2RequestProcessingException extends C2Exception {

	public C2RequestProcessingException(String errorCode, String message) {
		super(errorCode, message);
	}

	public C2RequestProcessingException(String errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}

}
