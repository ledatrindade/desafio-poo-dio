# 🚀 Desafio: Programação Orientada a Objetos na Prática (Java)

Este projeto tem como objetivo aplicar **na prática os principais conceitos da Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**, por meio da simulação de um **sistema de bootcamp para desenvolvedores**.

A ideia é sair da teoria e ver a POO funcionando em um cenário real, utilizando classes que representam cursos, mentorias, desenvolvedores e o progresso dentro de um bootcamp.

---

## 🎯 Objetivo do Projeto

Colocar em prática os **4 pilares da Programação Orientada a Objetos**:

- **Abstração**
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

Tudo isso aplicado em um domínio realista, onde:
- Desenvolvedores se inscrevem em bootcamps
- Progridem em cursos e mentorias
- Acumulam experiência (XP) conforme avançam

---

## 🧠 Visão Geral do Sistema

O sistema simula o funcionamento de um bootcamp:

- Um **Bootcamp** contém cursos e mentorias
- Um **Dev** pode se inscrever no bootcamp
- Cada conteúdo concluído gera **XP**
- O progresso acontece de forma sequencial
- O usuário interage via **console**, informando dados pelo teclado

---

## 🏗️ Estrutura do Projeto

### 📦 Classes do Domínio

- **Conteudo (classe abstrata)**
  - Classe base para cursos e mentorias
  - Define atributos comuns (`titulo`, `descricao`)
  - Declara o método abstrato `calcularXp()`

- **Curso**
  - Herda de `Conteudo`
  - Possui carga horária
  - XP calculado com base na carga horária

- **Mentoria**
  - Herda de `Conteudo`
  - Possui data
  - XP fixo adicional

- **Bootcamp**
  - Possui nome, descrição e datas
  - Agrupa conteúdos (cursos e mentorias)
  - Controla os desenvolvedores inscritos

- **Dev**
  - Representa o desenvolvedor participante
  - Controla conteúdos inscritos e concluídos
  - Calcula o XP total acumulado

- **Main**
  - Classe principal da aplicação
  - Simula a interação do usuário via `Scanner`
  - Executa o fluxo completo do sistema

---

## 🧩 Aplicação dos Conceitos de POO

### 🔹 Abstração
O domínio do problema (bootcamp) foi representado por classes que modelam elementos reais, como cursos, mentorias e desenvolvedores.

### 🔹 Encapsulamento
Os atributos são privados e acessados por getters e setters, garantindo maior controle e segurança dos dados.

### 🔹 Herança
As classes `Curso` e `Mentoria` herdam de `Conteudo`, reutilizando atributos e comportamentos comuns.

### 🔹 Polimorfismo
O método `calcularXp()` é implementado de formas diferentes em `Curso` e `Mentoria`, sendo chamado de maneira genérica.

---

## 🖥️ Interação com o Usuário

O sistema permite que o usuário:

1. Informe seu nome
2. Visualize os conteúdos disponíveis no bootcamp
3. Escolha quantos conteúdos deseja progredir
4. Veja os conteúdos concluídos
5. Confira o XP total acumulado

Toda a interação acontece pelo **console**, tornando a simulação mais próxima de um sistema real.

---

## 🛠️ Tecnologias Utilizadas

- Java
- Java Time API
- Collections (`Set`, `HashSet`, `LinkedHashSet`)
- Scanner (entrada de dados)
- Git e GitHub
- IntelliJ IDEA

---

## 🤝 Contribuições

Este repositório foi criado com fins educacionais.

Se este projeto te ajudou de alguma forma:
- ⭐ Dê um star no repositório
- 🐛 Reporte issues
- 💡 Sugira melhorias

Toda contribuição é bem-vinda!
