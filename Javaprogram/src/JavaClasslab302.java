import javax.swing.JOptionPane;

public class JavaClasslab302 {
	public static void main(String[] args) {
	 double weight =  Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
	 double hight =  Double.parseDouble(JOptionPane.showInputDialog("Input hight"));
	 hight =hight/100;
	 double BMI = (weight/Math.pow(hight, 2));
			
	if(BMI <18.5) {
		JOptionPane.showMessageDialog(null,
				"BMI = "+ BMI
				+"\nYou're Underweight");
	}else if(BMI <25) {
		JOptionPane.showMessageDialog(null,
				"BMI = "+ BMI
				+"\nYou're Normal-weight");
	}else if(BMI <30) {
		JOptionPane.showMessageDialog(null,
				"BMI = "+ BMI
				+"\nYou're Overweight");
	}else if(BMI>30) {
		JOptionPane.showMessageDialog(null,
				"BMI = "+ BMI
				+"\nYou're Obesity");
	}
	}
}
