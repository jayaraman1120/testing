package org.jaya.javatestproject.scim.resource;



import org.jaya.javatestproject.scim.model.Token;
import org.jaya.javatestproject.scim.service.TokenService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/Token")
public class TokenResource {
TokenService tokenservice = new TokenService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Token getToken() {
		return tokenservice.getToken("Token");
	}
}
