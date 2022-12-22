package week7;
import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		inputCoin();
	}

	public static void inputSize() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of Piggy bank");
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your Piggy Bank: " + pb.getPiggyBank());
		inputCoin();
	}

	private static void inputCoin() {
		while (true) {
			System.out.println("\n===================================");
			System.out.println("Menu of PiggyBank");
			System.out.println("===================================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("===================================");
			System.out.println("Please select choice[1-5]: ");
			int choice = scan.nextInt();
			if(choice == 1 ) {
				System.out.print("insert 1 bath money: ");
				pb.addOne(scan.nextInt());
				System.out.println("Money total: "+pb.getTotal());
			}else if ( choice == 2) {
			System.out.print("insert 2 bath money: ");
			pb.addTwo(scan.nextInt());
			System.out.println("Money total: "+pb.getTotal());
		}else if (choice == 3) {
			System.out.print("insert 5 bath money: ");
			pb.addfive(scan.nextInt());	
			System.out.println("Money total: "+pb.getTotal());
		}else if( choice ==4) {
			System.out.print("insert 10 bath money: ");
			pb.addten(scan.nextInt());
			System.out.println("Money total: "+pb.getTotal());
		}else if (choice ==5 ) {
			System.out.println("Bye Bye");
			break;
		}
		
	}
	}
}
