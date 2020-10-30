package com.example.restservice;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse {
	private String[] messages;
	private Result result;
	
	public RestResponse() {

	}

	@Override
	public String toString() {
		return "RestResponse [messages=" + Arrays.toString(messages) + ", result=" + result.toString() + "]";
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String[] getMessages() {
		return messages;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}
	
	
	
}
