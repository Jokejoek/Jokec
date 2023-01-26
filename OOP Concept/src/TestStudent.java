
public class TestStudent {
	public static void main(String[] args) {
		//test constructor and tostring()
		Student chayanon = new Student("Chayanon Plachiwa","1 Happy ave");
		System.out.println(chayanon);
		
		chayanon.setAddress("23 chareomparkeit");
		System.out.println(chayanon);
		System.out.println(chayanon.getName());
		System.out.println(chayanon.getAddress());
		
		chayanon.addCourseGrade("INT107",87);
		chayanon.addCourseGrade("INT109",81);
		chayanon.addCourseGrade("MSC-202",92);
		chayanon.addCourseGrade();
		
		System.out.print("\nThe average grade is %.2n",chayanon.getAveragegrade);
	}
}
