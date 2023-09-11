package org.jaya.javatestproject.scim.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jaya.javatestproject.scim.database.DataBaseClass;
import org.jaya.javatestproject.scim.model.User;
import org.jaya.javatestproject.scim.model.UserResponse;

public class UserService {

	private Map<Long, User> database = DataBaseClass.getusers();
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	public List<User> getallusers(){
		return new ArrayList<User> (database.values());
	}
	
	public UserResponse addUser(UserResponse userresponse) {
		Long id = Long.valueOf(database.size()+1);
		ConvertResponsetoUser convertresponse = new ConvertResponsetoUser();
		User user = convertresponse.convertresponsetouser(userresponse, id);
		database.put(id, user);
		ConvertUsertoResponse converttoresponse = new ConvertUsertoResponse();
		return converttoresponse.convertusertoresponse(user);
	}
	
	public UserResponse getUser(long id) {
		ConvertUsertoResponse converttoresponse = new ConvertUsertoResponse();
		User user = database.get(id);
		System.out.println(user);
		return converttoresponse.convertusertoresponse(user);
	}
}
