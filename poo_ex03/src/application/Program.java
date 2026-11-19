package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("input student name: ");
		student.name = sc.nextLine();
		System.out.print("input grade1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("input grade2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("input grade3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", student.finalGrade());
		if(student.passOrFail() == true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		
		
		sc.close();
	}

}
