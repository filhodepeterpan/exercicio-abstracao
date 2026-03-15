package br.edu.fatecpg.tecprog.abstracao.view;
import br.edu.fatecpg.tecprog.abstracao.model.*;

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

        // AEROPORTO
        Aeroporto guarulhos = new Aeroporto();
        Aeroporto brasilia = new Aeroporto();

        guarulhos.nome = "Aeroporto Internacional de São Paulo/Guarulhos";
        guarulhos.bairro = "Cumbica";
        guarulhos.companhiasAereas = new String[] {"LATAM", "Gol", "Azul", "American Airlines", "Air France", "Lufthansa"};
        guarulhos.qtdVoos = 800;
        guarulhos.tamanho = 13.86;

        brasilia.nome = "Aeroporto Internacional de Brasília";
        brasilia.bairro = "Lago Sul";
        brasilia.companhiasAereas = new String[] {"LATAM", "Gol", "Azul", "TAP Air Portugal"};
        brasilia.qtdVoos = 350;
        brasilia.tamanho = 11.50;
        
        guarulhos.apresentar();
        brasilia.apresentar();

        guarulhos.venderPassagem();
        brasilia.autorizarEmbarque();

        // ESTAÇÃO DE TREM
        EstacaoDeTrem estacaoBras = new EstacaoDeTrem();
        EstacaoDeTrem estacaoLuz = new EstacaoDeTrem();

        estacaoBras.nome = "Estação Brás";
        estacaoBras.endereco = "Praça Agente Cícero, Brás - São Paulo";
        estacaoBras.linhasDeTrem = new String[] {"Linha 7-Rubi", "Linha 10-Turquesa", "Linha 11-Coral", "Linha 12-Safira", "Linha 13-Jade"};
        estacaoBras.itinerarios = new String[] {"Jundiaí ↔ Rio Grande da Serra", "Estudantes ↔ Luz", "Calmon Viana ↔ Brás", "Aeroporto-Guarulhos ↔ Engenheiro Goulart"};
        estacaoBras.expediente = "04:00 - 00:00";

        estacaoLuz.nome = "Estação da Luz";
        estacaoLuz.endereco = "Praça da Luz, Bom Retiro - São Paulo";
        estacaoLuz.linhasDeTrem = new String[] {"Linha 7-Rubi", "Linha 11-Coral", "Linha 13-Jade"};
        estacaoLuz.itinerarios = new String[] {"Jundiaí ↔ Luz", "Estudantes ↔ Luz", "Aeroporto-Guarulhos ↔ Luz"};
        estacaoLuz.expediente = "04:00 - 00:00";

        estacaoBras.apresentar();
        estacaoLuz.apresentar();

        estacaoBras.darPartida();
        estacaoLuz.desembarcarPassageiro();

        // RESTAURANTE
        Restaurante restaurante1 = new Restaurante();
        Restaurante restaurante2 = new Restaurante();

        restaurante1.nome = "Fogo de Chão";
        restaurante1.endereco = "Av. dos Bandeirantes, São Paulo";
        restaurante1.cnpj = "03.123.456/0001-89";
        restaurante1.especialidade = "Churrasco";
        restaurante1.quantidadeMesas = 80;

        restaurante2.nome = "A Casa das Massas";
        restaurante2.endereco = "Rua Araújo, Centro - São Paulo";
        restaurante2.cnpj = "11.987.654/0001-55";
        restaurante2.especialidade = "Comida Italiana";
        restaurante2.quantidadeMesas = 40;

        restaurante1.apresentar();
        restaurante2.apresentar();

        // HOTEL
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel();

        hotel1.nome = "Hotel Unique";
        hotel1.endereco = "Av. Brigadeiro Luís Antônio, São Paulo";
        hotel1.quartosDisponiveis = 94;
        hotel1.classificacaoEstrelas = 5;
        hotel1.ofereceCafeDaManha = true;

        hotel2.nome = "Casa da Felicidade";
        hotel2.endereco = "Centro - São Paulo";
        hotel2.quartosDisponiveis = 182;
        hotel2.classificacaoEstrelas = 3;
        hotel2.ofereceCafeDaManha = false;

        hotel1.apresentar();
        hotel2.apresentar();

        hotel1.reservarQuarto();
        hotel2.limparQuarto();
    }
}
