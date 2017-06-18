package com.lyd.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class RestService {

	@POST
	@Path("/lydService")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response lydRest(InputStream incomingData) {
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(incomingData));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Parsing: - ");
		}
		System.out.println("Data Received: " + sb.toString());

		// return HTTP response 200 in case of success
		return Response.status(200).entity(sb.toString()).build();
	}
	
	
	
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public Response verifyRESTService(InputStream incomingData) {
	String result = "lydRESTService Successfully started..";
	 
	// return HTTP response 200 in case of success
	return Response.status(200).entity(result).build();
	}
	
	
	
}
