package org.jaya.javatestproject.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import org.apache.commons.lang3.StringUtils;
import org.jaya.javatestproject.messenger.database.DataBaseClass;
import org.jaya.javatestproject.messenger.model.Message;

import jakarta.ws.rs.PathParam;

public class MessageService {
	private Map<Long,Message> database = DataBaseClass.getMessages();
	public MessageService() {
		// TODO Auto-generated constructor stub
		database.put(1L, new Message(1L,"Hello World","Jayaraman"));
		database.put(2L, new Message(2L,"Hello World","Author"));
	}
	public List<Message> getAllMessages(){
		
		return new ArrayList<Message>(database.values());
	}
	public Message getMessage(Long id){
		
		return database.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(database.size()+1);
		database.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		database.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return database.remove(id);
	}
}
