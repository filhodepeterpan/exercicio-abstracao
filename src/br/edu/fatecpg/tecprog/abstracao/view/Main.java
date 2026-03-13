package br.edu.fatecpg.tecprog.abstracao.view;
import br.edu.fatecpg.tecprog.abstracao.model.Praia;
import br.edu.fatecpg.tecprog.abstracao.model.Praca;

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
        Praca pracaMorgado = new Praca();
        Praca pracaMunicipal = new Praca();

        pracaMorgado.nome = "Praça Morgado";
        pracaMorgado.qtdFuncionarios = 3;
        pracaMorgado.qtdBancos = 6;
        pracaMorgado.arvoresEncontradas = new String[] {"Palmeira", "Aroeira"};
        pracaMorgado.posteDeIluminacao = false;

        pracaMunicipal.nome = "Praça Municipal";
        pracaMunicipal.qtdFuncionarios = 27;
        pracaMunicipal.qtdBancos = 18;
        pracaMunicipal.arvoresEncontradas = new String[] {"Samambaia", "Palmeira", "Coqueiro", "Aroeira", "Ipê-amarelo", "Bambu" };
        pracaMunicipal.posteDeIluminacao = true;

        pracaMorgado.apresentar();
        pracaMunicipal.apresentar();

        pracaMorgado.realizarEvento();
        pracaMunicipal.iluminarPraca();
    }
}
