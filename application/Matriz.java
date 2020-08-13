package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i>0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length -1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		/*
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
						
			}
		}
		System.out.print("Diagonal Pricipal = ");
		for (int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int contador = 0;
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println("Numeros negativos: " + contador);
		
		*/
		sc.close();
		
		
	}

}
