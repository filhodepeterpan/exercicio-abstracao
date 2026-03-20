package br.edu.fatecpg.tecprog.abstracao.model;

public class Parque {
	public String nome;
	public String endereco;
	public int tamanho;
	public String tipo;
	public String expediente;

	public void apresentar() {
		System.out.printf("""

				Nome: %s
				Endereço: %s
				Tamanho(m²): %s m²
				Público/Privado: %s
				Horário de funcionamento: %s
				""", this.nome, this.endereco, this.tamanho, this.tipo, this.expediente);
	}

	public void rondaSeguranca() {
		System.out.println("\nPatrulhando area.");
	}

	public void fecharParque() {
		System.out.println("\nAs atividades do parque estão encerradas");
	}

	public void realizarEventos() {
		System.out.println("\nEvento em andamento.");
	}
}