package br.edu.fatecpg.tecprog.abstracao.model;

public class Aeroporto {
    public String nome;
    public String bairro;
    public String[] companhiasAereas;
    public int qtdVoos;
    public double tamanho;

    public void apresentar(){
        System.out.printf("""
                \nNome do Aeroporto: %s
                Bairro: %s
                Companhias Aéreas: %s
                Quantidade de vôos: %d
                Tamanho: %.2fkm²
                """, this.nome, this.bairro, String.join(", " ,this.companhiasAereas), this.qtdVoos, this.tamanho);
    }

    public void venderPassagem(){
        System.out.println("\nPassagem vendida!");
    }

    public void autorizarEmbarque(){
        System.out.println("\nEmbarque autorizado!");
    }

    public void monitorarCidadoes(){
        System.out.println("\nCompanhia Aérea cadastrada!");
    }
}
