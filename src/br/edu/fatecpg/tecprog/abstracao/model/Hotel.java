package br.edu.fatecpg.tecprog.abstracao.model;

public class Hotel {

    public String nome;
    public String endereco;
    public int quartosDisponiveis;
    public int classificacaoEstrelas;
    public boolean ofereceCafeDaManha;

    public void apresentar(){
        System.out.printf("""
                
                Nome do Hotel: %s
                Endereço: %s
                Quartos disponíveis: %d
                Classificação: %d estrelas
                Oferece café da manhã: %b
                """, this.nome, this.endereco, this.quartosDisponiveis, this.classificacaoEstrelas, this.ofereceCafeDaManha? "Sim" : "Não");
    }

    public void reservarQuarto(){
        System.out.println("\nQuarto reservado!");
    }

    public void fazerCheckIn(){
        System.out.println("\nCheck-in realizado!");
    }

    public void limparQuarto(){
        System.out.println("\nQuarto limpo!");
    }
}