package homework1;
import java.util.Scanner;

public class VendingMachine {
	
	private double insertAmount = 0.0;
	private String displaySelection = "";
	private double foodPrice = 0.0;
	private int selection = 1;
	Scanner input = new Scanner(System.in);


	public VendingMachine (){
	}
	

	public void readInsertAmount(){
		System.out.println("The vending machine accepts amount in coins (dime = 0.1, quarter = 0.25," +
				" penny = 0.01, nickel = 0.05), " +
				"1 dollar bill,and 5 dollars bill");
		System.out.println("Please insert amounts and enter 0 to indicate you are done inserting");
		double amount = 1; 
		while (amount > 0){
		amount = input.nextDouble();
		insertAmount = insertAmount + amount;
		
		}
	System.out.println(insertAmount);
	}
	
	/* public void readSelections(double price){			
		foodPrice = price;
	
			
		System.out.println("This vending machine has five selections for you to choose from");
		System.out
				.println("(1 for Lays Chip, 2 for Gummy Bear, 3 for Kitkat, 4 for Bubble Gum, "
							+ "5 for Peanut butter cracker or 0 to stop the selection");
		selection = input.nextInt();
			
		switch (selection){
		case 1: 
			
				
			
			
		case 2:
			
		case 3:
			
		case 4:
		
		case 5:
			
		case 0: */
			
			
		
			
		}
		
		
		
		
		




