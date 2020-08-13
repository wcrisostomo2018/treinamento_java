package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;


public class Programa {
	


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaCorrente conta;
		
		double valor;
		
		System.out.print("Informe o numero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Informe o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Efetuará um deposito inicial ? (s/n) ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Informe o valor para deposito:");
			double depositoInicial = sc.nextDouble();
			conta = new ContaCorrente(numConta,titular,depositoInicial);
		} else {
			conta = new ContaCorrente(numConta,titular);
		}
		
		
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe um  valor para ser depositado: ");
		valor = sc.nextDouble();
		conta.deposito(valor);

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Informe um  valor para ser sacado: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		

		
		/*
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		Product produto = new Product(name, price);
		
		produto.setName("Computador");
		System.out.println("Nome Atualizado: " + produto.getName());
		
		produto.setPrice(1200.00);
		System.out.println("Preço novo: " + produto.getPrice());
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println("Informe a quantidade de produtos para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produto);
		
		System.out.println();
		System.out.println("Informe a quantidade de produtos para ser removida do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produto);
		*/
		sc.close();

	}

}
