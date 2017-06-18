package com.lyd.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RESTJerseyClient {
	
	/*
	 * 
	 * ref:http://crunchify.com/how-to-create-restful-java-client-with-jersey-client-example/
	 */

	private void getFtoCResponse() {
		try {

			Client client = Client.create();
			WebResource webResource2 = client.resource("http://localhost:8080/testSpring/jersey/ftocservice/90");
			ClientResponse response2 = webResource2.accept("application/json").get(ClientResponse.class);
			if (response2.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response2.getStatus());
			}

			String output2 = response2.getEntity(String.class);
			System.out.println("\n============getFtoCResponse============");
			System.out.println(output2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getCtoFResponse() {
		try {

			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/testSpring/jersey/ctofservice/40");
			ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			System.out.println("============getCtoFResponse============");
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		RESTJerseyClient rjc = new RESTJerseyClient();
		rjc.getCtoFResponse();
		rjc.getFtoCResponse();
	}

}
