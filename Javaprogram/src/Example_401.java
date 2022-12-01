import java.util.*;
public class Example_401 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String inputtext="";
		String wordtodisplay="";
		while(true) {
			System.out.print("Enter word");
		 inputtext = kb.next();
		 if(inputtext.equalsIgnoreCase("stop")) {
		   break;	 
		 }
		 wordtodisplay = wordtodisplay+inputtext+" ";
		}
		System.out.println(inputtext.toUpperCase());

	}

}
