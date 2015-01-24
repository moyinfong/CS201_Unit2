//version 2
package Testing1;
import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[] args) {
		String userName;
		String password;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your username");
		userName = input.next();
		System.out.println("Enter you password");
		password = input.next();
		
		
		System.out.println("Hello  "+ userName +", Welcome to CSC200 class! and Your password is "+ password);
		input.close();
	}

}
