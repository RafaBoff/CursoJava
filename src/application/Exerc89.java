package application;

import java.util.Scanner;

import entities.Rent;

public class Exerc89 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] rent = new Rent[10]; 
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String mail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, mail);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}

}
