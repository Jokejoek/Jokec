import java.util.*;
import javax.swing.*;
public class Example_403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = JOptionPane.showInputDialog(null,
				"Input a sentence : ");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog(null,
					"Input a sentence, again : ");
			
		}
		System.out.println();
		int countofspace = 0;
		for(int i =0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
			countofspace++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"This sentece has "+countofspace +" spacebar.\n"+"This sentece has "+(countofspace+1) +" words.");
	}
}
