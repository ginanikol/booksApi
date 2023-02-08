package gina.nikol.springboot.demo.booksapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import gina.nikol.springboot.demo.booksapp.model.Book;
import gina.nikol.springboot.demo.booksapp.model.BookList;

/**
 * Implementation class for the BooksService interface.
 * 
 * @author Gina Nikolouzou
 * 
 */
@Service
public class BooksServiceImpl implements BooksService {

	/**
	 * Parses the list of returned books to keep relevant book information.
	 * 
	 * @param response The response from the API containing all books.
	 * @return A list of books.
	 */
	@Override
	public List<Book> parseBooksResponse(BookList response) {

		return response.getResults().stream()
			.map(book -> {
				Book filteredBook = new Book();
				filteredBook.setId(book.getId());
				filteredBook.setTitle(book.getTitle());
				filteredBook.setAuthors(book.getAuthors());
				filteredBook.setLanguages(book.getLanguages());
				filteredBook.setDownloadCount(book.getDownloadCount());
				return filteredBook;
			}).collect(Collectors.toList());
	}
}
