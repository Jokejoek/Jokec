
public class Student {
	//private instance variable
	private String name;
	private String address;
	//The course taken and grades for the courses are kept in 2 parallel arrays
	//course[] = {INT108,INT107}; grades[]={89,75};
	private String[] courses;
	private int[] grades; //valid range is [0,100]
	private int numCourses;//numbers of courses taken so far
	//Maximun number of courses taken by student
	private static final int MAX_COURSE = 30;
	
	/**Construct a student instance with given input*/
	public Student(String name,String address){
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return name+" ("+address+")";
	}
	public void addCourseGrade(String course,int grade) {
		courses[numCourses]=course;
		grades[numCourses]=grade;
		++numCourses;
	}
	public void printGrades() {
		System.out.print("");
	}
	public double getAverageGrade() {
		int sum=0;
		for(int i=0;i<numCourses;i++) {
			sum+=grades[i];
		}
		return (double)sum/numCourses;
	}
}
