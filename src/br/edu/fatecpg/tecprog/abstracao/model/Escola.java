package br.edu.fatecpg.tecprog.abstracao.model;

public class Escola {
	public String nome;
	public String endereco;
	public String telefone;
	public String cnpj;
	public String funcionamento;

	public void apresentar() {
		System.out.printf("""
				\nNome da Escola: %s
				Endereço: %s
				Telefone: %s
				CNPJ: %s
				Horário de Funcionamento: %s²
				""", this.nome, this.endereco, this.telefone, this.cnpj, this.funcionamento);
	}

	public void cadastraAluno() {
		System.out.println("\nAluno cadastrado.");
	}

	public void emitirHistorico() {
		System.out.println("\nHistórico pronto para retirada.");
	}

	public void controlaAcesso() {
		System.out.println("\nVerificando identidade...");
		System.out.println("Acesso Autorizado.");
	}
}