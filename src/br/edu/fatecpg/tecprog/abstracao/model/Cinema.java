package br.edu.fatecpg.tecprog.abstracao.model;

public class Cinema {
	public String nome;
	public String[] cartaz;
	public int qtdassentos;
	public boolean imax;
	public int qtdsalas;

	public void apresentar() {
		System.out.printf("""

				Nome do Cinema: %s
				Em cartaz: %s
				Qtd. assentos: %d
				Possui IMAX: %s
				Qtd. salas: %s
				""", this.nome, String.join(", ", this.cartaz), this.qtdassentos, this.imax ? "Sim" : "Não",
				this.qtdsalas);
	}

	public void iniciarSessao() {
		System.out.println("\nFilme iniciado");
	}

	public void venderIngresso() {
		System.out.println("\nVendendo ingresso...");
		System.out.println("Ingresso vendido!");
	}

	public void oferecerCombo() {
		System.out.println("\nDeseja combo? Pipoca Grande + Refrigerante: R$45");
	}
}