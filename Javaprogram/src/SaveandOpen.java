import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {

	private String name, dept;

	public void insert() throws IOException {
		Scanner console = new Scanner(System.in); // input data from keyboard
		PrintStream prs = new PrintStream(new File("employee.txt")); // write data to File
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = console.next();
			System.out.print("Enter department : ");
			dept = console.next();
			prs.println(name + "\t" + dept);
			System.out.print("Enter data again? : ");
			answer = console.next();
		} while (answer.equalsIgnoreCase("y"));
	} // end of insert()

	public void read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while (in.hasNext()) {
				name = in.next();
				dept = in.next();
				if (dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.print(i + ") " + name);
					check = true;
				}
			} // while()
			if (check) {
				super.header();
				System.out.print("\nEmployee in department " + super.getDept() 
					+ " is " + i + " person.\n");
				super.header();
			} else {
				System.out.print("\nSorry,no department : " + super.getDept() 
					+ " in file.");
			}

		} catch (IOException e) {
			System.out.print("\nSorry,file not found...");
		}

	}

}