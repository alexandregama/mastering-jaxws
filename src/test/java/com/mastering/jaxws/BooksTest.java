package com.mastering.jaxws;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mastering.jaxws.stock.book.Book;
import com.mastering.jaxws.stock.book.Books;
import com.mastering.jaxws.stock.book.MapBooksDao;

public class BooksTest {

	@Test
	public void shouldGetBooks() throws Exception {
		MapBooksDao books = new MapBooksDao();
		
		List<Book> booksFound = books.findQuantityFromListOf(Arrays.asList("SOA", "TDD"));
		
		assertEquals("SOA", booksFound.get(0).getCode());
		assertEquals("TDD", booksFound.get(1).getCode());
	} 
	
	@Test
	public void shouldGetAllBooksFromAListOfCodes() throws Exception {
		Books books = new MapBooksDao();
		
		List<Book> booksFound = books.findByListOf(asList("SOA", "TDD"));
		
		assertEquals("SOA", booksFound.get(0).getCode());
		assertEquals("TDD", booksFound.get(1).getCode());
	}
	
}
