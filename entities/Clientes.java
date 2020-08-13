package entities;

import java.util.Date;

public class Clientes {
		private String nome;
		private String email;
		private Date dataNascimento;
		
		public Clientes() {
			
		}

		public Clientes(String nome, String email, Date aniversario) {
			this.nome = nome;
			this.email = email;
			this.dataNascimento = aniversario;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getAniversario() {
			return dataNascimento;
		}

		public void setAniversario(Date aniversario) {
			this.dataNascimento = aniversario;
		}
		
		
}
