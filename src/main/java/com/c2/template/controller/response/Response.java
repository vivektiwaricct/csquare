package com.c2.template.controller.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Response {
	@JsonProperty("meta")
	Map<String,Object> meta = new HashMap<>();
	@JsonProperty("data")
	private Object data;

	public Response() {
	}

	public Map<String, Object> getMeta() {
		return meta;
	}

	public void setMeta(Map<String, Object> meta) {
		for(String key:meta.keySet()){
			this.meta.put(key, meta.get(key));
		}
	}
	
	public void addMeta(String key,Object value) {
		this.meta.put(key, value);
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
