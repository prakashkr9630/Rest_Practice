package org.prakash.rest.RestApplication.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.prakash.rest.RestApplication.Database.Database;
import org.prakash.rest.RestApplication.Model.Profile;

public class Profileservice {

	
	private Map<String,Profile> profiles = Database.getProfile();
	
	
	public List<Profile> getAllProfile(){
		return new ArrayList<Profile>(profiles.values());		
	}

	public Map<String, Profile> getProfile() {
		return profiles;
	}

	public Profile setProfile(Profile profile) {
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfilename(), profile);
		return profile;
	}
	
	
	
}
