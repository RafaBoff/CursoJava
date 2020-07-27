package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exerc03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		System.out.print("Enter student name: ");
		stud.name = sc.nextLine();
		System.out.print("Enter grades: ");
		stud.grade1 = sc.nextDouble();
		stud.grade2 = sc.nextDouble();
		stud.grade3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", stud.finalGrade());
		
		if (stud.finalGrade() < 60) {
			System.out.print("FAILED");
			System.out.println();
			System.out.printf("MISSING %.2f POINTS %n", stud.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
