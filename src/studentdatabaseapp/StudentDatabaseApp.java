package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		/* We don't want to write thispeace of code for every of many students: 
		 
		Student st1= new Student();
		st1.enroll();
		st1.payTuition();
		System.out.println(st1.showInfo());
		
		Student st2= new Student();
		st2.enroll();
		st2.payTuition();
		System.out.println(st2.showInfo());
		
		*/
		
		//Ask how many users we want to add
		
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numbOfStud = in.nextInt();
		
		Student[] students = new Student[numbOfStud];
		
		//Create n number of new students
		for (int n=0; n<numbOfStud; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			//System.out.println(students[n].showInfo());
		}
		//System.out.println(students[0].showInfo());
		//System.out.println(students[1].showInfo());
	
		for (int n=0; n<numbOfStud; n++) {
			System.out.println(students[n].showInfo());
		}
	}

}
