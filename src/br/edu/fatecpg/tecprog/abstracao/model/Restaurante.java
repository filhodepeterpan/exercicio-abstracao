package br.edu.fatecpg.tecprog.abstracao.model;

public class Restaurante {

    public String nome;
    public String endereco;
    public String cnpj;
    public String especialidade;
    public int quantidadeMesas;

    public void apresentar(){
        System.out.printf("""
                
                Nome do Restaurante: %s
                Endereço: %s
                CNPJ: %s
                Especialidade: %s
                Quantidade de Mesas: %d
                """, this.nome, this.endereco, this.cnpj, this.especialidade, this.quantidadeMesas);
    }

    public void abrirComanda(){
        System.out.println("\nComanda aberta!");
    }

    public void entregarCardapio(){
        System.out.println("\nCardápio entregue ao cliente!");
    }

    public void retirarPedido(){
        System.out.println("\nPedido retirado!");
    }
}