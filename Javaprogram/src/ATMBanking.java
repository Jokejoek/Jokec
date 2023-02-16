import java.util.*;
import java.text.*;
public class ATMBanking {

	public static void main(String[] args) {
		DecimalFormat bankacc = new DecimalFormat("000-000-00-0");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number: ");
		String accnum = scan.next();

		
		System.out.print(bankacc.format(Double.parseDouble(accnum))); //test
	}

}
