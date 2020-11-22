package Project_17;

import java.util.InputMismatchException;
import java.util.Scanner;



public class ProductTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		
		int stockChoice = -1,errorFlag = 0;
		Product[] products = new Product[1];
		
//		int maxSize = -1, menuChoice,errorFlag = 0;
//		
//		maxSize = getNumProducts(in);
		
		do {
			errorFlag = 0;
			
			try {
				System.out.println("1: CD\n2: DVD\nPlease enter the product type:");
				stockChoice = in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("The data type you have entered is invalid!");
				stockChoice = -1;
				errorFlag = 1;
				in.nextLine();
			}
			catch (Exception e) {
				System.out.println(e);
				stockChoice = -1;
				errorFlag = 1;
				in.nextLine();
			}
			
			if((stockChoice < 1 || stockChoice > 2) && errorFlag != 1) {
				System.out.println("Only numbers 1 or 2 allowed!");
			}
			
		}
		while(!(stockChoice == 1 || stockChoice == 2));
	
		switch(stockChoice) {
		case 1: addCDToInventory(products, in, 1, products.length - 1 );
		break;
		case 2: addDVDToInventory(products, in, 1, products.length - 1);
		break;
		}

		
//		if(maxSize ==0) {
//			//Display a no products message if zero is entered
//			System.out.println("No products required!");
//		}
//		else {
//			try {
//				
//				
//			    	do {
//			    		menuChoice = getMenuOption(in);
//			    		executeMenuChoice(menuChoice, products, in);
//			    	}
//			    	while(menuChoice != 0);
//		    }
//			catch(InputMismatchException e) {
//				System.out.println("Incorrect data type entered!");
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
	}
		
	
	public static void displayInventory(Product[]products) {
	    for(Product product: products)
	    	System.out.println(product);
	}
	
	public static void addToInventory(Product[] products, Scanner in, int maxSize) {
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		
		for(int i = 0; i<maxSize; i++) {
        	in.nextLine();

    		System.out.print("\n\nPlease enter the product name: ");
    		in.nextLine();
    		tempName = in.nextLine();
    		System.out.print("Please enter the quantity of stock for this product: ");
    		tempQty = in.nextInt();
    		System.out.print("Please enter the price for this product: ");
    		tempPrice = in.nextDouble();
    		System.out.print("Please enter the item number: ");
    		tempNumber = in.nextInt();
    		
    		
    		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
		}
	}
	
	public static void addCDToInventory(Product[] products, Scanner in, int maxSize, int i) {
		
		String tempArtist;
		int tempNumberOfSongs;
		String tempLabel;
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		

		System.out.print("\n\nPlease enter the CD name: ");
		in.nextLine();
		tempName = in.nextLine();
		System.out.println("Please enter the artist name:");
		tempArtist = in.next();
		System.out.println("Please enter the record label name:");
		tempLabel = in.next();
		System.out.println("Please enter the number of songs:");
		tempNumberOfSongs = in.nextInt();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		
		
		products[i] = new CD (tempNumber, tempName, tempQty, tempPrice, tempArtist, 
				tempNumberOfSongs, tempLabel);
	}

			
	public static void addDVDToInventory(Product[] products, Scanner in, int maxSize, int i) {
			
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		double tempLength;
		int tempAgeRating;
		String tempFilmStudio;
		
		System.out.print("\n\nPlease enter the DVD name: ");
		in.nextLine();
		tempName = in.nextLine();
		System.out.println("Please enter the film studio name:");
		tempFilmStudio = in.next();
		System.out.println("Please enter the age rating:");
		tempAgeRating = in.nextInt();
		System.out.println("Please enter the length in minutes:");
		tempLength = in.nextDouble();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		
		
		products[i] = new DVD (tempNumber, tempName, tempQty, tempPrice, tempLength, tempAgeRating,
		tempFilmStudio);
	}
	
	
	public static int getNumProducts(Scanner in) {
		int temp = -1;
		
		int flag = 0;
		
		do {
		flag = 0;
		
		System.out.println("Enter the number of products you would like to add.");
		System.out.print("Enter 0 (zero) if you do not wish to add products: ");
		
		try{
			temp = in.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Incorrect data type entered!");
			in.nextLine();
			flag = 1;
		}
		catch(Exception e) {
			System.out.println(e);
			in.nextLine();
			flag = 1;
		}
		
		if(temp < 0 && flag != 1)
			System.out.println("Incorrect Value entered");
		}
		while(temp < 0);
		
		return temp;
	}
	

	
	public static int getMenuOption (Scanner in) {
		int temp;
		System.out.println("1. View Inventory\n2. Add Stock\n3. "
				+ "Deduct Stock\n4. Discontinue Stock\n0.Exit\n\nPlease enter a menu option:");
		
		do {
			try {
				temp = in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
				
				temp = -1;
			}
			catch(Exception e){
				System.out.println(e);
				in.nextLine();
				
				temp = -1;
			}
		}
		while (!(temp >= 0 && temp <= 4));
		
		return temp;
	}
	
	public static int getProductNumber(Product [] products, Scanner in) {
		int productChoice = -1;
		
		for(int i = 0; i < products.length; i++) {
			System.out.println("Product name: " + products[i].getName() +
					" Product index: " + i);
		}
		
		System.out.println("Enter the index of the product to update:");
		
		try {
			productChoice = in.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Incorrect data type entered!");
			in.nextLine();
		}
		catch(Exception e) {
			System.out.println(e);
			in.nextLine();
		}
		
		if(productChoice >= 0 && productChoice < products.length) {
			return productChoice;
		}
		
		System.out.println("The index you have entered is invalid");
		return -1;
		
	}
	
	public static void addInventory(Product[] products, Scanner in) {

		int productChoice, updateValue = -1, flag = 0;
			productChoice = getProductNumber(products, in);
			
		if(productChoice == -1) return;
			
		if(products[productChoice].getActive()) {
				
			do {
				flag = 0;
				System.out.println("How many products do you want to add?");
				
				try {
					updateValue = in.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Incorrect data type entered!");
					in.nextLine();
					updateValue = -1;
					flag = 1;
					
				}
				catch(Exception e ) {
					System.out.println(e);
					in.nextLine();
					updateValue = -1;
					flag = 1;
				}
				
				if(updateValue <= 0 && flag == 0) {
					System.out.println("The update value must be a positive integer.");
				}

			}	
			while(!(updateValue > 0));
			
			products[productChoice].addToInventory(updateValue);
		}
			
		else {
			System.out.println("The product you tried to add stock to is discontinued");
		}
	}
	
	public static void deductInventory(Product[] products, Scanner in) {
		int productChoice, updateValue = -1, flag = 0;
		productChoice = getProductNumber(products, in);
		
		if(productChoice == -1) return;
		
		if(products[productChoice].getActive()) {
			do {
				flag = 0;
				System.out.println("How many products do you want to deduct?");
				
				try {
					updateValue = in.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Incorrect data type entered!");
					in.nextLine();
					updateValue = -1;
					flag = 1;
					
				}
				catch(Exception e ) {
					System.out.println(e);
					in.nextLine();
					updateValue = -1;
					flag = 1;
				}
				
				if(updateValue <= 0 && flag == 0) {
					System.out.println("The update value must be a positive integer.");
				}
				else if(products[productChoice].getQtyInStock() - updateValue < 0 && flag == 0) {
					System.out.println("The quantity to deduct is too high");
				}
			}	
			while(!(updateValue > 0 && (products[productChoice].getQtyInStock() - updateValue >= 0)));
			
			products[productChoice].deductFromInventory(updateValue);
		}
		
		else {
			System.out.println("The product you tried to deduct is discontinued");
		}
	}
	
	public static void discontinueInventory(Product[] products, Scanner in) {
		int productChoice = -1;
		do {
			try {
				productChoice = getProductNumber(products, in);
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			catch (Exception e) {
				System.out.println(e);
				in.nextLine();
			}
		}
		while(productChoice == -1);
		
		
		products[productChoice].setActive(false);
	}
	
	public static void executeMenuChoice(int menuChoice, Product[] products, Scanner in) {
		
		switch(menuChoice) {
		case 0: System.out.println("Exit");
				return;
				
		case 1: System.out.println("View Inventory");
				displayInventory(products);
				break;
				
		case 2: System.out.println("Add Stock");
				addInventory(products, in);
				break;
				
		case 3: System.out.println("Deduct Stock");
				deductInventory(products, in);
				break;
				
		case 4: System.out.println("Discontinue Stock");
				discontinueInventory(products, in);
				break;
		
		default: System.out.println("Invalid option");
		}
	}
}


