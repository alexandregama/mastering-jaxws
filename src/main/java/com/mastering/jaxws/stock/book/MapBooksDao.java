package com.mastering.jaxws.stock.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBooksDao implements Books {

	private static Map<String, Book> database = new HashMap<>();

	static {
		database.put("SOA", new Book("SOA", 10));
		database.put("REST", new Book("REST", 8));
		database.put("TDD", new Book("TDD", 15));
	}

	@Override
	public Book findQuantityFrom(String code) {
		return database.get(code);
	}

	@Override
	public List<Book> findQuantityFromListOf(List<String> codes) {
		List<Book> books = new ArrayList<>();

		codes.forEach(code -> books.add(database.get(code)));

		return books;
	}

}
