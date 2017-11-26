package com.cs.app.DaoPackages;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrganiationDao {

	private String orname;
	private String orgadd;
	private int orgpin;
	
	
	public String getOrname() {
		return orname;
	}
	public void setOrname(String orname) {
		this.orname = orname;
	}
	public String getOrgadd() {
		return orgadd;
	}
	public void setOrgadd(String orgadd) {
		this.orgadd = orgadd;
	}
	public int getOrgpin() {
		return orgpin;
	}
	public void setOrgpin(int orgpin) {
		this.orgpin = orgpin;
	}		
}
