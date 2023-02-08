package gina.nikol.springboot.demo.booksapp.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gina.nikol.springboot.demo.booksapp.entity.BookRatingReview;
import gina.nikol.springboot.demo.booksapp.repositories.BookRatingReviewRepository;

/**
 * Controller class to handle requests related to {@link BookRatingReview}.
 * 
 * @author Gina Nikolouzou
 *
 */
@RestController
@RequestMapping("/books/rating-review")
public class BookRatingReviewController {
	
	private final BookRatingReviewRepository repository;

	/**
	 * Constructor to initialize the {@link BookRatingReviewRepository} instance.
	 * 
	 * @param repository the {@link BookRatingReviewRepository} instance.
	 */
	public BookRatingReviewController(BookRatingReviewRepository repository) {
		this.repository = repository;
	}

	/**
	 * Handles the POST request to save a new {@link BookRatingReview}.
	 * 
	 * @param ratingReview the {@link BookRatingReview} instance to be saved.
	 * @return the saved {@link BookRatingReview}.
	 */
	@PostMapping
	public ResponseEntity<BookRatingReview> saveRatingReview (@RequestBody BookRatingReview ratingReview) {
		BookRatingReview savedRatingReview = repository.save(ratingReview);
		return ResponseEntity.ok(savedRatingReview);
	}
}
