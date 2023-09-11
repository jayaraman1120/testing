package org.jaya.javatestproject.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.jaya.javatestproject.messenger.model.Message;
import org.jaya.javatestproject.messenger.model.Profile;

public class DataBaseClass {

	private static Map<Long, Message> messages = new HashMap();
	private static Map<String, Profile> profiles = new HashMap();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
}
