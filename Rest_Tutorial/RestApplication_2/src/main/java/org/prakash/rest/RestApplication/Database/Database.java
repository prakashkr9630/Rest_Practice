package org.prakash.rest.RestApplication.Database;

import java.util.HashMap;
import java.util.Map;

import org.prakash.rest.RestApplication.Model.Message;
import org.prakash.rest.RestApplication.Model.Profile;

public class Database {
	
	private static Map<Long,Message> messages = new HashMap<Long,Message>();
	private static Map<String,Profile> profile = new HashMap<String,Profile>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}		
	
	public static Map<String, Profile> getProfile() {
		return profile;
	}
}
