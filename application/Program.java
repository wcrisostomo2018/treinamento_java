package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.Nivel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Informe o nome do departamento:");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Informe os dados do Trabalhador: ");
		System.out.print("Nome:");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.print("Nivel:");
		String nivelTrabalhador = sc.nextLine();
		
		System.out.print("Salario Base:");
		Double salarioTrabalhador = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador,Nivel.valueOf("MEDIO"),salarioTrabalhador,new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos esse trabalhador possui: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Informe os dados do  contrato de Nº" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por Hora: ");
			Double valorHora = sc.nextDouble();
			System.out.println("Horas: ");
			int horas = sc.nextInt();  
			ContratoHora contrato = new ContratoHora(dataContrato,valorHora,horas);
			trabalhador.AddContrato(contrato);		
			
		}
		
		System.out.println();
		System.out.println("Entre com o mes e ano para calcular os ganhos (MM/YYYY):");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDept().getNome());
		System.out.println("Ganhos de " + mesEano + ": " + String.format("%.2f", trabalhador.ganho(ano, mes)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();		

	}

}
