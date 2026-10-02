# Desafio "Bar OO"

Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres. Cada cerveja custa 5 reais, cada refrigerante
3 reais e cada espetinho custa 7 reais. Além disso, o bar cobra uma taxa de couvert artístico no valor de 4 reais,
porém, se o valor gasto com consumo for superior a 30 reais, o couvert artístico não é cobrado.

Fazer um programa para ler os seguintes dados de um cliente do bar: sexo (F ou M), quantidade de cervejas, refrigerantes
e espetinhos consumidos. O programa deve então mostrar um relatório com a conta a ser paga pelo cliente.

## Diagrama UML da Classe

| Bill                                                                                          |
|:----------------------------------------------------------------------------------------------|
| - gender : char <br> - beer : int <br> - barbecue : int <br> - softDrink : int                |
| + cover() : double <br> + feeding() : double <br> + ticket() : double <br> + total() : double |

---

## Exemplo de entrada e saída

### Entrada

| Entrada                          | Exemplo 1 | Exemplo 2 |
|:---------------------------------|:----------|:----------|
| **Sexo:**                        | F         | M         |
| **Quantidade de cervejas:**      | 3         | 7         |
| **Quantidade de refrigerantes:** | 0         | 1         |
| **Quantidade de espetinhos:**    | 1         | 2         |

### Saída

| Saída               | Exemplo 1 | Exemplo 2         |
|:--------------------|:----------|:------------------|
| **Consumo =**       | R$ 22.00  | R$ 52.00          |
| **Couvert =**       | R$ 4.00   | Isento de Couvert |
| **Ingresso =**      | R$ 8.00   | R$ 10.00          |
| **Valor a pagar =** | R$ 34.00  | R$ 62.00          |