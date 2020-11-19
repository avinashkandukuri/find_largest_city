package com.test.findlargestcity.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Response {

	@JsonProperty("RestResponse")
	private RestResponse RestResponse;

	public RestResponse getRestResponse() {
		return RestResponse;
	}

	public void setRestResponse(RestResponse restResponse) {
		RestResponse = restResponse;
	}

}
