package org.prakash.rest.RestApplication.Service;

import java.util.ArrayList;
import java.util.List;

import org.prakash.rest.RestApplication.Model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		List<Message> list = new ArrayList<>();
		Message m1 = new Message(1l, "this is new message_1", "Prakash kumar");
		Message m2 = new Message(1l, "this is new message_2", "Prakash kumar");
		Message m3 = new Message(1l, "this is new message_3", "Prakash kumar");
		list.add(m1);
		list.add(m2);
		list.add(m3);		
		return list;
	}

}
