package com.mastering.jaxws.client.consumer;

import static java.util.Arrays.asList;

import java.util.List;

import client.Book;
import client.StockServiceEndpoint;
import client.StockServiceEndpointService;

public class StockBookListServiceConsumer {

	public static void main(String[] args) {
		StockServiceEndpoint service = new StockServiceEndpointService().getStockServiceEndpointPort();
		
		List<Book> books = service.booksFromItsCode(asList("SOA", "TDD"));
		
		System.out.println("Books Found: ");
		System.out.println(books.get(0).getCode() + ": " + books.get(0).getQuantity());
		System.out.println(books.get(1).getCode() + ": " + books.get(1).getQuantity());
	}
	
}
