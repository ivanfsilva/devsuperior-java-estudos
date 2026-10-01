# Problema "funcionários"

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do
funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada
ao lado.

## Diagrama UML da Classe

| Employee                                                                 |
|:-------------------------------------------------------------------------|
| - Name : string <br> - GrossSalary : double <br> - Tax : double          |
| + NetSalary() : double <br> + IncreaseSalary(percentage : double) : void |

---

## Exemplo de entrada e saída

### Entrada

| Entrada                                  | Exemplo 1  |
|:-----------------------------------------|:-----------|
| **Nome:**                                | Joao Silva |
| **Salário bruto:**                       | 6000.00    |
| **Imposto:**                             | 1000.00    |
| **Porcentagem para aumentar o salário:** | 10.0       |

### Saída

| Saída                  | Exemplo 1             |
|:-----------------------|:----------------------|
| **Funcionário:**       | Joao Silva, $ 5000.00 |
| **Dados atualizados:** | Joao Silva, $ 5600.00 |