package br.edu.fatecpg.tecprog.abstracao.model;

import java.util.Arrays;

public class Praca {
    public String nome;
    public int qtdFuncionarios;
    public int qtdBancos;
    public String[] arvoresEncontradas;
    public boolean posteDeIluminacao;

    public void apresentar(){
        System.out.printf("""
                \nNome da Praça: %s
                Quantidade de funcionários: %d
                Quantidade de bancos: %d
                Árvores encontradas: %s
                Possui poste de iluminação? %s
                """, this.nome, this.qtdFuncionarios, this.qtdBancos, String.join(", " ,this.arvoresEncontradas), this.posteDeIluminacao ? "Sim" : "Não");
    }

    public void iluminarPraca(){
        System.out.println("\nPraça iluminada!");
    }

    public void realizarEvento(){
        System.out.println("\nEvento realizado!");
    }

    public void monitorarCidadoes(){
        System.out.println("\nMonitorando cidadões...");
        System.out.println("\nMonitorado!");
    }
}
