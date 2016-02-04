package com.mastering.jaxws.stock.book;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class StockServiceEndpoint {

	private Books books = new MapBooksDao();
	
	@WebMethod
	public int getQuantityFromCode(String code) {
		Book book = books.findQuantityFrom(code);
		
		return book.getQuantity();
	}
	
}
