package br.edu.fatecpg.tecprog.abstracao.model;

public class Hospital {
	public String nome;
	public String cnpj;
	public boolean alvara;
	public int qtdleitos;
	public String[] especialidades;

	public void apresentar() {
		System.out.printf("""

				Nome do Hospital: %s
				CNPJ: %s
				Alvará: %s
				Qtd. de leitos: %d
				Especialidades: %s
				""", this.nome, this.cnpj, this.alvara ? "Sim" : "Não", this.qtdleitos,
				String.join(", ", this.especialidades));
	}

	public void internaPaciente() {
		System.out.println("\nColetando dados para internação...");
		System.out.println("Paciente internado");
	}

	public void emitirProntuário() {
		System.out.println("\nElaborando prontuário...");
		System.out.println("Prontuário pronto.");
	}

	public void atenderPaciente() {
		System.out.println("\nSeja bem-vindo, paciente!");
	}
}