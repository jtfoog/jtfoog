package Assignment1;


/*Magazine class
 * Joseph Fuguet and Josh Labrie
 * Represents class Magazine
 */

public class Magazine extends Media {
	// Variables exclusive to Magazine type
	double issueCost = 0;
	int issuesPerYear = 0;

	public Magazine(String title, String publicationDate, double issueCost, int issuesPerYear) { // Magazine constructor

		super(title, publicationDate); // calls Media.java abstract class
		this.issueCost = issueCost;
		this.issuesPerYear = issuesPerYear;
	}

	////////GETTERS AND SETTERS
	@Override
	public double getCost() {
		return issueCost;
	}

	public double getIssueCost() {
		return issueCost;
	}

	public void setIssueCost(double issueCost) {
		this.issueCost = issueCost;
	}

	public int getIssuesPerYear() {
		return issuesPerYear;
	}

	public void setIssuesPerYear(int issuesPerYear) {
		this.issuesPerYear = issuesPerYear;
	}

	public String print() { //custom print method for magazines
		return "m, " + this.getTitle() + ", " + this.getPublicationDate() + ", " + this.getIssueCost() + ", "
				+ this.getIssuesPerYear();
	}
}
