package week7;

import java.util.*;

public class StudentScore {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many student in classroom : ");
		int stud= scan.nextInt();
		Student[] std = new Student[stud];
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();
			System.out.println("INPUT INFOMNTION OF STUDENT"+(i+1));
			System.out.println("-----------------------------------------------");
			System.out.print("Input student name: ");
			std[i].setName(scan.next());
			System.out.print("Input student score: ");
			std[i].getScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score: ");
				std[i].getScore(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("-----------------------------------------------");
		for(int i = 0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getname()+"("+std[i].getScore()+")");
			}
			
		}
		for(Student _std:std) {
			System.out.println(">> "+_std.getname()+" get grade "+ _std.findGrade(_std.getScore()));
		}

	}

}
