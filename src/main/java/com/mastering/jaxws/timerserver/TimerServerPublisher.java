package com.mastering.jaxws.timerserver;

import javax.xml.ws.Endpoint;

/**
 * 
 * @author alexandregama
 *
 * Endpoint class exists since JAX-WS 2.0 
 *
 * Note that we must use the Service Implementation Bean (SIB) instead of its interface
 * 
 * Important: Endpoint.publish can handle just one request at time. We can't use it in production,
 * only if you have just a few of requests and don't need worry about concurrency.
 */

public class TimerServerPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8089/timerserver", new TimerServerImpl());
	}
	
}
