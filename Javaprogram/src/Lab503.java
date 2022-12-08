import javax.swing.JOptionPane;

public class Lab503 {
	static int inputyear;

	public static void main(String[] args) {
		inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));

		while (!(checkyear(inputyear))) {
			inputyear = Integer.parseInt(
					JOptionPane.showInputDialog("Please Input year between 1000-3000" + "\nInput Year,again"));
		}
		if (isLeapyear(inputyear)) {
			JOptionPane.showConfirmDialog(null, inputyear + " is leap year");
		} else {
			JOptionPane.showConfirmDialog(null, inputyear + " is not leap year");
		}
	}

	public static boolean checkyear(int year) {
		if (year >= 1000 && year <= 3000) {
			return true;
		}
		return false;

	}

	public static boolean isLeapyear(int year) {
		if ((year % 4 == 00) && ((year % 100 != 0) || (year % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}

}