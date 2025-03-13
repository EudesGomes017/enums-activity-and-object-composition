# Enums em Java

Este módulo contém exercícios e exemplos sobre o uso de **Enums** em **Java**. O objetivo é entender como trabalhar com tipos enumerados, uma forma de representar um conjunto fixo de constantes de forma mais segura e eficiente.

## Funcionalidade

Enums são tipos especiais de classe em Java que representam um conjunto de constantes. Eles são úteis para representar valores que não mudam durante a execução do programa, como os dias da semana, meses do ano, status de um pedido, entre outros.

Ao invés de usar valores arbitrários como inteiros ou strings, os **Enums** fornecem uma forma segura e legível de representar essas constantes, garantindo que apenas valores válidos sejam usados.

## Conceitos Principais

- **Definição de Enum**: Um Enum é uma classe especial que contém um número fixo de constantes, como `SUNDAY`, `MONDAY`, etc., no caso dos dias da semana.
- **Benefícios dos Enums**:
  - **Segurança**: Garante que apenas os valores definidos no Enum possam ser usados, evitando erros como o uso de valores inválidos.
  - **Legibilidade**: O código fica mais legível ao usar constantes nomeadas em vez de valores numéricos ou strings.
  - **Métodos e Propriedades**: Enums podem ter métodos, construtores e propriedades, o que permite adicionar funcionalidades às constantes.
- **Uso de Enums**: São frequentemente usados para representar estados, categorias ou outros conjuntos de dados fixos no programa.
- **Comparação de Enums**: Enums são comparados usando o método `equals()` ou `==`, já que são garantidos como instâncias únicas.

## Objetivos do Módulo

- Compreender como e quando usar **Enums** em Java.
- Aprender a criar **Enums** para representar conjuntos fixos de valores.
- Explorar os métodos e funcionalidades adicionais que os **Enums** oferecem, como **métodos personalizados** e **ordenação**.
- Aprender como trabalhar com **Enums** em controle de fluxo, como em **switch** ou para definir estados em um sistema.
