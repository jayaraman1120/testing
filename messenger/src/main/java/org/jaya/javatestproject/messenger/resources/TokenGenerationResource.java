package org.jaya.javatestproject.messenger.resources;

import org.jaya.javatestproject.messenger.model.Token;
import org.jaya.javatestproject.messenger.service.TokenService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/token")
public class TokenGenerationResource {
	TokenService tokenservice = new TokenService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Token getToken() {
		return tokenservice.getToken("Token");
	}

}
