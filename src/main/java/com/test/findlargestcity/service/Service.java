package com.test.findlargestcity.service;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.test.findlargestcity.model.Response;

/**
 *
 * Service that interacts with REST end point to fetch state details.
 *
 */

public class Service {

	private static String URL = "http://services.groupkt.com/state/get/USA/";

	public String getContent(String state) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Response response;
		String output = null;
		try {
			response = mapper.readValue(new java.net.URL(URL + state), Response.class);
			String message = response.getRestResponse().getMessages().get(0);

			if (message.contains("Not Found")) {
				output = message;
			} else {
				output = "State : " + response.getRestResponse().getResult().getName() + ", Largest City : "
						+ response.getRestResponse().getResult().getLargest_city() + ", Capital : "
						+ response.getRestResponse().getResult().getCapital();
			}
		} catch (IOException e) {
			throw new Exception("Exception occurred : Please verify input and try again later!!");
		}
		return output;
	}

}
