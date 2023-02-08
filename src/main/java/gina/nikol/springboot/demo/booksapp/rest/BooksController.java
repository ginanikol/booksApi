package gina.nikol.springboot.demo.booksapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import gina.nikol.springboot.demo.booksapp.model.Book;
import gina.nikol.springboot.demo.booksapp.model.BookList;
import gina.nikol.springboot.demo.booksapp.service.BooksService;

/**
 * A REST controller class that provides endpoint to retrieve books.
 * 
 * @author Gina Nikolouzou
 * 
 */
@RestController
public class BooksController {

	@Autowired
	BooksService bookService;
	
	/**
	 * Retrieves a list of books that match the search title.
	 * 
	 * @param search the title of the book to search for.
	 * @return a list of books that match the search title.
	 */
	@GetMapping("/books")
	public List<Book> getBooks(@RequestParam(value = "search") String search) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://gutendex.com/books?search=" + search;
		BookList response = restTemplate.getForObject(url, BookList.class);

		return bookService.parseBooksResponse(response);
	}

}
