package org.jaya.javatestproject.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jaya.javatestproject.messenger.database.DataBaseClass;
import org.jaya.javatestproject.messenger.model.Message;
import org.jaya.javatestproject.messenger.model.Profile;

public class ProfileService {

	private Map<String,Profile> database = DataBaseClass.getProfiles();
	public ProfileService() {
		// TODO Auto-generated constructor stub
		database.put("jaya", new Profile(1L,"Jayaraman_Sambanthan","Jayaraman","Sambanthan"));
		database.put("hello", new Profile(2L,"Hello_World","Hello","World"));
	}
	public List<Profile> getAllProfiles(){
		
		return new ArrayList<Profile>(database.values());
	}
	public Profile getProfile(String profilename){
		
		return database.get(profilename);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(database.size()+1);
		database.put(profile.getProfilename(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfilename().isEmpty()) {
			return null;
		}
		database.put(profile.getProfilename(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profilename) {
		return database.remove(profilename);
	}
}
