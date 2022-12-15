package Week6;

import java.util.*;

public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberOfInterger = { 78, 36, 58, 41, 25, 92, 75 };
		System.out.print("Input index of array : ");
		int indexOfArray = scan.nextInt();

		while (indexOfArray < 0 || indexOfArray > (numberOfInterger.length - 1)) {
			System.out.print("Input index of Array, agian : ");
			indexOfArray = scan.nextInt();

		}
		System.out.println();
		System.out.println("Value is current index is " + (numberOfInterger[indexOfArray]));
		System.out.println("Value is current index is " + (numberOfInterger[indexOfArray + 1]));
		if (indexOfArray == 6) {
			System.out.println("Sorry, " + indexOfArray + " is the last index in array.");
		} else {
			System.out.println("Value is current index is " + (numberOfInterger[indexOfArray + 1]));
		}
	}

}
