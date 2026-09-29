# Problema "atletas"

Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome, sexo, altura,
peso). Depois, mostrar um relatório contendo: peso médio dos atletas, nome do atleta mais alto, porcentagem de
homens e altura média das mulheres. Caso não sejam digitadas mulheres, mostrar a mensagem "Não há mulheres
cadastradas". O programa deve fazer validações para não permitir valores não positivos de altura e peso, nem
valores de sexo diferentes de F e M.

## Exemplo de entrada e saída

### Entrada

| Entrada                                 | Exemplo 1             | Exemplo 2    |
|:----------------------------------------|:----------------------|:-------------|
| **Qual a quantidade de atletas?**       | 3                     | 1            |
| **Digite os dados do atleta numero 1:** |                       |              |
| **Nome:**                               | Carlos Silva          | Carlos Silva |
| **Sexo:**                               | M                     | M            |
| **Altura:**                             | -1.5 <br> 0 <br> 1.75 | 1.75         |
| **Peso:**                               | 84.8                  | 84.8         |
| **Digite os dados do atleta numero 2:** |                       |              |
| **Nome:**                               | Maria José            |              |
| **Sexo:**                               | F                     |              |
| **Altura:**                             | 1.71                  |              |
| **Peso:**                               | 64.5                  |              |
| **Digite os dados do atleta numero 3:** |                       |              |
| **Nome:**                               | Teresa Borges         |              |
| **Sexo:**                               | R <br> S <br> F       |              |
| **Altura:**                             | 1.65                  |              |
| **Peso:**                               | 0 <br> -60 <br> 54.3  |              |

### Saída

| Saída          | Exemplo 1                                                                                                                                | Exemplo 2                                                                                                                             |
|:---------------|:-----------------------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------|
| **RELATÓRIO:** | Peso médio dos atletas: 67.87 <br> Atleta mais alto: Carlos Silva <br> Porcentagem de homens: 33.3% <br> Altura média das mulheres: 1.68 | Peso médio dos atletas: 84.80 <br> Atleta mais alto: Carlos Silva <br> Porcentagem de homens: 100.0% <br> Não há mulheres cadastradas |