package com.test.findlargestcity.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.test.findlargestcity.model.State;

public class RestResponse {

	@JsonProperty("messages")
	List<String> messages;
	@JsonProperty("result")
	State result;

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public State getResult() {
		return result;
	}

	public void setResult(State result) {
		this.result = result;
	}

}
