package quiz2;

import java.util.Scanner;

public class Authentication {

		static String correctionUsername = "moyinfong";
		static String correctionPassword = "9876";
		static String username;
		static String password;
		static Scanner input = new Scanner(System.in);
		static boolean status;

		public static void main(String[] args) {

			System.out.println("Enter your username");
			username = input.next();

			System.out.println("Enter your password");
			password = input.next();


			status = authentication(username, password);
			
			

			if (status == true) {
				System.out.println("Welcome " + username + "!");
			} 
			else {
				System.out.println("Invalid Password or Username");

			}
		}

		public static boolean authentication(String username, String password) {

			if (username.equals(correctionUsername) && password.equals(correctionPassword)) {
				status = true;
			}
			else {
				status = false;
				
			}
			
			return status;
		}
	}


	}

}
