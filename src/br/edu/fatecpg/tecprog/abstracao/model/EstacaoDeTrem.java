package br.edu.fatecpg.tecprog.abstracao.model;

public class EstacaoDeTrem {
    public String nome;
    public String endereco;
    public String[] linhasDeTrem;
    public String[] itinerarios;
    public String expediente;

    public void apresentar(){
        System.out.printf("""
                \nNome da Estação do Trem: %s
                Endereço: %s
                Linhas de trem: %s
                Itinerários: %s
                Expediente: %s²
                """, this.nome, this.endereco, String.join(", " ,this.linhasDeTrem), String.join(", " ,this.itinerarios), this.expediente);
    }

    public void darPartida(){
        System.out.println("\nPartida dada!!");
    }

    public void embarcarPassageiro(){
        System.out.println("\nEmbarque autorizado!");
    }

    public void desembarcarPassageiro(){
        System.out.println("\nPassageiro desembarcado!");
    }
}
