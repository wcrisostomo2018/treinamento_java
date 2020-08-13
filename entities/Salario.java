package entities;

public class Salario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Salario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(double porc) {
		this.salario += this.salario * porc / 100; 
	}
	
	public String toString() {
		return id + "," + nome + "," + String.format("%.2f", salario);
	}
	
}
