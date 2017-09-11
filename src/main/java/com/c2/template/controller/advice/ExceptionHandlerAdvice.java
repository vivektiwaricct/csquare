package com.c2.template.controller.advice;

import javax.validation.ConstraintViolationException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.c2.template.C2Constants;
import com.c2.template.controller.response.Response;
import com.c2.template.exception.C2RequestProcessingException;
import com.c2.template.controller.response.Error;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	@ExceptionHandler(C2RequestProcessingException.class)
	public Response handleException(C2RequestProcessingException e) {
		Response response = new Response();
		response.setStatus(C2Constants.FAILURE);
		response.setError(new Error(e.getErrorCode(), e.getMessage()));

		return response;
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public Response handleException(ConstraintViolationException e) {
		Response response = new Response();
		
		return response;
	}
}
