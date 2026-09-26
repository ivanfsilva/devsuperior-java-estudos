package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Configura o ponto como separador decimal para o Scanner e System.out.printf
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        double b = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = sc.nextDouble();

        // Fórmulas matemáticas
        double areaQuadrado = a * a;
        double areaTriangulo = (a * b) / 2.0;
        double areaTrapezio = ((a + b) * c) / 2.0;

        // Exibição dos resultados com 4 casas decimais
        System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f%n", areaTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);

        sc.close();
    }
}
