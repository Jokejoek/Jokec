package Week6;

import java.util.*;

public class Example_603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.print("Input number " + (i + 2) + " : ");
			number[5] = scan.nextInt();
			int totalNumber = sumOfPos(number);
			System.out.println("Summation of positive number is " + sumOfPos(number));
		}

	}// end of main()

	private static int sumOfPos(int[] number) {
		int sum = 0;
		for (int _num : num) {
			sum += _num;
		}
		return sum;
	}

}