package org.jaya.javatestproject.scim.resource;

import java.util.List;

import org.jaya.javatestproject.scim.model.User;
import org.jaya.javatestproject.scim.model.UserResponse;
import org.jaya.javatestproject.scim.service.UserService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/Users")
public class UserResource {
	
	UserService userservice = new UserService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getallusers(){
		return userservice.getallusers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser(UserResponse userresponse) {
		return Response.status(Status.CREATED).entity(userservice.addUser(userresponse)).build(); 
	}
	
	@GET
	@Path("{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse getuser(@PathParam("messageId") long id){
		return userservice.getUser(id);
	}
}
