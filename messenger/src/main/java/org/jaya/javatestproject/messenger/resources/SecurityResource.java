package org.jaya.javatestproject.messenger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/secured")
public class SecurityResource {

	public SecurityResource() {
		// TODO Auto-generated constructor stub
	}
@GET
@Produces(MediaType.TEXT_PLAIN)
public String returnempty() {
	return "API Passed";
}
}
