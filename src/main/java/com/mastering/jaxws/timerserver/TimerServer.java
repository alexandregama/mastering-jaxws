package com.mastering.jaxws.timerserver;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 
 * @author alexandregama
 * The annotation @WebService indicates that this is the Service Endpoint Interface.
 * 
 * The annoation @WebMethod indicates that this is a service operation
 * 
 */

@WebService
@SOAPBinding(style = Style.RPC)
public interface TimerServer {

	@WebMethod
	String getTimeAsString();
	
	@WebMethod
	String getTimeAsElapsed();
	
}
