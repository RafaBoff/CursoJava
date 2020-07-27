package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

import java.util.ArrayList;
import java.util.List;

public class Exerc94 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employe> list = new ArrayList<>();
		
		// PART 1 - Reading Data
		
		System.out.print("How many employees will be registred? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("ID already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employe emp = new Employe(id, name, salary);
			list.add(emp);
			
		}
		
		// PART 2 - Updating salary of given employee
			
			System.out.println();
			System.out.print("Enter the employee ID that will have salary increase: ");
			int idsalary = sc.nextInt();
			
			Employe emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
			
			//Integer pos = position(list, idsalary);
			
			if(emp == null) {
				System.out.println("This ID does not exists!");
			} 
			else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				emp.increaseSalary(percent);
			}
			
			System.out.println("");
			System.out.println("List of Employees: ");
			for(Employe e : list) {
				System.out.print(e);
				System.out.println();
			}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employe> list, int id) {
		Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer position(List<Employe> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	}

}
