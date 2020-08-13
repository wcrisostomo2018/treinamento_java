package entities;

public class ItemPedido {
		private Integer quantidade;
		private Double preco;
		private String nome;
		
		public ItemPedido() {
			
		}

		public ItemPedido(Integer quantidade, Double preco, String nome) {
			super();
			this.quantidade = quantidade;
			this.preco = preco;
			this.nome = nome;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}
		
		public String getNome() {
			return  nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Double subTotal() {
			return quantidade * preco;
		}

		@Override
		public String toString() {
			return nome + ", " + "R$ " + String.format("%.2f", preco) + ", " + "Quantidade: " + quantidade + ", " + "Subtotal: " + String.format("%.2f", subTotal());
			
		}
		
		
}
