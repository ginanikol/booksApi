package gina.nikol.springboot.demo.booksapp.service;

import java.util.List;

import gina.nikol.springboot.demo.booksapp.model.Book;
import gina.nikol.springboot.demo.booksapp.model.BookList;

/**
* 
* This interface provides a contract for parsing the list of books returned by an API.
* 
* @author Gina Nikolouzou
* 
*/
public interface BooksService {

/**
* Parses the list of returned books to filter out irrelevant book information.
* 
* @param response the response from the API containing all books
* @return a list of books
*/
List<Book> parseBooksResponse(BookList response);
}