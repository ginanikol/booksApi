package gina.nikol.springboot.demo.booksapp.repositories;

import org.springframework.data.repository.CrudRepository;

import gina.nikol.springboot.demo.booksapp.entity.BookRatingReview;

/**
* Represents the BookRatingReview Repository.
* This interface extends CrudRepository to provide CRUD operations for the entity {@link BookRatingReview}.
* 
* @author Gina Nikolouzou
* 
*/
public interface BookRatingReviewRepository extends CrudRepository<BookRatingReview, Long>{

}
