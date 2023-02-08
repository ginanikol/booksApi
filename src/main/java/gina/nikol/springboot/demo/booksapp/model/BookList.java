package gina.nikol.springboot.demo.booksapp.model;

import java.util.List;

/**
 * The BookList class holds a list of books.
 * 
 * @author Gina Nikolouzou
 * 
 */
public class BookList {

	private List<Book> results;

	/**
	 * Gets the list of books.
	 * 
	 * @return List of books.
	 */
	public List<Book> getResults() {
		return results;
	}

	/**
	 * Sets the list of books.
	 * 
	 * @param books List of books.
	 */
	public void setResults(List<Book> books) {
		this.results = books;
	}

	/**
	 * Alias for setResults(List<Book> books)
	 * 
	 * @param books List of books.
	 */
	public void setBooks(List<Book> books) {
		this.results = books;
	}
}
