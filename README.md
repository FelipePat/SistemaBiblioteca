#  Sistema de Gerenciamento de Biblioteca (Java Console)

Este é um projeto desenvolvido para consolidar fundamentos de **Programação Orientada a Objetos (POO)** e manipulação de coleções em Java. O sistema simula o funcionamento interno de uma biblioteca, permitindo o cadastro de livros e o controle de empréstimos.

##  Tecnologias Utilizadas
* **Java 17** (ou a versão que você usou)
* **Lógica de Programação** (Loops, Condicionais)
* **Estrutura de Dados** (ArrayList)

##  Conceitos de POO Aplicados
Neste projeto, foquei em aplicar boas práticas de desenvolvimento:
* **Encapsulamento:** Atributos privados com acesso controlado via Getters e Setters.
* **Abstração:** Criação de classes representando entidades do mundo real.
* **Regras de Negócio:** Implementação de lógica para evitar empréstimos de livros já indisponíveis.

##  Funcionalidades
- [x] Cadastro de novos livros com ID único.
- [x] Listagem de livros (em memória).
- [x] Lógica de empréstimo com verificação de disponibilidade.

##  Estrutura do Código
* `Livro.java`: Classe de modelo com os atributos e construtores.
* `Biblioteca.java`: Classe de serviço responsável por gerenciar a lista de livros e aplicar as regras de negócio.

##  Como rodar o projeto
1. Clone o repositório:
   ```bash
   git clone [https://github.com/FelipePat/SistemaBiblioteca.git](https://github.com/FelipePat/SistemaBiblioteca.git)
