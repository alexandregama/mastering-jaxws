package com.mastering.jaxws.timerserver;

import javax.xml.ws.Endpoint;

public class TimerServerPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8089/timerserver", new TimerServerImpl());
	}
	
}
