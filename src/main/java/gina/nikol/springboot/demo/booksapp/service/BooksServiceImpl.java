package gina.nikol.springboot.demo.booksapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import gina.nikol.springboot.demo.booksapp.model.Book;
import gina.nikol.springboot.demo.booksapp.model.BookList;

@Service
public class BooksServiceImpl implements BooksService {

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
