package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercMat {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lines: ");
		int x = sc.nextInt();
		
		sc.hasNextLine();
		System.out.print("Columns: ");
		int y = sc.nextInt();
		
		int[][] mat = new int[x][y];
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Select number: ");
		int z = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == z){
					System.out.println("Position: i " + i + ", j " + j);
					if(i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
					}
					
					if(i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
					}
					
					if(j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
					}
					
					if(j < mat[1].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
					}
				}
			}
		}	
		sc.close();
	}
}
