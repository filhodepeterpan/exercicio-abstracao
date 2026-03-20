package br.edu.fatecpg.tecprog.abstracao.model;

public class Estadio {
	public int tamanho;
	public int capacidade;
	public String jogoatual;
	public String vlentrada;
	public String placar;

	public void apresentar() {
		System.out.printf("""

				Tamanho(m²): %s m²
				Capacidade: %s
				Jogo do Dia: %s
				Preço da Entrada: %s
				Placar: %s
				""", this.tamanho, this.capacidade, this.jogoatual,this.vlentrada,this.placar);
	}
	
	public void iniciarJogo() {
		System.out.println("\nQue comece o jogo!");
	}

	public void anunciarVencedor() {
		System.out.println("\nE o vecendor da partida foi...");
		System.out.println("Barcelona!");
	}

	public void marcarJogos() {
		System.out.println("\nProximo jogos: Real Madrid x Atlético Madrid");
	}
}