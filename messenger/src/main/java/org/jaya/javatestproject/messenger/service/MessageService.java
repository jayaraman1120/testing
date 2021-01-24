package org.jaya.javatestproject.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.jaya.javatestproject.messenger.model.Message;

public class MessageService {

	public MessageService() {
		// TODO Auto-generated constructor stub
	}
	public List<Message> getAllMessages(){
		List<Message> list = new ArrayList();
		Message m1 = new Message();
		Message m2 = new Message();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
