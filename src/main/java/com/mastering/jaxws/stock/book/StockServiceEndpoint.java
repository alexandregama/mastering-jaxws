package com.mastering.jaxws.stock.book;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class StockServiceEndpoint {

	private Books books = new MapBooksDao();
	
	@WebMethod(operationName = "bookQuantityByCode", action = "RetrieveQuantityFromCode")
	@WebResult(name = "bookQuantity")
	public int getQuantityFromCode(@WebParam(name = "code") String code) {
		Book book = books.findQuantityFrom(code);
		
		return book.getQuantity();
	}
	
	@WebMethod(operationName = "booksFromItsCode")
	@WebResult(name = "booksList")
	public List<Book> getQuantityFromListofCodes(@WebParam(name = "codes") List<String> codes) {
		List<Book> listOfBooks = books.findByListOf(codes);
		
		return listOfBooks;
	}
}
