package br.edu.fatecpg.tecprog.abstracao.model;

public class Biblioteca {

    public String nome;
    public String endereco;
    public String cnpj;
    public String telefone;
    public String[] sessoes;

    public void apresentar(){
        System.out.printf(""" 
                \nNome da Biblioteca: %s
                Endereço: %s
                CNPJ: %s
                Telefone: %s
                Sessoes: %s
                """, this.nome, this.endereco, this.cnpj, this.telefone, String.join(", " ,this.sessoes));
    }

    public void cadastrarLivro(){
        System.out.println("\nLivro cadastrado!");
    }

    public void emitirCarteirinha(){
        System.out.println("\nCarteirinha emitida com sucesso!");
    }

    public void aplicarMulta(){
        System.out.println("\nMulta aplicada: R$3!!");
    }
}
