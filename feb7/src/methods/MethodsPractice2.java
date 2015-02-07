package methods;
import javax.swing.JOptionPane;

public class MethodsPractice2 {

	public static void main(String[] args) {
		
		MethodsPractice testing = new MethodsPractice();
		String username = JOptionPane.showInputDialog("Enter Username");
		String password = JOptionPane.showInputDialog("Enter Password");
		testing.authenication2(password, username);

	}

}
