package org.jaya.javatestproject.messenger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import org.jaya.javatestproject.messenger.model.Message;
import org.jaya.javatestproject.messenger.service.MessageService;
@Path("/messages")
public class MessageResource {
	MessageService messageservice = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageservice.getAllMessages();
	}
	
}
