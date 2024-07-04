# DesafioDioPoo

![Diagrama Desafio Iphone DIO drawio](https://github.com/Dennis8751/DesafioIphone/assets/170773372/46f6cdcb-f168-4f50-a52d-8f55b4728937)

# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Este repositório contém a solução para o desafio **"Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet"** desenvolvido pela [DIO](https://www.dio.me/). O objetivo do desafio foi criar um modelo orientado a objetos para simular algumas das principais funcionalidades de um iPhone, incluindo a reprodução de músicas, a realização de chamadas e a navegação na internet.

## Desafio

O desafio consiste em **modelar um sistema de iPhone** usando princípios de **Programação Orientada a Objetos (POO)** e **UML (Unified Modeling Language)**. O sistema deve incluir funcionalidades como:

- **Reprodução de Músicas**
- **Realização de Chamadas**
- **Navegação na Internet**

## Estrutura do Projeto

O projeto é estruturado em classes e interfaces que simulam as funcionalidades básicas de um iPhone:

- **`AparelhoTelefonico`**: Interface que define métodos para fazer e desligar chamadas.
- **`Contato`**: Classe que representa um contato telefônico com nome e número de telefone.
- **`ReprodutorMusica`**: Interface para funcionalidades de um reprodutor de música.
- **`ReprodutorFilme`**: Interface para funcionalidades de reprodução de filmes.
- **`Filme`**: Classe que representa um filme com um nome.
- **`Netflix`**: Classe que implementa a interface `ReprodutorFilme` para gerenciar uma lista de filmes e suas funções.

### Funcionalidades Implementadas

- **Chamadas Telefônicas**: 
  - **Ligar para um contato**: Busca o contato na lista e simula a ligação.
  - **Desligar a chamada**: Simula o encerramento da chamada.

- **Reprodução de Músicas e Filmes**:
  - **Adicionar e remover músicas e filmes**: Adiciona ou remove itens das listas.
  - **Reproduzir e pausar**: Simula a reprodução e pausa de músicas e filmes.

### Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para implementar o sistema.
- **UML**: Utilizado para modelar as classes e suas interações.
