import javax.swing.*;
import java.text.*;
public class JavaClassLab301 {
	static final int PRICEPERSON = 299;
	public static void main(String[] args) {
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = PRICEPERSON * numberofCustomer;
		int memberCard;
		double discount;	
		do{
			memberCard = JOptionPane.showConfirmDialog(null,
				"Total Price is "+totalPrice+" baht." +
				"\nDo you have a member c-ard?");
		}while(memberCard==2);{
		
		if(memberCard==0) {
			discount = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, " Amount to be paid is "
					+(discount)+" bath.");
		}
		else if (memberCard==1) {
			JOptionPane.showMessageDialog(null, " Amount to be paid is "
					+totalPrice+" bath.");
		}
		}
	}

}
