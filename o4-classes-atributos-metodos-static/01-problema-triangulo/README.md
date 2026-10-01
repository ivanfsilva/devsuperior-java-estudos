# Problema triângulo

Fazer um programa para ler as medidas dos lados de dois triângulos $X$ e $Y$ (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus lados $a$, $b$ e $c$ é a seguinte (fórmula de Heron):

$$\text{area} = \sqrt{p(p - a)(p - b)(p - c)} \quad \text{onde} \quad p = \frac{a + b + c}{2}$$

## Exemplo de entrada e saída

### Entrada

| Entrada                   | Exemplo 1                | Exemplo 2                |
| :------------------------ | :----------------------- | :----------------------- |
| **Lados do triângulo X:** | 3.00 <br> 4.00 <br> 5.00 | -                        |
| **Lados do triângulo Y:** | -                        | 7.50 <br> 4.50 <br> 4.02 |

### Saída

| Saída                | Exemplo |
| :------------------- | :------ |
| **Triangle X area:** | 6.0000  |
| **Triangle Y area:** | 7.5638  |
| **Larger area:**     | Y       |
