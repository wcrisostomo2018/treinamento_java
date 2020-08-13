package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Salario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão registrados? ");		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Funcionário Nº " + (i + 1) + ":");
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			while (existeID(lista, id)) {
				System.out.println("Id já existe! Tente novamente");
				id = sc.nextInt();
			}
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			Double salario = sc.nextDouble();
			
			Salario sal = new Salario(id,nome, salario);
			lista.add(sal);
			
		}
		
		System.out.println();
		System.out.println("Informe o funcionário que terá o seu salario alterado: ");
		int id = sc.nextInt();
		
		//Integer pos = possuiId(lista,id);
		Salario sal = lista.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
		
		if (sal == null) {
			System.out.println("Este id não existe");
		}
		else {
			System.out.println("Informe o percentual de aumento: ");
			double porcentagem = sc.nextDouble();
			sal.aumentoSalario(porcentagem);
			//lista.get(pos).aumentoSalario(porcentagem);
		}
		
		
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (Salario salary : lista) {
			System.out.println(salary);
		}
		
		sc.close();
		
	}
		public static Integer possuiId(List<Salario> lista, int id) {
			for (int i =0;i<lista.size();i++) {
				if (lista.get(i).getId() == id) {
					return i;
				}
			}
				return null;
		}
		
		public static boolean existeID(List<Salario> lista, int id) {
			Salario sal = lista.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
			return sal != null;
		}
		
}
		
		
		/*
		List<String> lista = new ArrayList<>();
		
		lista.add("Willian");
		lista.add("Jurubeba");
		lista.add("Pretinha");
		lista.add("Joaquim");
		lista.add("Jose");
		
		
		lista.add(2, "Simone");
		
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		System.out.println();
		
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		//lista.remove(1);
		lista.removeIf(x -> x.charAt(0) == 'W');
		
		for (String x : lista) {
			System.out.println(x);
		}		
		
		System.out.println("-----------------------");
		System.out.println("Index of Pretinha: " + lista.indexOf("Pretinha"));
		
		System.out.println("-----------------------");
		
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		
		for (String x : resultado) {
			System.out.println(x);
		}		

		System.out.println("-----------------------");

		String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(nome);
		
		*/
		
