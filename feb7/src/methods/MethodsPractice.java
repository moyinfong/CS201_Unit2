package methods;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MethodsPractice {
	static String correctionUsername = "moyinfong";
	static String correctionPassword = "9876";
	static String username;
	static String password;
	static Scanner input = new Scanner(System.in);
	static boolean status = false;

	public static void main(String[] args) {
		
		authentication(password, username);
	
		}
		
	
	public static boolean authentication(String password, String username){
			status = false;
			System.out.println("Enter your username");
			username = input.next();
			System.out.println("Enter your password");
			password = input.next();
			if(username.equalsIgnoreCase(correctionUsername) && password.equals(correctionPassword)){
				System.out.println("Welcome "+ username+ "!" );
			status = true;
			}
			else{
			status = false;
				System.out.println("Invalid Password or Username");
			}
		
		return status;
		}
	
	public static boolean authenication2(String password,String username){
		status = false;
				
		if(username.equalsIgnoreCase(correctionUsername)&& password.equals(correctionPassword)){
			JOptionPane.showMessageDialog(null, "Welcome "+ username);
			status = true;
			
		}
		else{
			JOptionPane.showMessageDialog(null,"Invalid Password or Username");
		}
		
		return status;
		
		
	}
	}
