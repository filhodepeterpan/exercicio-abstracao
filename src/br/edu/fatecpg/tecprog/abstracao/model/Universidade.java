package br.edu.fatecpg.tecprog.abstracao.model;

public class Universidade {
	public String nome;
	public String endereco;
	public String telefone;
	public String cnpj;
	public String [] cursos;

	public void apresentar() {
		System.out.printf("""
				\nNome da Universidade: %s
				Endereço: %s
				Telefone: %s
				CNPJ: %s
				Cursos: %s
				""", this.nome, this.endereco, this.telefone, this.cnpj, String.join(", " ,this.cursos));
		}

	public void matriculaAluno() {
		System.out.println("\nAluno matriculado com sucesso.");
	}

	public void validaEstagio() {
		System.out.println("\nValidando...");
		System.out.println("Estágio validado!");
	}

	public void realizarEvento() {
		System.out.println("\nIniciando evento...");
		System.out.println("\nEvento em andamento!");
	}
}