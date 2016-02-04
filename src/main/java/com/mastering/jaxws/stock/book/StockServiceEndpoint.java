package com.mastering.jaxws.stock.book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class StockServiceEndpoint {

	private Books books = new MapBooksDao();
	
	@WebMethod(operationName = "bookQuantityByCode")
	@WebResult(name = "bookQuantity")
	public int getQuantityFromCode(@WebParam(name = "code") String code) {
		Book book = books.findQuantityFrom(code);
		
		return book.getQuantity();
	}
	
}
