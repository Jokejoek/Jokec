package Week6;

import java.util.*;

import javax.*;
import javax.swing.JOptionPane;

public class Lab605 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("input number " + (i + 1) + ":"));
		}
		showEven(number);
		showOdd(number);

	}

	private static void showOdd(int[] nums) {
		String Odd ="";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				Odd = Odd+nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n" + Odd);
	}

	private static void showEven(int[] nums) {
		String even = "";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				even = even+nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: \n" + even);


	}

}
