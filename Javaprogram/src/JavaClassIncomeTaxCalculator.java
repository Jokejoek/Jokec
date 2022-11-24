import java.util.*;
import java.text.*;
public class JavaClassIncomeTaxCalculator {
	final static double TAX_RATE_ABOVE_20K = 0.1;
	final static double TAX_RATE_ABOVE_40K = 0.2;
	final static double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("##,##0.00");
		double taxableIncome;
		double taxPayable;
		System.out.print("Enter the taxable in come : $");
		taxableIncome = scan.nextInt();
		
		if (taxableIncome <= 20000) { 
			taxPayable = taxableIncome*0;
			} else if (taxableIncome <= 40000) { 
			taxPayable = taxableIncome-=20000;
			taxPayable=taxableIncome*TAX_RATE_ABOVE_20K;
			} else if (taxableIncome <= 60000) { 
			taxPayable = taxableIncome-=40000;
			taxPayable = taxableIncome*TAX_RATE_ABOVE_40K+2000;
			} else { 
			taxPayable = taxableIncome-=60000;
			taxPayable = taxableIncome*TAX_RATE_ABOVE_60K+6000;
			}
		System.out.println("The in come tax payable is: $"+frm.format(taxPayable));
	}
}
