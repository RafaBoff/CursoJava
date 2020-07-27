package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class ExercFix9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit ? (y/n) ");
		char iniDep = sc.next().charAt(0);
		 
		if(iniDep == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial = sc.nextDouble();	
			bank = new Bank(account, name, initial);
		} 
		else {
			bank = new Bank(account, name);			
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double incValue = sc.nextDouble();
		bank.incBalance(incValue);
		System.out.println("Updated account data:");
		System.out.println(bank);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double decValue = sc.nextDouble();
		bank.decBalance(decValue);
		System.out.println("Updated account data:");
		System.out.println(bank);
		System.out.println();

		sc.close();
		
	}

}
