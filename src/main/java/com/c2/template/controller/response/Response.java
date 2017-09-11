package com.c2.template.controller.response;

public class Response {
	private String status;
	private Error error;

	public Response() {
	}

	public Response(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
