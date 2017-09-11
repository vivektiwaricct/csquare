package com.c2.template.exception;

public class C2Exception extends RuntimeException {
	private String errorCode;

	public C2Exception(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public C2Exception(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
