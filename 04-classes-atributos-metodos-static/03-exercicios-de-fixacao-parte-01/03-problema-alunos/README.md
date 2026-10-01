# Problema "alunos"

Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro
trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
também se o aluno está aprovado (APROVADO) ou não (REPROVADO) e, em caso negativo, quantos pontos faltam para o aluno
obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe **Student** para resolver este
problema.

---

## Exemplo de entrada e saída

### Entrada

| Entrada     | Exemplo 1  | Exemplo 2  |
|:------------|:-----------|:-----------|
| **Nome:**   | Alex Green | Alex Green |
| **Nota 1:** | 27.00      | 17.00      |
| **Nota 2:** | 31.00      | 20.00      |
| **Nota 3:** | 32.00      | 15.00      |

### Saída

| Saída                  | Exemplo 1 | Exemplo 2            |
|:-----------------------|:----------|:---------------------|
| **NOTA FINAL =**       | 90.00     | 52.00                |
| **SITUAÇÃO =**         | PASS      | FAILED               |
| **PONTOS FALTANTES =** | -         | FALTARAM 8.00 PONTOS |