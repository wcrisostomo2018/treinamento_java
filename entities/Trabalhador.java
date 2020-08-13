package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Nivel;

public class Trabalhador {
	private String nome;
	private Nivel nivel;
	private Double salarioBase;
	
	private Departamento dept;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, Nivel nivel, Double salarioBase, Departamento nomeDepartamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.dept = nomeDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDept() {
		return dept;
	}

	public void setDept(Departamento dept) {
		this.dept = dept;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	
	public void AddContrato(ContratoHora contrato) {
		contratos.add(contrato);
		
	}
	
	public void RemoveContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double ganho(int ano, int mes ) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes =	1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
}
