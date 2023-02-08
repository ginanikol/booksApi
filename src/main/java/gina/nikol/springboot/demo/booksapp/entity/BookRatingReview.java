package gina.nikol.springboot.demo.booksapp.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Entity class for representing a BookRatingReview.
 * 
 * @author Gina Nikolouzou
 *  
 *
 */
@Entity
public class BookRatingReview {
	
	/**
	 * The unique identifier for the BookRatingReview.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * The identifier of the book being rated and reviewed.
	 */
	private Long bookId;
	
	/**
	 * The rating for the book.
	 */
	private int rating;
	
	/**
	 * A review for the book.
	 */
	private String review;

	/**
	 * Default constructor of a new BookRatingReview.
	 */
	public BookRatingReview() {
	}

	/**
	 * Constructs a new BookRatingReview with the given bookId, rating, and review.
	 * 
	 * @param bookId The identifier of the book being rated and reviewed.
	 * @param rating The rating for the book, represented as an integer.
	 * @param review A review for the book, represented as a string.
	 */
	public BookRatingReview(Long bookId, int rating, String review) {
		this.bookId = bookId;
		this.rating = rating;
		this.review = review;
	}

	/**
	 * Gets the unique identifier for the BookRatingReview.
	 * 
	 * @return The unique identifier for the BookRatingReview.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the unique identifier for the BookRatingReview.
	 * 
	 * @param id The new unique identifier for the BookRatingReview.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the identifier of the book being rated and reviewed.
	 * 
	 * @return The identifier of the book being rated and reviewed.
	 */
	public Long getBookId() {
		return bookId;
	}

	/**
	 * Sets the identifier of the book being rated and reviewed.
	 * 
	 * @param bookId The new identifier of the book being rated and reviewed.
	 */
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	/**
	 * Gets the rating for the book.
	 * 
	 * @return The rating for the book, represented as an integer.
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Sets the rating for the book.
	 * 
	 * @param rating The new rating for the book, represented as an integer.
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * Gets the review for the book.
	 * 
	 * @return The review for the book, represented as a string.
	 */
	public String getReview() {
		return review;
	}

	/**
	 * Sets the review for the book.
	 * 
	 * @param review The new review for the book, represented as a string.
	 */
	public void setReview(String review) {
		this.review = review;
	}

}