import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		System.out.println("");
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
			}
		int space = sentence.indexOf(' ');
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)!=' ') {
				System.out.print(sentence.charAt(i));
			}
			else {
				System.out.println("");
			}
		}

	}


}