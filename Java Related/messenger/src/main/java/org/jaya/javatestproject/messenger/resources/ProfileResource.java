package org.jaya.javatestproject.messenger.resources;

import java.util.List;

import org.jaya.javatestproject.messenger.model.Message;
import org.jaya.javatestproject.messenger.model.Profile;
import org.jaya.javatestproject.messenger.service.ProfileService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/profiles")
public class ProfileResource {
ProfileService profileservice = new ProfileService();
	public ProfileResource() {
		// TODO Auto-generated constructor stub
	}
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Profile> getAllProfiles(){
	return profileservice.getAllProfiles();
}

@GET
@Path("{profilename}")
@Produces(MediaType.APPLICATION_JSON)
public Profile getMessage(@PathParam("profilename") String profilename) {
	
	return profileservice.getProfile(profilename);
}

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Profile addProfile(Profile profile) {
	return profileservice.addProfile(profile);
}

@PUT
@Path("{profilename}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Profile updateProfile(@PathParam("profilename") String profilename, Profile profile) {
	profile.setProfilename(profilename);
	return profileservice.updateProfile(profile);
}

@DELETE
@Path("{profilename}")
@Produces(MediaType.APPLICATION_JSON)
public Profile removeProfile(@PathParam("profilename") String profilename) {
	return profileservice.removeProfile(profilename);
}

}
