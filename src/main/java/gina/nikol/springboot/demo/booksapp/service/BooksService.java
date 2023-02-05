package gina.nikol.springboot.demo.booksapp.service;

import java.util.List;

import gina.nikol.springboot.demo.booksapp.model.Book;
import gina.nikol.springboot.demo.booksapp.model.BookList;

public interface BooksService {
	/**
	 * Parses the list of the returned books to filter out irrelevant book info
	 * @param response response from the api containg all books
	 * @return a list of books
	 */
	public List<Book> parseBooksResponse(BookList response);
	
	
}
