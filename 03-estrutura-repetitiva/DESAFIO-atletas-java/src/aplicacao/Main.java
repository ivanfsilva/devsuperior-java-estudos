package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();

        double somaPesos = 0.0;
        double maiorAltura = 0.0;
        String atletaMaisAlto = "";
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double somaAlturaMulheres = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do atleta numero " + i + ":");

            System.out.print("Nome: ");
            sc.nextLine(); // Limpa o buffer
            String nome = sc.nextLine();

            // Validação do sexo ('F' ou 'M')
            System.out.print("Sexo: ");
            char sexo = sc.next().toUpperCase().charAt(0);
            while (sexo != 'F' && sexo != 'M') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().toUpperCase().charAt(0);
            }

            // Validação da altura (valor estritamente positivo)
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            // Validação do peso (valor estritamente positivo)
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            // Acumula peso total
            somaPesos += peso;

            // Verifica se é o atleta mais alto
            if (altura > maiorAltura) {
                maiorAltura = altura;
                atletaMaisAlto = nome;
            }

            // Contagem e estatísticas por sexo
            if (sexo == 'M') {
                qtdHomens++;
            } else {
                qtdMulheres++;
                somaAlturaMulheres += altura;
            }
        }

        // Cálculos do relatório
        double pesoMedio = somaPesos / n;
        double porcentagemHomens = ((double) qtdHomens / n) * 100.0;

        // Impressão do relatório final
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.println("Atleta mais alto: " + atletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);

        if (qtdMulheres > 0) {
            double alturaMediaMulheres = somaAlturaMulheres / qtdMulheres;
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }
}
