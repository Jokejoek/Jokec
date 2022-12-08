import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		
		inputStudent();
	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		String id = "";
		String subid = "";
		while(isLength(id,subid))
		{
			System.out.print("Enter Student: ");
			id = scan.nextLine();
			System.out.print("Enter Subject: ");
			subid = scan.nextLine();
		}
	}
	public static boolean isLength(String item1,String item2) {
		if(item1.length()==10 && item2.length() == 7) {
		return true;	
		}
		return false;
		
	}

}
