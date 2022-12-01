import java.util.Scanner;

public class Lab403 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String check = message.toLowerCase();
		if(check.contains("nichi")){
			System.out.println("Nichi is  sentence");
		}
		else {
			System.out.print(message);
		}
	}
	
}
