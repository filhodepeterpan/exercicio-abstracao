package br.edu.fatecpg.tecprog.abstracao.model;

public class Delegacia {

    public String nome;
    public String nivelAbrangencia;
    public int qtdViaturas;
    public int qtdPoliciais;
    public String nivelGovernamental;

    public void apresentar(){
        System.out.printf("""
                
                Nome da Delegacia: %s
                Nível de Abrangência: %s
                Quantidade de Viaturas: %d
                Quantidade de Policiais: %d
                Nível Governamental: %s
                """, this.nome, this.nivelAbrangencia, this.qtdViaturas, this.qtdPoliciais, this.nivelGovernamental);
    }

    public void apreenderBens(){
        System.out.println("\nBens apreendidos!");
    }

    public void prenderSuspeito(){
        System.out.println("\nSuspeito preso!");
    }

    public void registrarBO(){
        System.out.println("\nBoletim de ocorrência registrado!");
    }
}