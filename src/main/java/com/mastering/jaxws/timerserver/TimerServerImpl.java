package com.mastering.jaxws.timerserver;

import java.util.Date;

import javax.jws.WebService;

/**
 * 
 * @author alexandregama
 *
 * Note that we are usind the property endpointInterface to links to 
 * SEI. This class is a Service Implementation Bean.
 *
 * Note that we need to use the FQN in the endpointInterface property
 */

@WebService(endpointInterface = "com.mastering.jaxws.timerserver.TimerServer")
public class TimerServerImpl implements TimerServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
 	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
