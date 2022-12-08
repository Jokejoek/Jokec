import javax.swing.JOptionPane;

improt javax.swing.*;
public class Lab502 {
	static String Email;
	public static void main(String[] args) {
		inputEmail();

	}
	public static void inputEmail() {
		Email = JOptionPane.showInputDialog("input your e-mail");
		checkEmail(Email);
	}
	public static void checkEmail(String chkEmail) {
		chkEmail = JOptionPane.showInputDialog("Input your e-mail");
		-
		
	}
}
