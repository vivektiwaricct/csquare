package com.c2.template.controller.advice;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.c2.template.C2Constants;
import com.c2.template.auth.service.RequestContextKeeper;
import com.c2.template.controller.response.Errors;
import com.c2.template.exception.C2RequestProcessingException;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
	@ExceptionHandler(C2RequestProcessingException.class)
	public void handleException(C2RequestProcessingException e) {
		updateContextMap(e.getErrorCode(), e.getMessage());
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Errors> handleException(ConstraintViolationException ce) {
		Set<ConstraintViolation<?>> violationMessages = ce.getConstraintViolations();
		StringBuilder messages = new StringBuilder();
		for (Iterator<ConstraintViolation<?>> iterator = violationMessages.iterator(); iterator.hasNext();) {
			ConstraintViolation<?> violationMessageKey = iterator.next();
			messages.append(violationMessageKey.getMessage()).append(", ");
		}
		Map<String, Object> contextMap = RequestContextKeeper.getContext();
		contextMap.put(C2Constants.STATUS, C2Constants.FAILURE);

		return new ResponseEntity<>(
				new Errors(C2Constants.VALIDATION_ERROR_CODE, messages.toString().substring(0, messages.length() - 2)),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	private void updateContextMap(String errorCode, String errorMessage) {
		Map<String, Object> contextMap = RequestContextKeeper.getContext();
		contextMap.put(C2Constants.ERR_CODE, errorCode);
		contextMap.put(C2Constants.ERR_MSG, errorMessage);
		contextMap.put(C2Constants.STATUS, C2Constants.FAILURE);

	}
}
