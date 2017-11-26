package org.prakash.rest.RestApplication;

import java.util.List;

import javax.validation.constraints.Past;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.prakash.rest.RestApplication.Model.Message;
import org.prakash.rest.RestApplication.Service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService service = new MessageService();
	
	
	
	public MessageResource(){}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(@QueryParam("year")int year){
		return service.getAllMessages();
	}
	
	/**
	 * use http://localhost:8080/RestApplication/webapi/messages/test 
	 * 
	 * @return
	 */
		
		
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "Default test method";
	}
	
	/**
	 * here {messageid} can be mapped as variable input in the url , {} represent as 
	 * open to any variable and "messageid" as a variable 
	 * 
	 *  Use this url 
	 *  http://localhost:8080/RestApplication/webapi/messages/teasdasdasd
	 *  
	 * 
	 * @return
	 */
	
//	@GET
//	@Path("/{messageid}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String newTest(){
//		return "Another Default test method";
//	}
	
	/*
	 * the above method has be comment in order to execute this one because of same 
	 * same MIME type, 
	 * 
	 *  this method will take an argument after "/messages" and print it as it is
	 *    
	 * 	No matter what you pass, we can can convert it by declaring that argument 
	 * as it, in our case it is long , so we'll pass it as string and we'll get the value 
	 * as long 
	 *
	 * also change from  @Produces(MediaType.TEXT_PLAIN) to
	 *  @Produces(MediaType.APPLICATION_XML) 
	 * 
	 * @PathParam("messageid")  is and important type here , we can have multiple PathParam
	 * in order to provide more and more arument , but it is only in java 8 or above 
	 * 
	 * use this URL
	 * http://localhost:8080/RestApplication/webapi/messages/1
	 */
	
//	@GET
//	@Path("/{messageid}")	
//	@Produces(MediaType.APPLICATION_XML)
//	public Message newTestone(@PathParam("messageid")Long id ){
//		//return "Path param value is:" + messageid;
//		return service.getMessages(id);
//		
//	}
	
	/**
	 * this is for getting the respose in JSON fromate 
	 * for this goto pom.xml and un comment the Json suport , the apply this 
	 * @Produces(MediaType.APPLICATION_JSON) , you will get this  
	 * @param id
	 * @return
	 */
	
	@GET
	@Path("/{messageid}")	
	@Produces(MediaType.APPLICATION_JSON)
	public Message newTesttwo(@PathParam("messageid") Long id){
		//return "Path param value is:" + messageid;
		return service.getMessages(id);
		
	}
	
	
	/**
	 * Simple Post Implementation 
	 */
	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public String addMessages(){
//		return "Post works";
//	}
	
	/**
	 * 
	 * 
	 * this  method is basically about sending the input the method , like we usually do for our web service to consume and produce 
	 * output for that, 
	 * Denote 
	 * @Consumes(MediaType.APPLICATION_JSON) this denote the type of input that this application will accept 
	 * @Produces(MediaType.APPLICATION_XML) this will denote the type of output it will generate 
	 *   
	 * 
	 * 
	 * @param mas
	 * @return
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public Message addMessages(Message mas){		
		return service.addMessages(mas);	
	}
	
	
	
	
	
	
	
	
}
