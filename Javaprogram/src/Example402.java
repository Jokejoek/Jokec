import java.util.*;

import javax.swing.JOptionPane;
public class Example402 {

	public static void main(String[] args) {
		String inputemail = JOptionPane.showInputDialog("Input you e-mail: ");
		while (inputemail.startsWith("@")||inputemail.contains(" "))
		{
			inputemail = JOptionPane.showInputDialog("Input your e-mail: ");	
		}
		if(inputemail.endsWith("@gmail.com")||inputemail.endsWith("@hotmail.com")) {
			
	
		JOptionPane.showMessageDialog(null, "Your e-mail is "+inputemail);}
	}	
	else {
		JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
	}

}
