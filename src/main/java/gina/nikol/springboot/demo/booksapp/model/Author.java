package gina.nikol.springboot.demo.booksapp.model;

/**
 * Represents information about an author.
 * 
 * @author Gina Nikolouzou
 * 
 */
public class Author {

	private String name;
	private int birthYear;
	private int deathYear;

	/**
	 * Gets the name of the author.
	 * 
	 * @return The name of the author.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the author.
	 * 
	 * @param name The new name of the author.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the birth year of the author.
	 * 
	 * @return The birth year of the author.
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birth year of the author.
	 * 
	 * @param birthYear The new birth year of the author.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Gets the death year of the author.
	 * 
	 * @return The death year of the author.
	 */
	public int getDeathYear() {
		return deathYear;
	}

	/**
	 * Sets the death year of the author.
	 * 
	 * @param deathYear The new death year of the author.
	 */
	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}

}
