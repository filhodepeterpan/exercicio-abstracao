package br.edu.fatecpg.tecprog.abstracao.view;
import br.edu.fatecpg.tecprog.abstracao.model.Praia;

public class Main {
    public static void main(String [] args){
        // PRAIA
        Praia praiaOcian = new Praia();
        Praia praiaGuilhermina = new Praia();

        praiaOcian.nome = "Praia Ocian";
        praiaOcian.bairro = "Ocian";
        praiaOcian.nivelDoMar = 0.75;
        praiaOcian.extensao = 1.7;
        praiaOcian.forcaDasOndas = "Média";

        praiaGuilhermina.nome = "Praia Guilhermina";
        praiaGuilhermina.bairro = "Guilhermina";
        praiaGuilhermina.nivelDoMar = 0.80;
        praiaGuilhermina.extensao = 1.5;
        praiaGuilhermina.forcaDasOndas = "Forte";

        praiaOcian.apresentar();
        praiaGuilhermina.apresentar();

        praiaOcian.indicarPerigo();
        praiaGuilhermina.monitorarBanhistas();

       // PRAÇA


    }
}
