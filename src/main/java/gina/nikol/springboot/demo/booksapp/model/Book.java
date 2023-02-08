package gina.nikol.springboot.demo.booksapp.model;

import java.util.List;

/**
 * Represents information about a book.
 * 
 * @author Gina Nikolouzou
 * 
 */
public class Book {
	
	/**
	* Represents the properties of a book.
	*/
	private int id;

	/**
	* Title of the book.
	*/
	private String title;
	
	/**
	* List of authors who have written the book.
	*/
	private List<Author> authors;
	
	/**
	List of languages in which the book is available.
	*/
	private List<String> languages;
	
	/**
	The number of times the book has been downloaded.
	*/
	private int downloadCount;
    
    /**
     * Gets the id of the book.
     * 
     * @return The id of the book.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the book.
     * 
     * @param id The new id of the book.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the list of authors of the book.
     * 
     * @return The list of authors of the book.
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * Sets the list of authors of the book.
     * 
     * @param authors The new list of authors of the book.
     */
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    /**
     * Gets the list of languages of the book.
     * 
     * @return The list of languages of the book.
     */
    public List<String> getLanguages() {
        return languages;
    }

    /**
     * Sets the list of languages of the book.
     * 
     * @param languages The new list of languages of the book.
     */
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    /**
     * Gets the download count of the book.
     * 
     * @return The download count of the book.
     */
    public int getDownloadCount() {
        return downloadCount;
    }

    /**
     * Sets the download count of the book.
     * 
     * @param downloadCount The new download count of the book.
     */
    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }
}

