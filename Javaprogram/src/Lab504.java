import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Plase enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		String firstname= fullname.substring(0,fullname.indexOf(' '));

		System.out.print(AbbreviatName(fullname) + firstname);
	}

	public static String AbbreviatName(String name) {
		String le = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)==' ') {
				le = (le + name.charAt(i+1)).toUpperCase();
				le = le + ".";
			}

		}
		return le;
	}
}
