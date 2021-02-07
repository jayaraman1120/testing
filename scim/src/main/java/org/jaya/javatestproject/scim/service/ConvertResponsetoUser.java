package org.jaya.javatestproject.scim.service;

import java.util.Date;

import org.jaya.javatestproject.scim.model.Email;
import org.jaya.javatestproject.scim.model.Name;
import org.jaya.javatestproject.scim.model.User;
import org.jaya.javatestproject.scim.model.UserResponse;

public class ConvertResponsetoUser {
	private String username;
	private String email;
	private String externalId;
	private String formatted_name;
	private String family_name;
	private String given_name;
	
	public User convertresponsetouser(UserResponse userresponse, Long id) {
		username = userresponse.getUsername();
		Email emailObject = userresponse.getEmails().get(0);
		email = emailObject.getValue();
		externalId = userresponse.getExternalId();
		Name name = userresponse.getName();
		formatted_name = name.getFormatted();
		family_name = name.getFamilyname();
		given_name  = name.getGivenname();
		
		return new User(username,email,"7092440455",new Date(),new Date(),id,externalId,formatted_name,family_name,given_name);
	}
}
