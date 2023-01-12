import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.text.*;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber1.setBounds(45, 11, 103, 35);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(170, 20, 222, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber2.setBounds(45, 57, 103, 29);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(170, 63, 222, 20);
		contentPane.add(txtNumber2);
		
		JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(170, 102, 55, 22);
		cmbOperator.addItem ("+");
		cmbOperator.addItem ("-");
		cmbOperator.addItem ("*");
		cmbOperator.addItem ("/");
		contentPane.add(cmbOperator);
		
		final JCheckBox oneDigit = new JCheckBox("1 Digit");
		oneDigit.setBounds(170, 145, 97, 23);
		contentPane.add(oneDigit);
		
		
		
		JCheckBox twoDigit = new JCheckBox("2 Digit");
		twoDigit.setBounds(170, 175, 97, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		

		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				if (e.getSource() == btnOK) {
					num1= Double.parseDouble(txtNumber1.getText());
					num2= Double.parseDouble(txtNumber2.getText());
					//sum= num1+num2;
					operator = (String).cmbOperator.getSelectItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber =null;
					//JRadioButonn
					if(oneDigit.isSelected())
						frmNumber= new DecimalFormat("#,###.");
					
					lblresult.setText(String.format("%2.f",sum));
				}
			}
		});
		btnOK.setBounds(86, 215, 96, 35);
		contentPane.add(btnOK);

		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(249, 215, 96, 35);
		contentPane.add(btnCancel);

		JLabel lblresult = new JLabel("Result");
		lblresult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblresult.setBounds(321, 175, 103, 29);
		contentPane.add(lblresult);
		
		JLabel cmdOprerator = new JLabel("Operator");
		cmdOprerator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmdOprerator.setBounds(45, 97, 103, 29);
		contentPane.add(cmdOprerator);
		
		JLabel lblHowToShow = new JLabel("How to show digit");
		lblHowToShow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHowToShow.setBounds(45, 137, 120, 29);
		contentPane.add(lblHowToShow);
		


		

	}
}
