package br.edu.fatecpg.tecprog.abstracao.model;

public class Teatro {
	public String nome;
	public String endereco;
	public String emcartaz;
	public int qtdlugares;
	public String vlingresso;

	public void apresentar() {
		System.out.printf("""

				Nome do Teatro: %s
				Endereco: %s
				Em cartaz: %s
				Qtd. lugares: %s
				Preço Ingresso: %s
				""", this.nome, this.endereco, this.emcartaz,this.qtdlugares,this.vlingresso
				);
	}

	public void direcionarLuzes() {
		System.out.println("\nPosicionando luzes...");
	}

	public void iniciarPeca() {
		System.out.println("\nPeça começando...");
	}

	public void tocarTrilhaSonora() {
		System.out.println("\nIniciando trilha sonora...");
	}
}