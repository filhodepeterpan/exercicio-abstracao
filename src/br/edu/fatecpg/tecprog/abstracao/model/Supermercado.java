package br.edu.fatecpg.tecprog.abstracao.model;

public class Supermercado {
	public String nome;
	public String endereco;
	public String cnpj;
	public double pdvs;
	public double reputacao;

	public void apresentar() {
		System.out.printf("""
				\nNome do supermercado: %s
				Endereço: %s
				CNPJ: %s
				Qtd. de caixas: %s
				Reputação Reclame Aqui: %s
				""", this.nome, this.endereco, this.cnpj, this.pdvs, this.reputacao);
	}

	public void abrirCaixa() {
		System.out.println("\nIniciando caixa...");
		System.out.println("Caixa iniciado.");
	}

	public void reporProduto() {
		System.out.println("\nReabastecendo estoque...");
		System.out.println("Estoque abastecido!");
	}

	public void pagarDistribuidor() {
		System.out.println("\nDistribuidor pago");
	}
}