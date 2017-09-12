package com.c2.template.controller.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.c2.template.auth.service.RequestContextKeeper;
import com.c2.template.controller.response.Response;

@RestControllerAdvice
public class ControllerAfterAdvice implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		RequestContextKeeper.getContext();
		
		Response responseWrapper = new Response();
		responseWrapper.setMeta(RequestContextKeeper.getContext());
		responseWrapper.setData(body);
		return responseWrapper;
	}

}
