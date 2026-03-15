package br.edu.fatecpg.tecprog.abstracao.model;

public class Fazenda {

    public String nome;
    public String dono;
    public String tipo;
    public int qtdAnimais;
    public double hectares;

    public void apresentar(){
        System.out.printf("""
                
                Nome da Fazenda: %s
                Dono: %s
                Tipo: %s
                Quantidade de Animais: %d
                Hectares: %.2f
                """, this.nome, this.dono, this.tipo, this.qtdAnimais, this.hectares);
    }

    public void plantar(){
        System.out.println("\nPlantio realizado!");
    }

    public void alimentarAnimais(){
        System.out.println("\nAnimais alimentados!");
    }

    public void venderParaDistribuidora(){
        System.out.println("\nVenda realizada para distribuidora!");
    }
}