# 🥩 Protein Tracker CLI

Este é um projeto pessoal desenvolvido em **Java** com o objetivo de facilitar o controle diário de ingestão proteica para entusiastas de musculação e saúde. O projeto faz parte do meu portfólio de estudos como graduando em **Engenharia de Computação** no **IF Goiano - Campus Trindade**.

## 🚀 Funcionalidades Atuais (MVP)

* **Cálculo Dinâmico de Meta:** O sistema permite definir a meta diária baseada no peso do usuário e em um fator de ajuste customizável (ex: $1.6g/kg$ a $2.2g/kg$), permitindo flexibilidade para diferentes fases do treinamento.
* **Encapsulamento de Dados:** Aplicação de modificadores de acesso `private` nos atributos biométricos, garantindo que a lógica de negócio (cálculo da meta) seja protegida e centralizada na classe `Usuario`.
* **Lógica Orientada a Objetos:** Estrutura inicial focada na criação de objetos consistentes através de construtores parametrizados.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+).
* **IDE:** IntelliJ IDEA.
* **Versionamento:** Git e GitHub.

## 🎯 Próximos Passos (Roadmap)

Como o projeto está em fase inicial e focado no aprendizado contínuo, as seguintes metas foram estabelecidas:

* [ ] **Interface de Interação (CLI):** Implementação de métodos Getters e Setters para interação via console.
* [ ] **Registro de Consumo:** Criação de métodos para somar a proteína ingerida ao longo do dia.
* [ ] **Expansão de Macros:** Inclusão de Carboidratos e Gorduras para um controle de dieta completo.
* [ ] **Interface Gráfica:** Implementação de janelas de diálogo utilizando `javax.swing`.

## 📖 Como Executar

1. Certifique-se de ter o JDK instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/natannn14/protein-counter.git](https://github.com/natannn14/protein-counter.git)