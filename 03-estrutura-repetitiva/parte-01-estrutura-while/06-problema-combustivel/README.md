# Problema "combustivel"

Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um
algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja
válido). O programa será encerrado quando o código informado for o número 4, devendo então mostrar a mensagem "MUITO
OBRIGADO", bem como as quantidades de cada combustível.

## Exemplo de entrada e saída

### Entrada

| Entrada                                          | Exemplo 1                            |
|:-------------------------------------------------|:-------------------------------------|
| **Informe um codigo (1, 2, 3) ou 4 para parar:** | 8 <br> 1 <br> 7 <br> 2 <br> 2 <br> 4 |

### Saída

| Saída         | Exemplo 1                                                     |
|:--------------|:--------------------------------------------------------------|
| **Resultado** | MUITO OBRIGADO <br> Alcool: 1 <br> Gasolina: 2 <br> Diesel: 0 |