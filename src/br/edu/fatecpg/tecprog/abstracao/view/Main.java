package br.edu.fatecpg.tecprog.abstracao.view;

import br.edu.fatecpg.tecprog.abstracao.model.*;

public class Main {
	public static void main(String[] args) {
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
		pracaMorgado.arvoresEncontradas = new String[] { "Palmeira", "Aroeira" };
		pracaMorgado.posteDeIluminacao = false;

		pracaMunicipal.nome = "Praça Municipal";
		pracaMunicipal.qtdFuncionarios = 27;
		pracaMunicipal.qtdBancos = 18;
		pracaMunicipal.arvoresEncontradas = new String[] { "Samambaia", "Palmeira", "Coqueiro", "Aroeira",
				"Ipê-amarelo", "Bambu" };
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
		guarulhos.companhiasAereas = new String[] { "LATAM", "Gol", "Azul", "American Airlines", "Air France",
				"Lufthansa" };
		guarulhos.qtdVoos = 800;
		guarulhos.tamanho = 13.86;

		brasilia.nome = "Aeroporto Internacional de Brasília";
		brasilia.bairro = "Lago Sul";
		brasilia.companhiasAereas = new String[] { "LATAM", "Gol", "Azul", "TAP Air Portugal" };
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
		estacaoBras.linhasDeTrem = new String[] { "Linha 7-Rubi", "Linha 10-Turquesa", "Linha 11-Coral",
				"Linha 12-Safira", "Linha 13-Jade" };
		estacaoBras.itinerarios = new String[] { "Jundiaí ↔ Rio Grande da Serra", "Estudantes ↔ Luz",
				"Calmon Viana ↔ Brás", "Aeroporto-Guarulhos ↔ Engenheiro Goulart" };
		estacaoBras.expediente = "04:00 - 00:00";

		estacaoLuz.nome = "Estação da Luz";
		estacaoLuz.endereco = "Praça da Luz, Bom Retiro - São Paulo";
		estacaoLuz.linhasDeTrem = new String[] { "Linha 7-Rubi", "Linha 11-Coral", "Linha 13-Jade" };
		estacaoLuz.itinerarios = new String[] { "Jundiaí ↔ Luz", "Estudantes ↔ Luz", "Aeroporto-Guarulhos ↔ Luz" };
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

		// MUSEU
		Museu museu1 = new Museu();
		Museu museu2 = new Museu();

		museu1.nome = "Museu do Ipiranga";
		museu1.endereco = "Parque da Independência, São Paulo";
		museu1.qtdFuncionarios = 120;
		museu1.exposicaoAtual = "Independência do Brasil";
		museu1.precoIngresso = 30.00;

		museu2.nome = "MASP";
		museu2.endereco = "Av. Paulista, São Paulo";
		museu2.qtdFuncionarios = 200;
		museu2.exposicaoAtual = "Arte Europeia";
		museu2.precoIngresso = 50.00;

		museu1.apresentar();
		museu2.apresentar();

		museu1.abrirMuseu();
		museu2.comprarArtefato();

		// FAZENDA
		Fazenda fazenda1 = new Fazenda();
		Fazenda fazenda2 = new Fazenda();

		fazenda1.nome = "Fazenda Boa Vista";
		fazenda1.dono = "João Pereira";
		fazenda1.tipo = "Pecuária";
		fazenda1.qtdAnimais = 350;
		fazenda1.hectares = 1200;

		fazenda2.nome = "Fazenda Santa Maria";
		fazenda2.dono = "Carlos Silva";
		fazenda2.tipo = "Agricultura";
		fazenda2.qtdAnimais = 80;
		fazenda2.hectares = 600;

		fazenda1.apresentar();
		fazenda2.apresentar();

		fazenda1.plantar();
		fazenda2.alimentarAnimais();

		// DELEGACIA
		Delegacia delegacia1 = new Delegacia();
		Delegacia delegacia2 = new Delegacia();

		delegacia1.nome = "1º Distrito Policial";
		delegacia1.nivelAbrangencia = "Municipal";
		delegacia1.qtdViaturas = 12;
		delegacia1.qtdPoliciais = 85;
		delegacia1.nivelGovernamental = "Estadual";

		delegacia2.nome = "Polícia Federal - SP";
		delegacia2.nivelAbrangencia = "Nacional";
		delegacia2.qtdViaturas = 25;
		delegacia2.qtdPoliciais = 200;
		delegacia2.nivelGovernamental = "Federal";

		delegacia1.apresentar();
		delegacia2.apresentar();

		delegacia1.prenderSuspeito();
		delegacia1.registrarBO();

		// IGREJA
		Igreja igreja1 = new Igreja();
		Igreja igreja2 = new Igreja();

		igreja1.nome = "Catedral da Sé";
		igreja1.endereco = "Praça da Sé, São Paulo";
		igreja1.religiao = "Católica";
		igreja1.diocese = "Arquidiocese de São Paulo";
		igreja1.numeroAssentos = 8000;

		igreja2.nome = "Igreja Universal";
		igreja2.endereco = "Av. João Dias, São Paulo";
		igreja2.religiao = "Evangélica";
		igreja2.diocese = "Templo de Salomão";
		igreja2.numeroAssentos = 10000;

		igreja1.apresentar();
		igreja2.apresentar();

		igreja1.realizarMatrimonio();
		igreja2.colherDizimo();

		// BIBLIOTECA
		Biblioteca biblioteca1 = new Biblioteca();
		Biblioteca biblioteca2 = new Biblioteca();

		biblioteca1.nome = "Biblioteca Municipal de São Vicente";
		biblioteca1.endereco = "Rua Fr. Gaspar 280, São Vicente - SP";
		biblioteca1.cnpj = "46.177.523/0001-09";
		biblioteca1.telefone = "(13) 3467-5999";
		biblioteca1.sessoes = new String[] { "Romance", "Sci-fi", "Medicina", "Revistas", "Filosofia" };

		biblioteca2.nome = "Biblioteca Municipal Alberto Souza";
		biblioteca2.endereco = "Praça Patriarca José Bonifácio, 58 - Centro, Santos - SP";
		biblioteca2.cnpj = "58.200.015/0001-83";
		biblioteca2.telefone = "(13) 3467-5999";
		biblioteca2.sessoes = new String[] { "Aventura", "HQs", "Direito", "Autobiografia", "Autoajuda" };

		biblioteca1.apresentar();
		biblioteca2.apresentar();

		biblioteca1.emitirCarteirinha();
		biblioteca2.aplicarMulta();

		// ESCOLA
		Escola escola1 = new Escola();
		Escola escola2 = new Escola();

		escola1.nome = "Colégio Cellula Mater";
		escola1.endereco = "Av. Presidente Wilson, 1252 - Centro, São Vicente - SP";
		escola1.telefone = "(13) 3467-6160";
		escola1.cnpj = "08.011.966/0001-36";
		escola1.funcionamento = "07:00 - 19:00";

		escola2.nome = "Escola e Faculdade Fortec";
		escola2.endereco = "Av. Presidente Wilson, 1013 - Itararé, São Vicente - SP";
		escola2.telefone = "(13) 3569-2525";
		escola2.cnpj = "44.309.573/0001-77),";
		escola2.funcionamento = "09:00 - 20:00";

		escola1.apresentar();
		escola2.apresentar();

		escola1.cadastraAluno();
		escola2.emitirHistorico();

		// UNIVERSIDADE
		Universidade universidade1 = new Universidade();
		Universidade universidade2 = new Universidade();

		universidade1.nome = "Fatec Praia Grande";
		universidade1.endereco = "Pça. Dezenove de Janeiro 144, Praia Grande, SP";
		universidade1.telefone = "(13) 3591-1303 / 3591-6968";
		universidade1.cnpj = "62.823.257/0129-64";
		universidade1.cursos = new String[] { "Análise e Desenvolvimento de Sistemas", "Comércio Exterior",
				"Desenvolvimento de Software Multiplataforma", "Gestão Empresarial", "Processos Químicos" };

		universidade2.nome = "Fatec Rubens Lara";
		universidade2.endereco = "Av. Senador Feijó, 350 - Vila Matias, Santos - SP,";
		universidade2.telefone = "(13) 3226-4100";
		universidade2.cnpj = "62.823.257/0001-09";
		universidade2.cursos = new String[] { "Análise e Desenvolvimento de Sistemas", "Ciência de Dados",
				"Gestão Portuária", "Gestão de Recursos Humanos", "Logística", "Sistemas para Internet" };

		universidade1.apresentar();
		universidade2.apresentar();

		universidade1.matriculaAluno();
		universidade2.validaEstagio();

		// HOSPITAL
		Hospital hospital1 = new Hospital();
		Hospital hospital2 = new Hospital();

		hospital1.nome = "Hospital do Vicentino";
		hospital1.cnpj = "3021378";
		hospital1.alvara = true;
		hospital1.qtdleitos = 97;
		hospital1.especialidades = new String[] { "Clinica Geral", "Emergencia", "Ortopedia", "Pediatria" };

		hospital2.nome = "Hospital Irmã Dulce";
		hospital2.cnpj = "57.571.275/0009-50";
		hospital2.alvara = true;
		hospital2.qtdleitos = 273;
		hospital2.especialidades = new String[] { "Trauma", "Neurocirurgia", "Cirurgias eletivas" };

		hospital1.apresentar();
		hospital2.apresentar();

		hospital1.atenderPaciente();
		hospital2.internaPaciente();

		// SUPERMERCADO
		Supermercado supermercado1 = new Supermercado();
		Supermercado supermercado2 = new Supermercado();

		supermercado1.nome = "Carrefour Hipermercado São Vicente";
		supermercado1.endereco = "v. Prefeito José Monteiro, 1045 - Jardim Independencia, São Vicente - SP";
		supermercado1.cnpj = "43.259.548/0001-63";
		supermercado1.pdvs = 30;
		supermercado1.reputacao = 7.5;

		supermercado2.nome = "Assaí São Vicente";
		supermercado2.endereco = "Av. Antônio Emmerich, 245 - Vila Cascatinha, São Vicente - SP";
		supermercado2.cnpj = "06.057.223/0434-90";
		supermercado2.pdvs = 30;
		supermercado2.reputacao = 7.2;

		supermercado1.apresentar();
		supermercado2.apresentar();

		supermercado1.abrirCaixa();
		supermercado2.reporProduto();
		
		//SHOPPING
		Shopping shopping1 = new Shopping();
		Shopping shopping2 = new Shopping();
		
		shopping1.nome = "Praiamar Shopping";
		shopping1.endereco = "R. Alexandre Martins, 80 - Aparecida, Santos - SP";
		shopping1.vlestacionamento = 15;
		shopping1.lojas = new String [] {"Zelo","Granado","Hering","Baccio di Latte"};
		shopping1.tamanho = 130000;
		
		shopping2.nome = "Litoral Plaza";
		shopping2.endereco = "Av. Ayrton Senna da Silva, 1511 - Xixová, Praia Grande - SP";
		shopping2.vlestacionamento = 15;
		shopping2.lojas = new String [] {"Jeronimo","Hope", "Starbucks", "Centauro"};
		shopping2.tamanho = 90000;
		
		shopping1.apresentar();
		shopping2.apresentar();

		shopping1.cadastrarLoja();
		shopping2.acionarSegurança();
	}
}