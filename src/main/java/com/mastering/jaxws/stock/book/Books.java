package com.mastering.jaxws.stock.book;

import java.util.List;

public interface Books {

	Book findQuantityFrom(String code);
	
	List<Book> findQuantityFromListOf(List<String> codes);

	List<Book> findByListOf(List<String> codes);
	
}
