package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	@JsonProperty
	private RestResponse restResponse;

	public Response() {

	}
	
	@Override
	public String toString() {
		return "Response [RestResponse=" + restResponse.toString() + "]";
	}

	public RestResponse getRestResponse() {
		return restResponse;
	}

	public void setRestResponse(RestResponse restResponse) {
		this.restResponse = restResponse;
	}
	
}
