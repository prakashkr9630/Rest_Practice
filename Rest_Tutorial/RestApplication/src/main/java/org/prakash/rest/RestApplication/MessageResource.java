package org.prakash.rest.RestApplication;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.prakash.rest.RestApplication.Model.Message;
import org.prakash.rest.RestApplication.Service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
		return service.getAllMessages();
	}
	

}
