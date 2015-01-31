/*Student:Yin Fong Mo
 Assignment # 1, Problem 1
 CS 201
 The purpose of this program is to create a vending machine that offers 5 products.
 The machine accepts only pennies, dimes, nickels, quarters, one dollar bills, and 5 dollar bills. 
 User can indicate all the money has finished inserting by entering 0, then the machine will total amount of money has inserted
 The selections available for user are numbers from 1 to 5.
 The machine allows user to choose more than 1 products
 User can stop the selection process any time by entering 0. the machine will total the amount that will be charged
 If the user chooses to cancel the selection, the machine returns the initial amount in coins.
 If the total inserted amount is less than the total charged amount, the machine will display a "do not have efficient fund" message.*/

/*Algorithm 
 Start
 initialize variables
 Print user instruction on inserting money 
 Create a while loop that ends when not done is false (when user enters "0")
 read insert amount
 print an error message except amounts of 0.01, 0.05, 0.1, 0.25, 1, 5
 Add increase amount to insert amount 
 End while loop when user enters "0" and not done becomes false
 print insert amount
 print user instruction on how to select products
 create a while loop that ends when selection = 0 
 read selection
 use a switch statement to assign food price 
 Add food price to total charge
 print error message except selection from 1 to 5 
 end loop when user enter "0" 
 print total charge
 use if-else to print outcomes 
 if insertAmount > totalCharge
 set total change = insert amount - total charge
 else if totalCharge = 0
 set total change = insert amount
 else total charge > insert amount
 print do not have sufficient fund message
 set totalChange = totalChange * 100;
 set quarters = (int)totalChange/ 25;
 set totalChange = totalChange % 25;
 set dimes = (int)totalChange / 10;
 set totalChange = totalChange % 10;
 set nickels = (int)totalChange /5;
 set totalChange = totalChange % 5;
 set pennies = (int)totalChange;
 print total change in quarters, dimes, nickels, and pennies 
 end*/

package assignment1;
import java.util.Scanner;// scanner class

