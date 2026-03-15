package br.edu.fatecpg.tecprog.abstracao.model;

public class Igreja {

    public String nome;
    public String endereco;
    public String religiao;
    public String diocese;
    public int numeroAssentos;

    public void apresentar(){
        System.out.printf("""
                
                Nome da Igreja: %s
                Endereço: %s
                Religião: %s
                Diocese: %s
                Número de Assentos: %d
                """, this.nome, this.endereco, this.religiao, this.diocese, this.numeroAssentos);
    }

    public void realizarMatrimonio(){
        System.out.println("\nMatrimônio realizado!");
    }

    public void colherDizimo(){
        System.out.println("\nDízimo recolhido!");
    }

    public void batizar(){
        System.out.println("\nBatismo realizado!");
    }
}