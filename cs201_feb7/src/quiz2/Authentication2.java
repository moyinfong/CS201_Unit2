package quiz2;

import javax.swing.JOptionPane;

public class Authentication2 {

	public static void main(String[] args) {

		Authentication testing = new Authentication();

		testing.username = JOptionPane.showInputDialog("Enter username");
		testing.password = JOptionPane.showInputDialog("Enter Password");

		testing.authentication(testing.username, testing.password);

		if (testing.status == true) {
			JOptionPane.showMessageDialog(null, "Welcome " + testing.username);
		} 
		
		else {
			JOptionPane.showMessageDialog(null, "Invalid Password or Username");
		}

	}

}
