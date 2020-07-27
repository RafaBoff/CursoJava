package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Prodct;

public class Prod {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Prodct> list = new ArrayList<>();
		
		System.out.print("Quantos produtos cadastrar ? ");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			
		System.out.print("Digite o código: ");
		int code = sc.nextInt();
		
		System.out.print("Digite o nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Digite o valor: ");
		double valor = sc.nextDouble();
		
		Prodct prd = new Prodct(code, name, valor);
		list.add(prd);
		
		}
		
		System.out.println();
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("Dados Produtos\n");
		
		for(Prodct p : list) {
		System.out.println(p);
		System.out.println();
		}
		
		sc.close();
		
	}

}
