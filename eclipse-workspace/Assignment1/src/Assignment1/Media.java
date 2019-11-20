package Assignment1;


/*Media abstract class
 * Joseph Fuguet and Josh Labrie
 */

public abstract class Media implements MediaUtility, Comparable<Media> {
	String title = null; //variables present in all media types
	String publicationDate = null;
	double date = 0;

	public Media(String title, String publicationDate) { //media type constructor
		this.title = title;
		this.publicationDate = publicationDate;
	}

	public String getTitle() { //Returns title of media
		return this.title;
	}

	public String getPublicationDate() { //Returns publication date of media
		return this.publicationDate;
	}

	public int compareTo(Media m) { //Compare method
		return publicationDate.compareTo(this.getPublicationDate());
	}

	public abstract String print();

	public abstract double getCost();

}
