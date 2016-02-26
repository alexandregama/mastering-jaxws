package com.mastering.jaxws.stock.book;

import javax.xml.ws.Endpoint;

public class RegisterEndpointStockService {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8089/1/stockservice", new StockServiceEndpoint());
	}
}
