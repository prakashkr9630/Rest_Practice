package com.cs.app.SampleApplication;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cs.app.ApplicationService.DaoService;
import com.cs.app.DaoPackages.EmployeeDao;
import com.cs.app.DaoPackages.OrganiationDao;

@Path("/info")
public class Prakash {
	
	
	public Prakash(){}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getName(){
		return "Welcome..!!\n\n\n\nThis is info page";
	}
	
	@GET
	@Path("/firstname")
	@Produces(MediaType.TEXT_PLAIN)
	public String getFirstName(){
		return "Prakash";
	}
	
	
	@GET
	@Path("/lastname")
	@Produces(MediaType.TEXT_PLAIN)
	public String getLastName(){
		return "kumar";
	}
	
	@GET
	@Path("/{something}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSomething(@PathParam("something")String something){
		if(something!=null)
		{
			return "The value passed in the @PathParam is :"+something;	
		}else{
			return "this is sample output to any of garbae input";	
		}
		
	}
	
	
	@GET
	@Path("/something ")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSome(){
		return "something";
	}
	
	
	@GET
	@Path("/emp")
	@Produces(MediaType.APPLICATION_XML)	
	public List<EmployeeDao> getEmployeeDetails(){
		DaoService daoservice = new  DaoService();
		daoservice.setEmployeedao(null);
		return daoservice.getEmployeedao(); 
	}
	
	@GET
	@Path("/org")	
	@Produces(MediaType.APPLICATION_XML)
	public List<OrganiationDao> getOrgniationDeyails(){
		DaoService daoservice = new  DaoService();
		daoservice.setOrganiationdao(null);
		
		return daoservice.getOrganiationdao();
	}
	
	@GET
	@Path("/empfiler")
	@Produces(MediaType.APPLICATION_XML)
	public List<EmployeeDao> getFilterValue(@QueryParam("age") int thisage){
		DaoService daoservice = new  DaoService();
		daoservice.setEmployeedao(null);
		return daoservice.getEmployeedao(thisage);
	}
	
	@POST
	@Path("post")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_XML)	
	public String getPsotValue(){
		return "this is post request";
	}
	

}
