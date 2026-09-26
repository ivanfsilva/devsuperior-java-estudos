package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Define o locale para US para ler e formatar decimais com ponto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        // Cálculos
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        // Exibição dos resultados com 4 casas decimais
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        sc.close();
    }
}