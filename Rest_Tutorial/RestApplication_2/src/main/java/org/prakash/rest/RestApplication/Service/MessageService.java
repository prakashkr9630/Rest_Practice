package org.prakash.rest.RestApplication.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.prakash.rest.RestApplication.Database.Database;
import org.prakash.rest.RestApplication.Model.Message;

public class MessageService {

	private Map<Long, Message> messages = Database.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "this is messages no 1", "prakash"));
		messages.put(2L, new Message(2, "this is messages no 2", "kumar"));
		messages.put(3L, new Message(3, "this is messages no 2", "ram"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessages(Long id) {
		return messages.get(id);
	}

	public Message addMessages(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessages(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;

	}

	public Message removeMessages(Long id) {
		return messages.remove(id);
	}

	public void setMessages(Map<Long, Message> messages) {
		this.messages = messages;
	}

	public List<Message> getMessagesbyyear(int year) {
		List<Message> messageforyear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(Message message : messages.values()){
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR)==year){
				messageforyear.add(message);
			}
		}
		
		return messageforyear;
	}

	public List<Message> getMessagespaginated(int start, int size) {
			
		List<Message> list = new ArrayList<>();
		if(start+size>list.size()){
			return new ArrayList();
		}
		return list.subList(start, start+size);
	}

}
