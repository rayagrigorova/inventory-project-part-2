package Project_17;

public class DVD extends Product{
	double length;
	int ageRating;
	String filmStudio;
	
	public DVD() {
		super();
		length = 0;
		ageRating = 0;
		filmStudio = "";
	}
	
	public DVD(int number, String name, int qty, double price, 
			double length, int ageRating, String filmStudio){
		super(number, name, qty, price);
		this.length = length;
		this.ageRating = ageRating;
		this.filmStudio = filmStudio;
		
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	public String getFilmStudio() {
		return filmStudio;
	}

	public void setFilmStudio(String filmStudio) {
		this.filmStudio = filmStudio;
	}
	
	/*
	 * In the DVD subclass, override the method to calculate the value of the
	 * inventory of a DVD with the same name as that method previously created in
	 * the product class. The DVD subclass method should also add a 5% restocking
	 * fee to the value of the inventory of that product. You will need to get the
	 * values for price and quantity in stock from the superclass.
	 */
    public double getInventoryValue()
    {
      return (super.getInventoryValue() * 1.05);
    }
    
	/*
	 * a. Override the toString() method from the Product class so that all
	 * information about new subclass objects (DVDs) can be printed to the output
	 * console. Use the getter methods for the values instead of referencing the
	 * fields directly, this enforces using the local version of the methods if they
	 * exist instead of the methods at the superclass. Your output should look like
	 * the following:
	 * 
	 * Item Number : 1 Name : Daredevil Movie Length : 99 Age Rating : 15 Film
	 * Studio : 20th Century Fox Quantity in stock: 50 Price : 8.99 Stock Value :
	 * 471.975 Product Status : Active
	 */
    
    public String toString() {
    	return ("Item Number: " + this.getItemNumber() + " Name: " + this.getName()
    	+ " Movie Length: " +  this.getLength() +  " Age Rating:  " 
    	+ this.getAgeRating() + "\nFilm Studio: " +  this.getFilmStudio() + " Quantity in stock: "
    	+ this.getQtyInStock() +  " Price : " + this.getPrice() + " Stock Value : " 
    	+ this.getInventoryValue() + " Product Status : " + this.getActive());
    }
	
}
