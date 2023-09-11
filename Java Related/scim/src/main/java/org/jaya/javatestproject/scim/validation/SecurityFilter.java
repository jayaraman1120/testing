package org.jaya.javatestproject.scim.validation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

@Provider
public class SecurityFilter implements ContainerRequestFilter{
		 public static final String Authorization_Header_Key = "Authorization";
		 public static final String Authorization_Header_Prefix = "Bearer ";
		 public static final String Secured_URL_Prefix = "User";
		 
			
			@Override
			public void filter(ContainerRequestContext requestContext) throws IOException {
				// TODO Auto-generated method stub
				if(requestContext.getUriInfo().getPath().contains(Secured_URL_Prefix)) {
					List <String> authHeader = requestContext.getHeaders().get(Authorization_Header_Key);
					if (authHeader.size() > 0 && authHeader != null) {
						String authToken = authHeader.get(0);
						authToken = authToken.replaceFirst(Authorization_Header_Prefix, "");
						byte[] decoded = Base64.getDecoder().decode(authToken);
						String decodedauthToken = new String(decoded, StandardCharsets.UTF_8);
						if ("Token".equals(decodedauthToken) ) {
							return;
						}	
					}
					Response unauthorizedstatus = Response.status(Response.Status.UNAUTHORIZED).entity("User not Allowed").build();
					requestContext.abortWith(unauthorizedstatus);
				}
			}

}
