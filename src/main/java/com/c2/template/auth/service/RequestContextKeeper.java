package com.c2.template.auth.service;

import java.util.Map;

public class RequestContextKeeper {
	private static final ThreadLocal<Map<String, Object>> requestContext = new ThreadLocal<>();

	public static void setContext(Map<String, Object> map) {
		requestContext.set(map);
	}

	public static Map<String, Object> getContext() {
		return requestContext.get();
	}

	public static void deleteContext() {
		requestContext.remove();
	}
}
