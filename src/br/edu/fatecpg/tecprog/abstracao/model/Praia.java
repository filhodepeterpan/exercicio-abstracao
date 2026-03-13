package br.edu.fatecpg.tecprog.abstracao.model;

public class Praia {
    public String nome;
    public double nivelDoMar;
    public double extensao;
    public String bairro;
    public String forcaDasOndas;

    public void apresentar(){
        System.out.printf("""
                \nNome da praia: %s
                Bairro: %s
                Nível do mar: %fm
                Extensão: %fkm
                Força das ondas: %s
                """, this.nome, this.bairro, this.nivelDoMar, this.extensao, this.forcaDasOndas);
    }
    public void indicarPerigo(){
        System.out.println("\nPerigo!");
    }

    public void monitorarBanhistas(){
        System.out.println("\nMonitorando banhistas...");
        System.out.println("\nMonitorado!");
    }

    public void limpar(){
        System.out.println("\nLimpando a praia...");
        System.out.println("\nLimpo!");
    }
}
