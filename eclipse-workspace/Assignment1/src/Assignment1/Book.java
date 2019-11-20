
/*
 * Joseph Fuguet and Josh Labrie
 * Represents type Book
 */

package Assignment1;

public class Book extends Media {
	String author = null;// VAriables present in all Books
	double cost = 0;

	public Book(String title, String publicationDate, String author, double cost) { // Book constructor
		super(title, publicationDate); //calls constructor in Media.java
		this.author = author;
		this.cost = cost;
	}
	//////GETTERS AND SETTERS
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String print() { //Print method for Book
		return "b, " + this.getTitle() + ", " + this.getPublicationDate() + ", " + this.getAuthor() + ", "
				+ this.getCost();

	}
}
