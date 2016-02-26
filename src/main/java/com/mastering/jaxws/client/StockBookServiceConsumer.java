package com.mastering.jaxws.client;

public class StockBookServiceConsumer {

	public static void main(String[] args) {
		StockServiceEndpoint service = new StockServiceEndpointService().getStockServiceEndpointPort();
		
		int quantityOfBooks = service.bookQuantityByCode("SOA");
		
		System.out.println("Quantity of book from BookService: " + quantityOfBooks);
	}
	
}
