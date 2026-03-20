package br.edu.fatecpg.tecprog.abstracao.model;

public class Shopping {
	public String nome;
	public String endereco;
	public int vlestacionamento;
	public String[] lojas;
	public int tamanho;

	public void apresentar() {
		System.out.printf("""
				\nNome do Shopping: %s
				Endereço: %s
				Valor Hora Estacionamento: R$ %s 
				Tamanho: %s m²
				""", this.nome, this.endereco, this.vlestacionamento, String.join(", ", this.lojas), this.tamanho);
	}
	public void cadastrarLoja() {
		System.out.println("\nLoja cadastrada com sucesso.");
	}

	public void acionarSegurança() {
		System.out.println("\nChamando seguranças.");
	}

	public void fecharShopping() {
		System.out.println("\nEncerrando atividades...");
		System.out.println("Shopping fechado.");
	}
}