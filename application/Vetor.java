package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Willian", "Simone", "Jurubeba"};
		
		for (int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------");
		
		for (String obj: vect) {
			System.out.println(obj);
		}
		
		
		
		/*
		int n = sc.nextInt();
		Produto[] vect  = new Produto[n];
		
		for (int i=0;i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produto(name,price);
		}
		
		double soma = 0.0;
			for (int i=0;i<vect.length;i++) {
				soma += vect[i].getPrice();
			}
			
		double media = soma / vect.length;
		
		System.out.printf("Media dos produtos: %.2f%n" , media);
		*/
		/*
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0;i<n;i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
			for (int i = 0; i<n;i++) {
				soma += vect[i];
			}
		double media = soma / n;
		System.out.printf("Media dos valores: %.2f%n" , media);
		*/
		sc.close();
	}

}
