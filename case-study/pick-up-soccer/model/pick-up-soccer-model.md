```mermaid
---
title: Pick-up Soccer
---
classDiagram
    Pessoa "1" <-- "*" Contato
    Contato "*" <-- "*" TipoContato
    Pessoa <|-- Jogador
    Pessoa <|-- Funcionario
    Time *-- Jogador
    Partida "*" <-- "1" Time : Casa
    Partida "*" <-- "1" Time : Visitante
    Funcionario "1" <-- "*" Endereco
    direction RL
    class Pessoa {
	    -nome : String
	    -cpf : String
	    -dataNascimento : Date
	    -contatos : ArrayList~Contato~
	    -tipoContato : ArrayList~Contato~
	    +prepararContato() void
	    +listarContatos() void
	    +Pessoa(cpf : String, nome : String, dataNascimento : Date, contatos : ArrayList~Contato~)
    }
    class Contato {
	    -tipo : TipoContato
	    -contato : String
	    +toString() String
	    +Contato(tipo : TipoContato, contato : String)
	    +Contato()
    }
    class Jogador {
	    -posicao : String
	    -altura : float
	    -camisa : int
	    -time : Time
	    -apelido : String
	    +cadastrarJogador(Time : int) Jogador
	    +toString() String
	    +Jogador()
	    +Jogador(nome : String, dataDeNascimento : Date, contato : ArrayList~Contato~)
	    +Jogador(altura : float, posicao : String, camisa : int, time : Time)
    }
    class Funcionario {
	    -salario : float
	    -funcao : String
	    +pegarEndereco() void
	    +funcionario(cpf : String, nome : String, dataDeNascimento : Date, contatos : ArrayList~Contato~, tipoContato : ArrayList~Contato~, salario : float, funcao : String, enderecos : ArrayList~Endereco~)
    }
    class TipoContato {
        <<enumeration>>
	    EMAIL
	    TELEFONE
	    CELULAR
	    INSTAGRAM
	    WHATSAPP
	    LINKEDIN
    }
    class Time {
	    -jogadores : ArrayList~Jogador~
	    -jogadoresTitulares : ArrayList~Jogador~
	    -nomeTime : String
	    -dataCriacao : Date
	    -cidade : String
	    -jogadoresReservas : ArrayList~Jogador~
	    +qtdCertaJogadores() void
	    +cadastrarTime() time
	    +adicionarJogador(time : int) void
	    +removerJogador() void
	    +listarJogadores() void
	    +toString() String
	    +Time()
	    +Time(String nomeTime : int, Date dataCriacao : int, String cidade : int)
    }
    class Endereco {
	    -uf : String
	    -cidade : String
	    -bairro : String
	    -numeroCasa : int
	    +toString() String
	    +endereco(uf : String, cidade : String, bairro : String, numeroCasa : int) void
    }
    class Partida {
	    -casa : Time
	    -visitante : Time
	    -data : Date
	    -golsCasa : int
	    -golsVisitante : int
	    +vencedor() Time
	    +Partida(Time casa : int, Time visitante : int, Date data : int, int golsCasa : int, int golsVisitante : int)
    }
    ```
