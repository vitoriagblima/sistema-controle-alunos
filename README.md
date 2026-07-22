# Student Grade System (Sistema de Gestão de Alunos)

![Java](https://img.shields.io/badge/Java-2B2B2B?style=for-the-badge)
![POO](https://img.shields.io/badge/POO-383838?style=for-the-badge)
![License](https://img.shields.io/badge/License--MIT-2B2B2B?style=for-the-badge)

Conforme avanço nos meus estudos sobre os fundamentos de **Programação Orientada a Objetos (POO)**, venho desenvolvendo e publicando exercícios práticos baseados em casos de uso no GitHub para documentar e consolidar tudo o que foi aprendido.

Este projeto em Java simula a gestão acadêmica de uma turma, permitindo o cadastro dinâmico de múltiplos alunos, cálculo de médias individuais, verificação do status de aprovação, além de gerar estatísticas consolidadas da turma (como a média geral e o destaque de maior nota).

## Demonstração de Uso

Veja o sistema rodando e interagindo com o usuário diretamente no terminal:

> 🎥 **Vídeo da demonstração:** [Assista ao arquivo `demo.mp4`](img/demo.mp4)


## Diagrama da Classe Aluno

A estrutura abaixo representa a modelagem da classe `Aluno` desenvolvida no pacote `entities`, demonstrando graficamente a divisão estruturada entre os atributos privados, construtores, getters/setters e métodos de negócio.

![Diagrama de Classe do Aluno](img/diagram_class_aluno.png)


## Conceitos de POO Aplicados

![Arrays e Vetores](https://img.shields.io/badge/Arrays%20%2F%20Vetores-2B2B2B?style=for-the-badge)
![Encapsulamento](https://img.shields.io/badge/Encapsulamento-383838?style=for-the-badge)
![Métodos Coesos](https://img.shields.io/badge/M%C3%A9todos%20Coesos-2B2B2B?style=for-the-badge)
![Sobrescrita Override](https://img.shields.io/badge/Sobrescrita%20(%40Override)-383838?style=for-the-badge)
![Pacotes](https://img.shields.io/badge/Pacotes-2B2B2B?style=for-the-badge)

Neste projeto, estou aplicando na prática o conhecimento que aprendi recentemente sobre **Arrays (Vetores)** e manipulação de múltiplos objetos na memória, junto aos seguintes pilares e boas práticas:

* **Arrays / Vetores:** Aplicação do aprendizado recente sobre vetores para armazenar, percorrer e manipular dinamicamente um conjunto de instâncias da classe `Aluno` na memória.
* **Encapsulamento:** Atributos privados (`private`) com leituras e alterações controladas por *getters* e *setters*, garantindo a integridade dos dados cadastrados.
* **Métodos Coesos:** Lógica de processamento encapsulada na própria entidade. O método `calcularMedia` realiza a média aritmética simples, enquanto o `isAprovado` avalia a regra de aprovação (nota mínima **6.0**).
* **Sobrescrita de Métodos (`@Override`):** Customização do método `toString()` para entregar uma representação em texto limpa e formatada do aluno com seu status final.
* **Organização em Pacotes:** Separação clara de responsabilidades entre as classes do domínio (`entities`) e a classe de ponto de entrada/interação (`application`).


## Próximos Passos

Como este repositório reflete minha exata jornada de aprendizado atual, **ainda não implementei validações de dados ou tratamento de exceções (Exceptions)** — portanto, o programa confia que o usuário inserirá os tipos de dados corretos no terminal. 

Assim que eu avançar nos estudos e dominar as tratativas de exceções em Java, retornarei a este repositório com novas atualizações para tornar a aplicação totalmente robusta e à prova de falhas.

## Estrutura do Projeto

O projeto está organizado conforme a árvore de diretórios abaixo:

```text
STUDENT-GRADE-SYSTEM/
├── img/ 
│   ├── diagram_class_aluno.png  # Diagrama de classe UML
│   └── demo.mp4                 # Gravação do funcionamento no terminal
├── src/
│   ├── application/
│   │   └── Program.java        # Interface e interação via console (Scanner)
│   └── entities/
│       └── Aluno.java          # Entidade com regras de negócio e encapsulamento
├── LICENSE
└── README.md                    # Documentação do projeto
