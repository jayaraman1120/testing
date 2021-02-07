package org.jaya.javatestproject.scim.database;

import java.util.HashMap;
import java.util.Map;

import org.jaya.javatestproject.scim.model.User;

public class DataBaseClass {

	private static Map<Long, User> users = new HashMap();
	
	public static Map<Long, User> getusers(){
		return users;
	}
	
}
