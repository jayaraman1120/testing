package org.jaya.javatestproject.scim.service;

import java.util.ArrayList;
import java.util.List;

import org.jaya.javatestproject.scim.model.Email;
import org.jaya.javatestproject.scim.model.Meta;
import org.jaya.javatestproject.scim.model.Name;
import org.jaya.javatestproject.scim.model.User;
import org.jaya.javatestproject.scim.model.UserResponse;

public class ConvertUsertoResponse {

	public UserResponse convertusertoresponse (User user) {
		System.out.println(user.getEmail());
		Email email = new Email(user.getEmail());
		List<Email> emailList = new ArrayList();
		emailList.add(email);
		UserResponse userresponse = new UserResponse();
		userresponse.setEmails(emailList);
		userresponse.setExternalId(user.getExternalid());
		userresponse.setId(user.getId());
		userresponse.setMeta(new Meta(user.getCreated(),user.getModified()));
		userresponse.setName(new Name(user.getFormatted_name(),user.getFamily_name(),user.getGiven_name()));
		List<String> schema = new ArrayList();
		schema.add("urn:ietf:params:scim:schemas:core:2.0:User");
		userresponse.setSchemas(schema);
		return userresponse;
	}
}