public class VendingMachine {
	public static void main(String[] args) {
	//initialize variables
	
		double insertAmount = 0.0;
		double foodPrice = 0.0;
		double totalCharge = 0.0;
		double totalChange = 0.0;
		int selection = 1;
		int quarters;
		int dimes;
		int nickels;
		int pennies; 
		double amount = 1.0;
		boolean notdone = true;
		
		
		Scanner input = new Scanner(System.in);
		
//prompt user to input amounts
		System.out.println("The vending machine accepts amount in coins");
		System.out.println("dime = 0.1, quarter = 0.25, penny = 0.01, nickel = 0.05, 1 dollar bill,and 5 dollars bill");
		System.out.println("Please insert amounts and enter 0 to indicate you are done inserting");
//loop that prompt user to purchase 3 times		
	for(int i = 0; i< 3; i++){
		//reset all the value to their initial values after each purchase is completed;
		//create a while loop that ends when user enter 0 which changes the variable not done to false
		//user will enter amount individually 
		//user will receive warn when the amount entered is not penny, dime, nickel, quarter, 1 dollar or 5 dollar
		// try and catch is to avoid non-integer input like string
		notdone = true;
		insertAmount = 0.0;
		foodPrice = 0.0;
		totalChange = 0.0;
		totalCharge = 0.0;
		selection = 1;
		quarters= 0;
		dimes = 0;
		amount = 1.0; 
		nickels = 0;
		pennies = 0; 
		
		while (notdone){
			System.out.println("Enter amount ");
			
			try {
				amount = input.nextDouble();
				if(amount == 0.1 || amount ==  0.25 || amount == 0.05 || amount == 0.01 ||
						amount == 1 || amount == 5 || amount == 0){
					insertAmount = insertAmount + amount;
					
					if (amount == 0){
						notdone = false;
					}
				}
				else {
					System.out.println("Invalid input, please re-enter amount ");

																	
				}
			} 
			catch (Exception e) {
				System.out.println("Invalid input, please re-enter amount ");
				input.nextLine();
			}
						
		}
		//output total inserted amount after the while loop is ended 					
			System.out.println("You have inserted the dollar amount of $" + Math.round(insertAmount*100.0)/100.0);
			
		//output user instructions  
		//create a while loop that will end when user enter "0" 
		int count = 1;	
		System.out.println("This vending machine has five selections for you to choose from");
		System.out
				.println("(1 for laychip $1.50 , 2 for Gummy Bear $2.81, 3 for Kitkat $0.89, 4 for Bubble Gum $1.72, "
							+ "5 for Peanut butter cracker $3.5");
		System.out.println("You can exist the selection process anytime by entering 0");
		
		
		while(selection > 0){
			System.out.println("Please enter your selection for item #" + count);
			selection = input.nextInt();
			if(selection == 1 || selection == 2  || selection == 3 || selection == 4 ||
					selection == 5 || selection == 0){
				count++;
		//using switch statement to assignment food price based on the selection					
			switch (selection){ 
					case 1: 
						foodPrice = 1.50;
						totalCharge = totalCharge + foodPrice;
						break;
					case 2:
						foodPrice = 2.81;
						totalCharge = totalCharge + foodPrice;
						break;
					case 3:
						foodPrice = 0.89;
						totalCharge = totalCharge + foodPrice;
						break;
						
					case 4:
						foodPrice = 1.72;
						totalCharge = totalCharge + foodPrice;
						break;
					
					case 5:
						foodPrice = 3.54;
						totalCharge = totalCharge + foodPrice;
						break;
					case 0:
						foodPrice = 0;
						totalCharge = totalCharge + foodPrice;
						break;
					
				}
			}
			//user if-else to output different outcomes ( insert amount > total charge or insert amount < total charge or selection = 0)
			//if user input values other than 0, 1 - 5, the machine will display an error message and prompt user to re-enter again until the input is valid 
			else{
				System.out.println("Sorry, the item is unavalible, please re-enter selection for item # "+ count);
				selection = input.nextInt();
				while(selection != 1 && selection !=  2 && selection != 3 && selection != 4 &&
						selection != 5 && selection != 0){
					System.out.println("Sorry, the item is unavalible, please re-enter selection for item # "+ count);
						selection = input.nextInt();
					}
				
				switch (selection){ 
				case 1: 
					foodPrice = 1.50;
					totalCharge = totalCharge + foodPrice;
					break;
				case 2:
					foodPrice = 2.81;
					totalCharge = totalCharge + foodPrice;
					break;
				case 3:
					foodPrice = 0.89;
					totalCharge = totalCharge + foodPrice;
					break;
					
				case 4:
					foodPrice = 1.72;
					totalCharge = totalCharge + foodPrice;
					break;
				
				case 5:
					foodPrice = 3.54;
					totalCharge = totalCharge + foodPrice;
					break;
				case 0:
					foodPrice = 0;
					totalCharge = totalCharge + foodPrice;
					break;
				}
					count++;
					
					
			}
						
		}
						
	
	//display the total amount in two decimal point after the while loop is ended 
	
		System.out.println();
		System.out.println("Thank you!");
		System.out.println("You have inserted the total amount of $ "+ Math.round(insertAmount*100.0)/100.0);
		
		//if the total charge is less than amount inserted and not equal to 0		
		if(insertAmount > totalCharge && totalCharge!= 0){
			totalChange = Math.round((insertAmount - totalCharge)*100.0)/100.0; 
			System.out.println("The total amount of $" + Math.round(totalCharge*100.0)/100.0 + " will be charged");	
			System.out.println("The total change in the amount of $"+ totalChange);
			System.out.println("You will receive the amount of change in ");
		}
		//if user did not select any item and enter 0 right away 
		else if (totalCharge == 0){
			totalChange = Math.round((insertAmount - totalCharge)*100.0)/100.0; 
			
			System.out.println("You did not select any item, your will receive a full amount of refund ");
			System.out.print("The refund you will receive will be in ");
				
		}	
				
		//if total price is more than amount inserted
		//user will get full refund 
		else{
				totalCharge = 0;
				totalChange = Math.round((insertAmount - totalCharge)*100.0)/100.0; 
				System.out.println("Sorry, you do not have sufficient fund");
				System.out.println("You will receive full amount of refund");
				System.out.print("The refund you will receive will be in ");
				
			
			}
			
		//calculate change in quarters, dimes, nickels, and pennies 	
		totalChange = totalChange * 100;
		quarters = (int)totalChange/ 25;
		totalChange = totalChange % 25;
		dimes = (int)totalChange / 10;
		totalChange = totalChange % 10;
		nickels = (int)totalChange /5;
		totalChange = totalChange % 5;
		pennies = (int)totalChange;
		
			
		// display the change in quarters, dimes, nickels, and pennies 
		System.out.println(quarters+
				" quarter(s), "+ dimes +" dime(s), "+nickels +
				" nickel(s), "+pennies +" penny(ies)");
		System.out.println("See you next time!");
		System.out.println();
		
		
		}
	input.close();
	}	
	}
	
	
	
			
	

						
						
					
						
						
					
					
				
				
				
		
		




