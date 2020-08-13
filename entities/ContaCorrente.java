package entities;

public class ContaCorrente {
		private int numConta;
		private String titular;
		private double saldo = 0;


		
		public ContaCorrente(int numConta, String titular) {
			super();
			this.numConta = numConta;
			this.titular = titular;
		}
		
		public ContaCorrente(int numConta, String titular, double depositoInicial) {
			super();
			this.numConta = numConta;
			this.titular = titular;
			deposito(depositoInicial);
		}



		public int getNumConta() {
			return numConta;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public double getSaldo() {
			return saldo;
		}


		
		
		
		
		
		
		
		public void saque(double valor) {
			saldo -= valor + 5.00;
		}
		
		public void deposito(double valor) {
			saldo += valor;
		}
		
		public String toString() {
			return "conta "+ numConta + ", " + "titular: " + titular + ", " + "saldo: R$ " + String.format("%.2f", saldo); 
		}
		
}
