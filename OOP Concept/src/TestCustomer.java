public class TestCustomer {
	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1.toString());
		c1.setDiscount(5);
		System.out.println(c1.toString());
		Line();
		System.out.println("\nid is: "+c1.getID());
		System.out.println("name is: "+c1.getName());
		System.out.println("discount is: "+c1.getDiscount());
		Line();
		System.out.println("\n###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1.toString());	
		inv1.setAmount(10000);
		System.out.println(inv1.toString());
		Line();
		System.out.println("\nid is :"+inv1.getID());
		System.out.println("customer is :"+c1.toString());
		System.out.println("amount is :"+inv1.getAmount());
		Line();
		System.out.println("\ncustomer's is : "+c1.getID());
		System.out.println("customer's name  is : "+c1.getName());
		System.out.println("customer's discount  is : "+c1.getDiscount());
		System.out.println("amount after discount  is : "+inv1.getAmountAfterDiscount());
	} 

	public static void Line() {
		for(int i=0;i<60;i++) {
			System.out.print("*");
		}
	}
} // end of class()