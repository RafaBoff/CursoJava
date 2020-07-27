package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ExercFix8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price? ");
		double cota = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");		
		double qtd = sc.nextDouble();
		
		double reais = CurrencyConverter.price(cota, qtd);
		System.out.printf("Amount to be paid in reais = %.2f%n", reais);
		
		sc.close();
		
	}

}
