import java.util.*;

import javax.swing.JOptionPane;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
	
		int space= fullname.indexOf(' ');
		if(space ==-1) {
			System.out.print("incorrect");
		}
		else {
			System.out.println("First Name: "+fullname.substring(0,space).toUpperCase());
			System.out.println("Last Name: "+fullname.substring(space+1).toLowerCase());
		}
		}
		

	}
