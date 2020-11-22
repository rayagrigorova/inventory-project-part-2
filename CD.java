package Project_17;

public class CD extends Product {
	
	String artist;
	int numberOfSongs;
	String label;
	
	public CD() {
		super();
		artist = "";
		numberOfSongs = 0;
		label = "";
	}
	
	public CD (int number, String name, int qty, double price, String artist, 
	int numberOfSongs, String label) {
		super(number, name, qty, price);
		this.artist = artist;
		this.numberOfSongs = numberOfSongs;
		this.label = label;
	}
	/*
	 *  a. Create a subclass of the Product class called DVD that has
	 * additional instance fields to store the movie length in minutes, the age
	 * rating and the Film Studio that released the movie.
	 * b. Create a single
	 * constructor that accepts values for every instance field for both the DVD and
	 * Product classes. Use the super() call to the constructor in Product passing
	 * the required parameters. 
	 * c. Create getters and setters for the DVD instance
	 * fields. 
	 * d. Follow exactly the same process to create a subclass of Product
	 * named CD. Create the instance fields, constructor and getter and setters.
	 */

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	/*
	 * Item Number : 2 Name : Dreams we never lost Artist : Tidelines Songs on Album
	 * : 14 Record label : Tide Lines Music Quantity in stock: 50 Price : 7.99 Stock
	 * Value : 399.5 Product Status : Active
	 */
	public String toString() {
		return ("Item Number: " + this.getItemNumber() + " Name: " + this.getName()
    	+ " Artist: " +  this.getArtist() +  " Songs on Album:  " 
    	+ this.getNumberOfSongs() + "\nRecord label: " +  this.getLabel() + " Quantity in stock: "
    	+ this.getQtyInStock() +  " Price : " + this.getPrice() + " Stock Value : " 
    	+ this.getInventoryValue() + " Product Status : " + this.getActive());
	}
}
