package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Clientes;
import entities.ItemPedido;
import entities.Pedido;
import entities.enums.OrderStatus;

public class ProgramPedido {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.println("Email:");
		String email =sc.next();
		
		System.out.println("Data de nascimento (dd/mm/yyyy): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Clientes cliente = new Clientes(nome, email, dataNascimento);
		
		System.out.println();
		System.out.println("Informe o dados do Pedido:");
		
		System.out.println("Status: ");
		String status = sc.next();
		
		Date data = new Date();
		
		Pedido pedido = new Pedido(10,data,OrderStatus.valueOf("PROCESSANDO"));
		
		List<ItemPedido> listaPedido = new ArrayList<>();
		
		System.out.println("Quantos itens possui o pedido: ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Informe os dados do item Nº " + (i + 1) + ":");
			
			System.out.print("Nome Produto:");
			String nomeProduto = sc.next();
			
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			
			ItemPedido produto = new ItemPedido(quantidade,preco,nomeProduto);	
			listaPedido.add(produto);
		}
		
		System.out.println();
		System.out.println("Dados do pedido: ");
		System.out.println("Data do pedido: " + pedido.getInstante());
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println("Cliente do pedido: " + cliente.getNome());
		System.out.println();
		System.out.println("Itens do peiddo:");
		
		for (ItemPedido item : listaPedido) {
			System.out.println(item);
		}
		
	
		
		
		
		
		
		
		sc.close();
	}

}
