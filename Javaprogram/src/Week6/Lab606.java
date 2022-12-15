package Week6;

import javax.swing.JOptionPane;

public class Lab606 {

	public static void main(String[] args) {
		int[] number = { 25, 78, 41, 22, 36, 85,37 };
		int indexpos = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while (!checkindex(number, indexpos)) {
			indexpos = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		JOptionPane.showMessageDialog(null, "Current data,nums[" + indexpos + "] is " + currentData(number, indexpos) 
		+"\n"+(indexpos-1!=-1?"Previous data,nums["+(indexpos-1)+"] is "+prevData(number, indexpos):"No previous data")
		+"\n"+(indexpos+1!=7?"Next data,nums["+(indexpos+1)+"] is "+nextData(number, indexpos):"No next data"));

	}

	private static int nextData(int[] number, int pos) {
		return (pos >= 0 && pos <= 6) ? number[pos + 1] : -1;
	}

	private static int prevData(int[] number, int pos) {
		return (pos >= 0 && pos <= 6) ? number[pos - 1] : -1;

	}

	private static int currentData(int[] number, int pos) {
		int value = number[pos];
		return value;

	}

	private static boolean checkindex(int number[], int pos) {
		return (pos >= 0 && pos < 7);

	}

}
