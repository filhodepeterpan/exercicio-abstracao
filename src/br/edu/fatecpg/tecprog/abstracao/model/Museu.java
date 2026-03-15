package br.edu.fatecpg.tecprog.abstracao.model;

public class Museu {

    public String nome;
    public String endereco;
    public int qtdFuncionarios;
    public String exposicaoAtual;
    public double precoIngresso;

    public void apresentar(){
        System.out.printf("""
                
                Nome do Museu: %s
                Endereço: %s
                Quantidade de Funcionários: %d
                Exposição Atual: %s
                Preço do Ingresso: %.2f
                """, this.nome, this.endereco, this.qtdFuncionarios, this.exposicaoAtual, this.precoIngresso);
    }

    public void venderIngresso(){
        System.out.println("\nIngresso vendido!");
    }

    public void abrirMuseu(){
        System.out.println("\nMuseu aberto ao público!");
    }

    public void comprarArtefato(){
        System.out.println("\nArtefato adquirido!");
    }
}