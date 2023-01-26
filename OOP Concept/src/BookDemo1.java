import java.util.Scanner;

public class BookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input author name : ");
		String name = scan.nextLine();
		System.out.print("input author e-mail : ");
		String email = scan.nextLine();
		
		Author worapat = new Author(name,email);
		System.out.println(worapat);
		
		System.out.print("input Book title: ");
	scan.nextLine();
	String title = scan.nextLine();
	System.out.print("Input book page : ");
	int page = scan.nextInt();
	
	Book1 book = new Book1(title,worapat,page);
	System.out.println(book);
	}

}
