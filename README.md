# booksApi

This API is used to retreive lists of books from Gutendex (https://gutendex.com). 
Example:
GET http://[hostname]/books/?search=david
will return all books written by authors that their name and/or lastname is 'David', or books that their title contains 'David'.

It is also able to save ratings and reviews for a book in its database according to the reader's input.
Example:
POST http://[hostname]/books/rating-review
{
    "bookId": 766,
    "rating": 4,
    "review": "Good book"
}
